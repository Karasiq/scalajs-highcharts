/**
 * Automatically generated file. Please do not edit.
 * @author Highcharts Config Generator v1.0.4 by Karasiq
 * @see [[http://api.highcharts.com/highcharts]]
 */
package com.highcharts.config

import scalajs.js, js.UndefOr

@js.annotation.ScalaJSDefined
class YAxisPlotBandsLabel extends js.Object {
  
  /**
   * Horizontal alignment of the label. Can be one of "left", "center" or "right".
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/plotbands-label-align/" target="_blank">Aligned to the right</a>
   * @since 2.1
   */
  val align: String = "center"
  
  /**
   * Rotation of the text label in degrees .
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/plotbands-label-rotation/" target="_blank">Vertical text</a>
   * @since 2.1
   */
  val rotation: Double = 0
  
  /**
   * CSS styles for the text label.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/plotbands-label-style/" target="_blank">Blue and bold label</a>
   * @since 2.1
   */
  val style: UndefOr[js.Object] = js.undefined
  
  /**
   * The string text itself. A subset of HTML is supported.
   * @since 2.1
   */
  val text: UndefOr[String] = js.undefined
  
  /**
   * The text alignment for the label. While <code>align</code> determines where the texts anchor point is placed within the plot band, <code>textAlign</code> determines how the text is aligned against its anchor point. Possible values are "left", "center" and "right". Defaults to the same as the <code>align</code> option.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/plotbands-label-rotation/" target="_blank">Vertical text in center position but text-aligned left</a>
   * @since 2.1
   */
  val textAlign: UndefOr[String] = js.undefined
  
  /**
   * <p>Whether to <a href="http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html">use HTML</a> to render the labels.
   * @since 3.0.3
   */
  val useHTML: Boolean = false
  
  /**
   * Vertical alignment of the label relative to the plot band. Can be one of "top", "middle" or "bottom".
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/plotbands-label-verticalalign/" target="_blank">Vertically centered label</a>
   * @since 2.1
   */
  val verticalAlign: String = "top"
  
  /**
   * Horizontal position relative the alignment. Default varies by orientation.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/plotbands-label-align/" target="_blank">Aligned 10px from the right edge</a>
   * @since 2.1
   */
  val x: UndefOr[Double] = js.undefined
  
  /**
   * Vertical position of the text baseline relative to the alignment. Default varies by orientation.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/plotbands-label-y/" target="_blank">Label on x axis</a>
   * @since 2.1
   */
  val y: UndefOr[Double] = js.undefined
}
