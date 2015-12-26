/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator v1.0.7 by Karasiq
  * @see [[http://api.highcharts.com/highcharts]]
  */
package com.highcharts.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>yAxis-plotLines-label</code>
  */
@js.annotation.ScalaJSDefined
class YAxisPlotLinesLabel extends js.Object {

  /**
    * Horizontal alignment of the label. Can be one of "left", "center" or "right".
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/plotlines-label-align-right/" target="_blank">Aligned to the right</a>
    * @since 2.1
    */
  val align: js.UndefOr[String] = js.undefined

  /**
    * Rotation of the text label in degrees. Defaults to 0 for horizontal plot lines and 90 for vertical lines.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/plotlines-label-verticalalign-middle/" target="_blank">Slanted text</a>
    * @since 2.1
    */
  val rotation: js.UndefOr[Double] = js.undefined

  /**
    * CSS styles for the text label.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/plotlines-label-style/" target="_blank">Blue and bold label</a>
    * @since 2.1
    */
  val style: js.UndefOr[js.Object] = js.undefined

  /**
    * The text itself. A subset of HTML is supported.
    * @since 2.1
    */
  val text: js.UndefOr[String] = js.undefined

  /**
    * The text alignment for the label. While <code>align</code> determines where the texts anchor point is placed within the plot band, <code>textAlign</code> determines how the text is aligned against its anchor point. Possible values are "left", "center" and "right". Defaults to the same as the <code>align</code> option.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/plotlines-label-textalign/" target="_blank">Text label in bottom position</a>
    * @since 2.1
    */
  val textAlign: js.UndefOr[String] = js.undefined

  /**
    * <p>Whether to <a href="http://docs.highcharts.com/#formatting$html">use HTML</a> to render the labels.
    * @since 3.0.3
    */
  val useHTML: js.UndefOr[Boolean] = js.undefined

  /**
    * Vertical alignment of the label relative to the plot band. Can be one of "top", "middle" or "bottom".
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/plotlines-label-verticalalign-middle/" target="_blank">Vertically centered label</a>
    * @since 2.1
    */
  val verticalAlign: js.UndefOr[String] = js.undefined

  /**
    * Horizontal position relative the alignment. Default varies by orientation.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/plotlines-label-align-right/" target="_blank">Aligned 10px from the right edge</a>
    * @since 2.1
    */
  val x: js.UndefOr[Double] = js.undefined

  /**
    * Vertical position of the text baseline relative to the alignment. Default varies by orientation.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/plotlines-label-y/" target="_blank">Label below the plot line</a>
    * @since 2.1
    */
  val y: js.UndefOr[Double] = js.undefined
}
