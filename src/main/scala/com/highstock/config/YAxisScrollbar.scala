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
  * @note JavaScript name: <code>yAxis-scrollbar</code>
  */
@js.annotation.ScalaJSDefined
class YAxisScrollbar extends js.Object {

  /**
    * The background color of the scrollbar itself.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/scrollbar/style/" target="_blank">Scrollbar styling</a>
    */
  val barBackgroundColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * The color of the scrollbar's border.
    */
  val barBorderColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * The border rounding radius of the bar.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/scrollbar/style/" target="_blank">Scrollbar styling</a>
    */
  val barBorderRadius: js.UndefOr[Double] = js.undefined

  /**
    * The width of the bar's border.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/scrollbar/style/" target="_blank">Scrollbar styling</a>
    */
  val barBorderWidth: js.UndefOr[Double] = js.undefined

  /**
    * The color of the small arrow inside the scrollbar buttons.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/scrollbar/style/" target="_blank">Scrollbar styling</a>
    */
  val buttonArrowColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * The color of scrollbar buttons.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/scrollbar/style/" target="_blank">Scrollbar styling</a>
    */
  val buttonBackgroundColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * The color of the border of the scrollbar buttons.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/scrollbar/style/" target="_blank">Scrollbar styling</a>
    */
  val buttonBorderColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * The corner radius of the scrollbar buttons.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/scrollbar/style/" target="_blank">Scrollbar styling</a>
    */
  val buttonBorderRadius: js.UndefOr[Double] = js.undefined

  /**
    * The border width of the scrollbar buttons.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/scrollbar/style/" target="_blank">Scrollbar styling</a>
    */
  val buttonBorderWidth: js.UndefOr[Double] = js.undefined

  /**
    * Enable the scrollbar on the Y axis.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/yaxis/scrollbar/" target="_blank">Enabled on Y axis</a>
    * @since 4.2.6
    */
  val enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * Whether to redraw the main chart as the scrollbar or the navigator zoomed window is moved. Defaults to <code>true</code> for modern browsers and <code>false</code> for legacy IE browsers as well as mobile devices.
    * @since 1.3
    */
  val liveRedraw: js.UndefOr[Boolean] = js.undefined

  /**
    * Pixel margin between the scrollbar and the axis elements.
    * @since 4.2.6
    */
  val margin: js.UndefOr[Double] = js.undefined

  /**
    * The minimum width of the scrollbar.
    * @since 1.2.5
    */
  val minWidth: js.UndefOr[Double] = js.undefined

  /**
    * The color of the small rifles in the middle of the scrollbar.
    */
  val rifleColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * Whether to show the scrollbar when it is fully zoomed out at max range. Setting it to <code>false</code> on the Y axis makes the scrollbar stay hidden until the user zooms in, like common in browsers.
    * @since 4.2.6
    */
  val showFull: js.UndefOr[Boolean] = js.undefined

  /**
    * The width of a vertical scrollbar or height of a horizontal scrollbar. Defaults to 20 on touch devices.
    * @since 4.2.6
    */
  val size: js.UndefOr[Double] = js.undefined

  /**
    * The color of the track background.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/scrollbar/style/" target="_blank">Scrollbar styling</a>
    */
  val trackBackgroundColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * The color of the border of the scrollbar track.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/scrollbar/style/" target="_blank">Scrollbar styling</a>
    */
  val trackBorderColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * The corner radius of the border of the scrollbar track.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/scrollbar/style/" target="_blank">Scrollbar styling</a>
    */
  val trackBorderRadius: js.UndefOr[Double] = js.undefined

  /**
    * The width of the border of the scrollbar track.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/scrollbar/style/" target="_blank">Scrollbar styling</a>
    */
  val trackBorderWidth: js.Any = js.undefined

  /**
    * Z index of the scrollbar elements.
    * @since 4.2.6
    */
  val zIndex: js.UndefOr[Double] = js.undefined
}

