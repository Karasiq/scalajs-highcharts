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
  * @note JavaScript name: <code>series&lt;polygon&gt;-marker-states</code>
  */
@js.annotation.ScalaJSDefined
class SeriesPolygonMarkerStates extends js.Object {

  val hover: js.UndefOr[CleanJsObject[SeriesPolygonMarkerStatesHover]] = js.undefined

  /**
    * The appearance of the point marker when selected. In order to allow a point to be 
    * 		selected, set the <code>series.allowPointSelect</code> option to true.
    */
  val select: js.UndefOr[CleanJsObject[SeriesPolygonMarkerStatesSelect]] = js.undefined
}

object SeriesPolygonMarkerStates {
  /**
    * @param select The appearance of the point marker when selected. In order to allow a point to be . 		selected, set the <code>series.allowPointSelect</code> option to true.
    */
  def apply(hover: js.UndefOr[CleanJsObject[SeriesPolygonMarkerStatesHover]] = js.undefined, select: js.UndefOr[CleanJsObject[SeriesPolygonMarkerStatesSelect]] = js.undefined): SeriesPolygonMarkerStates = {
    val hoverOuter: js.UndefOr[CleanJsObject[SeriesPolygonMarkerStatesHover]] = hover
    val selectOuter: js.UndefOr[CleanJsObject[SeriesPolygonMarkerStatesSelect]] = select
    new SeriesPolygonMarkerStates {
      override val hover: js.UndefOr[CleanJsObject[SeriesPolygonMarkerStatesHover]] = hoverOuter
      override val select: js.UndefOr[CleanJsObject[SeriesPolygonMarkerStatesSelect]] = selectOuter
    }
  }
}
