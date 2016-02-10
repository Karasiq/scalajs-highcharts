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
  * @note JavaScript name: <code>series&lt;line&gt;-marker-states</code>
  */
@js.annotation.ScalaJSDefined
class SeriesLineMarkerStates extends js.Object {

  val hover: js.UndefOr[CleanJsObject[SeriesLineMarkerStatesHover]] = js.undefined

  /**
    * The appearance of the point marker when selected. In order to allow a point to be 
    * 		selected, set the <code>series.allowPointSelect</code> option to true.
    */
  val select: js.UndefOr[CleanJsObject[SeriesLineMarkerStatesSelect]] = js.undefined
}

object SeriesLineMarkerStates {
  /**
    * @param select The appearance of the point marker when selected. In order to allow a point to be . 		selected, set the <code>series.allowPointSelect</code> option to true.
    */
  def apply(hover: js.UndefOr[CleanJsObject[SeriesLineMarkerStatesHover]] = js.undefined, select: js.UndefOr[CleanJsObject[SeriesLineMarkerStatesSelect]] = js.undefined): SeriesLineMarkerStates = {
    val hoverOuter: js.UndefOr[CleanJsObject[SeriesLineMarkerStatesHover]] = hover
    val selectOuter: js.UndefOr[CleanJsObject[SeriesLineMarkerStatesSelect]] = select
    new SeriesLineMarkerStates {
      override val hover: js.UndefOr[CleanJsObject[SeriesLineMarkerStatesHover]] = hoverOuter
      override val select: js.UndefOr[CleanJsObject[SeriesLineMarkerStatesSelect]] = selectOuter
    }
  }
}
