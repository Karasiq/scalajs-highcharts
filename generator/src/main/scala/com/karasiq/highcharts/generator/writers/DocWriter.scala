package com.karasiq.highcharts.generator.writers

import com.karasiq.highcharts.generator.ConfigurationObject

trait DocWriter {
  def writeDocumentation(cfg: ConfigurationObject)(writer: String ⇒ Unit): Unit
}
