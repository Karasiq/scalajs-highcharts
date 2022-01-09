/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/gantt]]
  */
package com.gantt.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>series&lt;venn&gt;-cluster-states</code>
  */
class SeriesVennClusterStates extends com.highcharts.HighchartsGenericObject {

  var hover: js.Any = js.undefined
}

object SeriesVennClusterStates {
  /**
    */
  def apply(hover: js.UndefOr[js.Any] = js.undefined): SeriesVennClusterStates = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesVennClusterStates {
      this.hover = hover
    })
  }
}
