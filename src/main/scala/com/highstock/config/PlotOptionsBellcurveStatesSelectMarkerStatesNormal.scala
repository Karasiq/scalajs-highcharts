/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highstock]]
  */
package com.highstock.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>plotOptions-bellcurve-states-select-marker-states-normal</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsBellcurveStatesSelectMarkerStatesNormal extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Animation when returning to normal state after hovering.</p>
    * @since 6.0.0
    */
  val animation: js.UndefOr[Boolean | js.Object] = js.undefined
}

object PlotOptionsBellcurveStatesSelectMarkerStatesNormal {
  /**
    * @param animation <p>Animation when returning to normal state after hovering.</p>
    */
  def apply(animation: js.UndefOr[Boolean | js.Object] = js.undefined): PlotOptionsBellcurveStatesSelectMarkerStatesNormal = {
    val animationOuter: js.UndefOr[Boolean | js.Object] = animation
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsBellcurveStatesSelectMarkerStatesNormal {
      override val animation: js.UndefOr[Boolean | js.Object] = animationOuter
    })
  }
}
