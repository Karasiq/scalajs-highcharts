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
  * @note JavaScript name: <code>navigator-series-marker</code>
  */
@js.annotation.ScalaJSDefined
class NavigatorSeriesMarker extends com.highcharts.HighchartsGenericObject {

  val enabled: js.UndefOr[Boolean] = js.undefined
}

object NavigatorSeriesMarker {
  /**
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined): NavigatorSeriesMarker = {
    val enabledOuter: js.UndefOr[Boolean] = enabled
    com.highcharts.HighchartsGenericObject.toCleanObject(new NavigatorSeriesMarker {
      override val enabled: js.UndefOr[Boolean] = enabledOuter
    })
  }
}
