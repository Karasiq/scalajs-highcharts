package com.karasiq.highcharts.generator.writers

import com.karasiq.highcharts.generator.ConfigurationObject

class ScalaDocWriter extends DocWriter {
  override def writeDocumentation(cfg: ConfigurationObject)(writer: String ⇒ Unit): Unit = {
    for (desc <- cfg.description if desc.nonEmpty) {
      writer("/**")
      desc.split("""(\r\n|\r|\n)""").foreach { descLine ⇒
        writer(" * " + descLine)
      }

      for (demo <- cfg.demo if demo.nonEmpty) {
        writer(" * @example " + demo)
      }
      writer(" */")
    }
  }
}
