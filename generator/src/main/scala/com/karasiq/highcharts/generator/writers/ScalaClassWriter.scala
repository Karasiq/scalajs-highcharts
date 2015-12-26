package com.karasiq.highcharts.generator.writers

import com.karasiq.highcharts.generator.ConfigurationObject
import com.karasiq.highcharts.generator.ast.{ScalaJsClass, ScalaJsMethod, ScalaJsValue}
import org.apache.commons.lang3.StringEscapeUtils

object ScalaClassWriter {
  // Scala keywords
  private val reserved = Set("abstract", "case", "catch", "class", "def", "do", "else", "extends", "false", "final", "finally", "for", "forSome", "if", "implicit", "import", "lazy", "match", "new", "null", "object", "override", "package", "private", "protected", "return", "sealed", "super", "this", "throw", "trait", "try", "true", "type", "val", "var", "while", "with", "yield")

  def validScalaName(name: String): String = {
    if (name.nonEmpty && (!name.matches("\\w+") || reserved.contains(name))) {
      s"`$name`"
    } else {
      name
    }
  }
}

class ScalaClassWriter extends ClassWriter {
  import ScalaClassWriter.validScalaName

  override def writeClass(scalaClass: ScalaJsClass)(writer: (String) ⇒ Unit): Unit = scalaClass match {
    case ScalaJsClass(jsName, className, definitions) ⇒
      writer(
        s"""/**
           |  * @note JavaScript name: <code>${StringEscapeUtils.escapeHtml4(jsName)}</code>
           |  */""".stripMargin
      )

      // Abstract native JS trait
      val isTrait: Boolean = definitions.exists(_.isInstanceOf[ScalaJsMethod])

      if (isTrait) {
        writer("@js.native")
        writer(s"trait ${validScalaName(className)} extends js.Object {")
      } else {
        writer("@js.annotation.ScalaJSDefined")
        writer(s"class ${validScalaName(className)} extends js.Object {")
      }

      val tab = "  " // Tabulation
      val docWriter = new ScalaDocWriter

      def writeDoc(cfg: ConfigurationObject): Unit = {
        writer("") // Empty line
        docWriter.writeDocumentation(cfg)(str ⇒ writer(tab + str)) // ScalaDoc
      }

      definitions.foreach {
        case ScalaJsMethod(cfg, scalaName, scalaType, arguments) ⇒
          writeDoc(cfg)
          val args = arguments.collect {
            case ScalaJsValue(_, argName, argType, Some(argValue)) ⇒
              s"${validScalaName(argName)}: $argType = $argValue"

            case ScalaJsValue(_, argName, argType, None) ⇒
              if (argType == "js.Any")
                s"${validScalaName(argName)}: $argType = js.undefined"
              else
                s"${validScalaName(argName)}: js.UndefOr[$argType] = js.undefined"
          }
          writer(tab + s"def ${validScalaName(scalaName)}(${args.mkString(", ")}): $scalaType = js.native")

        case ScalaJsValue(cfg, name, scalaType, value) ⇒
          val scalaName: String = validScalaName(name)
          writeDoc(cfg)
          if (isTrait) {
            writer(tab + s"val $scalaName: $scalaType = js.native")
          } else value match {
            case Some(v) ⇒
              writer(tab + s"val $scalaName: $scalaType = $v")

            case None if scalaType == "js.Any" ⇒
              writer(tab + s"val $scalaName: $scalaType = js.undefined")

            case None ⇒
              writer(tab + s"val $scalaName: js.UndefOr[$scalaType] = js.undefined")
          }

        case c: ScalaJsClass ⇒
          writeClass(c)(str ⇒ writer(tab + str))
      }

      writer("}")
  }
}