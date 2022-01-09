/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highmaps]]
  */
package com.highmaps.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>plotOptions-dema-point</code>
  */
class PlotOptionsDemaPoint extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Events for each single point.</p>
    * @since 7.0.0
    */
  var events: js.Any = js.undefined
}

object PlotOptionsDemaPoint {
  /**
    * @param events <p>Events for each single point.</p>
    */
  def apply(events: js.UndefOr[js.Any] = js.undefined): PlotOptionsDemaPoint = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsDemaPoint {
      this.events = events
    })
  }
}
