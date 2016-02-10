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
  * @note JavaScript name: <code>plotOptions-waterfall-point</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsWaterfallPoint extends js.Object {

  /**
    * Events for each single point
    */
  val events: js.UndefOr[CleanJsObject[PlotOptionsWaterfallPointEvents]] = js.undefined
}

object PlotOptionsWaterfallPoint {
  /**
    * @param events Events for each single point
    */
  def apply(events: js.UndefOr[CleanJsObject[PlotOptionsWaterfallPointEvents]] = js.undefined): PlotOptionsWaterfallPoint = {
    val eventsOuter: js.UndefOr[CleanJsObject[PlotOptionsWaterfallPointEvents]] = events
    new PlotOptionsWaterfallPoint {
      override val events: js.UndefOr[CleanJsObject[PlotOptionsWaterfallPointEvents]] = eventsOuter
    }
  }
}
