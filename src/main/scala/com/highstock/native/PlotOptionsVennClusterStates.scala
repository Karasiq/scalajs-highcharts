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
  * @note JavaScript name: <code>plotOptions-venn-cluster-states</code>
  */
class PlotOptionsVennClusterStates extends com.highcharts.HighchartsGenericObject {

  var hover: js.Any = js.undefined
}

object PlotOptionsVennClusterStates {
  /**
    */
  def apply(hover: js.UndefOr[js.Any] = js.undefined): PlotOptionsVennClusterStates = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsVennClusterStates {
      this.hover = hover
    })
  }
}