object YAxisScrollbar {
  /**
    * @param barBackgroundColor The background color of the scrollbar itself.
    * @param barBorderColor The color of the scrollbar's border.
    * @param barBorderRadius The border rounding radius of the bar.
    * @param barBorderWidth The width of the bar's border.
    * @param buttonArrowColor The color of the small arrow inside the scrollbar buttons.
    * @param buttonBackgroundColor The color of scrollbar buttons.
    * @param buttonBorderColor The color of the border of the scrollbar buttons.
    * @param buttonBorderRadius The corner radius of the scrollbar buttons.
    * @param buttonBorderWidth The border width of the scrollbar buttons.
    * @param enabled Enable the scrollbar on the Y axis.
    * @param liveRedraw Whether to redraw the main chart as the scrollbar or the navigator zoomed window is moved. Defaults to <code>true</code> for modern browsers and <code>false</code> for legacy IE browsers as well as mobile devices.
    * @param margin Pixel margin between the scrollbar and the axis elements.
    * @param minWidth The minimum width of the scrollbar.
    * @param rifleColor The color of the small rifles in the middle of the scrollbar.
    * @param showFull Whether to show the scrollbar when it is fully zoomed out at max range. Setting it to <code>false</code> on the Y axis makes the scrollbar stay hidden until the user zooms in, like common in browsers.
    * @param size The width of a vertical scrollbar or height of a horizontal scrollbar. Defaults to 20 on touch devices.
    * @param trackBackgroundColor The color of the track background.
    * @param trackBorderColor The color of the border of the scrollbar track.
    * @param trackBorderRadius The corner radius of the border of the scrollbar track.
    * @param trackBorderWidth The width of the border of the scrollbar track.
    * @param zIndex Z index of the scrollbar elements.
    */
  def apply(barBackgroundColor: js.UndefOr[String | js.Object] = js.undefined, barBorderColor: js.UndefOr[String | js.Object] = js.undefined, barBorderRadius: js.UndefOr[Double] = js.undefined, barBorderWidth: js.UndefOr[Double] = js.undefined, buttonArrowColor: js.UndefOr[String | js.Object] = js.undefined, buttonBackgroundColor: js.UndefOr[String | js.Object] = js.undefined, buttonBorderColor: js.UndefOr[String | js.Object] = js.undefined, buttonBorderRadius: js.UndefOr[Double] = js.undefined, buttonBorderWidth: js.UndefOr[Double] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, liveRedraw: js.UndefOr[Boolean] = js.undefined, margin: js.UndefOr[Double] = js.undefined, minWidth: js.UndefOr[Double] = js.undefined, rifleColor: js.UndefOr[String | js.Object] = js.undefined, showFull: js.UndefOr[Boolean] = js.undefined, size: js.UndefOr[Double] = js.undefined, trackBackgroundColor: js.UndefOr[String | js.Object] = js.undefined, trackBorderColor: js.UndefOr[String | js.Object] = js.undefined, trackBorderRadius: js.UndefOr[Double] = js.undefined, trackBorderWidth: js.UndefOr[js.Any] = js.undefined, zIndex: js.UndefOr[Double] = js.undefined): YAxisScrollbar = {
    val barBackgroundColorOuter: js.UndefOr[String | js.Object] = barBackgroundColor
    val barBorderColorOuter: js.UndefOr[String | js.Object] = barBorderColor
    val barBorderRadiusOuter: js.UndefOr[Double] = barBorderRadius
    val barBorderWidthOuter: js.UndefOr[Double] = barBorderWidth
    val buttonArrowColorOuter: js.UndefOr[String | js.Object] = buttonArrowColor
    val buttonBackgroundColorOuter: js.UndefOr[String | js.Object] = buttonBackgroundColor
    val buttonBorderColorOuter: js.UndefOr[String | js.Object] = buttonBorderColor
    val buttonBorderRadiusOuter: js.UndefOr[Double] = buttonBorderRadius
    val buttonBorderWidthOuter: js.UndefOr[Double] = buttonBorderWidth
    val enabledOuter: js.UndefOr[Boolean] = enabled
    val liveRedrawOuter: js.UndefOr[Boolean] = liveRedraw
    val marginOuter: js.UndefOr[Double] = margin
    val minWidthOuter: js.UndefOr[Double] = minWidth
    val rifleColorOuter: js.UndefOr[String | js.Object] = rifleColor
    val showFullOuter: js.UndefOr[Boolean] = showFull
    val sizeOuter: js.UndefOr[Double] = size
    val trackBackgroundColorOuter: js.UndefOr[String | js.Object] = trackBackgroundColor
    val trackBorderColorOuter: js.UndefOr[String | js.Object] = trackBorderColor
    val trackBorderRadiusOuter: js.UndefOr[Double] = trackBorderRadius
    val trackBorderWidthOuter: js.Any = trackBorderWidth
    val zIndexOuter: js.UndefOr[Double] = zIndex
    new YAxisScrollbar {
      override val barBackgroundColor: js.UndefOr[String | js.Object] = barBackgroundColorOuter
      override val barBorderColor: js.UndefOr[String | js.Object] = barBorderColorOuter
      override val barBorderRadius: js.UndefOr[Double] = barBorderRadiusOuter
      override val barBorderWidth: js.UndefOr[Double] = barBorderWidthOuter
      override val buttonArrowColor: js.UndefOr[String | js.Object] = buttonArrowColorOuter
      override val buttonBackgroundColor: js.UndefOr[String | js.Object] = buttonBackgroundColorOuter
      override val buttonBorderColor: js.UndefOr[String | js.Object] = buttonBorderColorOuter
      override val buttonBorderRadius: js.UndefOr[Double] = buttonBorderRadiusOuter
      override val buttonBorderWidth: js.UndefOr[Double] = buttonBorderWidthOuter
      override val enabled: js.UndefOr[Boolean] = enabledOuter
      override val liveRedraw: js.UndefOr[Boolean] = liveRedrawOuter
      override val margin: js.UndefOr[Double] = marginOuter
      override val minWidth: js.UndefOr[Double] = minWidthOuter
      override val rifleColor: js.UndefOr[String | js.Object] = rifleColorOuter
      override val showFull: js.UndefOr[Boolean] = showFullOuter
      override val size: js.UndefOr[Double] = sizeOuter
      override val trackBackgroundColor: js.UndefOr[String | js.Object] = trackBackgroundColorOuter
      override val trackBorderColor: js.UndefOr[String | js.Object] = trackBorderColorOuter
      override val trackBorderRadius: js.UndefOr[Double] = trackBorderRadiusOuter
      override val trackBorderWidth: js.Any = trackBorderWidthOuter
      override val zIndex: js.UndefOr[Double] = zIndexOuter
    }
  }
}
