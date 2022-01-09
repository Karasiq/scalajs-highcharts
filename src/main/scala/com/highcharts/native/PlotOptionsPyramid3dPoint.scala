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
  * @note JavaScript name: <code>plotOptions-pyramid3d-point</code>
  */
class PlotOptionsPyramid3dPoint extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Events for each single point.</p>
    * @since 7.1.0
    */
  var events: js.Any = js.undefined
}

object PlotOptionsPyramid3dPoint {
  /**
    * @param events <p>Events for each single point.</p>
    */
  def apply(events: js.UndefOr[js.Any] = js.undefined): PlotOptionsPyramid3dPoint = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsPyramid3dPoint {
      this.events = events
    })
  }
}
