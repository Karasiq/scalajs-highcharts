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
  * @note JavaScript name: <code>series&lt;candlestick&gt;-states</code>
  */
@js.annotation.ScalaJSDefined
class SeriesCandlestickStates extends js.Object {

  /**
    * Options for the hovered series
    */
  val hover: js.UndefOr[CleanJsObject[SeriesCandlestickStatesHover]] = js.undefined
}

object SeriesCandlestickStates {
  /**
    * @param hover Options for the hovered series
    */
  def apply(hover: js.UndefOr[CleanJsObject[SeriesCandlestickStatesHover]] = js.undefined): SeriesCandlestickStates = {
    val hoverOuter: js.UndefOr[CleanJsObject[SeriesCandlestickStatesHover]] = hover
    new SeriesCandlestickStates {
      override val hover: js.UndefOr[CleanJsObject[SeriesCandlestickStatesHover]] = hoverOuter
    }
  }
}
