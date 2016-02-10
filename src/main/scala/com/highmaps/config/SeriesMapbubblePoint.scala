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
  * @note JavaScript name: <code>series&lt;mapbubble&gt;-point</code>
  */
@js.annotation.ScalaJSDefined
class SeriesMapbubblePoint extends js.Object {

  /**
    * Events for each single point
    */
  val events: js.UndefOr[CleanJsObject[SeriesMapbubblePointEvents]] = js.undefined
}

object SeriesMapbubblePoint {
  /**
    * @param events Events for each single point
    */
  def apply(events: js.UndefOr[CleanJsObject[SeriesMapbubblePointEvents]] = js.undefined): SeriesMapbubblePoint = {
    val eventsOuter: js.UndefOr[CleanJsObject[SeriesMapbubblePointEvents]] = events
    new SeriesMapbubblePoint {
      override val events: js.UndefOr[CleanJsObject[SeriesMapbubblePointEvents]] = eventsOuter
    }
  }
}
