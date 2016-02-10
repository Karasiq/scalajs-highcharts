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
  * @note JavaScript name: <code>plotOptions-series-point</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsSeriesPoint extends js.Object {

  /**
    * Events for each single point
    */
  val events: js.UndefOr[CleanJsObject[PlotOptionsSeriesPointEvents]] = js.undefined
}

object PlotOptionsSeriesPoint {
  /**
    * @param events Events for each single point
    */
  def apply(events: js.UndefOr[CleanJsObject[PlotOptionsSeriesPointEvents]] = js.undefined): PlotOptionsSeriesPoint = {
    val eventsOuter: js.UndefOr[CleanJsObject[PlotOptionsSeriesPointEvents]] = events
    new PlotOptionsSeriesPoint {
      override val events: js.UndefOr[CleanJsObject[PlotOptionsSeriesPointEvents]] = eventsOuter
    }
  }
}
