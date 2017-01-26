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
    * The color of the crosshair.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/xaxis/crosshair-customized/" target="_blank">Customized crosshairs</a>.
    * @since 2.1
    */
  val color: js.UndefOr[String | js.Object] = js.undefined

  /**
    * The dash style for the crosshair. See <a href="#plotOptions.series.dashStyle">series.dashStyle</a> for possible values.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/xaxis/crosshair-dashed/" target="_blank">Dashed X axis crosshair</a>
    * @since 2.1
    */
  val dashStyle: js.UndefOr[String] = js.undefined

  /**
    * <p>A label on the axis next to the crosshair.</p>
    * 
    * <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the label is styled with the <code>.highcharts-crosshair-label</code> class.</p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/xaxis/crosshair-label/" target="_blank">Crosshair labels</a>.

<a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/css/crosshair-label/" target="_blank">Style mode</a>.
    * @since 2.1
    */
  val label: js.UndefOr[CleanJsObject[YAxisCrosshairLabel]] = js.undefined

  /**
    * Whether the crosshair should snap to the point or follow the pointer independent of points.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/xaxis/crosshair-snap-false/" target="_blank">True by default</a>
    * @since 2.1
    */
  val snap: js.UndefOr[Boolean] = js.undefined

  /**
    * The pixel width of the crosshair.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/xaxis/crosshair-customized/" target="_blank">Customized crosshairs</a>.
    * @since 2.1
    */
  val width: js.UndefOr[Double] = js.undefined

  /**
    * The Z index of the crosshair. Higher Z indices allow drawing the crosshair on top of the series or behind the grid lines.
    * @since 2.1
    */
  val zIndex: js.UndefOr[Double] = js.undefined
}

object YAxisCrosshair {
  /**
    * @param className A class name for the crosshair, especially as a hook for styling.
    * @param color The color of the crosshair.
    * @param dashStyle The dash style for the crosshair. See <a href="#plotOptions.series.dashStyle">series.dashStyle</a> for possible values.
    * @param label <p>A label on the axis next to the crosshair.</p>. . <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the label is styled with the <code>.highcharts-crosshair-label</code> class.</p>
    * @param snap Whether the crosshair should snap to the point or follow the pointer independent of points.
    * @param width The pixel width of the crosshair.
    * @param zIndex The Z index of the crosshair. Higher Z indices allow drawing the crosshair on top of the series or behind the grid lines.
    */
  def apply(className: js.UndefOr[String] = js.undefined, color: js.UndefOr[String | js.Object] = js.undefined, dashStyle: js.UndefOr[String] = js.undefined, label: js.UndefOr[CleanJsObject[YAxisCrosshairLabel]] = js.undefined, snap: js.UndefOr[Boolean] = js.undefined, width: js.UndefOr[Double] = js.undefined, zIndex: js.UndefOr[Double] = js.undefined): YAxisCrosshair = {
    val classNameOuter: js.UndefOr[String] = className
    val colorOuter: js.UndefOr[String | js.Object] = color
    val dashStyleOuter: js.UndefOr[String] = dashStyle
    val labelOuter: js.UndefOr[CleanJsObject[YAxisCrosshairLabel]] = label
    val snapOuter: js.UndefOr[Boolean] = snap
    val widthOuter: js.UndefOr[Double] = width
    val zIndexOuter: js.UndefOr[Double] = zIndex
    new YAxisCrosshair {
      override val className: js.UndefOr[String] = classNameOuter
      override val color: js.UndefOr[String | js.Object] = colorOuter
      override val dashStyle: js.UndefOr[String] = dashStyleOuter
      override val label: js.UndefOr[CleanJsObject[YAxisCrosshairLabel]] = labelOuter
      override val snap: js.UndefOr[Boolean] = snapOuter
      override val width: js.UndefOr[Double] = widthOuter
      override val zIndex: js.UndefOr[Double] = zIndexOuter
    }
  }
}
