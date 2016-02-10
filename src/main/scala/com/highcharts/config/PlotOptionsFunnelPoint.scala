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
  * @note JavaScript name: <code>plotOptions-funnel-point</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsFunnelPoint extends js.Object {

  /**
    * Events for each single point
    */
  val events: js.UndefOr[CleanJsObject[PlotOptionsFunnelPointEvents]] = js.undefined
}

object PlotOptionsFunnelPoint {
  /**
    * @param events Events for each single point
    */
  def apply(events: js.UndefOr[CleanJsObject[PlotOptionsFunnelPointEvents]] = js.undefined): PlotOptionsFunnelPoint = {
    val eventsOuter: js.UndefOr[CleanJsObject[PlotOptionsFunnelPointEvents]] = events
    new PlotOptionsFunnelPoint {
      override val events: js.UndefOr[CleanJsObject[PlotOptionsFunnelPointEvents]] = eventsOuter
    }
  }
}
