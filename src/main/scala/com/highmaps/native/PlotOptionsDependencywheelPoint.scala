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
  * @note JavaScript name: <code>plotOptions-dependencywheel-point</code>
  */
class PlotOptionsDependencywheelPoint extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Events for each single point.</p>
    * @since 7.1.0
    */
  var events: js.Any = js.undefined
}

object PlotOptionsDependencywheelPoint {
  /**
    * @param events <p>Events for each single point.</p>
    */
  def apply(events: js.UndefOr[js.Any] = js.undefined): PlotOptionsDependencywheelPoint = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsDependencywheelPoint {
      this.events = events
    })
  }
}
