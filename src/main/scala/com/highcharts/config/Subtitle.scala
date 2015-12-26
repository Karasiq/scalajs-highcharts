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
  * @note JavaScript name: <code>subtitle</code>
  */
@js.annotation.ScalaJSDefined
class Subtitle extends js.Object {

  /**
    * The horizontal alignment of the subtitle. Can be one of "left", "center" and "right".
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/subtitle/align/" target="_blank">Footnote at right of plot area</a>
    * @since 2.0
    */
  val align: js.UndefOr[String] = js.undefined

  /**
    * When the subtitle is floating, the plot area will not move to make space for it.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/subtitle/floating/" target="_blank">Floating title and subtitle</a>.
    * @since 2.1
    */
  val floating: js.UndefOr[Boolean] = js.undefined

  /**
    * CSS styles for the title. Exact positioning of the title can be achieved by changing the margin property, or by adding <code>position: "absolute"</code> and  left and top properties.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/subtitle/style/" target="_blank">Custom color and weight</a>
    */
  val style: js.UndefOr[js.Object] = js.undefined

  /**
    * The subtitle of the chart.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/subtitle/text/" target="_blank">Custom subtitle</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/subtitle/text-formatted/" target="_blank">formatted and linked text.</a>
    */
  val text: js.UndefOr[String] = js.undefined

  /**
    * Whether to <a href="http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html">use HTML</a> to render the text.
    */
  val useHTML: js.UndefOr[Boolean] = js.undefined

  /**
    * The vertical alignment of the title. Can be one of "top", "middle" and "bottom". When a value is given, the title behaves as floating.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/subtitle/verticalalign/" target="_blank">Footnote at the bottom right of plot area</a>
    * @since 2.1
    */
  val verticalAlign: js.UndefOr[String] = js.undefined

  /**
    * The x position of the subtitle relative to the alignment within chart.spacingLeft and chart.spacingRight.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/subtitle/align/" target="_blank">Footnote at right of plot area</a>
    * @since 2.0
    */
  val x: js.UndefOr[Double] = js.undefined

  /**
    * The y position of the subtitle relative to the alignment within chart.spacingTop and chart.spacingBottom. By default the subtitle is laid out below the title unless the title is floating.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/subtitle/verticalalign/" target="_blank">Footnote at the bottom right of plot area</a>
    * @since 2.0
    */
  val y: js.UndefOr[Double] = js.undefined
}
