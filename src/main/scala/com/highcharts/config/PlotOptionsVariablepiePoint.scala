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
  * @note JavaScript name: <code>plotOptions-variablepie-point</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsVariablepiePoint extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Events for each single point.</p>
    * @since 6.0.0
    */
  val events: js.Any = js.undefined
}

object PlotOptionsVariablepiePoint {
  /**
    * @param events <p>Events for each single point.</p>
    */
  def apply(events: js.UndefOr[js.Any] = js.undefined): PlotOptionsVariablepiePoint = {
    val eventsOuter: js.Any = events
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsVariablepiePoint {
      override val events: js.Any = eventsOuter
    })
  }
}
