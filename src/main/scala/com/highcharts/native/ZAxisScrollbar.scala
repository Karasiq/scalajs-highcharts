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
  * @note JavaScript name: <code>zAxis-scrollbar</code>
  */
class ZAxisScrollbar extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Defines the position of the scrollbar. By default, it is positioned
    * on the opposite of the main axis (right side of the chart).
    * However, in the case of RTL languages could be set to <code>false</code>
    * which positions the scrollbar on the left.</p>
    * <p>Works only for vertical axes.
    * This means yAxis in a non-inverted chart and xAxis in the inverted.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/yaxis/scrollbar-opposite/">A scrollbar not on the opposite side</a>
    * @since 9.3.0
    */
  var opposite: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The background color of the scrollbar itself.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/scrollbar/style/">Scrollbar styling</a>
    * @since 4.2.6
    */
  var barBackgroundColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The color of the scrollbar&#39;s border.</p>
    * @since 4.2.6
    */
  var barBorderColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The border rounding radius of the bar.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/scrollbar/style/">Scrollbar styling</a>
    * @since 4.2.6
    */
  var barBorderRadius: js.UndefOr[Double] = js.undefined

  /**
    * <p>The width of the bar&#39;s border.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/scrollbar/style/">Scrollbar styling</a>
    * @since 4.2.6
    */
  var barBorderWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>The color of the small arrow inside the scrollbar buttons.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/scrollbar/style/">Scrollbar styling</a>
    * @since 4.2.6
    */
  var buttonArrowColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The color of scrollbar buttons.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/scrollbar/style/">Scrollbar styling</a>
    * @since 4.2.6
    */
  var buttonBackgroundColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The color of the border of the scrollbar buttons.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/scrollbar/style/">Scrollbar styling</a>
    * @since 4.2.6
    */
  var buttonBorderColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The corner radius of the scrollbar buttons.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/scrollbar/style/">Scrollbar styling</a>
    * @since 4.2.6
    */
  var buttonBorderRadius: js.UndefOr[Double] = js.undefined

  /**
    * <p>The border width of the scrollbar buttons.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/scrollbar/style/">Scrollbar styling</a>
    * @since 4.2.6
    */
  var buttonBorderWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>Enable or disable the scrollbar.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/scrollbar/enabled/">Disable the scrollbar, only use navigator</a>
    * @since 4.2.6
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The height of the scrollbar. The height also applies to the width
    * of the scroll arrows so that they are always squares. Defaults to
    * 20 for touch devices and 14 for mouse devices.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/scrollbar/height/">A 30px scrollbar</a>
    * @since 4.2.6
    */
  var height: js.UndefOr[Double] = js.undefined

  /**
    * <p>Whether to redraw the main chart as the scrollbar or the navigator
    * zoomed window is moved. Defaults to <code>true</code> for modern browsers and
    * <code>false</code> for legacy IE browsers as well as mobile devices.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/scrollbar/liveredraw">Setting live redraw to false</a>
    * @since 1.3.0
    */
  var liveRedraw: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The margin between the scrollbar and its axis when the scrollbar is
    * applied directly to an axis.</p>
    * @since 4.2.6
    */
  var margin: js.UndefOr[Double] = js.undefined

  /**
    * <p>The minimum width of the scrollbar.</p>
    * @since 1.2.5
    */
  var minWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>The color of the small rifles in the middle of the scrollbar.</p>
    * @since 4.2.6
    */
  var rifleColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>Whether to show or hide the scrollbar when the scrolled content is
    * zoomed out to it full extent.</p>
    * @since 4.2.6
    */
  var showFull: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The color of the track background.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/scrollbar/style/">Scrollbar styling</a>
    * @since 4.2.6
    */
  var trackBackgroundColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The color of the border of the scrollbar track.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/scrollbar/style/">Scrollbar styling</a>
    * @since 4.2.6
    */
  var trackBorderColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The corner radius of the border of the scrollbar track.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/scrollbar/style/">Scrollbar styling</a>
    * @since 4.2.6
    */
  var trackBorderRadius: js.UndefOr[Double] = js.undefined

  /**
    * <p>The width of the border of the scrollbar track.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/scrollbar/style/">Scrollbar styling</a>
    * @since 4.2.6
    */
  var trackBorderWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>The z index of the scrollbar group.</p>
    * @since 4.2.6
    */
  var zIndex: js.UndefOr[Double] = js.undefined
}

