/**
 * Automatically generated file. Please do not edit.
 * @author Highcharts Config Generator v1.0.4 by Karasiq
 * @see [[http://api.highcharts.com/highcharts]]
 */
package com.highcharts.config

import scalajs.js, js.UndefOr

@js.annotation.ScalaJSDefined
class Pane extends js.Object {
  
  /**
   * An object, or array of objects, for backgrounds. Sub options include <code>backgroundColor</code> (can be solid or gradient), <code>shape</code> ("solid" or "arc"), <code>innerWidth</code>, <code>outerWidth</code>, <code>borderWidth</code>, <code>borderColor</code>.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/demo/gauge-speedometer/" target="_blank">Multiple backgrounds on a gauge</a>.
   * @since 2.3.0
   */
  val background: UndefOr[js.Array[js.Object]] = js.undefined
  
  /**
   * The center of a polar chart or angular gauge, given as an array of [x, y] positions. Positions can be given as integers that transform to pixels, or as percentages of the plot area size.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/demo/gauge-vu-meter/" target="_blank">Two gauges with different center</a>
   * @since 2.3.0
   */
  val center: js.Any = js.Array("50%", "50%")
  
  /**
   * The end angle of the polar X axis or gauge value axis, given in degrees where 0 is north. Defaults to <a href="#pane.startAngle">startAngle</a> + 360.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/demo/gauge-vu-meter/" target="_blank">VU-meter with custom start and end angle</a>.
   * @since 2.3.0
   */
  val endAngle: UndefOr[Double] = js.undefined
  
  /**
   * The size of the pane, either as a number defining pixels, or a percentage defining a percentage of the plot are.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/demo/gauge-vu-meter/" target="_blank">Smaller size</a>
   */
  val size: js.Any = "85%"
  
  /**
   * The start angle of the polar X axis or gauge axis, given in degrees where 0 is north. Defaults to 0.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/demo/gauge-vu-meter/" target="_blank">VU-meter with custom start and end angle</a>.
   * @since 2.3.0
   */
  val startAngle: UndefOr[Double] = js.undefined
}
