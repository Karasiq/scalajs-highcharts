/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highmaps]]
  */
package com.highmaps.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>series&lt;heatmap&gt;-point</code>
  */
@js.annotation.ScalaJSDefined
class SeriesHeatmapPoint extends js.Object {

  /**
    * Events for each single point
    */
  val events: js.UndefOr[CleanJsObject[SeriesHeatmapPointEvents]] = js.undefined
}

object SeriesHeatmapPoint {
  /**
    * @param events Events for each single point
    */
  def apply(events: js.UndefOr[CleanJsObject[SeriesHeatmapPointEvents]] = js.undefined): SeriesHeatmapPoint = {
    val eventsOuter: js.UndefOr[CleanJsObject[SeriesHeatmapPointEvents]] = events
    new SeriesHeatmapPoint {
      override val events: js.UndefOr[CleanJsObject[SeriesHeatmapPointEvents]] = eventsOuter
    }
  }
}
