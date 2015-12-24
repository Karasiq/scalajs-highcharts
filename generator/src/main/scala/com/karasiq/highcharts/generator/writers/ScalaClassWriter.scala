package com.karasiq.highcharts.generator.writers

import java.io.{PrintWriter, StringWriter}

import com.karasiq.highcharts.generator.ConfigurationObject
import org.apache.commons.lang3.StringEscapeUtils

object ScalaClassWriter {
  // Scala keywords
  private val reserved = Set("abstract", "case", "catch", "class", "def", "do", "else", "extends", "false", "final", "finally", "for", "forSome", "if", "implicit", "import", "lazy", "match", "new", "null", "object", "override", "package", "private", "protected", "return", "sealed", "super", "this", "throw", "trait", "try", "true", "type", "val", "var", "while", "with", "yield")

  def validScalaName(name: String): String = {
    if (!name.matches("\\w+") || reserved.contains(name)) {
      s"`$name`"
    } else {
      name
    }
  }

  def classNameFor(jsName: String): String = {
    this.validScalaName(jsName.split("[-<>\\.]").filter(_.nonEmpty)
      .map(str ⇒ str.head.toUpper + str.tail).mkString)
  }

  def escapeString(str: String): String = {
    "\"" + StringEscapeUtils.escapeJava(str) + "\""
  }
}

class ScalaClassWriter extends ClassWriter {
  private def scalaType(classes: Set[String], cfg: ConfigurationObject): Option[String] = {
    val array = """Array<(.+)>""".r

    val selfClass = cfg.fullName
      .map(ScalaClassWriter.classNameFor)
      .filter(classes.contains)

    def stdTypes: PartialFunction[String, String] = {
      case "Function" ⇒
        "js.Function"

      case "CSSObject" | "Object" ⇒
        "js.Object"

      case "Color" ⇒
        "String"

      case "Number" ⇒
        "Double"

      case "Boolean" ⇒
        "Boolean"

      case t if t.contains("|") ⇒
        "js.Any"

      case array(t) ⇒
        val tpe = if (stdTypes.isDefinedAt(t)) {
          stdTypes(t)
        } else if (selfClass.nonEmpty) {
          selfClass.get
        } else {
          "js.Any"
        }
        s"js.Array[$tpe]"

      case "Array" ⇒
        s"js.Array[${selfClass.getOrElse("js.Any")}]"
    }

    cfg.returnType.orElse(Some("")).collect(stdTypes.orElse {
      case "" if cfg.fullName.nonEmpty && classes.contains(ScalaClassWriter.classNameFor(cfg.fullName.get)) ⇒
        ScalaClassWriter.classNameFor(cfg.fullName.get)

      case t if classes.contains(ScalaClassWriter.classNameFor(t)) ⇒
        ScalaClassWriter.classNameFor(t)
    })
  }

  private def value(classes: Set[String], cfg: ConfigurationObject): (String, String) = {
    val tpe: String = scalaType(classes, cfg).getOrElse("js.Any")

    def wrapString(value: String) = {
      if (value.trim == "null") {
        s"null.asInstanceOf[$tpe]"
      } else if (cfg.returnType.exists(_.contains("String")) || tpe == "String") {
        ScalaClassWriter.escapeString(value)
      } else {
        value
      }
    }

    cfg.defaults match {
      case Some(array) if array.startsWith("[") && array.endsWith("]") ⇒
        // Parse JS array value
        tpe → s"js.Array(${array.drop(1).dropRight(1)})"

      case Some(obj) if obj.startsWith("{") && obj.endsWith("}") && tpe == "js.Object" ⇒
        tpe → s"js.eval(${ScalaClassWriter.escapeString(obj)}).asInstanceOf[$tpe]"

      case Some(default) if default != "undefined" && (default.nonEmpty || tpe == "String") ⇒
        val df = wrapString(default)
        tpe → (if (df.nonEmpty) df else s"new $tpe()")

      case _ ⇒
        s"UndefOr[$tpe]" → "js.undefined"
    }
  }

  override def write(configObjects: List[ConfigurationObject])(writer: (String, String) ⇒ Unit): Unit = {
    val byClass = configObjects.groupBy(_.parent.getOrElse(""))
    val classNames = byClass.keys.toSet
    val classes = for ((parent, parameters) <- byClass.toIterator if parent.nonEmpty) yield {
      val sw = new StringWriter(512)
      val pw = new PrintWriter(sw)

      val className = ScalaClassWriter.classNameFor(parent)
      pw.println("@ScalaJSDefined")
      pw.println(s"class $className extends js.Object {")

      val writeToClass = (str: String) ⇒ pw.println("  " + str)
      val docWriter = new ScalaDocWriter
      for (cfg <- parameters; name <- cfg.title) {
        val (tpe, value) = this.value(classNames, cfg)
        writeToClass("") // Empty string
        docWriter.writeDocumentation(cfg)(writeToClass)
        writeToClass(s"var ${ScalaClassWriter.validScalaName(name)}: $tpe = $value")
      }

      pw.println("}")
      pw.flush()
      className → sw.toString
    }

    classes.foreach(writer.tupled)
  }
}