package com.highcharts

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object HighchartsModules {
  @js.native
  @JSImport("highcharts/modules/exporting", JSImport.Default)
  object Exporting extends native.Exporting {
    def apply(hc: js.Any): Unit = js.native
  }

  def loadExporting(hc: js.Any = Highcharts): Unit = {
    Exporting(hc)
  }
}
