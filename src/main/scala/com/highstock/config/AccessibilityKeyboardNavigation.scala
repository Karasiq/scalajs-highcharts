/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highstock]]
  */
package com.highstock.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>accessibility-keyboardNavigation</code>
  */
@js.annotation.ScalaJSDefined
class AccessibilityKeyboardNavigation extends js.Object {

  /**
    * Enable keyboard navigation for the chart.
    * @since 5.0.0
    */
  val enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * Skip null points when navigating through points with the keyboard.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/accessibility/advanced-accessible/">Accessible complex chart</a>
    * @since 5.0.0
    */
  val skipNullPoints: js.UndefOr[Boolean] = js.undefined

  /**
    * Enable tab navigation for points. Without this, only arrow keys can be used to navigate between points.
    * @since 5.0.13
    */
  val tabThroughChartElements: js.UndefOr[Boolean] = js.undefined
}

object AccessibilityKeyboardNavigation {
  /**
    * @param enabled Enable keyboard navigation for the chart.
    * @param skipNullPoints Skip null points when navigating through points with the keyboard.
    * @param tabThroughChartElements Enable tab navigation for points. Without this, only arrow keys can be used to navigate between points.
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, skipNullPoints: js.UndefOr[Boolean] = js.undefined, tabThroughChartElements: js.UndefOr[Boolean] = js.undefined): AccessibilityKeyboardNavigation = {
    val enabledOuter: js.UndefOr[Boolean] = enabled
    val skipNullPointsOuter: js.UndefOr[Boolean] = skipNullPoints
    val tabThroughChartElementsOuter: js.UndefOr[Boolean] = tabThroughChartElements
    new AccessibilityKeyboardNavigation {
      override val enabled: js.UndefOr[Boolean] = enabledOuter
      override val skipNullPoints: js.UndefOr[Boolean] = skipNullPointsOuter
      override val tabThroughChartElements: js.UndefOr[Boolean] = tabThroughChartElementsOuter
    }
  }
}
