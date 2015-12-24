/**
 * Automatically generated file. Please do not edit.
 * @author Highcharts Config Generator v1.0.1 by Karasiq
 * @see [[http://api.highcharts.com/highcharts]]
 */
package com.highcharts.config

import scalajs.js, js.UndefOr

@js.annotation.ScalaJSDefined
class Title extends js.Object {
  
  /**
   * The horizontal alignment of the title. Can be one of "left", "center" and "right".
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/title/align/" target="_blank">Aligned to the plot area (x = 70px 
			= margin left - spacing left)</a>
   * @since 2.0
   */
  var align: String = "center"
  
  /**
   * When the title is floating, the plot area will not move to make space for it.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/chart/zoomtype-none/" target="_blank">False by default</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/title/floating/" target="_blank">true - title on top of the plot area</a>.
   * @since 2.1
   */
  var floating: Boolean = false
  
  /**
   * The margin between the title and the plot area, or if a subtitle is present, the margin between the subtitle and the plot area.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/title/margin-50/" target="_blank">A chart title margin of 50</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/title/margin-subtitle/" target="_blank">the same margin applied with a subtitle</a>.
   * @since 2.1
   */
  var margin: Double = 15
  
  /**
   * CSS styles for the title. Use this for font styling, but use <code>align</code>, <code>x</code> and <code>y</code> for text alignment.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/title/style/" target="_blank">Custom color and weight</a>
   */
  var style: js.Object = js.eval("{ \"color\": \"#333333\", \"fontSize\": \"18px\" }").asInstanceOf[js.Object]
  
  /**
   * The title of the chart. To disable the title, set the <code>text</code> to <code>null</code>.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/title/text/" target="_blank">Custom title</a>
   */
  var text: String = "Chart title"
  
  /**
   * Whether to <a href="http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html">use HTML</a> to render the text.
   */
  var useHTML: Boolean = false
  
  /**
   * The vertical alignment of the title. Can be one of "top", "middle" and "bottom". When a value is given, the title behaves as floating.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/title/verticalalign/" target="_blank">Chart title in bottom right corner</a>
   * @since 2.1
   */
  var verticalAlign: String = " "
  
  /**
   * The x position of the title relative to the alignment within chart.spacingLeft and chart.spacingRight.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/title/align/" target="_blank">Aligned to the plot area (x = 70px 
			= margin left - spacing left)</a>
   * @since 2.0
   */
  var x: Double = 0
  
  /**
   * The y position of the title relative to the alignment within <a href="#chart.spacingTop">chart.spacingTop</a> and <a href="#chart.spacingBottom">chart.spacingBottom</a>. By default it depends on the font size.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/title/y/" target="_blank">Title inside the plot area</a>
   * @since 2.0
   */
  var y: UndefOr[Double] = js.undefined
}
