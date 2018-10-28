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
  * @note JavaScript name: <code>pane</code>
  */
@js.annotation.ScalaJSDefined
class Pane extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The center of a polar chart or angular gauge, given as an array
    * of [x, y] positions. Positions can be given as integers that
    * transform to pixels, or as percentages of the plot area size.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/gauge-vu-meter/">Two gauges with different center</a>
    * @since 2.3.0
    */
  val center: js.UndefOr[js.Array[String | Double]] = js.undefined

  /**
    * <p>The size of the pane, either as a number defining pixels, or a
    * percentage defining a percentage of the plot are.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/gauge-vu-meter/">Smaller size</a>
    * @since 2.3.0
    */
  val size: js.UndefOr[Double | String] = js.undefined

  /**
    * <p>The start angle of the polar X axis or gauge axis, given in degrees
    * where 0 is north. Defaults to 0.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/gauge-vu-meter/">VU-meter with custom start and end angle</a>
    * @since 2.3.0
    */
  val startAngle: js.UndefOr[Double] = js.undefined

  /**
    * <p>The end angle of the polar X axis or gauge value axis, given in
    * degrees where 0 is north. Defaults to <a href="#pane.startAngle">startAngle</a></p>
    * <ul>
    * <li>360.</li>
    * </ul>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/gauge-vu-meter/">VU-meter with custom start and end angle</a>
    * @since 2.3.0
    */
  val endAngle: js.UndefOr[Double] = js.undefined

  /**
    * <p>An array of background items for the pane.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/gauge-speedometer/">Speedometer gauge with multiple backgrounds</a>
    * @since 2.3.0
    */
  val background: js.UndefOr[js.Array[CleanJsObject[PaneBackground]]] = js.undefined
}

object Pane {
  /**
    * @param center <p>The center of a polar chart or angular gauge, given as an array. of [x, y] positions. Positions can be given as integers that. transform to pixels, or as percentages of the plot area size.</p>
    * @param size <p>The size of the pane, either as a number defining pixels, or a. percentage defining a percentage of the plot are.</p>
    * @param startAngle <p>The start angle of the polar X axis or gauge axis, given in degrees. where 0 is north. Defaults to 0.</p>
    * @param endAngle <p>The end angle of the polar X axis or gauge value axis, given in. degrees where 0 is north. Defaults to <a href="#pane.startAngle">startAngle</a></p>. <ul>. <li>360.</li>. </ul>
    * @param background <p>An array of background items for the pane.</p>
    */
  def apply(center: js.UndefOr[js.Array[String | Double]] = js.undefined, size: js.UndefOr[Double | String] = js.undefined, startAngle: js.UndefOr[Double] = js.undefined, endAngle: js.UndefOr[Double] = js.undefined, background: js.UndefOr[js.Array[CleanJsObject[PaneBackground]]] = js.undefined): Pane = {
    val centerOuter: js.UndefOr[js.Array[String | Double]] = center
    val sizeOuter: js.UndefOr[Double | String] = size
    val startAngleOuter: js.UndefOr[Double] = startAngle
    val endAngleOuter: js.UndefOr[Double] = endAngle
    val backgroundOuter: js.UndefOr[js.Array[CleanJsObject[PaneBackground]]] = background
    com.highcharts.HighchartsGenericObject.toCleanObject(new Pane {
      override val center: js.UndefOr[js.Array[String | Double]] = centerOuter
      override val size: js.UndefOr[Double | String] = sizeOuter
      override val startAngle: js.UndefOr[Double] = startAngleOuter
      override val endAngle: js.UndefOr[Double] = endAngleOuter
      override val background: js.UndefOr[js.Array[CleanJsObject[PaneBackground]]] = backgroundOuter
    })
  }
}
