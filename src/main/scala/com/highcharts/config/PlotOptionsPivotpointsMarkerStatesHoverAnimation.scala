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
  * @note JavaScript name: <code>plotOptions-pivotpoints-marker-states-hover-animation</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsPivotpointsMarkerStatesHoverAnimation extends com.highcharts.HighchartsGenericObject {

  val duration: js.UndefOr[Double] = js.undefined
}

object PlotOptionsPivotpointsMarkerStatesHoverAnimation {
  /**
    */
  def apply(duration: js.UndefOr[Double] = js.undefined): PlotOptionsPivotpointsMarkerStatesHoverAnimation = {
    val durationOuter: js.UndefOr[Double] = duration
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsPivotpointsMarkerStatesHoverAnimation {
      override val duration: js.UndefOr[Double] = durationOuter
    })
  }
}
