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
  * @note JavaScript name: <code>plotOptions-spline-marker-states</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsSplineMarkerStates extends js.Object {

  val hover: js.UndefOr[CleanJsObject[PlotOptionsSplineMarkerStatesHover]] = js.undefined

  /**
    * The appearance of the point marker when selected. In order to allow a point to be 
    * 		selected, set the <code>series.allowPointSelect</code> option to true.
    */
  val select: js.UndefOr[CleanJsObject[PlotOptionsSplineMarkerStatesSelect]] = js.undefined
}

object PlotOptionsSplineMarkerStates {
  /**
    * @param select The appearance of the point marker when selected. In order to allow a point to be . 		selected, set the <code>series.allowPointSelect</code> option to true.
    */
  def apply(hover: js.UndefOr[CleanJsObject[PlotOptionsSplineMarkerStatesHover]] = js.undefined, select: js.UndefOr[CleanJsObject[PlotOptionsSplineMarkerStatesSelect]] = js.undefined): PlotOptionsSplineMarkerStates = {
    val hoverOuter: js.UndefOr[CleanJsObject[PlotOptionsSplineMarkerStatesHover]] = hover
    val selectOuter: js.UndefOr[CleanJsObject[PlotOptionsSplineMarkerStatesSelect]] = select
    new PlotOptionsSplineMarkerStates {
      override val hover: js.UndefOr[CleanJsObject[PlotOptionsSplineMarkerStatesHover]] = hoverOuter
      override val select: js.UndefOr[CleanJsObject[PlotOptionsSplineMarkerStatesSelect]] = selectOuter
    }
  }
}
