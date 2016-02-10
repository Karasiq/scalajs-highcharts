package com.karasiq.highcharts.generator.writers

import com.karasiq.highcharts.generator.ConfigurationObject
import com.karasiq.highcharts.generator.ast.ScalaJsValue

class ScalaDocWriter extends DocWriter {
  override def paramDocumentation(values: Seq[ScalaJsValue])(writer: (String) ⇒ Unit): Unit = {
    writer("/**")
    for (ScalaJsValue(cfg, name, _, _) <- values; desc <- cfg.description if desc.nonEmpty) {
      writer(s"  * @param ${ScalaClassWriter.validScalaName(name)} ${desc.split("""(\r\n|\r|\n)""").mkString(". ")}")
    }
    writer("  */")
  }

  override def writeDocumentation(cfg: ConfigurationObject)(writer: String ⇒ Unit): Unit = {
    for (desc <- cfg.description if desc.nonEmpty) {
      writer("/**")
      desc.split("""(\r\n|\r|\n)""").foreach { descLine ⇒
        writer("  * " + descLine)
      }

      val paramRegex = """(\w+): (\w+)<br>([^\|]+)""".r
      val params = cfg.paramsDescription.toSeq.flatMap(_.split("\\|\\|")).collect {
        case paramRegex(name, tpe, description) ⇒
          (name, description)
      }

      for ((name, description) <- params) {
        writer(s"  * @param $name $description")
      }

      for (demo <- cfg.demo if demo.nonEmpty) {
        writer("  * @example " + demo)
      }

      for (since <- cfg.since if since.nonEmpty) {
        writer("  * @since " + since)
      }

      writer("  */")
    }
  }
}
