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
  * @note JavaScript name: <code>pane</code>
  */
@js.annotation.ScalaJSDefined
class Pane extends js.Object {

  /**
    * An object, or array of objects, for backgrounds. Sub options include <code>backgroundColor</code> (can be solid or gradient), <code>shape</code> ("solid" or "arc"), <code>innerWidth</code>, <code>outerWidth</code>, <code>borderWidth</code>, <code>borderColor</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/demo/gauge-speedometer/" target="_blank">Multiple backgrounds on a gauge</a>.
    * @since 2.3.0
    */
  val background: js.UndefOr[js.Array[js.Object]] = js.undefined

  /**
    * The center of a polar chart or angular gauge, given as an array of [x, y] positions. Positions can be given as integers that transform to pixels, or as percentages of the plot area size.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/demo/gauge-vu-meter/" target="_blank">Two gauges with different center</a>
    * @since 2.3.0
    */
  val center: js.UndefOr[js.Array[String | Double]] = js.undefined

  /**
    * The end angle of the polar X axis or gauge value axis, given in degrees where 0 is north. Defaults to <a href="#pane.startAngle">startAngle</a> + 360.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/demo/gauge-vu-meter/" target="_blank">VU-meter with custom start and end angle</a>.
    * @since 2.3.0
    */
  val endAngle: js.UndefOr[Double] = js.undefined

  /**
    * The size of the pane, either as a number defining pixels, or a percentage defining a percentage of the plot are.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/demo/gauge-vu-meter/" target="_blank">Smaller size</a>
    */
  val size: js.UndefOr[Double | String] = js.undefined

  /**
    * The start angle of the polar X axis or gauge axis, given in degrees where 0 is north. Defaults to 0.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/demo/gauge-vu-meter/" target="_blank">VU-meter with custom start and end angle</a>.
    * @since 2.3.0
    */
  val startAngle: js.UndefOr[Double] = js.undefined
}

object Pane {
  /**
    * @param background An object, or array of objects, for backgrounds. Sub options include <code>backgroundColor</code> (can be solid or gradient), <code>shape</code> ("solid" or "arc"), <code>innerWidth</code>, <code>outerWidth</code>, <code>borderWidth</code>, <code>borderColor</code>.
    * @param center The center of a polar chart or angular gauge, given as an array of [x, y] positions. Positions can be given as integers that transform to pixels, or as percentages of the plot area size.
    * @param endAngle The end angle of the polar X axis or gauge value axis, given in degrees where 0 is north. Defaults to <a href="#pane.startAngle">startAngle</a> + 360.
    * @param size The size of the pane, either as a number defining pixels, or a percentage defining a percentage of the plot are.
    * @param startAngle The start angle of the polar X axis or gauge axis, given in degrees where 0 is north. Defaults to 0.
    */
  def apply(background: js.UndefOr[js.Array[js.Object]] = js.undefined, center: js.UndefOr[js.Array[String | Double]] = js.undefined, endAngle: js.UndefOr[Double] = js.undefined, size: js.UndefOr[Double | String] = js.undefined, startAngle: js.UndefOr[Double] = js.undefined): Pane = {
    val backgroundOuter: js.UndefOr[js.Array[js.Object]] = background
    val centerOuter: js.UndefOr[js.Array[String | Double]] = center
    val endAngleOuter: js.UndefOr[Double] = endAngle
    val sizeOuter: js.UndefOr[Double | String] = size
    val startAngleOuter: js.UndefOr[Double] = startAngle
    new Pane {
      override val background: js.UndefOr[js.Array[js.Object]] = backgroundOuter
      override val center: js.UndefOr[js.Array[String | Double]] = centerOuter
      override val endAngle: js.UndefOr[Double] = endAngleOuter
      override val size: js.UndefOr[Double | String] = sizeOuter
      override val startAngle: js.UndefOr[Double] = startAngleOuter
    }
  }
}
