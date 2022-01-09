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
  * @note JavaScript name: <code>plotOptions-columnpyramid-point</code>
  */
class PlotOptionsColumnpyramidPoint extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Events for each single point.</p>
    * @since 7.0.0
    */
  var events: js.Any = js.undefined
}

object PlotOptionsColumnpyramidPoint {
  /**
    * @param events <p>Events for each single point.</p>
    */
  def apply(events: js.UndefOr[js.Any] = js.undefined): PlotOptionsColumnpyramidPoint = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsColumnpyramidPoint {
      this.events = events
    })
  }
}
