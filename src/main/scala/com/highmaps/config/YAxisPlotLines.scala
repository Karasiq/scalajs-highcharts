/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highmaps]]
  */
package com.highmaps.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>yAxis-plotLines</code>
  */
@js.annotation.ScalaJSDefined
class YAxisPlotLines extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>A custom class name, in addition to the default <code>highcharts-plot-line</code>,
    * to apply to each individual line.</p>
    * @since 5.0.0
    */
  val className: js.UndefOr[String] = js.undefined

  /**
    * <p>The color of the line.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotlines-color/">A red line from X axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/plotlines/">Plot line on Y axis</a>
    */
  val color: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The dashing or dot style for the plot line. For possible values see
    * [this overview](<a href="https://jsfiddle.net/gh/get/library/pure/highcharts">https://jsfiddle.net/gh/get/library/pure/highcharts</a>
    * /highcharts/tree/master/samples/highcharts/plotoptions/series-
    * dashstyle-all/).</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotlines-dashstyle/">Dash and dot pattern</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/plotlines/">Plot line on Y axis</a>
    * @since 1.2
    */
  val dashStyle: js.UndefOr[String] = js.undefined

  /**
    * <p>An object defining mouse events for the plot line. Supported
    * properties are <code>click</code>, <code>mouseover</code>, <code>mouseout</code>, <code>mousemove</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotlines-events/">Mouse events demonstrated</a>
    * @since 1.2
    */
  val events: js.Any = js.undefined

  /**
    * <p>An id used for identifying the plot line in Axis.removePlotLine.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotlines-id/">Remove plot line by id</a>
    */
  val id: js.UndefOr[String] = js.undefined

  /**
    * <p>The position of the line in axis units.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotlines-color/">Between two categories on X axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/plotlines/">Plot line on Y axis</a>
    */
  val value: js.UndefOr[Double] = js.undefined

  /**
    * <p>The width or thickness of the plot line.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotlines-color/">2px wide line from X axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/plotlines/">Plot line on Y axis</a>
    */
  val width: js.UndefOr[Double] = js.undefined

  /**
    * <p>The z index of the plot line within the chart.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotlines-zindex-behind/">Behind plot lines by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotlines-zindex-above/">Above plot lines</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotlines-zindex-above-all/">Above plot lines and series</a>
    * @since 1.2
    */
  val zIndex: js.UndefOr[Double] = js.undefined

  /**
    * <p>Text labels for the plot bands</p>
    */
  val label: js.Any = js.undefined
}

object YAxisPlotLines {
  /**
    * @param className <p>A custom class name, in addition to the default <code>highcharts-plot-line</code>,. to apply to each individual line.</p>
    * @param color <p>The color of the line.</p>
    * @param dashStyle <p>The dashing or dot style for the plot line. For possible values see. [this overview](<a href="https://jsfiddle.net/gh/get/library/pure/highcharts">https://jsfiddle.net/gh/get/library/pure/highcharts</a>. /highcharts/tree/master/samples/highcharts/plotoptions/series-. dashstyle-all/).</p>
    * @param events <p>An object defining mouse events for the plot line. Supported. properties are <code>click</code>, <code>mouseover</code>, <code>mouseout</code>, <code>mousemove</code>.</p>
    * @param id <p>An id used for identifying the plot line in Axis.removePlotLine.</p>
    * @param value <p>The position of the line in axis units.</p>
    * @param width <p>The width or thickness of the plot line.</p>
    * @param zIndex <p>The z index of the plot line within the chart.</p>
    * @param label <p>Text labels for the plot bands</p>
    */
  def apply(className: js.UndefOr[String] = js.undefined, color: js.UndefOr[String | js.Object] = js.undefined, dashStyle: js.UndefOr[String] = js.undefined, events: js.UndefOr[js.Any] = js.undefined, id: js.UndefOr[String] = js.undefined, value: js.UndefOr[Double] = js.undefined, width: js.UndefOr[Double] = js.undefined, zIndex: js.UndefOr[Double] = js.undefined, label: js.UndefOr[js.Any] = js.undefined): YAxisPlotLines = {
    val classNameOuter: js.UndefOr[String] = className
    val colorOuter: js.UndefOr[String | js.Object] = color
    val dashStyleOuter: js.UndefOr[String] = dashStyle
    val eventsOuter: js.Any = events
    val idOuter: js.UndefOr[String] = id
    val valueOuter: js.UndefOr[Double] = value
    val widthOuter: js.UndefOr[Double] = width
    val zIndexOuter: js.UndefOr[Double] = zIndex
    val labelOuter: js.Any = label
    com.highcharts.HighchartsGenericObject.toCleanObject(new YAxisPlotLines {
      override val className: js.UndefOr[String] = classNameOuter
      override val color: js.UndefOr[String | js.Object] = colorOuter
      override val dashStyle: js.UndefOr[String] = dashStyleOuter
      override val events: js.Any = eventsOuter
      override val id: js.UndefOr[String] = idOuter
      override val value: js.UndefOr[Double] = valueOuter
      override val width: js.UndefOr[Double] = widthOuter
      override val zIndex: js.UndefOr[Double] = zIndexOuter
      override val label: js.Any = labelOuter
    })
  }
}
