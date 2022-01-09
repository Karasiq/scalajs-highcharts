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
  * @note JavaScript name: <code>series&lt;hollowcandlestick&gt;-accessibility-keyboardNavigation</code>
  */
class SeriesHollowcandlestickAccessibilityKeyboardNavigation extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Enable/disable keyboard navigation support for a specific series.</p>
    * @since 7.1.0
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
}

object SeriesHollowcandlestickAccessibilityKeyboardNavigation {
  /**
    * @param enabled <p>Enable/disable keyboard navigation support for a specific series.</p>
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined): SeriesHollowcandlestickAccessibilityKeyboardNavigation = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesHollowcandlestickAccessibilityKeyboardNavigation {
      this.enabled = enabled
    })
  }
}
