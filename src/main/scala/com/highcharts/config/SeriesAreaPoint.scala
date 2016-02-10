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
  * @note JavaScript name: <code>series&lt;area&gt;-point</code>
  */
@js.annotation.ScalaJSDefined
class SeriesAreaPoint extends js.Object {

  /**
    * Events for each single point
    */
  val events: js.UndefOr[CleanJsObject[SeriesAreaPointEvents]] = js.undefined
}

object SeriesAreaPoint {
  /**
    * @param events Events for each single point
    */
  def apply(events: js.UndefOr[CleanJsObject[SeriesAreaPointEvents]] = js.undefined): SeriesAreaPoint = {
    val eventsOuter: js.UndefOr[CleanJsObject[SeriesAreaPointEvents]] = events
    new SeriesAreaPoint {
      override val events: js.UndefOr[CleanJsObject[SeriesAreaPointEvents]] = eventsOuter
    }
  }
}
