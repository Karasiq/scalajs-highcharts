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
  * @note JavaScript name: <code>series&lt;polygon&gt;-data-marker-states</code>
  */
@js.annotation.ScalaJSDefined
class SeriesPolygonDataMarkerStates extends js.Object {

  val hover: js.UndefOr[CleanJsObject[SeriesPolygonDataMarkerStatesHover]] = js.undefined

  /**
    * The appearance of the point marker when selected. In order to allow a point to be 
    * 		selected, set the <code>series.allowPointSelect</code> option to true.
    */
  val select: js.UndefOr[CleanJsObject[SeriesPolygonDataMarkerStatesSelect]] = js.undefined
}

object SeriesPolygonDataMarkerStates {
  /**
    * @param select The appearance of the point marker when selected. In order to allow a point to be . 		selected, set the <code>series.allowPointSelect</code> option to true.
    */
  def apply(hover: js.UndefOr[CleanJsObject[SeriesPolygonDataMarkerStatesHover]] = js.undefined, select: js.UndefOr[CleanJsObject[SeriesPolygonDataMarkerStatesSelect]] = js.undefined): SeriesPolygonDataMarkerStates = {
    val hoverOuter: js.UndefOr[CleanJsObject[SeriesPolygonDataMarkerStatesHover]] = hover
    val selectOuter: js.UndefOr[CleanJsObject[SeriesPolygonDataMarkerStatesSelect]] = select
    new SeriesPolygonDataMarkerStates {
      override val hover: js.UndefOr[CleanJsObject[SeriesPolygonDataMarkerStatesHover]] = hoverOuter
      override val select: js.UndefOr[CleanJsObject[SeriesPolygonDataMarkerStatesSelect]] = selectOuter
    }
  }
}
