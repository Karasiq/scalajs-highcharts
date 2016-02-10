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
  * @note JavaScript name: <code>series&lt;line&gt;-data-marker-states</code>
  */
@js.annotation.ScalaJSDefined
class SeriesLineDataMarkerStates extends js.Object {

  val hover: js.UndefOr[CleanJsObject[SeriesLineDataMarkerStatesHover]] = js.undefined

  /**
    * The appearance of the point marker when selected. In order to allow a point to be 
    * 		selected, set the <code>series.allowPointSelect</code> option to true.
    */
  val select: js.UndefOr[CleanJsObject[SeriesLineDataMarkerStatesSelect]] = js.undefined
}

object SeriesLineDataMarkerStates {
  /**
    * @param select The appearance of the point marker when selected. In order to allow a point to be . 		selected, set the <code>series.allowPointSelect</code> option to true.
    */
  def apply(hover: js.UndefOr[CleanJsObject[SeriesLineDataMarkerStatesHover]] = js.undefined, select: js.UndefOr[CleanJsObject[SeriesLineDataMarkerStatesSelect]] = js.undefined): SeriesLineDataMarkerStates = {
    val hoverOuter: js.UndefOr[CleanJsObject[SeriesLineDataMarkerStatesHover]] = hover
    val selectOuter: js.UndefOr[CleanJsObject[SeriesLineDataMarkerStatesSelect]] = select
    new SeriesLineDataMarkerStates {
      override val hover: js.UndefOr[CleanJsObject[SeriesLineDataMarkerStatesHover]] = hoverOuter
      override val select: js.UndefOr[CleanJsObject[SeriesLineDataMarkerStatesSelect]] = selectOuter
    }
  }
}
