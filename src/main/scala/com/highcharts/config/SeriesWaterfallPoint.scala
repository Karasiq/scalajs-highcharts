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
  * @note JavaScript name: <code>series&lt;waterfall&gt;-point</code>
  */
@js.annotation.ScalaJSDefined
class SeriesWaterfallPoint extends js.Object {

  /**
    * Events for each single point
    */
  val events: js.UndefOr[CleanJsObject[SeriesWaterfallPointEvents]] = js.undefined
}

object SeriesWaterfallPoint {
  /**
    * @param events Events for each single point
    */
  def apply(events: js.UndefOr[CleanJsObject[SeriesWaterfallPointEvents]] = js.undefined): SeriesWaterfallPoint = {
    val eventsOuter: js.UndefOr[CleanJsObject[SeriesWaterfallPointEvents]] = events
    new SeriesWaterfallPoint {
      override val events: js.UndefOr[CleanJsObject[SeriesWaterfallPointEvents]] = eventsOuter
    }
  }
}
