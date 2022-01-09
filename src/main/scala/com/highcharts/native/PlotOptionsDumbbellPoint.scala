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
  * @note JavaScript name: <code>plotOptions-dumbbell-point</code>
  */
class PlotOptionsDumbbellPoint extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Events for each single point.</p>
    * @since 8.0.0
    */
  var events: js.Any = js.undefined
}

object PlotOptionsDumbbellPoint {
  /**
    * @param events <p>Events for each single point.</p>
    */
  def apply(events: js.UndefOr[js.Any] = js.undefined): PlotOptionsDumbbellPoint = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsDumbbellPoint {
      this.events = events
    })
  }
}