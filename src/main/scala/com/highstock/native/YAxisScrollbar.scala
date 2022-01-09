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
  * @note JavaScript name: <code>yAxis-scrollbar</code>
  */
class YAxisScrollbar extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Enable the scrollbar on the Y axis.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/yaxis/scrollbar/">Enabled on Y axis</a>
    * @since 4.2.6
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Pixel margin between the scrollbar and the axis elements.</p>
    * @since 4.2.6
    */
  var margin: js.UndefOr[Double] = js.undefined

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
    * <p>Whether to show the scrollbar when it is fully zoomed out at max
    * range. Setting it to <code>false</code> on the Y axis makes the scrollbar stay
    * hidden until the user zooms in, like common in browsers.</p>
    * @since 4.2.6
    */
  var showFull: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The width of a vertical scrollbar or height of a horizontal
    * scrollbar. Defaults to 20 on touch devices.</p>
    * @since 4.2.6
    */
  var size: js.UndefOr[Double] = js.undefined

  /**
    * <p>Z index of the scrollbar elements.</p>
    * @since 4.2.6
    */
  var zIndex: js.UndefOr[Double] = js.undefined

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
    * <p>Whether to redraw the main chart as the scrollbar or the navigator
    * zoomed window is moved. Defaults to <code>true</code> for modern browsers and
    * <code>false</code> for legacy IE browsers as well as mobile devices.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/scrollbar/liveredraw">Setting live redraw to false</a>
    * @since 1.3.0
    */
  var liveRedraw: js.UndefOr[Boolean] = js.undefined

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
}

object YAxisScrollbar {
  /**
    * @param enabled <p>Enable the scrollbar on the Y axis.</p>
    * @param margin <p>Pixel margin between the scrollbar and the axis elements.</p>
    * @param opposite <p>Defines the position of the scrollbar. By default, it is positioned. on the opposite of the main axis (right side of the chart).. However, in the case of RTL languages could be set to <code>false</code>. which positions the scrollbar on the left.</p>. <p>Works only for vertical axes.. This means yAxis in a non-inverted chart and xAxis in the inverted.</p>
    * @param showFull <p>Whether to show the scrollbar when it is fully zoomed out at max. range. Setting it to <code>false</code> on the Y axis makes the scrollbar stay. hidden until the user zooms in, like common in browsers.</p>
    * @param size <p>The width of a vertical scrollbar or height of a horizontal. scrollbar. Defaults to 20 on touch devices.</p>
    * @param zIndex <p>Z index of the scrollbar elements.</p>
    * @param barBackgroundColor <p>The background color of the scrollbar itself.</p>
    * @param barBorderColor <p>The color of the scrollbar&#39;s border.</p>
    * @param barBorderRadius <p>The border rounding radius of the bar.</p>
    * @param barBorderWidth <p>The width of the bar&#39;s border.</p>
    * @param buttonArrowColor <p>The color of the small arrow inside the scrollbar buttons.</p>
    * @param buttonBackgroundColor <p>The color of scrollbar buttons.</p>
    * @param buttonBorderColor <p>The color of the border of the scrollbar buttons.</p>
    * @param buttonBorderRadius <p>The corner radius of the scrollbar buttons.</p>
    * @param buttonBorderWidth <p>The border width of the scrollbar buttons.</p>
    * @param liveRedraw <p>Whether to redraw the main chart as the scrollbar or the navigator. zoomed window is moved. Defaults to <code>true</code> for modern browsers and. <code>false</code> for legacy IE browsers as well as mobile devices.</p>
    * @param minWidth <p>The minimum width of the scrollbar.</p>
    * @param rifleColor <p>The color of the small rifles in the middle of the scrollbar.</p>
    * @param trackBackgroundColor <p>The color of the track background.</p>
    * @param trackBorderColor <p>The color of the border of the scrollbar track.</p>
    * @param trackBorderRadius <p>The corner radius of the border of the scrollbar track.</p>
    * @param trackBorderWidth <p>The width of the border of the scrollbar track.</p>
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, margin: js.UndefOr[Double] = js.undefined, opposite: js.UndefOr[Boolean] = js.undefined, showFull: js.UndefOr[Boolean] = js.undefined, size: js.UndefOr[Double] = js.undefined, zIndex: js.UndefOr[Double] = js.undefined, barBackgroundColor: js.UndefOr[String | js.Object] = js.undefined, barBorderColor: js.UndefOr[String | js.Object] = js.undefined, barBorderRadius: js.UndefOr[Double] = js.undefined, barBorderWidth: js.UndefOr[Double] = js.undefined, buttonArrowColor: js.UndefOr[String | js.Object] = js.undefined, buttonBackgroundColor: js.UndefOr[String | js.Object] = js.undefined, buttonBorderColor: js.UndefOr[String | js.Object] = js.undefined, buttonBorderRadius: js.UndefOr[Double] = js.undefined, buttonBorderWidth: js.UndefOr[Double] = js.undefined, liveRedraw: js.UndefOr[Boolean] = js.undefined, minWidth: js.UndefOr[Double] = js.undefined, rifleColor: js.UndefOr[String | js.Object] = js.undefined, trackBackgroundColor: js.UndefOr[String | js.Object] = js.undefined, trackBorderColor: js.UndefOr[String | js.Object] = js.undefined, trackBorderRadius: js.UndefOr[Double] = js.undefined, trackBorderWidth: js.UndefOr[Double] = js.undefined): YAxisScrollbar = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new YAxisScrollbar {
      this.enabled = enabled
      this.margin = margin
      this.opposite = opposite
      this.showFull = showFull
      this.size = size
      this.zIndex = zIndex
      this.barBackgroundColor = barBackgroundColor
      this.barBorderColor = barBorderColor
      this.barBorderRadius = barBorderRadius
      this.barBorderWidth = barBorderWidth
      this.buttonArrowColor = buttonArrowColor
      this.buttonBackgroundColor = buttonBackgroundColor
      this.buttonBorderColor = buttonBorderColor
      this.buttonBorderRadius = buttonBorderRadius
      this.buttonBorderWidth = buttonBorderWidth
      this.liveRedraw = liveRedraw
      this.minWidth = minWidth
      this.rifleColor = rifleColor
      this.trackBackgroundColor = trackBackgroundColor
      this.trackBorderColor = trackBorderColor
      this.trackBorderRadius = trackBorderRadius
      this.trackBorderWidth = trackBorderWidth
    })
  }
}
