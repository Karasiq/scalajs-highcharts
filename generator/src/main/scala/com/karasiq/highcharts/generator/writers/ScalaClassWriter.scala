package com.karasiq.highcharts.generator.writers

import com.karasiq.highcharts.generator.ConfigurationObject
import com.karasiq.highcharts.generator.ast.{ScalaJsClass, ScalaJsMethod, ScalaJsValue}
import org.apache.commons.lang3.StringEscapeUtils

class ScalaClassWriter extends ClassWriter {
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
        writer(s"trait $className extends js.Object {")
      } else {
        writer("@js.annotation.ScalaJSDefined")
        writer(s"class $className extends js.Object {")
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
            case ScalaJsValue(_, argName, argType, argValue) ⇒
              s"$argName: $argType = ${argValue.getOrElse(s"js.undefined.asInstanceOf[$argType]")}"
          }
          writer(tab + s"def $scalaName(${args.mkString(", ")}): $scalaType = js.native")

        case ScalaJsValue(cfg, scalaName, scalaType, value) ⇒
          writeDoc(cfg)
          if (isTrait) {
            writer(tab + s"val $scalaName: $scalaType = js.native")
          } else {
            writer(tab + s"val $scalaName: $scalaType = ${value.getOrElse(s"js.undefined.asInstanceOf[$scalaType]")}")
          }

        case c: ScalaJsClass ⇒
          writeClass(c)(str ⇒ writer(tab + str))
      }

      writer("}")
  }
}