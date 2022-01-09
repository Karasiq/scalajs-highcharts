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
  * @note JavaScript name: <code>plotOptions-columnrange-point</code>
  */
class PlotOptionsColumnrangePoint extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Events for each single point.</p>
    * @since 2.3.0
    */
  var events: js.Any = js.undefined
}

object PlotOptionsColumnrangePoint {
  /**
    * @param events <p>Events for each single point.</p>
    */
  def apply(events: js.UndefOr[js.Any] = js.undefined): PlotOptionsColumnrangePoint = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsColumnrangePoint {
      this.events = events
    })
  }
}
