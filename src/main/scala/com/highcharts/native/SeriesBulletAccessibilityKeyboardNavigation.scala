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
  * @note JavaScript name: <code>series&lt;bullet&gt;-accessibility-keyboardNavigation</code>
  */
class SeriesBulletAccessibilityKeyboardNavigation extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Enable/disable keyboard navigation support for a specific series.</p>
    * @since 7.1.0
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
}

object SeriesBulletAccessibilityKeyboardNavigation {
  /**
    * @param enabled <p>Enable/disable keyboard navigation support for a specific series.</p>
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined): SeriesBulletAccessibilityKeyboardNavigation = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesBulletAccessibilityKeyboardNavigation {
      this.enabled = enabled
    })
  }
}
