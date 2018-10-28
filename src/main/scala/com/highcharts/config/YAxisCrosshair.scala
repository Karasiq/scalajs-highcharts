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
class YAxisCrosshair extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>A class name for the crosshair, especially as a hook for styling.</p>
    * @since 5.0.0
    */
  val className: js.UndefOr[String] = js.undefined

  /**
    * <p>The color of the crosshair. Defaults to <code>#cccccc</code> for numeric and
    * datetime axes, and <code>rgba(204,214,235,0.25)</code> for category axes, where
    * the crosshair by default highlights the whole category.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/crosshair-customized/">Customized crosshairs</a>
    * @since 4.1
    */
  val color: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The dash style for the crosshair. See
    * <a href="#plotOptions.series.dashStyle">series.dashStyle</a>
    * for possible values.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/crosshair-dotted/">Dotted crosshair</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/crosshair-dashed/">Dashed X axis crosshair</a>
    * @since 4.1
    */
  val dashStyle: js.UndefOr[String] = js.undefined

  /**
    * <p>A label on the axis next to the crosshair.</p>
    * <p>In styled mode, the label is styled with the
    * <code>.highcharts-crosshair-label</code> class.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/crosshair-label/">Crosshair labels</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/crosshair-label/">Style mode</a>
    * @since 2.1
    */
  val label: js.Any = js.undefined

  /**
    * <p>Whether the crosshair should snap to the point or follow the pointer
    * independent of points.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/crosshair-snap-false/">True by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/latlon-advanced/">Snap is false</a>
    * @since 4.1
    */
  val snap: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The pixel width of the crosshair. Defaults to 1 for numeric or
    * datetime axes, and for one category width for category axes.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/crosshair-customized/">Customized crosshairs</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/crosshair-customized/">Customized crosshairs</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/crosshair-customized/">Customized crosshairs</a>
    * @since 4.1
    */
  val width: js.UndefOr[Double] = js.undefined

  /**
    * <p>The Z index of the crosshair. Higher Z indices allow drawing the
    * crosshair on top of the series or behind the grid lines.</p>
    * @since 4.1
    */
  val zIndex: js.UndefOr[Double] = js.undefined
}

object YAxisCrosshair {
  /**
    * @param className <p>A class name for the crosshair, especially as a hook for styling.</p>
    * @param color <p>The color of the crosshair. Defaults to <code>#cccccc</code> for numeric and. datetime axes, and <code>rgba(204,214,235,0.25)</code> for category axes, where. the crosshair by default highlights the whole category.</p>
    * @param dashStyle <p>The dash style for the crosshair. See. <a href="#plotOptions.series.dashStyle">series.dashStyle</a>. for possible values.</p>
    * @param label <p>A label on the axis next to the crosshair.</p>. <p>In styled mode, the label is styled with the. <code>.highcharts-crosshair-label</code> class.</p>
    * @param snap <p>Whether the crosshair should snap to the point or follow the pointer. independent of points.</p>
    * @param width <p>The pixel width of the crosshair. Defaults to 1 for numeric or. datetime axes, and for one category width for category axes.</p>
    * @param zIndex <p>The Z index of the crosshair. Higher Z indices allow drawing the. crosshair on top of the series or behind the grid lines.</p>
    */
  def apply(className: js.UndefOr[String] = js.undefined, color: js.UndefOr[String | js.Object] = js.undefined, dashStyle: js.UndefOr[String] = js.undefined, label: js.UndefOr[js.Any] = js.undefined, snap: js.UndefOr[Boolean] = js.undefined, width: js.UndefOr[Double] = js.undefined, zIndex: js.UndefOr[Double] = js.undefined): YAxisCrosshair = {
    val classNameOuter: js.UndefOr[String] = className
    val colorOuter: js.UndefOr[String | js.Object] = color
    val dashStyleOuter: js.UndefOr[String] = dashStyle
    val labelOuter: js.Any = label
    val snapOuter: js.UndefOr[Boolean] = snap
    val widthOuter: js.UndefOr[Double] = width
    val zIndexOuter: js.UndefOr[Double] = zIndex
    com.highcharts.HighchartsGenericObject.toCleanObject(new YAxisCrosshair {
      override val className: js.UndefOr[String] = classNameOuter
      override val color: js.UndefOr[String | js.Object] = colorOuter
      override val dashStyle: js.UndefOr[String] = dashStyleOuter
      override val label: js.Any = labelOuter
      override val snap: js.UndefOr[Boolean] = snapOuter
      override val width: js.UndefOr[Double] = widthOuter
      override val zIndex: js.UndefOr[Double] = zIndexOuter
    })
  }
}
