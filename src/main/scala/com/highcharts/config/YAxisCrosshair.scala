/**
 * Automatically generated file. Please do not edit.
 * @author Highcharts Config Generator v1.0.4 by Karasiq
 * @see [[http://api.highcharts.com/highcharts]]
 */
package com.highcharts.config

import scalajs.js, js.UndefOr

@js.annotation.ScalaJSDefined
class YAxisCrosshair extends js.Object {
  
  /**
   * The color of the crosshair. Defaults to <code>#C0C0C0</code> for numeric and datetime axes, and <code>rgba(155,200,255,0.2)</code> for category axes, where the crosshair by default highlights the whole category.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/crosshair-customized/" target="_blank">Customized crosshairs</a>.
   * @since 4.1
   */
  val color: String = ""
  
  /**
   * The dash style for the crosshair. See <a href="#plotOptions.series.dashStyle">series.dashStyle</a> for possible values.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/crosshair-dotted/" target="_blank">Dotted crosshair</a>
   * @since 4.1
   */
  val dashStyle: String = "Solid"
  
  /**
   * Whether the crosshair should snap to the point or follow the pointer independent of points.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/crosshair-snap-false/" target="_blank">True by default</a>
   * @since 4.1
   */
  val snap: Boolean = true
  
  /**
   * The pixel width of the crosshair. Defaults to 1 for numeric or datetime axes, and for one category width for category axes.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/crosshair-customized/" target="_blank">Customized crosshairs</a>.
   * @since 4.1
   */
  val width: UndefOr[Double] = js.undefined
  
  /**
   * The Z index of the crosshair. Higher Z indices allow drawing the crosshair on top of the series or behind the grid lines.
   * @since 4.1
   */
  val zIndex: Double = 2
}
