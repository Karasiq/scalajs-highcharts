/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highmaps]]
  */
package com.highmaps.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>legend-keyboardNavigation</code>
  */
@js.annotation.ScalaJSDefined
class LegendKeyboardNavigation extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Enable/disable keyboard navigation for the legend. Requires the Accessibility
    * module.</p>
    * @since 5.0.13
    */
  val enabled: js.UndefOr[Boolean] = js.undefined
}

object LegendKeyboardNavigation {
  /**
    * @param enabled <p>Enable/disable keyboard navigation for the legend. Requires the Accessibility. module.</p>
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined): LegendKeyboardNavigation = {
    val enabledOuter: js.UndefOr[Boolean] = enabled
    com.highcharts.HighchartsGenericObject.toCleanObject(new LegendKeyboardNavigation {
      override val enabled: js.UndefOr[Boolean] = enabledOuter
    })
  }
}
