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
  * @note JavaScript name: <code>series&lt;area&gt;-marker-states</code>
  */
@js.annotation.ScalaJSDefined
class SeriesAreaMarkerStates extends js.Object {

  val hover: js.UndefOr[CleanJsObject[SeriesAreaMarkerStatesHover]] = js.undefined

  /**
    * The appearance of the point marker when selected. In order to allow a point to be 
    * 		selected, set the <code>series.allowPointSelect</code> option to true.
    */
  val select: js.UndefOr[CleanJsObject[SeriesAreaMarkerStatesSelect]] = js.undefined
}

object SeriesAreaMarkerStates {
  /**
    * @param select The appearance of the point marker when selected. In order to allow a point to be . 		selected, set the <code>series.allowPointSelect</code> option to true.
    */
  def apply(hover: js.UndefOr[CleanJsObject[SeriesAreaMarkerStatesHover]] = js.undefined, select: js.UndefOr[CleanJsObject[SeriesAreaMarkerStatesSelect]] = js.undefined): SeriesAreaMarkerStates = {
    val hoverOuter: js.UndefOr[CleanJsObject[SeriesAreaMarkerStatesHover]] = hover
    val selectOuter: js.UndefOr[CleanJsObject[SeriesAreaMarkerStatesSelect]] = select
    new SeriesAreaMarkerStates {
      override val hover: js.UndefOr[CleanJsObject[SeriesAreaMarkerStatesHover]] = hoverOuter
      override val select: js.UndefOr[CleanJsObject[SeriesAreaMarkerStatesSelect]] = selectOuter
    }
  }
}
