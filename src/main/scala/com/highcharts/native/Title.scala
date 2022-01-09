/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highcharts]]
  */
package com.highcharts.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>title</code>
  */
class Title extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The horizontal alignment of the title. Can be one of &quot;left&quot;, &quot;center&quot;
    * and &quot;right&quot;.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/title/align/">Aligned to the plot area (x = 70px = margin left - spacing left)</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/title-align/">Aligned to the plot area (x = 50px = margin left - spacing left)</a>
    * @since 2.0.0
    */
  var align: js.UndefOr[String] = js.undefined

  /**
    * <p>When the title is floating, the plot area will not move to make space
    * for it.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/chart/zoomtype-none/">False by default</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/title/floating/">True - title on top of the plot area</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/title-floating/">True - title on top of the plot area</a>
    * @since 2.1.0
    */
  var floating: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The margin between the title and the plot area, or if a subtitle
    * is present, the margin between the subtitle and the plot area.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/title/margin-50/">A chart title margin of 50</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/title/margin-subtitle/">The same margin applied with a subtitle</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/title-margin/">A chart title margin of 50</a>
    * @since 2.1.0
    */
  var margin: js.UndefOr[Double] = js.undefined

  /**
    * <p>CSS styles for the title. Use this for font styling, but use <code>align</code>,
    * <code>x</code> and <code>y</code> for text alignment.</p>
    * <p>In styled mode, the title style is given in the <code>.highcharts-title</code>
    * class.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/title/style/">Custom color and weight</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/title-style/">Custom color and weight</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/titles/">Styled mode</a>
    */
  var style: js.UndefOr[js.Object] = js.undefined

  /**
    * <p>The title of the chart. To disable the title, set the <code>text</code> to
    * <code>undefined</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/title/text/">Custom title</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/title-text/">Custom title</a>
    */
  var text: js.UndefOr[String] = js.undefined

  /**
    * <p>Whether to
    * <a href="https://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html">use HTML</a>
    * to render the text.</p>
    */
  var useHTML: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The vertical alignment of the title. Can be one of <code>&quot;top&quot;</code>,
    * <code>&quot;middle&quot;</code> and <code>&quot;bottom&quot;</code>. When a value is given, the title behaves
    * as if <a href="#title.floating">floating</a> were <code>true</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/title/verticalalign/">Chart title in bottom right corner</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/title-verticalalign/">Chart title in bottom right corner</a>
    * @since 2.1.0
    */
  var verticalAlign: js.UndefOr[String] = js.undefined

  /**
    * <p>Adjustment made to the title width, normally to reserve space for
    * the exporting burger menu.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/title/widthadjust/">Wider menu, greater padding</a>
    * @since 4.2.5
    */
  var widthAdjust: js.UndefOr[Double] = js.undefined

  /**
    * <p>The x position of the title relative to the alignment within
    * <code>chart.spacingLeft</code> and <code>chart.spacingRight</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/title/align/">Aligned to the plot area (x = 70px = margin left - spacing left)</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/title-align/">Aligned to the plot area (x = 50px = margin left - spacing left)</a>
    * @since 2.0.0
    */
  var x: js.UndefOr[Double] = js.undefined

  /**
    * <p>The y position of the title relative to the alignment within
    * <a href="#chart.spacingTop">chart.spacingTop</a> and <a href="#chart.spacingBottom">chart.spacingBottom</a>. By default it depends on the font size.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/title/y/">Title inside the plot area</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/title-verticalalign/">Chart title in bottom right corner</a>
    * @since 2.0.0
    */
  var y: js.UndefOr[Double] = js.undefined
}

object Title {
  /**
    * @param align <p>The horizontal alignment of the title. Can be one of &quot;left&quot;, &quot;center&quot;. and &quot;right&quot;.</p>
    * @param floating <p>When the title is floating, the plot area will not move to make space. for it.</p>
    * @param margin <p>The margin between the title and the plot area, or if a subtitle. is present, the margin between the subtitle and the plot area.</p>
    * @param style <p>CSS styles for the title. Use this for font styling, but use <code>align</code>,. <code>x</code> and <code>y</code> for text alignment.</p>. <p>In styled mode, the title style is given in the <code>.highcharts-title</code>. class.</p>
    * @param text <p>The title of the chart. To disable the title, set the <code>text</code> to. <code>undefined</code>.</p>
    * @param useHTML <p>Whether to. <a href="https://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html">use HTML</a>. to render the text.</p>
    * @param verticalAlign <p>The vertical alignment of the title. Can be one of <code>&quot;top&quot;</code>,. <code>&quot;middle&quot;</code> and <code>&quot;bottom&quot;</code>. When a value is given, the title behaves. as if <a href="#title.floating">floating</a> were <code>true</code>.</p>
    * @param widthAdjust <p>Adjustment made to the title width, normally to reserve space for. the exporting burger menu.</p>
    * @param x <p>The x position of the title relative to the alignment within. <code>chart.spacingLeft</code> and <code>chart.spacingRight</code>.</p>
    * @param y <p>The y position of the title relative to the alignment within. <a href="#chart.spacingTop">chart.spacingTop</a> and <a href="#chart.spacingBottom">chart.spacingBottom</a>. By default it depends on the font size.</p>
    */
  def apply(align: js.UndefOr[String] = js.undefined, floating: js.UndefOr[Boolean] = js.undefined, margin: js.UndefOr[Double] = js.undefined, style: js.UndefOr[js.Object] = js.undefined, text: js.UndefOr[String] = js.undefined, useHTML: js.UndefOr[Boolean] = js.undefined, verticalAlign: js.UndefOr[String] = js.undefined, widthAdjust: js.UndefOr[Double] = js.undefined, x: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined): Title = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new Title {
      this.align = align
      this.floating = floating
      this.margin = margin
      this.style = style
      this.text = text
      this.useHTML = useHTML
      this.verticalAlign = verticalAlign
      this.widthAdjust = widthAdjust
      this.x = x
      this.y = y
    })
  }
}
