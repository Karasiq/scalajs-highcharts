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
  * @note JavaScript name: <code>plotOptions-bubble-marker-states</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsBubbleMarkerStates extends js.Object {

  val hover: js.UndefOr[CleanJsObject[PlotOptionsBubbleMarkerStatesHover]] = js.undefined

  /**
    * The appearance of the point marker when selected. In order to allow a point to be 
    * 		selected, set the <code>series.allowPointSelect</code> option to true.
    */
  val select: js.UndefOr[CleanJsObject[PlotOptionsBubbleMarkerStatesSelect]] = js.undefined
}

object PlotOptionsBubbleMarkerStates {
  /**
    * @param select The appearance of the point marker when selected. In order to allow a point to be . 		selected, set the <code>series.allowPointSelect</code> option to true.
    */
  def apply(hover: js.UndefOr[CleanJsObject[PlotOptionsBubbleMarkerStatesHover]] = js.undefined, select: js.UndefOr[CleanJsObject[PlotOptionsBubbleMarkerStatesSelect]] = js.undefined): PlotOptionsBubbleMarkerStates = {
    val hoverOuter: js.UndefOr[CleanJsObject[PlotOptionsBubbleMarkerStatesHover]] = hover
    val selectOuter: js.UndefOr[CleanJsObject[PlotOptionsBubbleMarkerStatesSelect]] = select
    new PlotOptionsBubbleMarkerStates {
      override val hover: js.UndefOr[CleanJsObject[PlotOptionsBubbleMarkerStatesHover]] = hoverOuter
      override val select: js.UndefOr[CleanJsObject[PlotOptionsBubbleMarkerStatesSelect]] = selectOuter
    }
  }
}
