/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highcharts]]
  */
package com.highcharts.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>chart-resetZoomButton-theme</code>
  */
class ChartResetZoomButtonTheme extends com.highcharts.HighchartsGenericObject {

  var zIndex: js.UndefOr[Double] = js.undefined
}

object ChartResetZoomButtonTheme {
  /**
    */
  def apply(zIndex: js.UndefOr[Double] = js.undefined): ChartResetZoomButtonTheme = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new ChartResetZoomButtonTheme {
      this.zIndex = zIndex
    })
  }
}
