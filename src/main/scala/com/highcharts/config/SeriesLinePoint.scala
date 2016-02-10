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
  * @note JavaScript name: <code>series&lt;line&gt;-point</code>
  */
@js.annotation.ScalaJSDefined
class SeriesLinePoint extends js.Object {

  /**
    * Events for each single point
    */
  val events: js.UndefOr[CleanJsObject[SeriesLinePointEvents]] = js.undefined
}

object SeriesLinePoint {
  /**
    * @param events Events for each single point
    */
  def apply(events: js.UndefOr[CleanJsObject[SeriesLinePointEvents]] = js.undefined): SeriesLinePoint = {
    val eventsOuter: js.UndefOr[CleanJsObject[SeriesLinePointEvents]] = events
    new SeriesLinePoint {
      override val events: js.UndefOr[CleanJsObject[SeriesLinePointEvents]] = eventsOuter
    }
  }
}
