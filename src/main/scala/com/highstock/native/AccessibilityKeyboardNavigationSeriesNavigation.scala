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
  * @note JavaScript name: <code>accessibility-keyboardNavigation-seriesNavigation</code>
  */
class AccessibilityKeyboardNavigationSeriesNavigation extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Set the keyboard navigation mode for the chart. Can be
    * &quot;normal&quot; or &quot;serialize&quot;. In normal mode, left/right arrow
    * keys move between points in a series, while up/down arrow
    * keys move between series. Up/down navigation acts
    * intelligently to figure out which series makes sense to move
    * to from any given point.</p>
    * <p>In &quot;serialize&quot; mode, points are instead navigated as a single
    * list. Left/right behaves as in &quot;normal&quot; mode. Up/down arrow
    * keys will behave like left/right. This can be useful for
    * unifying navigation behavior with/without screen readers
    * enabled.</p>
    * @since 8.0.0
    */
  var mode: js.UndefOr[String] = js.undefined

  /**
    * <p>When a series contains more points than this, we no longer
    * allow keyboard navigation for it.</p>
    * <p>Set to <code>false</code> to disable.</p>
    * @since 8.0.0
    */
  var pointNavigationEnabledThreshold: js.UndefOr[Boolean | Double] = js.undefined

  /**
    * <p>Skip null points when navigating through points with the
    * keyboard.</p>
    * @since 8.0.0
    */
  var skipNullPoints: js.UndefOr[Boolean] = js.undefined
}

object AccessibilityKeyboardNavigationSeriesNavigation {
  /**
    * @param mode <p>Set the keyboard navigation mode for the chart. Can be. &quot;normal&quot; or &quot;serialize&quot;. In normal mode, left/right arrow. keys move between points in a series, while up/down arrow. keys move between series. Up/down navigation acts. intelligently to figure out which series makes sense to move. to from any given point.</p>. <p>In &quot;serialize&quot; mode, points are instead navigated as a single. list. Left/right behaves as in &quot;normal&quot; mode. Up/down arrow. keys will behave like left/right. This can be useful for. unifying navigation behavior with/without screen readers. enabled.</p>
    * @param pointNavigationEnabledThreshold <p>When a series contains more points than this, we no longer. allow keyboard navigation for it.</p>. <p>Set to <code>false</code> to disable.</p>
    * @param skipNullPoints <p>Skip null points when navigating through points with the. keyboard.</p>
    */
  def apply(mode: js.UndefOr[String] = js.undefined, pointNavigationEnabledThreshold: js.UndefOr[Boolean | Double] = js.undefined, skipNullPoints: js.UndefOr[Boolean] = js.undefined): AccessibilityKeyboardNavigationSeriesNavigation = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new AccessibilityKeyboardNavigationSeriesNavigation {
      this.mode = mode
      this.pointNavigationEnabledThreshold = pointNavigationEnabledThreshold
      this.skipNullPoints = skipNullPoints
    })
  }
}
