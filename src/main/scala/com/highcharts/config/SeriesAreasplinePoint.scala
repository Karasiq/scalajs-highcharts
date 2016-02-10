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
  * @note JavaScript name: <code>series&lt;areaspline&gt;-point</code>
  */
@js.annotation.ScalaJSDefined
class SeriesAreasplinePoint extends js.Object {

  /**
    * Events for each single point
    */
  val events: js.UndefOr[CleanJsObject[SeriesAreasplinePointEvents]] = js.undefined
}

object SeriesAreasplinePoint {
  /**
    * @param events Events for each single point
    */
  def apply(events: js.UndefOr[CleanJsObject[SeriesAreasplinePointEvents]] = js.undefined): SeriesAreasplinePoint = {
    val eventsOuter: js.UndefOr[CleanJsObject[SeriesAreasplinePointEvents]] = events
    new SeriesAreasplinePoint {
      override val events: js.UndefOr[CleanJsObject[SeriesAreasplinePointEvents]] = eventsOuter
    }
  }
}
