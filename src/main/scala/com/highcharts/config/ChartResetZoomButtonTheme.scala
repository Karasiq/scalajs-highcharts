/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highcharts]]
  */
package com.highcharts.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>chart-resetZoomButton-theme</code>
  */
@js.annotation.ScalaJSDefined
class ChartResetZoomButtonTheme extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The Z index for the reset zoom button. The default value
    * places it below the tooltip that has Z index 7.</p>
    * @since 2.2
    */
  val zIndex: js.UndefOr[Double] = js.undefined
}

object ChartResetZoomButtonTheme {
  /**
    * @param zIndex <p>The Z index for the reset zoom button. The default value. places it below the tooltip that has Z index 7.</p>
    */
  def apply(zIndex: js.UndefOr[Double] = js.undefined): ChartResetZoomButtonTheme = {
    val zIndexOuter: js.UndefOr[Double] = zIndex
    com.highcharts.HighchartsGenericObject.toCleanObject(new ChartResetZoomButtonTheme {
      override val zIndex: js.UndefOr[Double] = zIndexOuter
    })
  }
}
