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
  * @note JavaScript name: <code>plotOptions-errorbar-point</code>
  */
class PlotOptionsErrorbarPoint extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Events for each single point.</p>
    */
  var events: js.Any = js.undefined
}

object PlotOptionsErrorbarPoint {
  /**
    * @param events <p>Events for each single point.</p>
    */
  def apply(events: js.UndefOr[js.Any] = js.undefined): PlotOptionsErrorbarPoint = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsErrorbarPoint {
      this.events = events
    })
  }
}
