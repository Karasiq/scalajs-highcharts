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
  * @note JavaScript name: <code>plotOptions-arearange-point</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsArearangePoint extends js.Object {

  /**
    * Events for each single point
    */
  val events: js.UndefOr[CleanJsObject[PlotOptionsArearangePointEvents]] = js.undefined
}

object PlotOptionsArearangePoint {
  /**
    * @param events Events for each single point
    */
  def apply(events: js.UndefOr[CleanJsObject[PlotOptionsArearangePointEvents]] = js.undefined): PlotOptionsArearangePoint = {
    val eventsOuter: js.UndefOr[CleanJsObject[PlotOptionsArearangePointEvents]] = events
    new PlotOptionsArearangePoint {
      override val events: js.UndefOr[CleanJsObject[PlotOptionsArearangePointEvents]] = eventsOuter
    }
  }
}
