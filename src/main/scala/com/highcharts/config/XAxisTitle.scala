/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator v1.0.5 by Karasiq
  * @see [[http://api.highcharts.com/highcharts]]
  */
package com.highcharts.config

import scalajs.js

/**
  * @note JavaScript name: <code>xAxis-title</code>
  */
@js.annotation.ScalaJSDefined
class XAxisTitle extends js.Object {

  /**
    * Alignment of the title relative to the axis values. Possible values
    *  are "low", "middle" or "high".
    * @example X axis title aligned <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/title-align-low/" target="_blank">"low"</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/title-align-center/" target="_blank">"middle" by default</a>, 
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/title-align-high/" target="_blank">"high"</a>, 
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/yaxis/title-offset/" target="_blank">place the Y axis title on top of the axis</a>
    */
  val align: String = "middle"

  /**
    * Deprecated. Set the <code>text</code> to <code>null</code> to disable the title.
    */
  val enabled: String = "middle"

  /**
    * The pixel distance between the axis labels or line and the title. Defaults to 0 for horizontal axes, 10 for vertical
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/title-margin/" target="_blank">Y axis title margin of 60</a>
    */
  val margin: Double = js.undefined.asInstanceOf[Double]

  /**
    * The distance of the axis title from the axis line. By default, this distance is  computed from the offset width of the labels, the labels' distance from  the axis and the title's margin. However when the offset option is set, it overrides all this.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/yaxis/title-offset/" target="_blank">Place the axis title on top of the axis</a>
    * @since 2.2.0
    */
  val offset: Double = js.undefined.asInstanceOf[Double]

  /**
    * The rotation of the text in degrees. 0 is horizontal, 270 is vertical reading from bottom to top.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/yaxis/title-offset/" target="_blank">Horizontal</a> Y axis title
    */
  val rotation: Double = 0

  /**
    * CSS styles for the title. When titles are rotated they are rendered using vector graphic techniques and not all styles are applicable.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/title-style/" target="_blank">Red</a> Y axis title
    */
  val style: js.Object = js.eval("{ \"color\": \"#707070\", \"fontWeight\": \"bold\" }").asInstanceOf[js.Object]

  /**
    * The actual text of the axis title. It can contain basic HTML text markup like &lt;b&gt;, &lt;i&gt; and spans with style.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/title-text/" target="_blank">Custom HTML</a> title for X axis
    */
  val text: String = js.undefined.asInstanceOf[String]

  /**
    * Horizontal pixel offset of the title position.
    * @since 4.1.6
    */
  val x: Double = 0

  /**
    * Vertical pixel offset of the title position.
    */
  val y: Double = js.undefined.asInstanceOf[Double]
}
