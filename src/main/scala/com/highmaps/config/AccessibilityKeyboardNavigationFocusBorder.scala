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
  * @note JavaScript name: <code>accessibility-keyboardNavigation-focusBorder</code>
  */
@js.annotation.ScalaJSDefined
class AccessibilityKeyboardNavigationFocusBorder extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Enable/disable focus border for chart.</p>
    * @since 6.0.3
    */
  val enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Hide the browser&#39;s default focus indicator.</p>
    * @since 6.0.4
    */
  val hideBrowserFocusOutline: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Style options for the focus border drawn around elements
    * while navigating through them. Note that some browsers in
    * addition draw their own borders for focused elements. These
    * automatic borders can not be styled by Highcharts.</p>
    * <p>In styled mode, the border is given the
    * <code>.highcharts-focus-border</code> class.</p>
    * @since 6.0.3
    */
  val style: js.UndefOr[CleanJsObject[AccessibilityKeyboardNavigationFocusBorderStyle]] = js.undefined

  /**
    * <p>Focus border margin around the elements.</p>
    * @since 6.0.3
    */
  val margin: js.UndefOr[Double] = js.undefined
}

object AccessibilityKeyboardNavigationFocusBorder {
  /**
    * @param enabled <p>Enable/disable focus border for chart.</p>
    * @param hideBrowserFocusOutline <p>Hide the browser&#39;s default focus indicator.</p>
    * @param style <p>Style options for the focus border drawn around elements. while navigating through them. Note that some browsers in. addition draw their own borders for focused elements. These. automatic borders can not be styled by Highcharts.</p>. <p>In styled mode, the border is given the. <code>.highcharts-focus-border</code> class.</p>
    * @param margin <p>Focus border margin around the elements.</p>
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, hideBrowserFocusOutline: js.UndefOr[Boolean] = js.undefined, style: js.UndefOr[CleanJsObject[AccessibilityKeyboardNavigationFocusBorderStyle]] = js.undefined, margin: js.UndefOr[Double] = js.undefined): AccessibilityKeyboardNavigationFocusBorder = {
    val enabledOuter: js.UndefOr[Boolean] = enabled
    val hideBrowserFocusOutlineOuter: js.UndefOr[Boolean] = hideBrowserFocusOutline
    val styleOuter: js.UndefOr[CleanJsObject[AccessibilityKeyboardNavigationFocusBorderStyle]] = style
    val marginOuter: js.UndefOr[Double] = margin
    com.highcharts.HighchartsGenericObject.toCleanObject(new AccessibilityKeyboardNavigationFocusBorder {
      override val enabled: js.UndefOr[Boolean] = enabledOuter
      override val hideBrowserFocusOutline: js.UndefOr[Boolean] = hideBrowserFocusOutlineOuter
      override val style: js.UndefOr[CleanJsObject[AccessibilityKeyboardNavigationFocusBorderStyle]] = styleOuter
      override val margin: js.UndefOr[Double] = marginOuter
    })
  }
}
