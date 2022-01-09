/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highmaps]]
  */
package com.highmaps.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>yAxis-resize</code>
  */
class YAxisResize extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Contains two arrays of axes that are controlled by control line
    * of the axis.</p>
    */
  var controlledAxis: js.Any = js.undefined

  /**
    * <p>Cursor style for the control line.</p>
    * <p>In styled mode use class <code>highcharts-axis-resizer</code> instead.</p>
    */
  var cursor: js.UndefOr[String] = js.undefined

  /**
    * <p>Enable or disable resize by drag for the axis.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/demo/candlestick-and-volume">Enabled resizer</a>
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Color of the control line.</p>
    * <p>In styled mode use class <code>highcharts-axis-resizer</code> instead.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/yaxis/styled-resizer">Styled resizer</a>
    */
  var lineColor: js.UndefOr[String] = js.undefined

  /**
    * <p>Dash style of the control line.</p>
    * <p>In styled mode use class <code>highcharts-axis-resizer</code> instead.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/yaxis/styled-resizer">Styled resizer</a>
    */
  var lineDashStyle: js.UndefOr[String] = js.undefined

  /**
    * <p>Width of the control line.</p>
    * <p>In styled mode use class <code>highcharts-axis-resizer</code> instead.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/yaxis/styled-resizer">Styled resizer</a>
    */
  var lineWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>Horizontal offset of the control line.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/yaxis/styled-resizer">Styled resizer</a>
    */
  var x: js.UndefOr[Double] = js.undefined

  /**
    * <p>Vertical offset of the control line.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/yaxis/styled-resizer">Styled resizer</a>
    */
  var y: js.UndefOr[Double] = js.undefined
}

object YAxisResize {
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
  def apply(controlledAxis: js.UndefOr[js.Any] = js.undefined, cursor: js.UndefOr[String] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, lineColor: js.UndefOr[String] = js.undefined, lineDashStyle: js.UndefOr[String] = js.undefined, lineWidth: js.UndefOr[Double] = js.undefined, x: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined): YAxisResize = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new YAxisResize {
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
