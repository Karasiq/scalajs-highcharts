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
  * @note JavaScript name: <code>plotOptions-heatmap-states</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsHeatmapStates extends js.Object {

  /**
    * Options for the hovered series
    */
  val hover: js.UndefOr[CleanJsObject[PlotOptionsHeatmapStatesHover]] = js.undefined
}

object PlotOptionsHeatmapStates {
  /**
    * @param hover Options for the hovered series
    */
  def apply(hover: js.UndefOr[CleanJsObject[PlotOptionsHeatmapStatesHover]] = js.undefined): PlotOptionsHeatmapStates = {
    val hoverOuter: js.UndefOr[CleanJsObject[PlotOptionsHeatmapStatesHover]] = hover
    new PlotOptionsHeatmapStates {
      override val hover: js.UndefOr[CleanJsObject[PlotOptionsHeatmapStatesHover]] = hoverOuter
    }
  }
}
