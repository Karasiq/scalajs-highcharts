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
  * @note JavaScript name: <code>zAxis-scrollbar</code>
  */
@js.annotation.ScalaJSDefined
class ZAxisScrollbar extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The height of the scrollbar. The height also applies to the width
    * of the scroll arrows so that they are always squares. Defaults to
    * 20 for touch devices and 14 for mouse devices.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/scrollbar/height/">A 30px scrollbar</a>
    * @since 4.2.6
    */
  val height: js.UndefOr[Double] = js.undefined

  /**
    * <p>The border rounding radius of the bar.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/scrollbar/style/">Scrollbar styling</a>
    * @since 4.2.6
    */
  val barBorderRadius: js.UndefOr[Double] = js.undefined

  /**
    * <p>The corner radius of the scrollbar buttons.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/scrollbar/style/">Scrollbar styling</a>
    * @since 4.2.6
    */
  val buttonBorderRadius: js.UndefOr[Double] = js.undefined

  /**
    * <p>Whether to redraw the main chart as the scrollbar or the navigator
    * zoomed window is moved. Defaults to <code>true</code> for modern browsers and
    * <code>false</code> for legacy IE browsers as well as mobile devices.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/scrollbar/liveredraw">Setting live redraw to false</a>
    * @since 1.3
    */
  val liveRedraw: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The margin between the scrollbar and its axis when the scrollbar is
    * applied directly to an axis.</p>
    * @since 4.2.6
    */
  val margin: js.UndefOr[Double] = js.undefined

  /**
    * <p>The minimum width of the scrollbar.</p>
    * @since 1.2.5
    */
  val minWidth: js.UndefOr[Double] = js.undefined

  val step: js.UndefOr[Double] = js.undefined

  /**
    * <p>The z index of the scrollbar group.</p>
    * @since 4.2.6
    */
  val zIndex: js.UndefOr[Double] = js.undefined

  /**
    * <p>The background color of the scrollbar itself.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/scrollbar/style/">Scrollbar styling</a>
    * @since 4.2.6
    */
  val barBackgroundColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The width of the bar&#39;s border.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/scrollbar/style/">Scrollbar styling</a>
    * @since 4.2.6
    */
  val barBorderWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>The color of the scrollbar&#39;s border.</p>
    * @since 4.2.6
    */
  val barBorderColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The color of the small arrow inside the scrollbar buttons.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/scrollbar/style/">Scrollbar styling</a>
    * @since 4.2.6
    */
  val buttonArrowColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The color of scrollbar buttons.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/scrollbar/style/">Scrollbar styling</a>
    * @since 4.2.6
    */
  val buttonBackgroundColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The color of the border of the scrollbar buttons.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/scrollbar/style/">Scrollbar styling</a>
    * @since 4.2.6
    */
  val buttonBorderColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The border width of the scrollbar buttons.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/scrollbar/style/">Scrollbar styling</a>
    * @since 4.2.6
    */
  val buttonBorderWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>The color of the small rifles in the middle of the scrollbar.</p>
    * @since 4.2.6
    */
  val rifleColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The color of the track background.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/scrollbar/style/">Scrollbar styling</a>
    * @since 4.2.6
    */
  val trackBackgroundColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The color of the border of the scrollbar track.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/scrollbar/style/">Scrollbar styling</a>
    * @since 4.2.6
    */
  val trackBorderColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The width of the border of the scrollbar track.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/scrollbar/style/">Scrollbar styling</a>
    * @since 4.2.6
    */
  val trackBorderWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>Enable or disable the scrollbar.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/scrollbar/enabled/">Disable the scrollbar, only use navigator</a>
    * @since 4.2.6
    */
  val enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Whether to show or hide the scrollbar when the scrolled content is
    * zoomed out to it full extent.</p>
    * @since 4.2.6
    */
  val showFull: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The corner radius of the border of the scrollbar track.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/scrollbar/style/">Scrollbar styling</a>
    * @since 4.2.6
    */
  val trackBorderRadius: js.UndefOr[Double] = js.undefined
}

