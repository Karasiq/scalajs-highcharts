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
  * @note JavaScript name: <code>plotOptions-solidgauge-point</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsSolidgaugePoint extends js.Object {

  /**
    * Events for each single point
    */
  val events: js.UndefOr[CleanJsObject[PlotOptionsSolidgaugePointEvents]] = js.undefined
}

object PlotOptionsSolidgaugePoint {
  /**
    * @param events Events for each single point
    */
  def apply(events: js.UndefOr[CleanJsObject[PlotOptionsSolidgaugePointEvents]] = js.undefined): PlotOptionsSolidgaugePoint = {
    val eventsOuter: js.UndefOr[CleanJsObject[PlotOptionsSolidgaugePointEvents]] = events
    new PlotOptionsSolidgaugePoint {
      override val events: js.UndefOr[CleanJsObject[PlotOptionsSolidgaugePointEvents]] = eventsOuter
    }
  }
}
