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
  * @note JavaScript name: <code>series&lt;treemap&gt;-cluster-states</code>
  */
class SeriesTreemapClusterStates extends com.highcharts.HighchartsGenericObject {

  var hover: js.Any = js.undefined
}

object SeriesTreemapClusterStates {
  /**
    */
  def apply(hover: js.UndefOr[js.Any] = js.undefined): SeriesTreemapClusterStates = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesTreemapClusterStates {
      this.hover = hover
    })
  }
}
