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
  * @note JavaScript name: <code>xAxis-plotBands-label</code>
  */
@js.annotation.ScalaJSDefined
class XAxisPlotBandsLabel extends js.Object {

  /**
    * Horizontal alignment of the label. Can be one of "left", "center" or "right".
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/plotbands-label-align/" target="_blank">Aligned to the right</a>
    * @since 2.1
    */
  val align: js.UndefOr[String] = js.undefined

  /**
    * Rotation of the text label in degrees .
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/plotbands-label-rotation/" target="_blank">Vertical text</a>
    * @since 2.1
    */
  val rotation: js.UndefOr[Double] = js.undefined

  /**
    * CSS styles for the text label.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/plotbands-label-style/" target="_blank">Blue and bold label</a>
    * @since 2.1
    */
  val style: js.UndefOr[js.Object] = js.undefined

  /**
    * The string text itself. A subset of HTML is supported.
    * @since 2.1
    */
  val text: js.UndefOr[String] = js.undefined

  /**
    * The text alignment for the label. While <code>align</code> determines where the texts anchor point is placed within the plot band, <code>textAlign</code> determines how the text is aligned against its anchor point. Possible values are "left", "center" and "right". Defaults to the same as the <code>align</code> option.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/plotbands-label-rotation/" target="_blank">Vertical text in center position but text-aligned left</a>
    * @since 2.1
    */
  val textAlign: js.UndefOr[String] = js.undefined

  /**
    * <p>Whether to <a href="http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html">use HTML</a> to render the labels.
    * @since 3.0.3
    */
  val useHTML: js.UndefOr[Boolean] = js.undefined

  /**
    * Vertical alignment of the label relative to the plot band. Can be one of "top", "middle" or "bottom".
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/plotbands-label-verticalalign/" target="_blank">Vertically centered label</a>
    * @since 2.1
    */
  val verticalAlign: js.UndefOr[String] = js.undefined

  /**
    * Horizontal position relative the alignment. Default varies by orientation.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/plotbands-label-align/" target="_blank">Aligned 10px from the right edge</a>
    * @since 2.1
    */
  val x: js.UndefOr[Double] = js.undefined

  /**
    * Vertical position of the text baseline relative to the alignment. Default varies by orientation.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/plotbands-label-y/" target="_blank">Label on x axis</a>
    * @since 2.1
    */
  val y: js.UndefOr[Double] = js.undefined
}

object XAxisPlotBandsLabel {
  /**
    * @param align Horizontal alignment of the label. Can be one of "left", "center" or "right".
    * @param rotation Rotation of the text label in degrees .
    * @param style CSS styles for the text label.
    * @param text The string text itself. A subset of HTML is supported.
    * @param textAlign The text alignment for the label. While <code>align</code> determines where the texts anchor point is placed within the plot band, <code>textAlign</code> determines how the text is aligned against its anchor point. Possible values are "left", "center" and "right". Defaults to the same as the <code>align</code> option.
    * @param useHTML <p>Whether to <a href="http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html">use HTML</a> to render the labels.
    * @param verticalAlign Vertical alignment of the label relative to the plot band. Can be one of "top", "middle" or "bottom".
    * @param x Horizontal position relative the alignment. Default varies by orientation.
    * @param y Vertical position of the text baseline relative to the alignment. Default varies by orientation.
    */
  def apply(align: js.UndefOr[String] = js.undefined, rotation: js.UndefOr[Double] = js.undefined, style: js.UndefOr[js.Object] = js.undefined, text: js.UndefOr[String] = js.undefined, textAlign: js.UndefOr[String] = js.undefined, useHTML: js.UndefOr[Boolean] = js.undefined, verticalAlign: js.UndefOr[String] = js.undefined, x: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined): XAxisPlotBandsLabel = {
    val alignOuter: js.UndefOr[String] = align
    val rotationOuter: js.UndefOr[Double] = rotation
    val styleOuter: js.UndefOr[js.Object] = style
    val textOuter: js.UndefOr[String] = text
    val textAlignOuter: js.UndefOr[String] = textAlign
    val useHTMLOuter: js.UndefOr[Boolean] = useHTML
    val verticalAlignOuter: js.UndefOr[String] = verticalAlign
    val xOuter: js.UndefOr[Double] = x
    val yOuter: js.UndefOr[Double] = y
    new XAxisPlotBandsLabel {
      override val align: js.UndefOr[String] = alignOuter
      override val rotation: js.UndefOr[Double] = rotationOuter
      override val style: js.UndefOr[js.Object] = styleOuter
      override val text: js.UndefOr[String] = textOuter
      override val textAlign: js.UndefOr[String] = textAlignOuter
      override val useHTML: js.UndefOr[Boolean] = useHTMLOuter
      override val verticalAlign: js.UndefOr[String] = verticalAlignOuter
      override val x: js.UndefOr[Double] = xOuter
      override val y: js.UndefOr[Double] = yOuter
    }
  }
}
