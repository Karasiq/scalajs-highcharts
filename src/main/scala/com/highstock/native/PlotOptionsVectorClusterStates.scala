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
  * @note JavaScript name: <code>plotOptions-vector-cluster-states</code>
  */
class PlotOptionsVectorClusterStates extends com.highcharts.HighchartsGenericObject {

  var hover: js.Any = js.undefined
}

object PlotOptionsVectorClusterStates {
  /**
    */
  def apply(hover: js.UndefOr[js.Any] = js.undefined): PlotOptionsVectorClusterStates = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsVectorClusterStates {
      this.hover = hover
    })
  }
}
