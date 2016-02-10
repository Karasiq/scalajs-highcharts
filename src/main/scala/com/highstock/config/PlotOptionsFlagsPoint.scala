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
  * @note JavaScript name: <code>plotOptions-flags-point</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsFlagsPoint extends js.Object {

  /**
    * Events for each single point
    */
  val events: js.UndefOr[CleanJsObject[PlotOptionsFlagsPointEvents]] = js.undefined
}

object PlotOptionsFlagsPoint {
  /**
    * @param events Events for each single point
    */
  def apply(events: js.UndefOr[CleanJsObject[PlotOptionsFlagsPointEvents]] = js.undefined): PlotOptionsFlagsPoint = {
    val eventsOuter: js.UndefOr[CleanJsObject[PlotOptionsFlagsPointEvents]] = events
    new PlotOptionsFlagsPoint {
      override val events: js.UndefOr[CleanJsObject[PlotOptionsFlagsPointEvents]] = eventsOuter
    }
  }
}
