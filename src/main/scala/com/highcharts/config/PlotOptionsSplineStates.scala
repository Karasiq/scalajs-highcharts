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
  * @note JavaScript name: <code>plotOptions-spline-states</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsSplineStates extends js.Object {

  /**
    * Options for the hovered series
    */
  val hover: js.UndefOr[CleanJsObject[PlotOptionsSplineStatesHover]] = js.undefined
}

object PlotOptionsSplineStates {
  /**
    * @param hover Options for the hovered series
    */
  def apply(hover: js.UndefOr[CleanJsObject[PlotOptionsSplineStatesHover]] = js.undefined): PlotOptionsSplineStates = {
    val hoverOuter: js.UndefOr[CleanJsObject[PlotOptionsSplineStatesHover]] = hover
    new PlotOptionsSplineStates {
      override val hover: js.UndefOr[CleanJsObject[PlotOptionsSplineStatesHover]] = hoverOuter
    }
  }
}
