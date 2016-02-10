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
  * @note JavaScript name: <code>plotOptions-bar-point</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsBarPoint extends js.Object {

  /**
    * Events for each single point
    */
  val events: js.UndefOr[CleanJsObject[PlotOptionsBarPointEvents]] = js.undefined
}

object PlotOptionsBarPoint {
  /**
    * @param events Events for each single point
    */
  def apply(events: js.UndefOr[CleanJsObject[PlotOptionsBarPointEvents]] = js.undefined): PlotOptionsBarPoint = {
    val eventsOuter: js.UndefOr[CleanJsObject[PlotOptionsBarPointEvents]] = events
    new PlotOptionsBarPoint {
      override val events: js.UndefOr[CleanJsObject[PlotOptionsBarPointEvents]] = eventsOuter
    }
  }
}
