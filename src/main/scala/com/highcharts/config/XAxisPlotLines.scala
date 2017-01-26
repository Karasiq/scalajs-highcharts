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
    * A custom class name, in addition to the default <code>highcharts-plot-line</code>, to apply to each individual line.
    * @since 5.0.0
    */
  val className: js.UndefOr[String] = js.undefined

  /**
    * The color of the line.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotlines-color/" target="_blank">A red line from X axis</a>
    */
  val color: js.UndefOr[String | js.Object] = js.undefined

  /**
    * The dashing or dot style for the plot line. For possible values see <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-dashstyle-all/">this overview</a>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotlines-dashstyle/" target="_blank">Dash and dot pattern</a>
    * @since 1.2
    */
  val dashStyle: js.UndefOr[String] = js.undefined

  /**
    * An object defining mouse events for the plot line. Supported properties are <code>click</code>, <code>mouseover</code>, <code>mouseout</code>, <code>mousemove</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotlines-events/" target="_blank">Mouse events demonstrated</a>
    * @since 1.2
    */
  val events: js.UndefOr[js.Object] = js.undefined

  /**
    * An id used for identifying the plot line in Axis.removePlotLine.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotlines-id/" target="_blank">Remove plot line by id</a>
    */
  val id: js.UndefOr[String] = js.undefined

  /**
    * Text labels for the plot bands
    */
  val label: js.UndefOr[CleanJsObject[XAxisPlotLinesLabel]] = js.undefined

  /**
    * The position of the line in axis units.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotlines-color/" target="_blank">Between two categories on X axis</a>
    */
  val value: js.UndefOr[Double] = js.undefined

  /**
    * The width or thickness of the plot line.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotlines-color/" target="_blank">2px wide line from X axis</a>
    */
  val width: js.UndefOr[Double] = js.undefined

  /**
    * The z index of the plot line within the chart.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotlines-zindex-behind/" target="_blank">Behind plot lines by default</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotlines-zindex-above/" target="_blank">above plot lines</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotlines-zindex-above-all/" target="_blank">above plot lines and series</a>.
    * @since 1.2
    */
  val zIndex: js.UndefOr[Double] = js.undefined
}

object XAxisPlotLines {
  /**
    * @param className A custom class name, in addition to the default <code>highcharts-plot-line</code>, to apply to each individual line.
    * @param color The color of the line.
    * @param dashStyle The dashing or dot style for the plot line. For possible values see <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-dashstyle-all/">this overview</a>.
    * @param events An object defining mouse events for the plot line. Supported properties are <code>click</code>, <code>mouseover</code>, <code>mouseout</code>, <code>mousemove</code>.
    * @param id An id used for identifying the plot line in Axis.removePlotLine.
    * @param label Text labels for the plot bands
    * @param value The position of the line in axis units.
    * @param width The width or thickness of the plot line.
    * @param zIndex The z index of the plot line within the chart.
    */
  def apply(className: js.UndefOr[String] = js.undefined, color: js.UndefOr[String | js.Object] = js.undefined, dashStyle: js.UndefOr[String] = js.undefined, events: js.UndefOr[js.Object] = js.undefined, id: js.UndefOr[String] = js.undefined, label: js.UndefOr[CleanJsObject[XAxisPlotLinesLabel]] = js.undefined, value: js.UndefOr[Double] = js.undefined, width: js.UndefOr[Double] = js.undefined, zIndex: js.UndefOr[Double] = js.undefined): XAxisPlotLines = {
    val classNameOuter: js.UndefOr[String] = className
    val colorOuter: js.UndefOr[String | js.Object] = color
    val dashStyleOuter: js.UndefOr[String] = dashStyle
    val eventsOuter: js.UndefOr[js.Object] = events
    val idOuter: js.UndefOr[String] = id
    val labelOuter: js.UndefOr[CleanJsObject[XAxisPlotLinesLabel]] = label
    val valueOuter: js.UndefOr[Double] = value
    val widthOuter: js.UndefOr[Double] = width
    val zIndexOuter: js.UndefOr[Double] = zIndex
    new XAxisPlotLines {
      override val className: js.UndefOr[String] = classNameOuter
      override val color: js.UndefOr[String | js.Object] = colorOuter
      override val dashStyle: js.UndefOr[String] = dashStyleOuter
      override val events: js.UndefOr[js.Object] = eventsOuter
      override val id: js.UndefOr[String] = idOuter
      override val label: js.UndefOr[CleanJsObject[XAxisPlotLinesLabel]] = labelOuter
      override val value: js.UndefOr[Double] = valueOuter
      override val width: js.UndefOr[Double] = widthOuter
      override val zIndex: js.UndefOr[Double] = zIndexOuter
    }
  }
}
