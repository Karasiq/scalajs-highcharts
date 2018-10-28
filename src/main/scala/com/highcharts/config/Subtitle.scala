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
  * @note JavaScript name: <code>subtitle</code>
  */
@js.annotation.ScalaJSDefined
class Subtitle extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The subtitle of the chart.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/subtitle/text/">Custom subtitle</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/subtitle/text-formatted/">Formatted and linked text.</a>
    */
  val text: js.UndefOr[String] = js.undefined

  /**
    * <p>The horizontal alignment of the subtitle. Can be one of &quot;left&quot;,
    *  &quot;center&quot; and &quot;right&quot;.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/subtitle/align/">Footnote at right of plot area</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/subtitle-footnote">Footnote at bottom right of plot area</a>
    * @since 2.0
    */
  val align: js.UndefOr[String] = js.undefined

  /**
    * <p>Adjustment made to the subtitle width, normally to reserve space
    * for the exporting burger menu.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/title/widthadjust/">Wider menu, greater padding</a>
    * @since 4.2.5
    */
  val widthAdjust: js.UndefOr[Double] = js.undefined

  /**
    * <p>When the subtitle is floating, the plot area will not move to make
    * space for it.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/subtitle/floating/">Floating title and subtitle</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/subtitle-footnote">Footnote floating at bottom right of plot area</a>
    * @since 2.1
    */
  val floating: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>CSS styles for the title.</p>
    * <p>In styled mode, the subtitle style is given in the
    * <code>.highcharts-subtitle</code> class.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/subtitle/style/">Custom color and weight</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/titles/">Styled mode</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/subtitle-style">Custom color and weight</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/titles/">Styled mode</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/titles/">Styled mode</a>
    */
  val style: js.UndefOr[js.Object] = js.undefined

  /**
    * <p>Whether to
    * <a href="https://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html">use HTML</a>
    * to render the text.</p>
    */
  val useHTML: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The vertical alignment of the title. Can be one of &quot;top&quot;, &quot;middle&quot;
    * and &quot;bottom&quot;. When a value is given, the title behaves as floating.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/subtitle/verticalalign/">Footnote at the bottom right of plot area</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/subtitle-footnote">Footnote at the bottom right of plot area</a>
    * @since 2.1
    */
  val verticalAlign: js.UndefOr[String] = js.undefined

  /**
    * <p>The x position of the subtitle relative to the alignment within
    * <code>chart.spacingLeft</code> and <code>chart.spacingRight</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/subtitle/align/">Footnote at right of plot area</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/subtitle-footnote">Footnote at the bottom right of plot area</a>
    * @since 2.0
    */
  val x: js.UndefOr[Double] = js.undefined

  /**
    * <p>The y position of the subtitle relative to the alignment within
    * <code>chart.spacingTop</code> and <code>chart.spacingBottom</code>. By default the subtitle
    * is laid out below the title unless the title is floating.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/subtitle/verticalalign/">Footnote at the bottom right of plot area</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/subtitle-footnote">Footnote at the bottom right of plot area</a>
    * @since 2.0
    */
  val y: js.UndefOr[Double] = js.undefined
}

object Subtitle {
  /**
    * @param text <p>The subtitle of the chart.</p>
    * @param align <p>The horizontal alignment of the subtitle. Can be one of &quot;left&quot;,.  &quot;center&quot; and &quot;right&quot;.</p>
    * @param widthAdjust <p>Adjustment made to the subtitle width, normally to reserve space. for the exporting burger menu.</p>
    * @param floating <p>When the subtitle is floating, the plot area will not move to make. space for it.</p>
    * @param style <p>CSS styles for the title.</p>. <p>In styled mode, the subtitle style is given in the. <code>.highcharts-subtitle</code> class.</p>
    * @param useHTML <p>Whether to. <a href="https://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html">use HTML</a>. to render the text.</p>
    * @param verticalAlign <p>The vertical alignment of the title. Can be one of &quot;top&quot;, &quot;middle&quot;. and &quot;bottom&quot;. When a value is given, the title behaves as floating.</p>
    * @param x <p>The x position of the subtitle relative to the alignment within. <code>chart.spacingLeft</code> and <code>chart.spacingRight</code>.</p>
    * @param y <p>The y position of the subtitle relative to the alignment within. <code>chart.spacingTop</code> and <code>chart.spacingBottom</code>. By default the subtitle. is laid out below the title unless the title is floating.</p>
    */
  def apply(text: js.UndefOr[String] = js.undefined, align: js.UndefOr[String] = js.undefined, widthAdjust: js.UndefOr[Double] = js.undefined, floating: js.UndefOr[Boolean] = js.undefined, style: js.UndefOr[js.Object] = js.undefined, useHTML: js.UndefOr[Boolean] = js.undefined, verticalAlign: js.UndefOr[String] = js.undefined, x: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined): Subtitle = {
    val textOuter: js.UndefOr[String] = text
    val alignOuter: js.UndefOr[String] = align
    val widthAdjustOuter: js.UndefOr[Double] = widthAdjust
    val floatingOuter: js.UndefOr[Boolean] = floating
    val styleOuter: js.UndefOr[js.Object] = style
    val useHTMLOuter: js.UndefOr[Boolean] = useHTML
    val verticalAlignOuter: js.UndefOr[String] = verticalAlign
    val xOuter: js.UndefOr[Double] = x
    val yOuter: js.UndefOr[Double] = y
    com.highcharts.HighchartsGenericObject.toCleanObject(new Subtitle {
      override val text: js.UndefOr[String] = textOuter
      override val align: js.UndefOr[String] = alignOuter
      override val widthAdjust: js.UndefOr[Double] = widthAdjustOuter
      override val floating: js.UndefOr[Boolean] = floatingOuter
      override val style: js.UndefOr[js.Object] = styleOuter
      override val useHTML: js.UndefOr[Boolean] = useHTMLOuter
      override val verticalAlign: js.UndefOr[String] = verticalAlignOuter
      override val x: js.UndefOr[Double] = xOuter
      override val y: js.UndefOr[Double] = yOuter
    })
  }
}
