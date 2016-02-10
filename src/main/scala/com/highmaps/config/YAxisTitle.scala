/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highmaps]]
  */
package com.highmaps.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>yAxis-title</code>
  */
@js.annotation.ScalaJSDefined
class YAxisTitle extends js.Object {

  /**
    * Alignment of the title relative to the axis values. Possible values
    *  are "low", "middle" or "high".
    */
  val align: js.UndefOr[String] = js.undefined

  /**
    * The pixel distance between the axis labels and the title. Positive values are outside the axis line, negative are inside.
    */
  val margin: js.UndefOr[Double] = js.undefined

  /**
    * The distance of the axis title from the axis line. By default, this distance is  computed from the offset width of the labels, the labels' distance from  the axis and the title's margin. However when the offset option is set, it overrides all this.
    */
  val offset: js.UndefOr[Double] = js.undefined

  /**
    * The rotation of the text in degrees. 0 is horizontal, 270 is  vertical reading from bottom to top.
    */
  val rotation: js.UndefOr[Double] = js.undefined

  /**
    * CSS styles for the title. When titles are rotated they are rendered using vector graphic techniques and not all styles are applicable.
    */
  val style: js.UndefOr[js.Object] = js.undefined

  /**
    * The actual text of the axis title. It can contain basic HTML text markup like &lt;b&gt;, &lt;i&gt; and spans with style.
    */
  val text: js.UndefOr[String] = js.undefined
}

object YAxisTitle {
  /**
    * @param align Alignment of the title relative to the axis values. Possible values.  are "low", "middle" or "high".
    * @param margin The pixel distance between the axis labels and the title. Positive values are outside the axis line, negative are inside.
    * @param offset The distance of the axis title from the axis line. By default, this distance is  computed from the offset width of the labels, the labels' distance from  the axis and the title's margin. However when the offset option is set, it overrides all this.
    * @param rotation The rotation of the text in degrees. 0 is horizontal, 270 is  vertical reading from bottom to top.
    * @param style CSS styles for the title. When titles are rotated they are rendered using vector graphic techniques and not all styles are applicable.
    * @param text The actual text of the axis title. It can contain basic HTML text markup like &lt;b&gt;, &lt;i&gt; and spans with style.
    */
  def apply(align: js.UndefOr[String] = js.undefined, margin: js.UndefOr[Double] = js.undefined, offset: js.UndefOr[Double] = js.undefined, rotation: js.UndefOr[Double] = js.undefined, style: js.UndefOr[js.Object] = js.undefined, text: js.UndefOr[String] = js.undefined): YAxisTitle = {
    val alignOuter: js.UndefOr[String] = align
    val marginOuter: js.UndefOr[Double] = margin
    val offsetOuter: js.UndefOr[Double] = offset
    val rotationOuter: js.UndefOr[Double] = rotation
    val styleOuter: js.UndefOr[js.Object] = style
    val textOuter: js.UndefOr[String] = text
    new YAxisTitle {
      override val align: js.UndefOr[String] = alignOuter
      override val margin: js.UndefOr[Double] = marginOuter
      override val offset: js.UndefOr[Double] = offsetOuter
      override val rotation: js.UndefOr[Double] = rotationOuter
      override val style: js.UndefOr[js.Object] = styleOuter
      override val text: js.UndefOr[String] = textOuter
    }
  }
}