object ZAxisScrollbar {
  /**
    * @param height <p>The height of the scrollbar. The height also applies to the width. of the scroll arrows so that they are always squares. Defaults to. 20 for touch devices and 14 for mouse devices.</p>
    * @param barBorderRadius <p>The border rounding radius of the bar.</p>
    * @param buttonBorderRadius <p>The corner radius of the scrollbar buttons.</p>
    * @param liveRedraw <p>Whether to redraw the main chart as the scrollbar or the navigator. zoomed window is moved. Defaults to <code>true</code> for modern browsers and. <code>false</code> for legacy IE browsers as well as mobile devices.</p>
    * @param margin <p>The margin between the scrollbar and its axis when the scrollbar is. applied directly to an axis.</p>
    * @param minWidth <p>The minimum width of the scrollbar.</p>
    * @param zIndex <p>The z index of the scrollbar group.</p>
    * @param barBackgroundColor <p>The background color of the scrollbar itself.</p>
    * @param barBorderWidth <p>The width of the bar&#39;s border.</p>
    * @param barBorderColor <p>The color of the scrollbar&#39;s border.</p>
    * @param buttonArrowColor <p>The color of the small arrow inside the scrollbar buttons.</p>
    * @param buttonBackgroundColor <p>The color of scrollbar buttons.</p>
    * @param buttonBorderColor <p>The color of the border of the scrollbar buttons.</p>
    * @param buttonBorderWidth <p>The border width of the scrollbar buttons.</p>
    * @param rifleColor <p>The color of the small rifles in the middle of the scrollbar.</p>
    * @param trackBackgroundColor <p>The color of the track background.</p>
    * @param trackBorderColor <p>The color of the border of the scrollbar track.</p>
    * @param trackBorderWidth <p>The width of the border of the scrollbar track.</p>
    * @param enabled <p>Enable or disable the scrollbar.</p>
    * @param showFull <p>Whether to show or hide the scrollbar when the scrolled content is. zoomed out to it full extent.</p>
    * @param trackBorderRadius <p>The corner radius of the border of the scrollbar track.</p>
    */
  def apply(height: js.UndefOr[Double] = js.undefined, barBorderRadius: js.UndefOr[Double] = js.undefined, buttonBorderRadius: js.UndefOr[Double] = js.undefined, liveRedraw: js.UndefOr[Boolean] = js.undefined, margin: js.UndefOr[Double] = js.undefined, minWidth: js.UndefOr[Double] = js.undefined, step: js.UndefOr[Double] = js.undefined, zIndex: js.UndefOr[Double] = js.undefined, barBackgroundColor: js.UndefOr[String | js.Object] = js.undefined, barBorderWidth: js.UndefOr[Double] = js.undefined, barBorderColor: js.UndefOr[String | js.Object] = js.undefined, buttonArrowColor: js.UndefOr[String | js.Object] = js.undefined, buttonBackgroundColor: js.UndefOr[String | js.Object] = js.undefined, buttonBorderColor: js.UndefOr[String | js.Object] = js.undefined, buttonBorderWidth: js.UndefOr[Double] = js.undefined, rifleColor: js.UndefOr[String | js.Object] = js.undefined, trackBackgroundColor: js.UndefOr[String | js.Object] = js.undefined, trackBorderColor: js.UndefOr[String | js.Object] = js.undefined, trackBorderWidth: js.UndefOr[Double] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, showFull: js.UndefOr[Boolean] = js.undefined, trackBorderRadius: js.UndefOr[Double] = js.undefined): ZAxisScrollbar = {
    val heightOuter: js.UndefOr[Double] = height
    val barBorderRadiusOuter: js.UndefOr[Double] = barBorderRadius
    val buttonBorderRadiusOuter: js.UndefOr[Double] = buttonBorderRadius
    val liveRedrawOuter: js.UndefOr[Boolean] = liveRedraw
    val marginOuter: js.UndefOr[Double] = margin
    val minWidthOuter: js.UndefOr[Double] = minWidth
    val stepOuter: js.UndefOr[Double] = step
    val zIndexOuter: js.UndefOr[Double] = zIndex
    val barBackgroundColorOuter: js.UndefOr[String | js.Object] = barBackgroundColor
    val barBorderWidthOuter: js.UndefOr[Double] = barBorderWidth
    val barBorderColorOuter: js.UndefOr[String | js.Object] = barBorderColor
    val buttonArrowColorOuter: js.UndefOr[String | js.Object] = buttonArrowColor
    val buttonBackgroundColorOuter: js.UndefOr[String | js.Object] = buttonBackgroundColor
    val buttonBorderColorOuter: js.UndefOr[String | js.Object] = buttonBorderColor
    val buttonBorderWidthOuter: js.UndefOr[Double] = buttonBorderWidth
    val rifleColorOuter: js.UndefOr[String | js.Object] = rifleColor
    val trackBackgroundColorOuter: js.UndefOr[String | js.Object] = trackBackgroundColor
    val trackBorderColorOuter: js.UndefOr[String | js.Object] = trackBorderColor
    val trackBorderWidthOuter: js.UndefOr[Double] = trackBorderWidth
    val enabledOuter: js.UndefOr[Boolean] = enabled
    val showFullOuter: js.UndefOr[Boolean] = showFull
    val trackBorderRadiusOuter: js.UndefOr[Double] = trackBorderRadius
    com.highcharts.HighchartsGenericObject.toCleanObject(new ZAxisScrollbar {
      override val height: js.UndefOr[Double] = heightOuter
      override val barBorderRadius: js.UndefOr[Double] = barBorderRadiusOuter
      override val buttonBorderRadius: js.UndefOr[Double] = buttonBorderRadiusOuter
      override val liveRedraw: js.UndefOr[Boolean] = liveRedrawOuter
      override val margin: js.UndefOr[Double] = marginOuter
      override val minWidth: js.UndefOr[Double] = minWidthOuter
      override val step: js.UndefOr[Double] = stepOuter
      override val zIndex: js.UndefOr[Double] = zIndexOuter
      override val barBackgroundColor: js.UndefOr[String | js.Object] = barBackgroundColorOuter
      override val barBorderWidth: js.UndefOr[Double] = barBorderWidthOuter
      override val barBorderColor: js.UndefOr[String | js.Object] = barBorderColorOuter
      override val buttonArrowColor: js.UndefOr[String | js.Object] = buttonArrowColorOuter
      override val buttonBackgroundColor: js.UndefOr[String | js.Object] = buttonBackgroundColorOuter
      override val buttonBorderColor: js.UndefOr[String | js.Object] = buttonBorderColorOuter
      override val buttonBorderWidth: js.UndefOr[Double] = buttonBorderWidthOuter
      override val rifleColor: js.UndefOr[String | js.Object] = rifleColorOuter
      override val trackBackgroundColor: js.UndefOr[String | js.Object] = trackBackgroundColorOuter
      override val trackBorderColor: js.UndefOr[String | js.Object] = trackBorderColorOuter
      override val trackBorderWidth: js.UndefOr[Double] = trackBorderWidthOuter
      override val enabled: js.UndefOr[Boolean] = enabledOuter
      override val showFull: js.UndefOr[Boolean] = showFullOuter
      override val trackBorderRadius: js.UndefOr[Double] = trackBorderRadiusOuter
    })
  }
}
