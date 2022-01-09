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
  * @note JavaScript name: <code>plotOptions-scatter-cluster-states</code>
  */
class PlotOptionsScatterClusterStates extends com.highcharts.HighchartsGenericObject {

  var hover: js.Any = js.undefined
}

object PlotOptionsScatterClusterStates {
  /**
    */
  def apply(hover: js.UndefOr[js.Any] = js.undefined): PlotOptionsScatterClusterStates = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsScatterClusterStates {
      this.hover = hover
    })
  }
}
