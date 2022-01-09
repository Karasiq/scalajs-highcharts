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
  * @note JavaScript name: <code>legend-accessibility</code>
  */
class LegendAccessibility extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Enable accessibility support for the legend.</p>
    * @since 7.1.0
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Options for keyboard navigation for the legend.</p>
    * @since 7.1.0
    */
  var keyboardNavigation: js.Any = js.undefined
}

object LegendAccessibility {
  /**
    * @param enabled <p>Enable accessibility support for the legend.</p>
    * @param keyboardNavigation <p>Options for keyboard navigation for the legend.</p>
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, keyboardNavigation: js.UndefOr[js.Any] = js.undefined): LegendAccessibility = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new LegendAccessibility {
      this.enabled = enabled
      this.keyboardNavigation = keyboardNavigation
    })
  }
}
