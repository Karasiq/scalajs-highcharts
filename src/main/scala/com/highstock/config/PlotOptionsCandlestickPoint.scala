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
  * @note JavaScript name: <code>plotOptions-candlestick-point</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsCandlestickPoint extends js.Object {

  /**
    * Events for each single point
    */
  val events: js.UndefOr[CleanJsObject[PlotOptionsCandlestickPointEvents]] = js.undefined
}

object PlotOptionsCandlestickPoint {
  /**
    * @param events Events for each single point
    */
  def apply(events: js.UndefOr[CleanJsObject[PlotOptionsCandlestickPointEvents]] = js.undefined): PlotOptionsCandlestickPoint = {
    val eventsOuter: js.UndefOr[CleanJsObject[PlotOptionsCandlestickPointEvents]] = events
    new PlotOptionsCandlestickPoint {
      override val events: js.UndefOr[CleanJsObject[PlotOptionsCandlestickPointEvents]] = eventsOuter
    }
  }
}
