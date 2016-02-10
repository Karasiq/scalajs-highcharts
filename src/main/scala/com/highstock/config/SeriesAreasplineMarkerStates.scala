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
  * @note JavaScript name: <code>series&lt;areaspline&gt;-marker-states</code>
  */
@js.annotation.ScalaJSDefined
class SeriesAreasplineMarkerStates extends js.Object {

  val hover: js.UndefOr[CleanJsObject[SeriesAreasplineMarkerStatesHover]] = js.undefined

  /**
    * The appearance of the point marker when selected. In order to allow a point to be 
    * 		selected, set the <code>series.allowPointSelect</code> option to true.
    */
  val select: js.UndefOr[CleanJsObject[SeriesAreasplineMarkerStatesSelect]] = js.undefined
}

object SeriesAreasplineMarkerStates {
  /**
    * @param select The appearance of the point marker when selected. In order to allow a point to be . 		selected, set the <code>series.allowPointSelect</code> option to true.
    */
  def apply(hover: js.UndefOr[CleanJsObject[SeriesAreasplineMarkerStatesHover]] = js.undefined, select: js.UndefOr[CleanJsObject[SeriesAreasplineMarkerStatesSelect]] = js.undefined): SeriesAreasplineMarkerStates = {
    val hoverOuter: js.UndefOr[CleanJsObject[SeriesAreasplineMarkerStatesHover]] = hover
    val selectOuter: js.UndefOr[CleanJsObject[SeriesAreasplineMarkerStatesSelect]] = select
    new SeriesAreasplineMarkerStates {
      override val hover: js.UndefOr[CleanJsObject[SeriesAreasplineMarkerStatesHover]] = hoverOuter
      override val select: js.UndefOr[CleanJsObject[SeriesAreasplineMarkerStatesSelect]] = selectOuter
    }
  }
}
