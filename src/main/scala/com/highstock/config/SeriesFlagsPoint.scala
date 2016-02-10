/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highstock]]
  */
package com.highstock.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>series&lt;flags&gt;-point</code>
  */
@js.annotation.ScalaJSDefined
class SeriesFlagsPoint extends js.Object {

  /**
    * Events for each single point
    */
  val events: js.UndefOr[CleanJsObject[SeriesFlagsPointEvents]] = js.undefined
}

object SeriesFlagsPoint {
  /**
    * @param events Events for each single point
    */
  def apply(events: js.UndefOr[CleanJsObject[SeriesFlagsPointEvents]] = js.undefined): SeriesFlagsPoint = {
    val eventsOuter: js.UndefOr[CleanJsObject[SeriesFlagsPointEvents]] = events
    new SeriesFlagsPoint {
      override val events: js.UndefOr[CleanJsObject[SeriesFlagsPointEvents]] = eventsOuter
    }
  }
}
