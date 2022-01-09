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
  * @note JavaScript name: <code>legend-accessibility-keyboardNavigation</code>
  */
class LegendAccessibilityKeyboardNavigation extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Enable keyboard navigation for the legend.</p>
    * @since 7.1.0
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
}

object LegendAccessibilityKeyboardNavigation {
  /**
    * @param enabled <p>Enable keyboard navigation for the legend.</p>
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined): LegendAccessibilityKeyboardNavigation = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new LegendAccessibilityKeyboardNavigation {
      this.enabled = enabled
    })
  }
}
