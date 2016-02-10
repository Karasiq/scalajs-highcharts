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
  * @note JavaScript name: <code>plotOptions-polygon-marker-states</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsPolygonMarkerStates extends js.Object {

  val hover: js.UndefOr[CleanJsObject[PlotOptionsPolygonMarkerStatesHover]] = js.undefined

  /**
    * The appearance of the point marker when selected. In order to allow a point to be 
    * 		selected, set the <code>series.allowPointSelect</code> option to true.
    */
  val select: js.UndefOr[CleanJsObject[PlotOptionsPolygonMarkerStatesSelect]] = js.undefined
}

object PlotOptionsPolygonMarkerStates {
  /**
    * @param select The appearance of the point marker when selected. In order to allow a point to be . 		selected, set the <code>series.allowPointSelect</code> option to true.
    */
  def apply(hover: js.UndefOr[CleanJsObject[PlotOptionsPolygonMarkerStatesHover]] = js.undefined, select: js.UndefOr[CleanJsObject[PlotOptionsPolygonMarkerStatesSelect]] = js.undefined): PlotOptionsPolygonMarkerStates = {
    val hoverOuter: js.UndefOr[CleanJsObject[PlotOptionsPolygonMarkerStatesHover]] = hover
    val selectOuter: js.UndefOr[CleanJsObject[PlotOptionsPolygonMarkerStatesSelect]] = select
    new PlotOptionsPolygonMarkerStates {
      override val hover: js.UndefOr[CleanJsObject[PlotOptionsPolygonMarkerStatesHover]] = hoverOuter
      override val select: js.UndefOr[CleanJsObject[PlotOptionsPolygonMarkerStatesSelect]] = selectOuter
    }
  }
}
