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
  * @note JavaScript name: <code>series&lt;pyramid&gt;-point</code>
  */
@js.annotation.ScalaJSDefined
class SeriesPyramidPoint extends js.Object {

  /**
    * Events for each single point
    */
  val events: js.UndefOr[CleanJsObject[SeriesPyramidPointEvents]] = js.undefined
}

object SeriesPyramidPoint {
  /**
    * @param events Events for each single point
    */
  def apply(events: js.UndefOr[CleanJsObject[SeriesPyramidPointEvents]] = js.undefined): SeriesPyramidPoint = {
    val eventsOuter: js.UndefOr[CleanJsObject[SeriesPyramidPointEvents]] = events
    new SeriesPyramidPoint {
      override val events: js.UndefOr[CleanJsObject[SeriesPyramidPointEvents]] = eventsOuter
    }
  }
}
