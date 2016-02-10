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
  * @note JavaScript name: <code>plotOptions-polygon-point</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsPolygonPoint extends js.Object {

  /**
    * Events for each single point
    */
  val events: js.UndefOr[CleanJsObject[PlotOptionsPolygonPointEvents]] = js.undefined
}

object PlotOptionsPolygonPoint {
  /**
    * @param events Events for each single point
    */
  def apply(events: js.UndefOr[CleanJsObject[PlotOptionsPolygonPointEvents]] = js.undefined): PlotOptionsPolygonPoint = {
    val eventsOuter: js.UndefOr[CleanJsObject[PlotOptionsPolygonPointEvents]] = events
    new PlotOptionsPolygonPoint {
      override val events: js.UndefOr[CleanJsObject[PlotOptionsPolygonPointEvents]] = eventsOuter
    }
  }
}
