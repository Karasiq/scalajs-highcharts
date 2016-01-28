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
  * @note JavaScript name: <code>xAxis-plotLines</code>
  */
@js.annotation.ScalaJSDefined
class XAxisPlotLines extends js.Object {

  /**
    * The color of the line.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/plotlines-color/" target="_blank">A red line from X axis</a>
    */
  val color: js.UndefOr[String | js.Object] = js.undefined

  /**
    * The dashing or dot style for the plot line. For possible values see <a href="http://jsfiddle.net/gh/get/jquery/1.7.1/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-dashstyle-all/">this overview</a>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/plotlines-dashstyle/" target="_blank">Dash and dot pattern</a>
    * @since 1.2
    */
  val dashStyle: js.UndefOr[String] = js.undefined

  /**
    * An object defining mouse events for the plot line. Supported properties are <code>click</code>, <code>mouseover</code>, <code>mouseout</code>, <code>mousemove</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/plotlines-events/" target="_blank">Mouse events demonstrated</a>
    * @since 1.2
    */
  val events: js.UndefOr[js.Object] = js.undefined

  /**
    * An id used for identifying the plot line in Axis.removePlotLine.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/plotlines-id/" target="_blank">Remove plot line by id</a>
    */
  val id: js.UndefOr[String] = js.undefined

  /**
    * Text labels for the plot bands
    */
  val label: js.UndefOr[CleanJsObject[XAxisPlotLinesLabel]] = js.undefined

  /**
    * The position of the line in axis units.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/plotlines-color/" target="_blank">Between two categories on X axis</a>
    */
  val value: js.UndefOr[Double] = js.undefined

  /**
    * The width or thickness of the plot line.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/plotlines-color/" target="_blank">2px wide line from X axis</a>
    */
  val width: js.UndefOr[Double] = js.undefined

  /**
    * The z index of the plot line within the chart.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/plotlines-zindex-behind/" target="_blank">Behind plot lines by default</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/plotlines-zindex-above/" target="_blank">above plot lines</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/plotlines-zindex-above-all/" target="_blank">above plot lines and series</a>.
    * @since 1.2
    */
  val zIndex: js.UndefOr[Double] = js.undefined
}
