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
  * @note JavaScript name: <code>plotOptions-pyramid-point</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsPyramidPoint extends js.Object {

  /**
    * Events for each single point
    */
  val events: js.UndefOr[CleanJsObject[PlotOptionsPyramidPointEvents]] = js.undefined
}

object PlotOptionsPyramidPoint {
  /**
    * @param events Events for each single point
    */
  def apply(events: js.UndefOr[CleanJsObject[PlotOptionsPyramidPointEvents]] = js.undefined): PlotOptionsPyramidPoint = {
    val eventsOuter: js.UndefOr[CleanJsObject[PlotOptionsPyramidPointEvents]] = events
    new PlotOptionsPyramidPoint {
      override val events: js.UndefOr[CleanJsObject[PlotOptionsPyramidPointEvents]] = eventsOuter
    }
  }
}
