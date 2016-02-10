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
  * @note JavaScript name: <code>plotOptions-polygon-states</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsPolygonStates extends js.Object {

  /**
    * Options for the hovered series
    */
  val hover: js.UndefOr[CleanJsObject[PlotOptionsPolygonStatesHover]] = js.undefined
}

object PlotOptionsPolygonStates {
  /**
    * @param hover Options for the hovered series
    */
  def apply(hover: js.UndefOr[CleanJsObject[PlotOptionsPolygonStatesHover]] = js.undefined): PlotOptionsPolygonStates = {
    val hoverOuter: js.UndefOr[CleanJsObject[PlotOptionsPolygonStatesHover]] = hover
    new PlotOptionsPolygonStates {
      override val hover: js.UndefOr[CleanJsObject[PlotOptionsPolygonStatesHover]] = hoverOuter
    }
  }
}
