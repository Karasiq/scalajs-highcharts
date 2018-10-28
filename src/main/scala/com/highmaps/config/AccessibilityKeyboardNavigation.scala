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
  * @note JavaScript name: <code>accessibility-keyboardNavigation</code>
  */
@js.annotation.ScalaJSDefined
class AccessibilityKeyboardNavigation extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Enable keyboard navigation for the chart.</p>
    * @since 5.0.0
    */
  val enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Options for the focus border drawn around elements while
    * navigating through them.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/accessibility/custom-focus">Custom focus ring</a>
    * @since 6.0.3
    */
  val focusBorder: js.UndefOr[CleanJsObject[AccessibilityKeyboardNavigationFocusBorder]] = js.undefined

  /**
    * <p>Set the keyboard navigation mode for the chart. Can be &quot;normal&quot;
    * or &quot;serialize&quot;. In normal mode, left/right arrow keys move
    * between points in a series, while up/down arrow keys move between
    * series. Up/down navigation acts intelligently to figure out which
    * series makes sense to move to from any given point.</p>
    * <p>In &quot;serialize&quot; mode, points are instead navigated as a single
    * list. Left/right behaves as in &quot;normal&quot; mode. Up/down arrow keys
    * will behave like left/right. This is useful for unifying
    * navigation behavior with/without screen readers enabled.</p>
    * @since 6.0.4
    */
  val mode: js.UndefOr[String] = js.undefined

  /**
    * <p>Skip null points when navigating through points with the
    * keyboard.</p>
    * @since 5.0.0
    */
  val skipNullPoints: js.UndefOr[Boolean] = js.undefined
}

object AccessibilityKeyboardNavigation {
  /**
    * @param enabled <p>Enable keyboard navigation for the chart.</p>
    * @param focusBorder <p>Options for the focus border drawn around elements while. navigating through them.</p>
    * @param mode <p>Set the keyboard navigation mode for the chart. Can be &quot;normal&quot;. or &quot;serialize&quot;. In normal mode, left/right arrow keys move. between points in a series, while up/down arrow keys move between. series. Up/down navigation acts intelligently to figure out which. series makes sense to move to from any given point.</p>. <p>In &quot;serialize&quot; mode, points are instead navigated as a single. list. Left/right behaves as in &quot;normal&quot; mode. Up/down arrow keys. will behave like left/right. This is useful for unifying. navigation behavior with/without screen readers enabled.</p>
    * @param skipNullPoints <p>Skip null points when navigating through points with the. keyboard.</p>
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, focusBorder: js.UndefOr[CleanJsObject[AccessibilityKeyboardNavigationFocusBorder]] = js.undefined, mode: js.UndefOr[String] = js.undefined, skipNullPoints: js.UndefOr[Boolean] = js.undefined): AccessibilityKeyboardNavigation = {
    val enabledOuter: js.UndefOr[Boolean] = enabled
    val focusBorderOuter: js.UndefOr[CleanJsObject[AccessibilityKeyboardNavigationFocusBorder]] = focusBorder
    val modeOuter: js.UndefOr[String] = mode
    val skipNullPointsOuter: js.UndefOr[Boolean] = skipNullPoints
    com.highcharts.HighchartsGenericObject.toCleanObject(new AccessibilityKeyboardNavigation {
      override val enabled: js.UndefOr[Boolean] = enabledOuter
      override val focusBorder: js.UndefOr[CleanJsObject[AccessibilityKeyboardNavigationFocusBorder]] = focusBorderOuter
      override val mode: js.UndefOr[String] = modeOuter
      override val skipNullPoints: js.UndefOr[Boolean] = skipNullPointsOuter
    })
  }
}
