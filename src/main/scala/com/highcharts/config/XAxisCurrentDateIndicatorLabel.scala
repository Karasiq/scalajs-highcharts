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
  * @note JavaScript name: <code>xAxis-currentDateIndicator-label</code>
  */
@js.annotation.ScalaJSDefined
class XAxisCurrentDateIndicatorLabel extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Horizontal alignment of the label. Can be one of &quot;left&quot;, &quot;center&quot; or
    * &quot;right&quot;.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotlines-label-align-right/">Aligned to the right</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/plotlines/">Plot line on Y axis</a>
    * @since 2.1
    */
  val align: js.UndefOr[String] = js.undefined

  /**
    * <p>Rotation of the text label in degrees. Defaults to 0 for horizontal plot
    * lines and 90 for vertical lines.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotlines-label-verticalalign-middle/">Slanted text</a>
    * @since 2.1
    */
  val rotation: js.UndefOr[Double] = js.undefined

  /**
    * <p>CSS styles for the text label.</p>
    * <p>In styled mode, the labels are styled by the
    * <code>.highcharts-plot-line-label</code> class.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotlines-label-style/">Blue and bold label</a>
    * @since 2.1
    */
  val style: js.UndefOr[js.Object] = js.undefined

  /**
    * <p>The text itself. A subset of HTML is supported.</p>
    * @since 2.1
    */
  val text: js.UndefOr[String] = js.undefined

  /**
    * <p>The text alignment for the label. While <code>align</code> determines where the
    * texts anchor point is placed within the plot band, <code>textAlign</code> determines
    * how the text is aligned against its anchor point. Possible values are
    * &quot;left&quot;, &quot;center&quot; and &quot;right&quot;. Defaults to the same as the <code>align</code> option.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotlines-label-textalign/">Text label in bottom position</a>
    * @since 2.1
    */
  val textAlign: js.UndefOr[String] = js.undefined

  /**
    * <p>Whether to [use HTML](<a href="https://www.highcharts.com/docs/chart-concepts">https://www.highcharts.com/docs/chart-concepts</a>
    * /labels-and-string-formatting#html) to render the labels.</p>
    * @since 3.0.3
    */
  val useHTML: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Vertical alignment of the label relative to the plot line. Can be
    * one of &quot;top&quot;, &quot;middle&quot; or &quot;bottom&quot;.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotlines-label-verticalalign-middle/">Vertically centered label</a>
    * @since 2.1
    */
  val verticalAlign: js.UndefOr[String] = js.undefined

  /**
    * <p>Horizontal position relative the alignment. Default varies by
    * orientation.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotlines-label-align-right/">Aligned 10px from the right edge</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/plotlines/">Plot line on Y axis</a>
    * @since 2.1
    */
  val x: js.UndefOr[Double] = js.undefined

  /**
    * <p>Vertical position of the text baseline relative to the alignment. Default
    * varies by orientation.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/xaxis/plotlines-label-y/">Label below the plot line</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/plotlines/">Plot line on Y axis</a>
    * @since 2.1
    */
  val y: js.UndefOr[Double] = js.undefined
}

object XAxisCurrentDateIndicatorLabel {
  /**
    * @param align <p>Horizontal alignment of the label. Can be one of &quot;left&quot;, &quot;center&quot; or. &quot;right&quot;.</p>
    * @param rotation <p>Rotation of the text label in degrees. Defaults to 0 for horizontal plot. lines and 90 for vertical lines.</p>
    * @param style <p>CSS styles for the text label.</p>. <p>In styled mode, the labels are styled by the. <code>.highcharts-plot-line-label</code> class.</p>
    * @param text <p>The text itself. A subset of HTML is supported.</p>
    * @param textAlign <p>The text alignment for the label. While <code>align</code> determines where the. texts anchor point is placed within the plot band, <code>textAlign</code> determines. how the text is aligned against its anchor point. Possible values are. &quot;left&quot;, &quot;center&quot; and &quot;right&quot;. Defaults to the same as the <code>align</code> option.</p>
    * @param useHTML <p>Whether to [use HTML](<a href="https://www.highcharts.com/docs/chart-concepts">https://www.highcharts.com/docs/chart-concepts</a>. /labels-and-string-formatting#html) to render the labels.</p>
    * @param verticalAlign <p>Vertical alignment of the label relative to the plot line. Can be. one of &quot;top&quot;, &quot;middle&quot; or &quot;bottom&quot;.</p>
    * @param x <p>Horizontal position relative the alignment. Default varies by. orientation.</p>
    * @param y <p>Vertical position of the text baseline relative to the alignment. Default. varies by orientation.</p>
    */
  def apply(align: js.UndefOr[String] = js.undefined, rotation: js.UndefOr[Double] = js.undefined, style: js.UndefOr[js.Object] = js.undefined, text: js.UndefOr[String] = js.undefined, textAlign: js.UndefOr[String] = js.undefined, useHTML: js.UndefOr[Boolean] = js.undefined, verticalAlign: js.UndefOr[String] = js.undefined, x: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined): XAxisCurrentDateIndicatorLabel = {
    val alignOuter: js.UndefOr[String] = align
    val rotationOuter: js.UndefOr[Double] = rotation
    val styleOuter: js.UndefOr[js.Object] = style
    val textOuter: js.UndefOr[String] = text
    val textAlignOuter: js.UndefOr[String] = textAlign
    val useHTMLOuter: js.UndefOr[Boolean] = useHTML
    val verticalAlignOuter: js.UndefOr[String] = verticalAlign
    val xOuter: js.UndefOr[Double] = x
    val yOuter: js.UndefOr[Double] = y
    com.highcharts.HighchartsGenericObject.toCleanObject(new XAxisCurrentDateIndicatorLabel {
      override val align: js.UndefOr[String] = alignOuter
      override val rotation: js.UndefOr[Double] = rotationOuter
      override val style: js.UndefOr[js.Object] = styleOuter
      override val text: js.UndefOr[String] = textOuter
      override val textAlign: js.UndefOr[String] = textAlignOuter
      override val useHTML: js.UndefOr[Boolean] = useHTMLOuter
      override val verticalAlign: js.UndefOr[String] = verticalAlignOuter
      override val x: js.UndefOr[Double] = xOuter
      override val y: js.UndefOr[Double] = yOuter
    })
  }
}
