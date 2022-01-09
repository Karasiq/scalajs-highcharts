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
  * @note JavaScript name: <code>plotOptions-klinger-point</code>
  */
class PlotOptionsKlingerPoint extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Events for each single point.</p>
    * @since 9.1.0
    */
  var events: js.Any = js.undefined
}

object PlotOptionsKlingerPoint {
  /**
    * @param events <p>Events for each single point.</p>
    */
  def apply(events: js.UndefOr[js.Any] = js.undefined): PlotOptionsKlingerPoint = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsKlingerPoint {
      this.events = events
    })
  }
}
