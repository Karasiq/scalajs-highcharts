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
  * @note JavaScript name: <code>plotOptions-candlestick-states</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsCandlestickStates extends js.Object {

  /**
    * Options for the hovered series
    */
  val hover: js.UndefOr[CleanJsObject[PlotOptionsCandlestickStatesHover]] = js.undefined
}

object PlotOptionsCandlestickStates {
  /**
    * @param hover Options for the hovered series
    */
  def apply(hover: js.UndefOr[CleanJsObject[PlotOptionsCandlestickStatesHover]] = js.undefined): PlotOptionsCandlestickStates = {
    val hoverOuter: js.UndefOr[CleanJsObject[PlotOptionsCandlestickStatesHover]] = hover
    new PlotOptionsCandlestickStates {
      override val hover: js.UndefOr[CleanJsObject[PlotOptionsCandlestickStatesHover]] = hoverOuter
    }
  }
}
