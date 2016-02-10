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
  * @note JavaScript name: <code>series&lt;spline&gt;-data-marker-states</code>
  */
@js.annotation.ScalaJSDefined
class SeriesSplineDataMarkerStates extends js.Object {

  val hover: js.UndefOr[CleanJsObject[SeriesSplineDataMarkerStatesHover]] = js.undefined

  /**
    * The appearance of the point marker when selected. In order to allow a point to be 
    * 		selected, set the <code>series.allowPointSelect</code> option to true.
    */
  val select: js.UndefOr[CleanJsObject[SeriesSplineDataMarkerStatesSelect]] = js.undefined
}

object SeriesSplineDataMarkerStates {
  /**
    * @param select The appearance of the point marker when selected. In order to allow a point to be . 		selected, set the <code>series.allowPointSelect</code> option to true.
    */
  def apply(hover: js.UndefOr[CleanJsObject[SeriesSplineDataMarkerStatesHover]] = js.undefined, select: js.UndefOr[CleanJsObject[SeriesSplineDataMarkerStatesSelect]] = js.undefined): SeriesSplineDataMarkerStates = {
    val hoverOuter: js.UndefOr[CleanJsObject[SeriesSplineDataMarkerStatesHover]] = hover
    val selectOuter: js.UndefOr[CleanJsObject[SeriesSplineDataMarkerStatesSelect]] = select
    new SeriesSplineDataMarkerStates {
      override val hover: js.UndefOr[CleanJsObject[SeriesSplineDataMarkerStatesHover]] = hoverOuter
      override val select: js.UndefOr[CleanJsObject[SeriesSplineDataMarkerStatesSelect]] = selectOuter
    }
  }
}
