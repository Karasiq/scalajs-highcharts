package com.karasiq.highcharts.generator.writers

import com.karasiq.highcharts.generator.ast.ScalaJsClass

trait ClassWriter {
  def writeClass(scalaClass: ScalaJsClass)(writer: String ⇒ Unit): Unit
}
