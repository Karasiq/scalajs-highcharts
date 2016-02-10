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
  * @note JavaScript name: <code>series&lt;bubble&gt;-marker-states</code>
  */
@js.annotation.ScalaJSDefined
class SeriesBubbleMarkerStates extends js.Object {

  val hover: js.UndefOr[CleanJsObject[SeriesBubbleMarkerStatesHover]] = js.undefined

  /**
    * The appearance of the point marker when selected. In order to allow a point to be 
    * 		selected, set the <code>series.allowPointSelect</code> option to true.
    */
  val select: js.UndefOr[CleanJsObject[SeriesBubbleMarkerStatesSelect]] = js.undefined
}

object SeriesBubbleMarkerStates {
  /**
    * @param select The appearance of the point marker when selected. In order to allow a point to be . 		selected, set the <code>series.allowPointSelect</code> option to true.
    */
  def apply(hover: js.UndefOr[CleanJsObject[SeriesBubbleMarkerStatesHover]] = js.undefined, select: js.UndefOr[CleanJsObject[SeriesBubbleMarkerStatesSelect]] = js.undefined): SeriesBubbleMarkerStates = {
    val hoverOuter: js.UndefOr[CleanJsObject[SeriesBubbleMarkerStatesHover]] = hover
    val selectOuter: js.UndefOr[CleanJsObject[SeriesBubbleMarkerStatesSelect]] = select
    new SeriesBubbleMarkerStates {
      override val hover: js.UndefOr[CleanJsObject[SeriesBubbleMarkerStatesHover]] = hoverOuter
      override val select: js.UndefOr[CleanJsObject[SeriesBubbleMarkerStatesSelect]] = selectOuter
    }
  }
}
