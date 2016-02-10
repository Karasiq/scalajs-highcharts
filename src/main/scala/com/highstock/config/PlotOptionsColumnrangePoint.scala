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
  * @note JavaScript name: <code>plotOptions-columnrange-point</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsColumnrangePoint extends js.Object {

  /**
    * Events for each single point
    */
  val events: js.UndefOr[CleanJsObject[PlotOptionsColumnrangePointEvents]] = js.undefined
}

object PlotOptionsColumnrangePoint {
  /**
    * @param events Events for each single point
    */
  def apply(events: js.UndefOr[CleanJsObject[PlotOptionsColumnrangePointEvents]] = js.undefined): PlotOptionsColumnrangePoint = {
    val eventsOuter: js.UndefOr[CleanJsObject[PlotOptionsColumnrangePointEvents]] = events
    new PlotOptionsColumnrangePoint {
      override val events: js.UndefOr[CleanJsObject[PlotOptionsColumnrangePointEvents]] = eventsOuter
    }
  }
}
