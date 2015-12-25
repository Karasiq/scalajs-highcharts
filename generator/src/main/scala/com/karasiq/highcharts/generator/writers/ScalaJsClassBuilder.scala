package com.karasiq.highcharts.generator.writers

import com.karasiq.highcharts.generator.ConfigurationObject
import com.karasiq.highcharts.generator.ast.{ScalaJsClass, ScalaJsDefinition, ScalaJsMethod, ScalaJsValue}
import org.apache.commons.lang3.StringEscapeUtils

object ScalaJsClassBuilder {
  // Scala keywords
  private val reserved = Set("abstract", "case", "catch", "class", "def", "do", "else", "extends", "false", "final", "finally", "for", "forSome", "if", "implicit", "import", "lazy", "match", "new", "null", "object", "override", "package", "private", "protected", "return", "sealed", "super", "this", "throw", "trait", "try", "true", "type", "val", "var", "while", "with", "yield")

  def validScalaName(name: String): String = {
    if (name.nonEmpty && (!name.matches("\\w+") || reserved.contains(name))) {
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

class ScalaJsClassBuilder {
  private def scalaType(classes: Set[String], tpe: Option[String], selfClass: Option[String] = None): Option[String] = {
    val array = """Array<(.+)>""".r

    def stdTypes: PartialFunction[String, String] = {
      case "String" ⇒
        "String"

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

      case "" if selfClass.nonEmpty ⇒
        selfClass.get

      case t if classes.contains(ScalaJsClassBuilder.classNameFor(t)) ⇒
        ScalaJsClassBuilder.classNameFor(t)
    }

    tpe.orElse(Some("")).collect(stdTypes.orElse {
      case "" if selfClass.exists(_.nonEmpty) ⇒
        selfClass.get

      case t if classes.contains(ScalaJsClassBuilder.classNameFor(t)) ⇒
        ScalaJsClassBuilder.classNameFor(t)
    })
  }

  private def cfgScalaType(classes: Set[String], cfg: ConfigurationObject): Option[String] = {
    val selfClass: Option[String] = cfg.fullName
      .map(ScalaJsClassBuilder.classNameFor)
      .filter(classes.contains)

    scalaType(classes, cfg.returnType, selfClass)
  }

  private def typeAndValue(classes: Set[String], cfg: ConfigurationObject): (String, Option[String]) = {
    def isMethod: Boolean = cfg.params.exists(_.nonEmpty)

    val scalaType: String = cfgScalaType(classes, cfg).getOrElse {
      if (isMethod) "Unit"
      else "js.Any"
    }

    def wrapString(value: String): String = {
      if (value.trim == "null") {
        // Null value
        s"null.asInstanceOf[$scalaType]"
      } else if (cfg.returnType.exists(_.contains("String")) || scalaType == "String") {
        // String literal
        ScalaJsClassBuilder.escapeString(value)
      } else {
        // Other
        value
      }
    }

    cfg.defaults match {
      case _ if isMethod ⇒
        // Method
        scalaType → None

      case Some(array) if array.startsWith("[") && array.endsWith("]") ⇒
        // Parse JS array value
        scalaType → Some(s"js.Array(${array.drop(1).dropRight(1)})")

      case Some(obj) if obj.startsWith("{") && obj.endsWith("}") && scalaType == "js.Object" ⇒
        scalaType → Some(s"js.eval(${ScalaJsClassBuilder.escapeString(obj)}).asInstanceOf[$scalaType]")

      case Some(default) if default != "undefined" && (default.nonEmpty || scalaType == "String") ⇒
        val df = wrapString(default)
        scalaType → Some(if (df.nonEmpty) df else s"new $scalaType")

      case _ if cfg.isParent && scalaType == "js.Any" ⇒
        // Series
        scalaType → Some("js.Array()")

      case _ if cfg.isParent ⇒
        // Sub-container
        scalaType → Some(s"new $scalaType")

      case _ ⇒
        scalaType → None
    }
  }

  private def methodArguments(classes: Set[String], cfg: ConfigurationObject): Seq[ScalaJsValue] = {
    val jsParams: Seq[String] = cfg.params.map(_.replaceAll("[\\(\\)\\[\\]]", ""))
      .toSeq.flatMap(_.split(", "))
      .filter(_.nonEmpty)

    val params: Seq[(String, String)] = for (jsParam <- jsParams) yield {
      val (tpe, name) = jsParam.split(" ", 2) match {
        case Array(jsType, jsName) ⇒
          scalaType(classes, Some(jsType)).getOrElse("js.Any") → jsName

        case Array(jsName) ⇒
          "js.Any" → jsName
      }
      tpe → ScalaJsClassBuilder.validScalaName(name)
    }

    for ((scalaType, scalaName) <- params) yield
      ScalaJsValue(cfg, scalaName, scalaType, None)
  }

  def parse(configObjects: Seq[ConfigurationObject], rootObject: Option[String] = None): Seq[ScalaJsClass] = {
    // Class -> definitions map
    val byClass = configObjects.groupBy(_.parent.orElse(rootObject).getOrElse(""))

    // Class table
    val classNames = byClass.keys.map(ScalaJsClassBuilder.classNameFor).filter(_.nonEmpty).toSet

    // Classes AST
    for ((jsClassName, parameters) <- byClass.toSeq if jsClassName.nonEmpty) yield {
      // Scala class name
      val className: String = ScalaJsClassBuilder.classNameFor(jsClassName)

      // Scala class definitions
      val definitions: Seq[ScalaJsDefinition] = for (cfg <- parameters; name <- cfg.title) yield {
        val (tpe, value) = this.typeAndValue(classNames, cfg)
        if (cfg.params.exists(_.nonEmpty)) {
          ScalaJsMethod(cfg, ScalaJsClassBuilder.validScalaName(name), tpe, methodArguments(classNames, cfg))
        } else {
          ScalaJsValue(cfg, ScalaJsClassBuilder.validScalaName(name), tpe, value)
        }
      }

      ScalaJsClass(jsClassName, className, definitions)
    }
  }
}