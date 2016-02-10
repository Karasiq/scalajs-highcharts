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
  * @note JavaScript name: <code>plotOptions-waterfall-states</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsWaterfallStates extends js.Object {

  /**
    * Options for the hovered series
    */
  val hover: js.UndefOr[CleanJsObject[PlotOptionsWaterfallStatesHover]] = js.undefined
}

object PlotOptionsWaterfallStates {
  /**
    * @param hover Options for the hovered series
    */
  def apply(hover: js.UndefOr[CleanJsObject[PlotOptionsWaterfallStatesHover]] = js.undefined): PlotOptionsWaterfallStates = {
    val hoverOuter: js.UndefOr[CleanJsObject[PlotOptionsWaterfallStatesHover]] = hover
    new PlotOptionsWaterfallStates {
      override val hover: js.UndefOr[CleanJsObject[PlotOptionsWaterfallStatesHover]] = hoverOuter
    }
  }
}
