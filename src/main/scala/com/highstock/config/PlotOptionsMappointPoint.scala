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
  * @note JavaScript name: <code>plotOptions-mappoint-point</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsMappointPoint extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Events for each single point.</p>
    */
  val events: js.Any = js.undefined
}

object PlotOptionsMappointPoint {
  /**
    * @param events <p>Events for each single point.</p>
    */
  def apply(events: js.UndefOr[js.Any] = js.undefined): PlotOptionsMappointPoint = {
    val eventsOuter: js.Any = events
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsMappointPoint {
      override val events: js.Any = eventsOuter
    })
  }
}
