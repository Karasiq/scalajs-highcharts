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
  * @note JavaScript name: <code>series&lt;vector&gt;-cluster-states</code>
  */
class SeriesVectorClusterStates extends com.highcharts.HighchartsGenericObject {

  var hover: js.Any = js.undefined
}

object SeriesVectorClusterStates {
  /**
    */
  def apply(hover: js.UndefOr[js.Any] = js.undefined): SeriesVectorClusterStates = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesVectorClusterStates {
      this.hover = hover
    })
  }
}
