/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator v1.0.9 by Karasiq
  * @see [[http://api.highcharts.com/highstock]]
  */
package com.highstock.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>xAxis-title</code>
  */
@js.annotation.ScalaJSDefined
class XAxisTitle extends js.Object {

  /**
    * Alignment of the title relative to the axis values. Possible values are "low", "middle" or "high".
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/xaxis/title-align/" target="_blank">Aligned to "high" value</a>
    */
  val align: js.UndefOr[String] = js.undefined

  /**
    * The pixel distance between the axis labels or line and the title. Defaults to 0 for horizontal axes, 10 for vertical
    */
  val margin: js.UndefOr[Double] = js.undefined

  /**
    * The distance of the axis title from the axis line. By default, this distance is  computed from the offset width of the labels, the labels' distance from  the axis and the title's margin. However when the offset option is set, it overrides all this.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/yaxis/title-offset/" target="_blank">Place the axis title on top of the Y axis</a>
    * @since 1.1
    */
  val offset: js.UndefOr[Double] = js.undefined

  /**
    * The rotation of the text in degrees. 0 is horizontal, 270 is vertical reading from bottom to top.
    */
  val rotation: js.UndefOr[Double] = js.undefined

  /**
    * CSS styles for the title. When titles are rotated they are rendered using vector graphic techniques and not all styles are applicable.
    */
  val style: js.UndefOr[js.Object] = js.undefined

  /**
    * The actual text of the axis title. It can contain basic HTML text markup like &lt;b&gt;, &lt;i&gt; and spans with style.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/xaxis/title-text/" target="_blank">Titles for both axes</a>
    */
  val text: js.UndefOr[String] = js.undefined

  /**
    * Horizontal pixel offset of the title position.
    * @since 2.1.6
    */
  val x: js.UndefOr[Double] = js.undefined

  /**
    * Vertical pixel offset of the title position.
    */
  val y: js.UndefOr[Double] = js.undefined
}
