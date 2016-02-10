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
  * @note JavaScript name: <code>plotOptions-treemap-states</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsTreemapStates extends js.Object {

  /**
    * Options for the hovered series
    */
  val hover: js.UndefOr[CleanJsObject[PlotOptionsTreemapStatesHover]] = js.undefined
}

object PlotOptionsTreemapStates {
  /**
    * @param hover Options for the hovered series
    */
  def apply(hover: js.UndefOr[CleanJsObject[PlotOptionsTreemapStatesHover]] = js.undefined): PlotOptionsTreemapStates = {
    val hoverOuter: js.UndefOr[CleanJsObject[PlotOptionsTreemapStatesHover]] = hover
    new PlotOptionsTreemapStates {
      override val hover: js.UndefOr[CleanJsObject[PlotOptionsTreemapStatesHover]] = hoverOuter
    }
  }
}
