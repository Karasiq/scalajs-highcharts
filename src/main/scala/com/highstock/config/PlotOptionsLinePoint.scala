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
  * @note JavaScript name: <code>plotOptions-line-point</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsLinePoint extends js.Object {

  /**
    * Events for each single point
    */
  val events: js.UndefOr[CleanJsObject[PlotOptionsLinePointEvents]] = js.undefined
}

object PlotOptionsLinePoint {
  /**
    * @param events Events for each single point
    */
  def apply(events: js.UndefOr[CleanJsObject[PlotOptionsLinePointEvents]] = js.undefined): PlotOptionsLinePoint = {
    val eventsOuter: js.UndefOr[CleanJsObject[PlotOptionsLinePointEvents]] = events
    new PlotOptionsLinePoint {
      override val events: js.UndefOr[CleanJsObject[PlotOptionsLinePointEvents]] = eventsOuter
    }
  }
}
