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
  * @note JavaScript name: <code>series&lt;columnrange&gt;-accessibility-keyboardNavigation</code>
  */
class SeriesColumnrangeAccessibilityKeyboardNavigation extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Enable/disable keyboard navigation support for a specific series.</p>
    * @since 7.1.0
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
}

object SeriesColumnrangeAccessibilityKeyboardNavigation {
  /**
    * @param enabled <p>Enable/disable keyboard navigation support for a specific series.</p>
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined): SeriesColumnrangeAccessibilityKeyboardNavigation = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesColumnrangeAccessibilityKeyboardNavigation {
      this.enabled = enabled
    })
  }
}