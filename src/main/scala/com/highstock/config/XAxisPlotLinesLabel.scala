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
  * @note JavaScript name: <code>xAxis-plotLines-label</code>
  */
@js.annotation.ScalaJSDefined
class XAxisPlotLinesLabel extends js.Object {

  /**
    * Horizontal alignment of the label. Can be one of "left", "center" or "right".
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/plotlines/" target="_blank">Plot line on Y axis</a>
    */
  val align: js.UndefOr[String] = js.undefined

  /**
    * Rotation of the text label in degrees. Defaults to 0 for horizontal plot lines and 90 for vertical lines.
    */
  val rotation: js.UndefOr[Double] = js.undefined

  /**
    * <p>CSS styles for the text label.</p>
    * 
    * <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the labels are styled by the <code>.highcharts-plot-line-label</code> class.</p>
    */
  val style: js.UndefOr[js.Object] = js.undefined

  /**
    * The text alignment for the label. While <code>align</code> determines where the texts anchor point is placed within the plot band, <code>textAlign</code> determines how the text is aligned against its anchor point. Possible values are "left", "center" and "right". Defaults to the same as the <code>align</code> option.
    */
  val textAlign: js.UndefOr[String] = js.undefined

  /**
    * <p>Whether to <a href="http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html">use HTML</a> to render the labels.
    * @since 1.3.3
    */
  val useHTML: js.UndefOr[Boolean] = js.undefined

  /**
    * Vertical alignment of the label relative to the plot line. Can be one of "top", "middle" or "bottom".
    */
  val verticalAlign: js.UndefOr[String] = js.undefined

  /**
    * Horizontal position relative the alignment. Default varies by orientation.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/plotlines/" target="_blank">Plot line on Y axis</a>
    */
  val x: js.UndefOr[Double] = js.undefined

  /**
    * Vertical position of the text baseline relative to the alignment. Default varies by orientation.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/plotlines/" target="_blank">Plot line on Y axis</a>
    */
  val y: js.UndefOr[Double] = js.undefined
}

object XAxisPlotLinesLabel {
  /**
    * @param align Horizontal alignment of the label. Can be one of "left", "center" or "right".
    * @param rotation Rotation of the text label in degrees. Defaults to 0 for horizontal plot lines and 90 for vertical lines.
    * @param style <p>CSS styles for the text label.</p>. . <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the labels are styled by the <code>.highcharts-plot-line-label</code> class.</p>
    * @param textAlign The text alignment for the label. While <code>align</code> determines where the texts anchor point is placed within the plot band, <code>textAlign</code> determines how the text is aligned against its anchor point. Possible values are "left", "center" and "right". Defaults to the same as the <code>align</code> option.
    * @param useHTML <p>Whether to <a href="http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html">use HTML</a> to render the labels.
    * @param verticalAlign Vertical alignment of the label relative to the plot line. Can be one of "top", "middle" or "bottom".
    * @param x Horizontal position relative the alignment. Default varies by orientation.
    * @param y Vertical position of the text baseline relative to the alignment. Default varies by orientation.
    */
  def apply(align: js.UndefOr[String] = js.undefined, rotation: js.UndefOr[Double] = js.undefined, style: js.UndefOr[js.Object] = js.undefined, textAlign: js.UndefOr[String] = js.undefined, useHTML: js.UndefOr[Boolean] = js.undefined, verticalAlign: js.UndefOr[String] = js.undefined, x: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined): XAxisPlotLinesLabel = {
    val alignOuter: js.UndefOr[String] = align
    val rotationOuter: js.UndefOr[Double] = rotation
    val styleOuter: js.UndefOr[js.Object] = style
    val textAlignOuter: js.UndefOr[String] = textAlign
    val useHTMLOuter: js.UndefOr[Boolean] = useHTML
    val verticalAlignOuter: js.UndefOr[String] = verticalAlign
    val xOuter: js.UndefOr[Double] = x
    val yOuter: js.UndefOr[Double] = y
    new XAxisPlotLinesLabel {
      override val align: js.UndefOr[String] = alignOuter
      override val rotation: js.UndefOr[Double] = rotationOuter
      override val style: js.UndefOr[js.Object] = styleOuter
      override val textAlign: js.UndefOr[String] = textAlignOuter
      override val useHTML: js.UndefOr[Boolean] = useHTMLOuter
      override val verticalAlign: js.UndefOr[String] = verticalAlignOuter
      override val x: js.UndefOr[Double] = xOuter
      override val y: js.UndefOr[Double] = yOuter
    }
  }
}
