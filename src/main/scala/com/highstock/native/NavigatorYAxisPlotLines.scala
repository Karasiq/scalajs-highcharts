/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highstock]]
  */
package com.highstock.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>navigator-yAxis-plotLines</code>
  */
class NavigatorYAxisPlotLines extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Flag to decide if plotLine should be rendered across all panes.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/plotlines-acrosspanes/">Plot lines on different panes</a>
    * @since 7.1.2
    */
  var acrossPanes: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>A custom class name, in addition to the default <code>highcharts-plot-line</code>,
    * to apply to each individual line.</p>
    * @since 5.0.0
    */
  var className: js.UndefOr[String] = js.undefined

  /**
    * <p>The color of the line.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotlines-color/">A red line from X axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/plotlines/">Plot line on Y axis</a>
    */
  var color: js.UndefOr[String] = js.undefined

  /**
    * <p>The dashing or dot style for the plot line. For possible values see
    * <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-dashstyle-all/">this overview</a>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotlines-dashstyle/">Dash and dot pattern</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/plotlines/">Plot line on Y axis</a>
    * @since 1.2.0
    */
  var dashStyle: js.UndefOr[String] = js.undefined

  /**
    * <p>An object defining mouse events for the plot line. Supported
    * properties are <code>click</code>, <code>mouseover</code>, <code>mouseout</code>, <code>mousemove</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotlines-events/">Mouse events demonstrated</a>
    * @since 1.2.0
    */
  var events: js.Any = js.undefined

  /**
    * <p>An id used for identifying the plot line in Axis.removePlotLine.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotlines-id/">Remove plot line by id</a>
    */
  var id: js.UndefOr[String] = js.undefined

  /**
    * <p>Text labels for the plot bands</p>
    */
  var label: js.Any = js.undefined

  /**
    * <p>The position of the line in axis units.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotlines-color/">Between two categories on X axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/plotlines/">Plot line on Y axis</a>
    */
  var value: js.UndefOr[Double] = js.undefined

  /**
    * <p>The width or thickness of the plot line.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotlines-color/">2px wide line from X axis</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/plotlines/">Plot line on Y axis</a>
    */
  var width: js.UndefOr[Double] = js.undefined

  /**
    * <p>The z index of the plot line within the chart.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotlines-zindex-behind/">Behind plot lines by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotlines-zindex-above/">Above plot lines</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotlines-zindex-above-all/">Above plot lines and series</a>
    * @since 1.2.0
    */
  var zIndex: js.UndefOr[Double] = js.undefined
}

object NavigatorYAxisPlotLines {
  /**
    * @param acrossPanes <p>Flag to decide if plotLine should be rendered across all panes.</p>
    * @param className <p>A custom class name, in addition to the default <code>highcharts-plot-line</code>,. to apply to each individual line.</p>
    * @param color <p>The color of the line.</p>
    * @param dashStyle <p>The dashing or dot style for the plot line. For possible values see. <a href="https://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-dashstyle-all/">this overview</a>.</p>
    * @param events <p>An object defining mouse events for the plot line. Supported. properties are <code>click</code>, <code>mouseover</code>, <code>mouseout</code>, <code>mousemove</code>.</p>
    * @param id <p>An id used for identifying the plot line in Axis.removePlotLine.</p>
    * @param label <p>Text labels for the plot bands</p>
    * @param value <p>The position of the line in axis units.</p>
    * @param width <p>The width or thickness of the plot line.</p>
    * @param zIndex <p>The z index of the plot line within the chart.</p>
    */
  def apply(acrossPanes: js.UndefOr[Boolean] = js.undefined, className: js.UndefOr[String] = js.undefined, color: js.UndefOr[String] = js.undefined, dashStyle: js.UndefOr[String] = js.undefined, events: js.UndefOr[js.Any] = js.undefined, id: js.UndefOr[String] = js.undefined, label: js.UndefOr[js.Any] = js.undefined, value: js.UndefOr[Double] = js.undefined, width: js.UndefOr[Double] = js.undefined, zIndex: js.UndefOr[Double] = js.undefined): NavigatorYAxisPlotLines = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new NavigatorYAxisPlotLines {
      this.acrossPanes = acrossPanes
      this.className = className
      this.color = color
      this.dashStyle = dashStyle
      this.events = events
      this.id = id
      this.label = label
      this.value = value
      this.width = width
      this.zIndex = zIndex
    })
  }
}
