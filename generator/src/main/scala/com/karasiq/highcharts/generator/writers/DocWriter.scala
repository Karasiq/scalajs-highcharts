package com.karasiq.highcharts.generator.writers

import com.karasiq.highcharts.generator.ConfigurationObject
import com.karasiq.highcharts.generator.ast.ScalaJsValue

trait DocWriter {
  def paramDocumentation(cfg: Seq[ScalaJsValue])(writer: String ⇒ Unit): Unit

  def writeDocumentation(cfg: ConfigurationObject)(writer: String ⇒ Unit): Unit
}
