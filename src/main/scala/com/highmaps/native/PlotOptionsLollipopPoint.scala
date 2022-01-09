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
  * @note JavaScript name: <code>plotOptions-lollipop-point</code>
  */
class PlotOptionsLollipopPoint extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Events for each single point.</p>
    * @since 8.0.0
    */
  var events: js.Any = js.undefined
}

object PlotOptionsLollipopPoint {
  /**
    * @param events <p>Events for each single point.</p>
    */
  def apply(events: js.UndefOr[js.Any] = js.undefined): PlotOptionsLollipopPoint = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsLollipopPoint {
      this.events = events
    })
  }
}
