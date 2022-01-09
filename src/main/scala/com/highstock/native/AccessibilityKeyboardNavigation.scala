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
  * @note JavaScript name: <code>accessibility-keyboardNavigation</code>
  */
class AccessibilityKeyboardNavigation extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Enable keyboard navigation for the chart.</p>
    * @since 5.0.0
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Options for the focus border drawn around elements while
    * navigating through them.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/accessibility/custom-focus">Custom focus ring</a>
    * @since 6.0.3
    */
  var focusBorder: js.Any = js.undefined

  /**
    * <p>Order of tab navigation in the chart. Determines which elements
    * are tabbed to first. Available elements are: <code>series</code>, <code>zoom</code>,
    * <code>rangeSelector</code>, <code>chartMenu</code>, <code>legend</code> and <code>container</code>. In
    * addition, any custom components can be added here. Adding
    * <code>container</code> first in order will make the keyboard focus stop on
    * the chart container first, requiring the user to tab again to
    * enter the chart.</p>
    * @since 7.1.0
    */
  var order: js.UndefOr[js.Array[String]] = js.undefined

  /**
    * <p>Options for the keyboard navigation of data points and series.</p>
    * @since 8.0.0
    */
  var seriesNavigation: js.Any = js.undefined

  /**
    * <p>Whether or not to wrap around when reaching the end of arrow-key
    * navigation for an element in the chart.</p>
    * @since 7.1.0
    */
  var wrapAround: js.UndefOr[Boolean] = js.undefined
}

object AccessibilityKeyboardNavigation {
  /**
    * @param enabled <p>Enable keyboard navigation for the chart.</p>
    * @param focusBorder <p>Options for the focus border drawn around elements while. navigating through them.</p>
    * @param order <p>Order of tab navigation in the chart. Determines which elements. are tabbed to first. Available elements are: <code>series</code>, <code>zoom</code>,. <code>rangeSelector</code>, <code>chartMenu</code>, <code>legend</code> and <code>container</code>. In. addition, any custom components can be added here. Adding. <code>container</code> first in order will make the keyboard focus stop on. the chart container first, requiring the user to tab again to. enter the chart.</p>
    * @param seriesNavigation <p>Options for the keyboard navigation of data points and series.</p>
    * @param wrapAround <p>Whether or not to wrap around when reaching the end of arrow-key. navigation for an element in the chart.</p>
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, focusBorder: js.UndefOr[js.Any] = js.undefined, order: js.UndefOr[js.Array[String]] = js.undefined, seriesNavigation: js.UndefOr[js.Any] = js.undefined, wrapAround: js.UndefOr[Boolean] = js.undefined): AccessibilityKeyboardNavigation = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new AccessibilityKeyboardNavigation {
      this.enabled = enabled
      this.focusBorder = focusBorder
      this.order = order
      this.seriesNavigation = seriesNavigation
      this.wrapAround = wrapAround
    })
  }
}
