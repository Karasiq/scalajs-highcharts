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
  * @note JavaScript name: <code>plotOptions-funnel3d-accessibility-keyboardNavigation</code>
  */
class PlotOptionsFunnel3dAccessibilityKeyboardNavigation extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Enable/disable keyboard navigation support for a specific series.</p>
    * @since 7.1.0
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
}

object PlotOptionsFunnel3dAccessibilityKeyboardNavigation {
  /**
    * @param enabled <p>Enable/disable keyboard navigation support for a specific series.</p>
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined): PlotOptionsFunnel3dAccessibilityKeyboardNavigation = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsFunnel3dAccessibilityKeyboardNavigation {
      this.enabled = enabled
    })
  }
}