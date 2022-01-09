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
  * @note JavaScript name: <code>navigation-annotationsOptions-controlPointOptions</code>
  */
class NavigationAnnotationsOptionsControlPointOptions extends com.highcharts.HighchartsGenericObject {

  var positioner: js.Any = js.undefined
}

object NavigationAnnotationsOptionsControlPointOptions {
  /**
    */
  def apply(positioner: js.UndefOr[js.Any] = js.undefined): NavigationAnnotationsOptionsControlPointOptions = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new NavigationAnnotationsOptionsControlPointOptions {
      this.positioner = positioner
    })
  }
}
