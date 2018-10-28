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
  * @note JavaScript name: <code>title</code>
  */
@js.annotation.ScalaJSDefined
class Title extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The title of the chart. To disable the title, set the <code>text</code> to
    * <code>undefined</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/title/text/">Custom title</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/title-text/">Custom title</a>
    */
  val text: js.UndefOr[String] = js.undefined

  /**
    * <p>The horizontal alignment of the title. Can be one of &quot;left&quot;, &quot;center&quot;
    * and &quot;right&quot;.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/title/align/">Aligned to the plot area (x = 70px = margin left - spacing left)</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/title-align/">Aligned to the plot area (x = 50px = margin left - spacing left)</a>
    * @since 2.0
    */
  val align: js.UndefOr[String] = js.undefined

  /**
    * <p>The margin between the title and the plot area, or if a subtitle
    * is present, the margin between the subtitle and the plot area.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/title/margin-50/">A chart title margin of 50</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/title/margin-subtitle/">The same margin applied with a subtitle</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/title-margin/">A chart title margin of 50</a>
    * @since 2.1
    */
  val margin: js.UndefOr[Double] = js.undefined

  /**
    * <p>Adjustment made to the title width, normally to reserve space for
    * the exporting burger menu.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/title/widthadjust/">Wider menu, greater padding</a>
    * @since 4.2.5
    */
  val widthAdjust: js.UndefOr[Double] = js.undefined

  /**
    * <p>When the title is floating, the plot area will not move to make space
    * for it.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/zoomtype-none/">False by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/title/floating/">True - title on top of the plot area</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/title-floating/">True - title on top of the plot area</a>
    * @since 2.1
    */
  val floating: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>CSS styles for the title. Use this for font styling, but use <code>align</code>,
    * <code>x</code> and <code>y</code> for text alignment.</p>
    * <p>In styled mode, the title style is given in the <code>.highcharts-title</code>
    * class.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/title/style/">Custom color and weight</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/title-style/">Custom color and weight</a>
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
    * <p>The vertical alignment of the title. Can be one of <code>&quot;top&quot;</code>,
    * <code>&quot;middle&quot;</code> and <code>&quot;bottom&quot;</code>. When a value is given, the title behaves
    * as if <a href="#title.floating">floating</a> were <code>true</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/title/verticalalign/">Chart title in bottom right corner</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/title-verticalalign/">Chart title in bottom right corner</a>
    * @since 2.1
    */
  val verticalAlign: js.UndefOr[String] = js.undefined

  /**
    * <p>The x position of the title relative to the alignment within
    * <code>chart.spacingLeft</code> and <code>chart.spacingRight</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/title/align/">Aligned to the plot area (x = 70px = margin left - spacing left)</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/title-align/">Aligned to the plot area (x = 50px = margin left - spacing left)</a>
    * @since 2.0
    */
  val x: js.UndefOr[Double] = js.undefined

  /**
    * <p>The y position of the title relative to the alignment within
    * <a href="#chart.spacingTop">chart.spacingTop</a> and <a href="#chart.spacingBottom">chart.spacingBottom</a>. By default it depends on the font size.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/title/y/">Title inside the plot area</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/title-verticalalign/">Chart title in bottom right corner</a>
    * @since 2.0
    */
  val y: js.UndefOr[Double] = js.undefined
}

object Title {
  /**
    * @param text <p>The title of the chart. To disable the title, set the <code>text</code> to. <code>undefined</code>.</p>
    * @param align <p>The horizontal alignment of the title. Can be one of &quot;left&quot;, &quot;center&quot;. and &quot;right&quot;.</p>
    * @param margin <p>The margin between the title and the plot area, or if a subtitle. is present, the margin between the subtitle and the plot area.</p>
    * @param widthAdjust <p>Adjustment made to the title width, normally to reserve space for. the exporting burger menu.</p>
    * @param floating <p>When the title is floating, the plot area will not move to make space. for it.</p>
    * @param style <p>CSS styles for the title. Use this for font styling, but use <code>align</code>,. <code>x</code> and <code>y</code> for text alignment.</p>. <p>In styled mode, the title style is given in the <code>.highcharts-title</code>. class.</p>
    * @param useHTML <p>Whether to. <a href="https://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html">use HTML</a>. to render the text.</p>
    * @param verticalAlign <p>The vertical alignment of the title. Can be one of <code>&quot;top&quot;</code>,. <code>&quot;middle&quot;</code> and <code>&quot;bottom&quot;</code>. When a value is given, the title behaves. as if <a href="#title.floating">floating</a> were <code>true</code>.</p>
    * @param x <p>The x position of the title relative to the alignment within. <code>chart.spacingLeft</code> and <code>chart.spacingRight</code>.</p>
    * @param y <p>The y position of the title relative to the alignment within. <a href="#chart.spacingTop">chart.spacingTop</a> and <a href="#chart.spacingBottom">chart.spacingBottom</a>. By default it depends on the font size.</p>
    */
  def apply(text: js.UndefOr[String] = js.undefined, align: js.UndefOr[String] = js.undefined, margin: js.UndefOr[Double] = js.undefined, widthAdjust: js.UndefOr[Double] = js.undefined, floating: js.UndefOr[Boolean] = js.undefined, style: js.UndefOr[js.Object] = js.undefined, useHTML: js.UndefOr[Boolean] = js.undefined, verticalAlign: js.UndefOr[String] = js.undefined, x: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined): Title = {
    val textOuter: js.UndefOr[String] = text
    val alignOuter: js.UndefOr[String] = align
    val marginOuter: js.UndefOr[Double] = margin
    val widthAdjustOuter: js.UndefOr[Double] = widthAdjust
    val floatingOuter: js.UndefOr[Boolean] = floating
    val styleOuter: js.UndefOr[js.Object] = style
    val useHTMLOuter: js.UndefOr[Boolean] = useHTML
    val verticalAlignOuter: js.UndefOr[String] = verticalAlign
    val xOuter: js.UndefOr[Double] = x
    val yOuter: js.UndefOr[Double] = y
    com.highcharts.HighchartsGenericObject.toCleanObject(new Title {
      override val text: js.UndefOr[String] = textOuter
      override val align: js.UndefOr[String] = alignOuter
      override val margin: js.UndefOr[Double] = marginOuter
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
