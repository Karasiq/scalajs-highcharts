/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highcharts]]
  */
package com.highcharts.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>plotOptions-slowstochastic-point</code>
  */
class PlotOptionsSlowstochasticPoint extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Events for each single point.</p>
    * @since 8.0.0
    */
  var events: js.Any = js.undefined
}

object PlotOptionsSlowstochasticPoint {
  /**
    * @param events <p>Events for each single point.</p>
    */
  def apply(events: js.UndefOr[js.Any] = js.undefined): PlotOptionsSlowstochasticPoint = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsSlowstochasticPoint {
      this.events = events
    })
  }
}
