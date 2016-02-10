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
  * @note JavaScript name: <code>plotOptions-scatter-marker-states</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsScatterMarkerStates extends js.Object {

  val hover: js.UndefOr[CleanJsObject[PlotOptionsScatterMarkerStatesHover]] = js.undefined

  /**
    * The appearance of the point marker when selected. In order to allow a point to be 
    * 		selected, set the <code>series.allowPointSelect</code> option to true.
    */
  val select: js.UndefOr[CleanJsObject[PlotOptionsScatterMarkerStatesSelect]] = js.undefined
}

object PlotOptionsScatterMarkerStates {
  /**
    * @param select The appearance of the point marker when selected. In order to allow a point to be . 		selected, set the <code>series.allowPointSelect</code> option to true.
    */
  def apply(hover: js.UndefOr[CleanJsObject[PlotOptionsScatterMarkerStatesHover]] = js.undefined, select: js.UndefOr[CleanJsObject[PlotOptionsScatterMarkerStatesSelect]] = js.undefined): PlotOptionsScatterMarkerStates = {
    val hoverOuter: js.UndefOr[CleanJsObject[PlotOptionsScatterMarkerStatesHover]] = hover
    val selectOuter: js.UndefOr[CleanJsObject[PlotOptionsScatterMarkerStatesSelect]] = select
    new PlotOptionsScatterMarkerStates {
      override val hover: js.UndefOr[CleanJsObject[PlotOptionsScatterMarkerStatesHover]] = hoverOuter
      override val select: js.UndefOr[CleanJsObject[PlotOptionsScatterMarkerStatesSelect]] = selectOuter
    }
  }
}
