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
  * @note JavaScript name: <code>yAxis-resize</code>
  */
@js.annotation.ScalaJSDefined
class YAxisResize extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Contains two arrays of axes that are controlled by control line
    * of the axis.</p>
    * <p>This feature requires the <code>drag-panes.js</code> module.</p>
    */
  val controlledAxis: js.Any = js.undefined

  /**
    * <p>Enable or disable resize by drag for the axis.</p>
    * <p>This feature requires the <code>drag-panes.js</code> module.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/demo/candlestick-and-volume">Enabled resizer</a>
    */
  val enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Cursor style for the control line.</p>
    * <p>In styled mode use class <code>highcharts-axis-resizer</code> instead.</p>
    * <p>This feature requires the <code>drag-panes.js</code> module.</p>
    */
  val cursor: js.UndefOr[String] = js.undefined

  /**
    * <p>Color of the control line.</p>
    * <p>In styled mode use class <code>highcharts-axis-resizer</code> instead.</p>
    * <p>This feature requires the <code>drag-panes.js</code> module.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/yaxis/styled-resizer">Styled resizer</a>
    */
  val lineColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>Dash style of the control line.</p>
    * <p>In styled mode use class <code>highcharts-axis-resizer</code> instead.</p>
    * <p>This feature requires the <code>drag-panes.js</code> module.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/yaxis/styled-resizer">Styled resizer</a>
    */
  val lineDashStyle: js.UndefOr[String] = js.undefined

  /**
    * <p>Width of the control line.</p>
    * <p>In styled mode use class <code>highcharts-axis-resizer</code> instead.</p>
    * <p>This feature requires the <code>drag-panes.js</code> module.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/yaxis/styled-resizer">Styled resizer</a>
    */
  val lineWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>Horizontal offset of the control line.</p>
    * <p>This feature requires the <code>drag-panes.js</code> module.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/yaxis/styled-resizer">Styled resizer</a>
    */
  val x: js.UndefOr[Double] = js.undefined

  /**
    * <p>Vertical offset of the control line.</p>
    * <p>This feature requires the <code>drag-panes.js</code> module.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/yaxis/styled-resizer">Styled resizer</a>
    */
  val y: js.UndefOr[Double] = js.undefined
}

object YAxisResize {
  /**
    * @param controlledAxis <p>Contains two arrays of axes that are controlled by control line. of the axis.</p>. <p>This feature requires the <code>drag-panes.js</code> module.</p>
    * @param enabled <p>Enable or disable resize by drag for the axis.</p>. <p>This feature requires the <code>drag-panes.js</code> module.</p>
    * @param cursor <p>Cursor style for the control line.</p>. <p>In styled mode use class <code>highcharts-axis-resizer</code> instead.</p>. <p>This feature requires the <code>drag-panes.js</code> module.</p>
    * @param lineColor <p>Color of the control line.</p>. <p>In styled mode use class <code>highcharts-axis-resizer</code> instead.</p>. <p>This feature requires the <code>drag-panes.js</code> module.</p>
    * @param lineDashStyle <p>Dash style of the control line.</p>. <p>In styled mode use class <code>highcharts-axis-resizer</code> instead.</p>. <p>This feature requires the <code>drag-panes.js</code> module.</p>
    * @param lineWidth <p>Width of the control line.</p>. <p>In styled mode use class <code>highcharts-axis-resizer</code> instead.</p>. <p>This feature requires the <code>drag-panes.js</code> module.</p>
    * @param x <p>Horizontal offset of the control line.</p>. <p>This feature requires the <code>drag-panes.js</code> module.</p>
    * @param y <p>Vertical offset of the control line.</p>. <p>This feature requires the <code>drag-panes.js</code> module.</p>
    */
  def apply(controlledAxis: js.UndefOr[js.Any] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, cursor: js.UndefOr[String] = js.undefined, lineColor: js.UndefOr[String | js.Object] = js.undefined, lineDashStyle: js.UndefOr[String] = js.undefined, lineWidth: js.UndefOr[Double] = js.undefined, x: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined): YAxisResize = {
    val controlledAxisOuter: js.Any = controlledAxis
    val enabledOuter: js.UndefOr[Boolean] = enabled
    val cursorOuter: js.UndefOr[String] = cursor
    val lineColorOuter: js.UndefOr[String | js.Object] = lineColor
    val lineDashStyleOuter: js.UndefOr[String] = lineDashStyle
    val lineWidthOuter: js.UndefOr[Double] = lineWidth
    val xOuter: js.UndefOr[Double] = x
    val yOuter: js.UndefOr[Double] = y
    com.highcharts.HighchartsGenericObject.toCleanObject(new YAxisResize {
      override val controlledAxis: js.Any = controlledAxisOuter
      override val enabled: js.UndefOr[Boolean] = enabledOuter
      override val cursor: js.UndefOr[String] = cursorOuter
      override val lineColor: js.UndefOr[String | js.Object] = lineColorOuter
      override val lineDashStyle: js.UndefOr[String] = lineDashStyleOuter
      override val lineWidth: js.UndefOr[Double] = lineWidthOuter
      override val x: js.UndefOr[Double] = xOuter
      override val y: js.UndefOr[Double] = yOuter
    })
  }
}
