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
  * @note JavaScript name: <code>navigation-bindings-saveChart</code>
  */
class NavigationBindingsSaveChart extends com.highcharts.HighchartsGenericObject {

  var noDataState: js.UndefOr[String] = js.undefined
}

object NavigationBindingsSaveChart {
  /**
    */
  def apply(noDataState: js.UndefOr[String] = js.undefined): NavigationBindingsSaveChart = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new NavigationBindingsSaveChart {
      this.noDataState = noDataState
    })
  }
}