object ZAxisScrollbar {
  /**
    * @param opposite <p>Defines the position of the scrollbar. By default, it is positioned. on the opposite of the main axis (right side of the chart).. However, in the case of RTL languages could be set to <code>false</code>. which positions the scrollbar on the left.</p>. <p>Works only for vertical axes.. This means yAxis in a non-inverted chart and xAxis in the inverted.</p>
    * @param barBackgroundColor <p>The background color of the scrollbar itself.</p>
    * @param barBorderColor <p>The color of the scrollbar&#39;s border.</p>
    * @param barBorderRadius <p>The border rounding radius of the bar.</p>
    * @param barBorderWidth <p>The width of the bar&#39;s border.</p>
    * @param buttonArrowColor <p>The color of the small arrow inside the scrollbar buttons.</p>
    * @param buttonBackgroundColor <p>The color of scrollbar buttons.</p>
    * @param buttonBorderColor <p>The color of the border of the scrollbar buttons.</p>
    * @param buttonBorderRadius <p>The corner radius of the scrollbar buttons.</p>
    * @param buttonBorderWidth <p>The border width of the scrollbar buttons.</p>
    * @param enabled <p>Enable or disable the scrollbar.</p>
    * @param height <p>The height of the scrollbar. The height also applies to the width. of the scroll arrows so that they are always squares. Defaults to. 20 for touch devices and 14 for mouse devices.</p>
    * @param liveRedraw <p>Whether to redraw the main chart as the scrollbar or the navigator. zoomed window is moved. Defaults to <code>true</code> for modern browsers and. <code>false</code> for legacy IE browsers as well as mobile devices.</p>
    * @param margin <p>The margin between the scrollbar and its axis when the scrollbar is. applied directly to an axis.</p>
    * @param minWidth <p>The minimum width of the scrollbar.</p>
    * @param rifleColor <p>The color of the small rifles in the middle of the scrollbar.</p>
    * @param showFull <p>Whether to show or hide the scrollbar when the scrolled content is. zoomed out to it full extent.</p>
    * @param trackBackgroundColor <p>The color of the track background.</p>
    * @param trackBorderColor <p>The color of the border of the scrollbar track.</p>
    * @param trackBorderRadius <p>The corner radius of the border of the scrollbar track.</p>
    * @param trackBorderWidth <p>The width of the border of the scrollbar track.</p>
    * @param zIndex <p>The z index of the scrollbar group.</p>
    */
  def apply(opposite: js.UndefOr[Boolean] = js.undefined, barBackgroundColor: js.UndefOr[String | js.Object] = js.undefined, barBorderColor: js.UndefOr[String | js.Object] = js.undefined, barBorderRadius: js.UndefOr[Double] = js.undefined, barBorderWidth: js.UndefOr[Double] = js.undefined, buttonArrowColor: js.UndefOr[String | js.Object] = js.undefined, buttonBackgroundColor: js.UndefOr[String | js.Object] = js.undefined, buttonBorderColor: js.UndefOr[String | js.Object] = js.undefined, buttonBorderRadius: js.UndefOr[Double] = js.undefined, buttonBorderWidth: js.UndefOr[Double] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, height: js.UndefOr[Double] = js.undefined, liveRedraw: js.UndefOr[Boolean] = js.undefined, margin: js.UndefOr[Double] = js.undefined, minWidth: js.UndefOr[Double] = js.undefined, rifleColor: js.UndefOr[String | js.Object] = js.undefined, showFull: js.UndefOr[Boolean] = js.undefined, trackBackgroundColor: js.UndefOr[String | js.Object] = js.undefined, trackBorderColor: js.UndefOr[String | js.Object] = js.undefined, trackBorderRadius: js.UndefOr[Double] = js.undefined, trackBorderWidth: js.UndefOr[Double] = js.undefined, zIndex: js.UndefOr[Double] = js.undefined): ZAxisScrollbar = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new ZAxisScrollbar {
      this.opposite = opposite
      this.barBackgroundColor = barBackgroundColor
      this.barBorderColor = barBorderColor
      this.barBorderRadius = barBorderRadius
      this.barBorderWidth = barBorderWidth
      this.buttonArrowColor = buttonArrowColor
      this.buttonBackgroundColor = buttonBackgroundColor
      this.buttonBorderColor = buttonBorderColor
      this.buttonBorderRadius = buttonBorderRadius
      this.buttonBorderWidth = buttonBorderWidth
      this.enabled = enabled
      this.height = height
      this.liveRedraw = liveRedraw
      this.margin = margin
      this.minWidth = minWidth
      this.rifleColor = rifleColor
      this.showFull = showFull
      this.trackBackgroundColor = trackBackgroundColor
      this.trackBorderColor = trackBorderColor
      this.trackBorderRadius = trackBorderRadius
      this.trackBorderWidth = trackBorderWidth
      this.zIndex = zIndex
    })
  }
}