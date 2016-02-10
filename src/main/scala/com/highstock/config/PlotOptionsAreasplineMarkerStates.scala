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
  * @note JavaScript name: <code>plotOptions-areaspline-marker-states</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsAreasplineMarkerStates extends js.Object {

  val hover: js.UndefOr[CleanJsObject[PlotOptionsAreasplineMarkerStatesHover]] = js.undefined

  /**
    * The appearance of the point marker when selected. In order to allow a point to be 
    * 		selected, set the <code>series.allowPointSelect</code> option to true.
    */
  val select: js.UndefOr[CleanJsObject[PlotOptionsAreasplineMarkerStatesSelect]] = js.undefined
}

object PlotOptionsAreasplineMarkerStates {
  /**
    * @param select The appearance of the point marker when selected. In order to allow a point to be . 		selected, set the <code>series.allowPointSelect</code> option to true.
    */
  def apply(hover: js.UndefOr[CleanJsObject[PlotOptionsAreasplineMarkerStatesHover]] = js.undefined, select: js.UndefOr[CleanJsObject[PlotOptionsAreasplineMarkerStatesSelect]] = js.undefined): PlotOptionsAreasplineMarkerStates = {
    val hoverOuter: js.UndefOr[CleanJsObject[PlotOptionsAreasplineMarkerStatesHover]] = hover
    val selectOuter: js.UndefOr[CleanJsObject[PlotOptionsAreasplineMarkerStatesSelect]] = select
    new PlotOptionsAreasplineMarkerStates {
      override val hover: js.UndefOr[CleanJsObject[PlotOptionsAreasplineMarkerStatesHover]] = hoverOuter
      override val select: js.UndefOr[CleanJsObject[PlotOptionsAreasplineMarkerStatesSelect]] = selectOuter
    }
  }
}
