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
  * @note JavaScript name: <code>plotOptions-line-marker-states</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsLineMarkerStates extends js.Object {

  val hover: js.UndefOr[CleanJsObject[PlotOptionsLineMarkerStatesHover]] = js.undefined

  /**
    * The appearance of the point marker when selected. In order to allow a point to be 
    * 		selected, set the <code>series.allowPointSelect</code> option to true.
    */
  val select: js.UndefOr[CleanJsObject[PlotOptionsLineMarkerStatesSelect]] = js.undefined
}

object PlotOptionsLineMarkerStates {
  /**
    * @param select The appearance of the point marker when selected. In order to allow a point to be . 		selected, set the <code>series.allowPointSelect</code> option to true.
    */
  def apply(hover: js.UndefOr[CleanJsObject[PlotOptionsLineMarkerStatesHover]] = js.undefined, select: js.UndefOr[CleanJsObject[PlotOptionsLineMarkerStatesSelect]] = js.undefined): PlotOptionsLineMarkerStates = {
    val hoverOuter: js.UndefOr[CleanJsObject[PlotOptionsLineMarkerStatesHover]] = hover
    val selectOuter: js.UndefOr[CleanJsObject[PlotOptionsLineMarkerStatesSelect]] = select
    new PlotOptionsLineMarkerStates {
      override val hover: js.UndefOr[CleanJsObject[PlotOptionsLineMarkerStatesHover]] = hoverOuter
      override val select: js.UndefOr[CleanJsObject[PlotOptionsLineMarkerStatesSelect]] = selectOuter
    }
  }
}
