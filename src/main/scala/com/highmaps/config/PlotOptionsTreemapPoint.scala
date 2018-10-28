/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highmaps]]
  */
package com.highmaps.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>plotOptions-treemap-point</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsTreemapPoint extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Events for each single point.</p>
    */
  val events: js.Any = js.undefined
}

object PlotOptionsTreemapPoint {
  /**
    * @param events <p>Events for each single point.</p>
    */
  def apply(events: js.UndefOr[js.Any] = js.undefined): PlotOptionsTreemapPoint = {
    val eventsOuter: js.Any = events
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsTreemapPoint {
      override val events: js.Any = eventsOuter
    })
  }
}
