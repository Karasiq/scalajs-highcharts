/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highcharts]]
  */
package com.highcharts.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>yAxis-crosshair</code>
  */
@js.annotation.ScalaJSDefined
class YAxisCrosshair extends js.Object {

  /**
    * A class name for the crosshair, especially as a hook for styling.
    * @since 5.0.0
    */
  val className: js.UndefOr[String] = js.undefined

  /**
    * The color of the crosshair. Defaults to <code>#cccccc</code> for numeric and datetime axes, and <code>rgba(204,214,235,0.25)</code> for category axes, where the crosshair by default highlights the whole category.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/xaxis/crosshair-customized/" target="_blank">Customized crosshairs</a>.
    * @since 4.1
    */
  val color: js.UndefOr[String | js.Object] = js.undefined

  /**
    * The dash style for the crosshair. See <a href="#plotOptions.series.dashStyle">series.dashStyle</a> for possible values.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/xaxis/crosshair-dotted/" target="_blank">Dotted crosshair</a>
    * @since 4.1
    */
  val dashStyle: js.UndefOr[String] = js.undefined

  /**
    * Whether the crosshair should snap to the point or follow the pointer independent of points.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/xaxis/crosshair-snap-false/" target="_blank">True by default</a>
    * @since 4.1
    */
  val snap: js.UndefOr[Boolean] = js.undefined

  /**
    * The pixel width of the crosshair. Defaults to 1 for numeric or datetime axes, and for one category width for category axes.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/xaxis/crosshair-customized/" target="_blank">Customized crosshairs</a>.
    * @since 4.1
    */
  val width: js.UndefOr[Double] = js.undefined

  /**
    * The Z index of the crosshair. Higher Z indices allow drawing the crosshair on top of the series or behind the grid lines.
    * @since 4.1
    */
  val zIndex: js.UndefOr[Double] = js.undefined
}

object YAxisCrosshair {
  /**
    * @param className A class name for the crosshair, especially as a hook for styling.
    * @param color The color of the crosshair. Defaults to <code>#cccccc</code> for numeric and datetime axes, and <code>rgba(204,214,235,0.25)</code> for category axes, where the crosshair by default highlights the whole category.
    * @param dashStyle The dash style for the crosshair. See <a href="#plotOptions.series.dashStyle">series.dashStyle</a> for possible values.
    * @param snap Whether the crosshair should snap to the point or follow the pointer independent of points.
    * @param width The pixel width of the crosshair. Defaults to 1 for numeric or datetime axes, and for one category width for category axes.
    * @param zIndex The Z index of the crosshair. Higher Z indices allow drawing the crosshair on top of the series or behind the grid lines.
    */
  def apply(className: js.UndefOr[String] = js.undefined, color: js.UndefOr[String | js.Object] = js.undefined, dashStyle: js.UndefOr[String] = js.undefined, snap: js.UndefOr[Boolean] = js.undefined, width: js.UndefOr[Double] = js.undefined, zIndex: js.UndefOr[Double] = js.undefined): YAxisCrosshair = {
    val classNameOuter: js.UndefOr[String] = className
    val colorOuter: js.UndefOr[String | js.Object] = color
    val dashStyleOuter: js.UndefOr[String] = dashStyle
    val snapOuter: js.UndefOr[Boolean] = snap
    val widthOuter: js.UndefOr[Double] = width
    val zIndexOuter: js.UndefOr[Double] = zIndex
    new YAxisCrosshair {
      override val className: js.UndefOr[String] = classNameOuter
      override val color: js.UndefOr[String | js.Object] = colorOuter
      override val dashStyle: js.UndefOr[String] = dashStyleOuter
      override val snap: js.UndefOr[Boolean] = snapOuter
      override val width: js.UndefOr[Double] = widthOuter
      override val zIndex: js.UndefOr[Double] = zIndexOuter
    }
  }
}
