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
  * @note JavaScript name: <code>accessibility-keyboardNavigation-focusBorder</code>
  */
class AccessibilityKeyboardNavigationFocusBorder extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Enable/disable focus border for chart.</p>
    * @since 6.0.3
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Hide the browser&#39;s default focus indicator.</p>
    * @since 6.0.4
    */
  var hideBrowserFocusOutline: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Focus border margin around the elements.</p>
    * @since 6.0.3
    */
  var margin: js.UndefOr[Double] = js.undefined

  /**
    * <p>Style options for the focus border drawn around elements
    * while navigating through them. Note that some browsers in
    * addition draw their own borders for focused elements. These
    * automatic borders can not be styled by Highcharts.</p>
    * <p>In styled mode, the border is given the
    * <code>.highcharts-focus-border</code> class.</p>
    * @since 6.0.3
    */
  var style: js.UndefOr[js.Object] = js.undefined
}

object AccessibilityKeyboardNavigationFocusBorder {
  /**
    * @param enabled <p>Enable/disable focus border for chart.</p>
    * @param hideBrowserFocusOutline <p>Hide the browser&#39;s default focus indicator.</p>
    * @param margin <p>Focus border margin around the elements.</p>
    * @param style <p>Style options for the focus border drawn around elements. while navigating through them. Note that some browsers in. addition draw their own borders for focused elements. These. automatic borders can not be styled by Highcharts.</p>. <p>In styled mode, the border is given the. <code>.highcharts-focus-border</code> class.</p>
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, hideBrowserFocusOutline: js.UndefOr[Boolean] = js.undefined, margin: js.UndefOr[Double] = js.undefined, style: js.UndefOr[js.Object] = js.undefined): AccessibilityKeyboardNavigationFocusBorder = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new AccessibilityKeyboardNavigationFocusBorder {
      this.enabled = enabled
      this.hideBrowserFocusOutline = hideBrowserFocusOutline
      this.margin = margin
      this.style = style
    })
  }
}
