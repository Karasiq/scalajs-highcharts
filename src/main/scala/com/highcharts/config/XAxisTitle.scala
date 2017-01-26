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
  * @note JavaScript name: <code>xAxis-title</code>
  */
@js.annotation.ScalaJSDefined
class XAxisTitle extends js.Object {

  /**
    * Alignment of the title relative to the axis values. Possible values
    *  are "low", "middle" or "high".
    * @example X axis title aligned <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/xaxis/title-align-low/" target="_blank">"low"</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/xaxis/title-align-center/" target="_blank">"middle" by default</a>, 
			<a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/xaxis/title-align-high/" target="_blank">"high"</a>, 
			<a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/yaxis/title-offset/" target="_blank">place the Y axis title on top of the axis</a>
    */
  val align: js.UndefOr[String] = js.undefined

  /**
    * Deprecated. Set the <code>text</code> to <code>null</code> to disable the title.
    */
  val enabled: js.UndefOr[String] = js.undefined

  /**
    * The pixel distance between the axis labels or line and the title. Defaults to 0 for horizontal axes, 10 for vertical
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/xaxis/title-margin/" target="_blank">Y axis title margin of 60</a>
    */
  val margin: js.UndefOr[Double] = js.undefined

  /**
    * The distance of the axis title from the axis line. By default, this distance is  computed from the offset width of the labels, the labels' distance from  the axis and the title's margin. However when the offset option is set, it overrides all this.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/yaxis/title-offset/" target="_blank">Place the axis title on top of the axis</a>
    * @since 2.2.0
    */
  val offset: js.UndefOr[Double] = js.undefined

  /**
    * The rotation of the text in degrees. 0 is horizontal, 270 is vertical reading from bottom to top.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/yaxis/title-offset/" target="_blank">Horizontal</a> Y axis title
    */
  val rotation: js.UndefOr[Double] = js.undefined

  /**
    * <p>CSS styles for the title. When titles are rotated they are rendered using vector graphic techniques and not all styles are applicable.</p>
    * 
    * <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the stroke width is given in the <code>.highcharts-axis-title</code> class.</p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/xaxis/title-style/" target="_blank">Red</a> Y axis title.

<a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/css/axis/" target="_blank">Styled mode</a>.

    */
  val style: js.UndefOr[js.Object] = js.undefined

  /**
    * The actual text of the axis title. It can contain basic HTML text markup like &lt;b&gt;, &lt;i&gt; and spans with style.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/xaxis/title-text/" target="_blank">Custom HTML</a> title for X axis
    */
  val text: js.UndefOr[String] = js.undefined

  /**
    * Horizontal pixel offset of the title position.
    * @since 4.1.6
    */
  val x: js.UndefOr[Double] = js.undefined

  /**
    * Vertical pixel offset of the title position.
    */
  val y: js.UndefOr[Double] = js.undefined
}

object XAxisTitle {
  /**
    * @param align Alignment of the title relative to the axis values. Possible values.  are "low", "middle" or "high".
    * @param enabled Deprecated. Set the <code>text</code> to <code>null</code> to disable the title.
    * @param margin The pixel distance between the axis labels or line and the title. Defaults to 0 for horizontal axes, 10 for vertical
    * @param offset The distance of the axis title from the axis line. By default, this distance is  computed from the offset width of the labels, the labels' distance from  the axis and the title's margin. However when the offset option is set, it overrides all this.
    * @param rotation The rotation of the text in degrees. 0 is horizontal, 270 is vertical reading from bottom to top.
    * @param style <p>CSS styles for the title. When titles are rotated they are rendered using vector graphic techniques and not all styles are applicable.</p>. . <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the stroke width is given in the <code>.highcharts-axis-title</code> class.</p>
    * @param text The actual text of the axis title. It can contain basic HTML text markup like &lt;b&gt;, &lt;i&gt; and spans with style.
    * @param x Horizontal pixel offset of the title position.
    * @param y Vertical pixel offset of the title position.
    */
  def apply(align: js.UndefOr[String] = js.undefined, enabled: js.UndefOr[String] = js.undefined, margin: js.UndefOr[Double] = js.undefined, offset: js.UndefOr[Double] = js.undefined, rotation: js.UndefOr[Double] = js.undefined, style: js.UndefOr[js.Object] = js.undefined, text: js.UndefOr[String] = js.undefined, x: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined): XAxisTitle = {
    val alignOuter: js.UndefOr[String] = align
    val enabledOuter: js.UndefOr[String] = enabled
    val marginOuter: js.UndefOr[Double] = margin
    val offsetOuter: js.UndefOr[Double] = offset
    val rotationOuter: js.UndefOr[Double] = rotation
    val styleOuter: js.UndefOr[js.Object] = style
    val textOuter: js.UndefOr[String] = text
    val xOuter: js.UndefOr[Double] = x
    val yOuter: js.UndefOr[Double] = y
    new XAxisTitle {
      override val align: js.UndefOr[String] = alignOuter
      override val enabled: js.UndefOr[String] = enabledOuter
      override val margin: js.UndefOr[Double] = marginOuter
      override val offset: js.UndefOr[Double] = offsetOuter
      override val rotation: js.UndefOr[Double] = rotationOuter
      override val style: js.UndefOr[js.Object] = styleOuter
      override val text: js.UndefOr[String] = textOuter
      override val x: js.UndefOr[Double] = xOuter
      override val y: js.UndefOr[Double] = yOuter
    }
  }
}
