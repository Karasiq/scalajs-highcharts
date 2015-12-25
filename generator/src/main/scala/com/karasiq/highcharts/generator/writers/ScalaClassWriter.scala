package com.karasiq.highcharts.generator.writers

import com.karasiq.highcharts.generator.ast.{ScalaJsClass, ScalaJsMethod, ScalaJsValue}

class ScalaClassWriter extends ClassWriter {
  override def writeClass(scalaClass: ScalaJsClass)(writer: (String) ⇒ Unit): Unit = scalaClass match {
    case ScalaJsClass(jsName, className, definitions) ⇒
      writer(
        s"""/**
           |  * @note JavaScript name: $jsName
           |  */""".stripMargin
      )

      // Abstract native JS trait
      val isTrait: Boolean = definitions.forall {
        case ScalaJsMethod(_, _, _, _) ⇒
          true

        case ScalaJsValue(_, _, _, value) ⇒
          value.isEmpty
      }

      if (isTrait) {
        writer("@js.native")
        writer(s"trait $className extends js.Object {")
      } else {
        writer("@js.annotation.ScalaJSDefined")
        writer(s"class $className extends js.Object {")
      }

      val tab = "  " // Tabulation
      val docWriter = new ScalaDocWriter
      definitions.foreach {
        case ScalaJsMethod(cfg, scalaName, scalaType, arguments) ⇒
          docWriter.writeDocumentation(cfg)(str ⇒ writer(tab + str))
          val args = arguments.collect {
            case ScalaJsValue(_, argName, argType, argValue) ⇒
              argValue.fold(s"$argName: UndefOr[$argType] = js.undefined")(v ⇒ s"$argName: $argType = $v")
          }
          writer(tab + s"def $scalaName(${args.mkString(", ")}): $scalaType = js.native")

        case ScalaJsValue(cfg, scalaName, scalaType, value) ⇒
          docWriter.writeDocumentation(cfg)(str ⇒ writer(tab + str))
          if (isTrait) {
            writer(tab + s"val $scalaName: $scalaType = js.native")
          } else value match {
            case Some(v) ⇒
              writer(tab + s"val $scalaName: $scalaType = $v")

            case None ⇒
              writer(tab + s"val $scalaName: UndefOr[$scalaType] = js.undefined")
          }
      }

      writer("}")
  }
}