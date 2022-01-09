/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highcharts]]
  */
package com.highcharts.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>pane</code>
  */
class Pane extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>An array of background items for the pane.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/gauge-speedometer/">Speedometer gauge with multiple backgrounds</a>
    * @since 2.3.0
    */
  var background: js.UndefOr[js.Array[js.Any]] = js.undefined

  /**
    * <p>The center of a polar chart or angular gauge, given as an array
    * of [x, y] positions. Positions can be given as integers that
    * transform to pixels, or as percentages of the plot area size.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/gauge-vu-meter/">Two gauges with different center</a>
    * @since 2.3.0
    */
  var center: js.UndefOr[js.Array[String | Double]] = js.undefined

  /**
    * <p>The end angle of the polar X axis or gauge value axis, given in
    * degrees where 0 is north. Defaults to <a href="#pane.startAngle">startAngle</a></p>
    * <ul>
    * <li>360.</li>
    * </ul>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/gauge-vu-meter/">VU-meter with custom start and end angle</a>
    * @since 2.3.0
    */
  var endAngle: js.UndefOr[Double] = js.undefined

  /**
    * <p>The inner size of the pane, either as a number defining pixels, or a
    * percentage defining a percentage of the pane&#39;s size.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/series-polar/column-inverted-inner">The inner size set to 20%</a>
    * @since 2.3.0
    */
  var innerSize: js.UndefOr[Double | String] = js.undefined

  /**
    * <p>The size of the pane, either as a number defining pixels, or a
    * percentage defining a percentage of the available plot area (the
    * smallest of the plot height or plot width).</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/gauge-vu-meter/">Smaller size</a>
    * @since 2.3.0
    */
  var size: js.UndefOr[Double | String] = js.undefined

  /**
    * <p>The start angle of the polar X axis or gauge axis, given in degrees
    * where 0 is north. Defaults to 0.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/demo/gauge-vu-meter/">VU-meter with custom start and end angle</a>
    * @since 2.3.0
    */
  var startAngle: js.UndefOr[Double] = js.undefined
}

object Pane {
  /**
    * @param background <p>An array of background items for the pane.</p>
    * @param center <p>The center of a polar chart or angular gauge, given as an array. of [x, y] positions. Positions can be given as integers that. transform to pixels, or as percentages of the plot area size.</p>
    * @param endAngle <p>The end angle of the polar X axis or gauge value axis, given in. degrees where 0 is north. Defaults to <a href="#pane.startAngle">startAngle</a></p>. <ul>. <li>360.</li>. </ul>
    * @param innerSize <p>The inner size of the pane, either as a number defining pixels, or a. percentage defining a percentage of the pane&#39;s size.</p>
    * @param size <p>The size of the pane, either as a number defining pixels, or a. percentage defining a percentage of the available plot area (the. smallest of the plot height or plot width).</p>
    * @param startAngle <p>The start angle of the polar X axis or gauge axis, given in degrees. where 0 is north. Defaults to 0.</p>
    */
  def apply(background: js.UndefOr[js.Array[js.Any]] = js.undefined, center: js.UndefOr[js.Array[String | Double]] = js.undefined, endAngle: js.UndefOr[Double] = js.undefined, innerSize: js.UndefOr[Double | String] = js.undefined, size: js.UndefOr[Double | String] = js.undefined, startAngle: js.UndefOr[Double] = js.undefined): Pane = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new Pane {
      this.background = background
      this.center = center
      this.endAngle = endAngle
      this.innerSize = innerSize
      this.size = size
      this.startAngle = startAngle
    })
  }
}
