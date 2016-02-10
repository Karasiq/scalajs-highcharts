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
  * @note JavaScript name: <code>series&lt;mapline&gt;-point</code>
  */
@js.annotation.ScalaJSDefined
class SeriesMaplinePoint extends js.Object {

  /**
    * Events for each single point
    */
  val events: js.UndefOr[CleanJsObject[SeriesMaplinePointEvents]] = js.undefined
}

object SeriesMaplinePoint {
  /**
    * @param events Events for each single point
    */
  def apply(events: js.UndefOr[CleanJsObject[SeriesMaplinePointEvents]] = js.undefined): SeriesMaplinePoint = {
    val eventsOuter: js.UndefOr[CleanJsObject[SeriesMaplinePointEvents]] = events
    new SeriesMaplinePoint {
      override val events: js.UndefOr[CleanJsObject[SeriesMaplinePointEvents]] = eventsOuter
    }
  }
}
