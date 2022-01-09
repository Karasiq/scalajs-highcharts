/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highstock]]
  */
package com.highstock.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>plotOptions-funnel-point</code>
  */
class PlotOptionsFunnelPoint extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Events for each single point.</p>
    */
  var events: js.Any = js.undefined
}

object PlotOptionsFunnelPoint {
  /**
    * @param events <p>Events for each single point.</p>
    */
  def apply(events: js.UndefOr[js.Any] = js.undefined): PlotOptionsFunnelPoint = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsFunnelPoint {
      this.events = events
    })
  }
}
