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
  * @note JavaScript name: <code>plotOptions-treemap-cluster-states</code>
  */
class PlotOptionsTreemapClusterStates extends com.highcharts.HighchartsGenericObject {

  var hover: js.Any = js.undefined
}

object PlotOptionsTreemapClusterStates {
  /**
    */
  def apply(hover: js.UndefOr[js.Any] = js.undefined): PlotOptionsTreemapClusterStates = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsTreemapClusterStates {
      this.hover = hover
    })
  }
}
