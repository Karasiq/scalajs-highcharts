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
  * @note JavaScript name: <code>plotOptions-boxplot-point</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsBoxplotPoint extends js.Object {

  /**
    * Events for each single point
    */
  val events: js.UndefOr[CleanJsObject[PlotOptionsBoxplotPointEvents]] = js.undefined
}

object PlotOptionsBoxplotPoint {
  /**
    * @param events Events for each single point
    */
  def apply(events: js.UndefOr[CleanJsObject[PlotOptionsBoxplotPointEvents]] = js.undefined): PlotOptionsBoxplotPoint = {
    val eventsOuter: js.UndefOr[CleanJsObject[PlotOptionsBoxplotPointEvents]] = events
    new PlotOptionsBoxplotPoint {
      override val events: js.UndefOr[CleanJsObject[PlotOptionsBoxplotPointEvents]] = eventsOuter
    }
  }
}
