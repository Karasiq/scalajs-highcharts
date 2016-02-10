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
  * @note JavaScript name: <code>plotOptions-ohlc-states</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsOhlcStates extends js.Object {

  /**
    * Options for the hovered series
    */
  val hover: js.UndefOr[CleanJsObject[PlotOptionsOhlcStatesHover]] = js.undefined
}

object PlotOptionsOhlcStates {
  /**
    * @param hover Options for the hovered series
    */
  def apply(hover: js.UndefOr[CleanJsObject[PlotOptionsOhlcStatesHover]] = js.undefined): PlotOptionsOhlcStates = {
    val hoverOuter: js.UndefOr[CleanJsObject[PlotOptionsOhlcStatesHover]] = hover
    new PlotOptionsOhlcStates {
      override val hover: js.UndefOr[CleanJsObject[PlotOptionsOhlcStatesHover]] = hoverOuter
    }
  }
}
