/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/gantt]]
  */
package com.gantt.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>plotOptions-abands-point</code>
  */
class PlotOptionsAbandsPoint extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Events for each single point.</p>
    * @since 7.0.0
    */
  var events: js.Any = js.undefined
}

object PlotOptionsAbandsPoint {
  /**
    * @param events <p>Events for each single point.</p>
    */
  def apply(events: js.UndefOr[js.Any] = js.undefined): PlotOptionsAbandsPoint = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsAbandsPoint {
      this.events = events
    })
  }
}
