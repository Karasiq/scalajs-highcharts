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
  * @note JavaScript name: <code>series&lt;candlestick&gt;-point</code>
  */
@js.annotation.ScalaJSDefined
class SeriesCandlestickPoint extends js.Object {

  /**
    * Events for each single point
    */
  val events: js.UndefOr[CleanJsObject[SeriesCandlestickPointEvents]] = js.undefined
}

object SeriesCandlestickPoint {
  /**
    * @param events Events for each single point
    */
  def apply(events: js.UndefOr[CleanJsObject[SeriesCandlestickPointEvents]] = js.undefined): SeriesCandlestickPoint = {
    val eventsOuter: js.UndefOr[CleanJsObject[SeriesCandlestickPointEvents]] = events
    new SeriesCandlestickPoint {
      override val events: js.UndefOr[CleanJsObject[SeriesCandlestickPointEvents]] = eventsOuter
    }
  }
}
