/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/gantt]]
  */
package com.gantt.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>chart-parallelAxes-resize</code>
  */
class ChartParallelAxesResize extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Contains two arrays of axes that are controlled by control line
    * of the axis.</p>
    * @since 6.0.0
    */
  var controlledAxis: js.Any = js.undefined

  /**
    * <p>Cursor style for the control line.</p>
    * <p>In styled mode use class <code>highcharts-axis-resizer</code> instead.</p>
    * @since 6.0.0
    */
  var cursor: js.UndefOr[String] = js.undefined

  /**
    * <p>Enable or disable resize by drag for the axis.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/demo/candlestick-and-volume">Enabled resizer</a>
    * @since 6.0.0
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Color of the control line.</p>
    * <p>In styled mode use class <code>highcharts-axis-resizer</code> instead.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/yaxis/styled-resizer">Styled resizer</a>
    * @since 6.0.0
    */
  var lineColor: js.UndefOr[String] = js.undefined

  /**
    * <p>Dash style of the control line.</p>
    * <p>In styled mode use class <code>highcharts-axis-resizer</code> instead.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/yaxis/styled-resizer">Styled resizer</a>
    * @since 6.0.0
    */
  var lineDashStyle: js.UndefOr[String] = js.undefined

  /**
    * <p>Width of the control line.</p>
    * <p>In styled mode use class <code>highcharts-axis-resizer</code> instead.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/yaxis/styled-resizer">Styled resizer</a>
    * @since 6.0.0
    */
  var lineWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>Horizontal offset of the control line.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/yaxis/styled-resizer">Styled resizer</a>
    * @since 6.0.0
    */
  var x: js.UndefOr[Double] = js.undefined

  /**
    * <p>Vertical offset of the control line.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/yaxis/styled-resizer">Styled resizer</a>
    * @since 6.0.0
    */
  var y: js.UndefOr[Double] = js.undefined
}

object ChartParallelAxesResize {
  /**
    * @param controlledAxis <p>Contains two arrays of axes that are controlled by control line. of the axis.</p>
    * @param cursor <p>Cursor style for the control line.</p>. <p>In styled mode use class <code>highcharts-axis-resizer</code> instead.</p>
    * @param enabled <p>Enable or disable resize by drag for the axis.</p>
    * @param lineColor <p>Color of the control line.</p>. <p>In styled mode use class <code>highcharts-axis-resizer</code> instead.</p>
    * @param lineDashStyle <p>Dash style of the control line.</p>. <p>In styled mode use class <code>highcharts-axis-resizer</code> instead.</p>
    * @param lineWidth <p>Width of the control line.</p>. <p>In styled mode use class <code>highcharts-axis-resizer</code> instead.</p>
    * @param x <p>Horizontal offset of the control line.</p>
    * @param y <p>Vertical offset of the control line.</p>
    */
  def apply(controlledAxis: js.UndefOr[js.Any] = js.undefined, cursor: js.UndefOr[String] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, lineColor: js.UndefOr[String] = js.undefined, lineDashStyle: js.UndefOr[String] = js.undefined, lineWidth: js.UndefOr[Double] = js.undefined, x: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined): ChartParallelAxesResize = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new ChartParallelAxesResize {
      this.controlledAxis = controlledAxis
      this.cursor = cursor
      this.enabled = enabled
      this.lineColor = lineColor
      this.lineDashStyle = lineDashStyle
      this.lineWidth = lineWidth
      this.x = x
      this.y = y
    })
  }
}
