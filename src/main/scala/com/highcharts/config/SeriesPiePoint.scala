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
  * @note JavaScript name: <code>series&lt;pie&gt;-point</code>
  */
@js.annotation.ScalaJSDefined
class SeriesPiePoint extends js.Object {

  /**
    * Events for each single point
    */
  val events: js.UndefOr[CleanJsObject[SeriesPiePointEvents]] = js.undefined
}

object SeriesPiePoint {
  /**
    * @param events Events for each single point
    */
  def apply(events: js.UndefOr[CleanJsObject[SeriesPiePointEvents]] = js.undefined): SeriesPiePoint = {
    val eventsOuter: js.UndefOr[CleanJsObject[SeriesPiePointEvents]] = events
    new SeriesPiePoint {
      override val events: js.UndefOr[CleanJsObject[SeriesPiePointEvents]] = eventsOuter
    }
  }
}
