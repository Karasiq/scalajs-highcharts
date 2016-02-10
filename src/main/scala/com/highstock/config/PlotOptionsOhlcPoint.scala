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
  * @note JavaScript name: <code>plotOptions-ohlc-point</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsOhlcPoint extends js.Object {

  /**
    * Events for each single point
    */
  val events: js.UndefOr[CleanJsObject[PlotOptionsOhlcPointEvents]] = js.undefined
}

object PlotOptionsOhlcPoint {
  /**
    * @param events Events for each single point
    */
  def apply(events: js.UndefOr[CleanJsObject[PlotOptionsOhlcPointEvents]] = js.undefined): PlotOptionsOhlcPoint = {
    val eventsOuter: js.UndefOr[CleanJsObject[PlotOptionsOhlcPointEvents]] = events
    new PlotOptionsOhlcPoint {
      override val events: js.UndefOr[CleanJsObject[PlotOptionsOhlcPointEvents]] = eventsOuter
    }
  }
}
