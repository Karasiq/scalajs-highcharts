package com.karasiq.highcharts.generator.writers

import com.karasiq.highcharts.generator.ConfigurationObject

trait ClassWriter {
  def write(configObjects: List[ConfigurationObject])(writer: (String, String) ⇒ Unit): Unit
}


