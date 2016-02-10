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
  * @note JavaScript name: <code>series&lt;scatter&gt;-marker-states</code>
  */
@js.annotation.ScalaJSDefined
class SeriesScatterMarkerStates extends js.Object {

  val hover: js.UndefOr[CleanJsObject[SeriesScatterMarkerStatesHover]] = js.undefined

  /**
    * The appearance of the point marker when selected. In order to allow a point to be 
    * 		selected, set the <code>series.allowPointSelect</code> option to true.
    */
  val select: js.UndefOr[CleanJsObject[SeriesScatterMarkerStatesSelect]] = js.undefined
}

object SeriesScatterMarkerStates {
  /**
    * @param select The appearance of the point marker when selected. In order to allow a point to be . 		selected, set the <code>series.allowPointSelect</code> option to true.
    */
  def apply(hover: js.UndefOr[CleanJsObject[SeriesScatterMarkerStatesHover]] = js.undefined, select: js.UndefOr[CleanJsObject[SeriesScatterMarkerStatesSelect]] = js.undefined): SeriesScatterMarkerStates = {
    val hoverOuter: js.UndefOr[CleanJsObject[SeriesScatterMarkerStatesHover]] = hover
    val selectOuter: js.UndefOr[CleanJsObject[SeriesScatterMarkerStatesSelect]] = select
    new SeriesScatterMarkerStates {
      override val hover: js.UndefOr[CleanJsObject[SeriesScatterMarkerStatesHover]] = hoverOuter
      override val select: js.UndefOr[CleanJsObject[SeriesScatterMarkerStatesSelect]] = selectOuter
    }
  }
}
