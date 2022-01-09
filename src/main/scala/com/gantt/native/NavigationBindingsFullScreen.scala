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
  * @note JavaScript name: <code>navigation-bindings-fullScreen</code>
  */
class NavigationBindingsFullScreen extends com.highcharts.HighchartsGenericObject {

  var noDataState: js.UndefOr[String] = js.undefined
}

object NavigationBindingsFullScreen {
  /**
    */
  def apply(noDataState: js.UndefOr[String] = js.undefined): NavigationBindingsFullScreen = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new NavigationBindingsFullScreen {
      this.noDataState = noDataState
    })
  }
}
