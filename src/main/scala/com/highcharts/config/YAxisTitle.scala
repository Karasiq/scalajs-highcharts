/**
 * Automatically generated file. Please do not edit.
 * @author Highcharts Config Generator v1.0.1 by Karasiq
 * @see [[http://api.highcharts.com/highcharts]]
 */
package com.highcharts.config

import scalajs.js, js.UndefOr

@js.annotation.ScalaJSDefined
class YAxisTitle extends js.Object {
  
  /**
   * Alignment of the title relative to the axis values. Possible values
   *  are "low", "middle" or "high".
   * @example X axis title aligned <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/title-align-low/" target="_blank">"low"</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/title-align-center/" target="_blank">"middle" by default</a>, 
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/title-align-high/" target="_blank">"high"</a>, 
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/yaxis/title-offset/" target="_blank">place the Y axis title on top of the axis</a>
   */
  var align: String = "middle"
  
  /**
   * Deprecated. Set the <code>text</code> to <code>null</code> to disable the title.
   */
  @deprecated
  var enabled: String = "middle"
  
  /**
   * The pixel distance between the axis labels and the title. Positive values are outside the axis line, negative are inside.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/title-margin/" target="_blank">Y axis title margin of 60</a>
   */
  var margin: Double = 40
  
  /**
   * The distance of the axis title from the axis line. By default, this distance is  computed from the offset width of the labels, the labels' distance from  the axis and the title's margin. However when the offset option is set, it overrides all this.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/yaxis/title-offset/" target="_blank">Place the axis title on top of the axis</a>
   * @since 2.2.0
   */
  var offset: UndefOr[Double] = js.undefined
  
  /**
   * The rotation of the text in degrees. 0 is horizontal, 270 is  vertical reading from bottom to top.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/yaxis/title-offset/" target="_blank">Horizontal</a> Y axis title
   */
  var rotation: Double = 270
  
  /**
   * CSS styles for the title. When titles are rotated they are rendered using vector graphic techniques and not all styles are applicable.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/title-style/" target="_blank">Red</a> Y axis title
   */
  var style: js.Object = js.eval("{ \"color\": \"#707070\", \"fontWeight\": \"bold\" }").asInstanceOf[js.Object]
  
  /**
   * The actual text of the axis title. Horizontal texts can contain HTML, 
   *  but rotated texts are painted using vector techniques and must be 
   *  clean text. The Y axis title is disabled by setting the <code>text</code>
   *  option to <code>null</code>.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/title-text/" target="_blank">Custom HTML</a> title for X axis
   */
  var text: String = "Values"
  
  /**
   * Horizontal pixel offset of the title position.
   * @since 4.1.6
   */
  var x: Double = 0
  
  /**
   * Vertical pixel offset of the title position.
   */
  var y: UndefOr[Double] = js.undefined
}