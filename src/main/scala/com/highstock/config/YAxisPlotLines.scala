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
  * @note JavaScript name: <code>yAxis-plotLines</code>
  */
@js.annotation.ScalaJSDefined
class YAxisPlotLines extends js.Object {

  /**
    * A custom class name, in addition to the default <code>highcharts-plot-line</code>, to apply to each individual line.
    * @since 5.0.0
    */
  val className: js.UndefOr[String] = js.undefined

  /**
    * The color of the line.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/plotlines/" target="_blank">Plot line on Y axis</a>
    */
  val color: js.UndefOr[String | js.Object] = js.undefined

  /**
    * The dashing or dot style for the plot line. For possible values see <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-dashstyle-all/">this overview</a>.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/plotlines/" target="_blank">Plot line on Y axis</a>
    */
  val dashStyle: js.UndefOr[String] = js.undefined

  /**
    * An object defining mouse events for the plot line. Supported properties are <code>click</code>, <code>mouseover</code>, <code>mouseout</code>, <code>mousemove</code>.
    */
  val events: js.UndefOr[js.Object] = js.undefined

  /**
    * An id used for identifying the plot line in Axis.removePlotLine.
    */
  val id: js.UndefOr[String] = js.undefined

  /**
    * Text labels for the plot bands
    */
  val label: js.UndefOr[CleanJsObject[YAxisPlotLinesLabel]] = js.undefined

  /**
    * The position of the line in axis units.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/plotlines/" target="_blank">Plot line on Y axis</a>
    */
  val value: js.UndefOr[Double] = js.undefined

  /**
    * The width or thickness of the plot line.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/plotlines/" target="_blank">Plot line on Y axis</a>
    */
  val width: js.UndefOr[Double] = js.undefined

  /**
    * The z index of the plot line within the chart.
    */
  val zIndex: js.UndefOr[Double] = js.undefined
}

object YAxisPlotLines {
  /**
    * @param className A custom class name, in addition to the default <code>highcharts-plot-line</code>, to apply to each individual line.
    * @param color The color of the line.
    * @param dashStyle The dashing or dot style for the plot line. For possible values see <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-dashstyle-all/">this overview</a>.
    * @param events An object defining mouse events for the plot line. Supported properties are <code>click</code>, <code>mouseover</code>, <code>mouseout</code>, <code>mousemove</code>.
    * @param id An id used for identifying the plot line in Axis.removePlotLine.
    * @param label Text labels for the plot bands
    * @param value The position of the line in axis units.
    * @param width The width or thickness of the plot line.
    * @param zIndex The z index of the plot line within the chart.
    */
  def apply(className: js.UndefOr[String] = js.undefined, color: js.UndefOr[String | js.Object] = js.undefined, dashStyle: js.UndefOr[String] = js.undefined, events: js.UndefOr[js.Object] = js.undefined, id: js.UndefOr[String] = js.undefined, label: js.UndefOr[CleanJsObject[YAxisPlotLinesLabel]] = js.undefined, value: js.UndefOr[Double] = js.undefined, width: js.UndefOr[Double] = js.undefined, zIndex: js.UndefOr[Double] = js.undefined): YAxisPlotLines = {
    val classNameOuter: js.UndefOr[String] = className
    val colorOuter: js.UndefOr[String | js.Object] = color
    val dashStyleOuter: js.UndefOr[String] = dashStyle
    val eventsOuter: js.UndefOr[js.Object] = events
    val idOuter: js.UndefOr[String] = id
    val labelOuter: js.UndefOr[CleanJsObject[YAxisPlotLinesLabel]] = label
    val valueOuter: js.UndefOr[Double] = value
    val widthOuter: js.UndefOr[Double] = width
    val zIndexOuter: js.UndefOr[Double] = zIndex
    new YAxisPlotLines {
      override val className: js.UndefOr[String] = classNameOuter
      override val color: js.UndefOr[String | js.Object] = colorOuter
      override val dashStyle: js.UndefOr[String] = dashStyleOuter
      override val events: js.UndefOr[js.Object] = eventsOuter
      override val id: js.UndefOr[String] = idOuter
      override val label: js.UndefOr[CleanJsObject[YAxisPlotLinesLabel]] = labelOuter
      override val value: js.UndefOr[Double] = valueOuter
      override val width: js.UndefOr[Double] = widthOuter
      override val zIndex: js.UndefOr[Double] = zIndexOuter
    }
  }
}
