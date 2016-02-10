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
  * @note JavaScript name: <code>series&lt;area&gt;-data-marker-states</code>
  */
@js.annotation.ScalaJSDefined
class SeriesAreaDataMarkerStates extends js.Object {

  val hover: js.UndefOr[CleanJsObject[SeriesAreaDataMarkerStatesHover]] = js.undefined

  /**
    * The appearance of the point marker when selected. In order to allow a point to be 
    * 		selected, set the <code>series.allowPointSelect</code> option to true.
    */
  val select: js.UndefOr[CleanJsObject[SeriesAreaDataMarkerStatesSelect]] = js.undefined
}

object SeriesAreaDataMarkerStates {
  /**
    * @param select The appearance of the point marker when selected. In order to allow a point to be . 		selected, set the <code>series.allowPointSelect</code> option to true.
    */
  def apply(hover: js.UndefOr[CleanJsObject[SeriesAreaDataMarkerStatesHover]] = js.undefined, select: js.UndefOr[CleanJsObject[SeriesAreaDataMarkerStatesSelect]] = js.undefined): SeriesAreaDataMarkerStates = {
    val hoverOuter: js.UndefOr[CleanJsObject[SeriesAreaDataMarkerStatesHover]] = hover
    val selectOuter: js.UndefOr[CleanJsObject[SeriesAreaDataMarkerStatesSelect]] = select
    new SeriesAreaDataMarkerStates {
      override val hover: js.UndefOr[CleanJsObject[SeriesAreaDataMarkerStatesHover]] = hoverOuter
      override val select: js.UndefOr[CleanJsObject[SeriesAreaDataMarkerStatesSelect]] = selectOuter
    }
  }
}
