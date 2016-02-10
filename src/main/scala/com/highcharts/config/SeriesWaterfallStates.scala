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
  * @note JavaScript name: <code>series&lt;waterfall&gt;-states</code>
  */
@js.annotation.ScalaJSDefined
class SeriesWaterfallStates extends js.Object {

  /**
    * Options for the hovered series
    */
  val hover: js.UndefOr[CleanJsObject[SeriesWaterfallStatesHover]] = js.undefined
}

object SeriesWaterfallStates {
  /**
    * @param hover Options for the hovered series
    */
  def apply(hover: js.UndefOr[CleanJsObject[SeriesWaterfallStatesHover]] = js.undefined): SeriesWaterfallStates = {
    val hoverOuter: js.UndefOr[CleanJsObject[SeriesWaterfallStatesHover]] = hover
    new SeriesWaterfallStates {
      override val hover: js.UndefOr[CleanJsObject[SeriesWaterfallStatesHover]] = hoverOuter
    }
  }
}
