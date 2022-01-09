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
  * @note JavaScript name: <code>plotOptions-areasplinerange-point</code>
  */
class PlotOptionsAreasplinerangePoint extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Events for each single point.</p>
    * @since 2.3.0
    */
  var events: js.Any = js.undefined
}

object PlotOptionsAreasplinerangePoint {
  /**
    * @param events <p>Events for each single point.</p>
    */
  def apply(events: js.UndefOr[js.Any] = js.undefined): PlotOptionsAreasplinerangePoint = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsAreasplinerangePoint {
      this.events = events
    })
  }
}
