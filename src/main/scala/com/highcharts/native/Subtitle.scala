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
  * @note JavaScript name: <code>subtitle</code>
  */
class Subtitle extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The horizontal alignment of the subtitle. Can be one of &quot;left&quot;,
    *  &quot;center&quot; and &quot;right&quot;.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/subtitle/align/">Footnote at right of plot area</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/subtitle-footnote">Footnote at bottom right of plot area</a>
    * @since 2.0.0
    */
  var align: js.UndefOr[String] = js.undefined

  /**
    * <p>When the subtitle is floating, the plot area will not move to make
    * space for it.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/subtitle/floating/">Floating title and subtitle</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/subtitle-footnote">Footnote floating at bottom right of plot area</a>
    * @since 2.1.0
    */
  var floating: js.UndefOr[Boolean] = js.undefined

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
  var style: js.UndefOr[js.Object] = js.undefined

  /**
    * <p>The subtitle of the chart.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/subtitle/text/">Custom subtitle</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/subtitle/text-formatted/">Formatted and linked text.</a>
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
    * <code>&quot;middle&quot;</code> and <code>&quot;bottom&quot;</code>. When middle, the subtitle behaves as
    * floating.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/subtitle/verticalalign/">Footnote at the bottom right of plot area</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/subtitle-footnote">Footnote at the bottom right of plot area</a>
    * @since 2.1.0
    */
  var verticalAlign: js.UndefOr[String] = js.undefined

  /**
    * <p>Adjustment made to the subtitle width, normally to reserve space
    * for the exporting burger menu.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/title/widthadjust/">Wider menu, greater padding</a>
    * @since 4.2.5
    */
  var widthAdjust: js.UndefOr[Double] = js.undefined

  /**
    * <p>The x position of the subtitle relative to the alignment within
    * <code>chart.spacingLeft</code> and <code>chart.spacingRight</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/subtitle/align/">Footnote at right of plot area</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/subtitle-footnote">Footnote at the bottom right of plot area</a>
    * @since 2.0.0
    */
  var x: js.UndefOr[Double] = js.undefined

  /**
    * <p>The y position of the subtitle relative to the alignment within
    * <code>chart.spacingTop</code> and <code>chart.spacingBottom</code>. By default the subtitle
    * is laid out below the title unless the title is floating.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/subtitle/verticalalign/">Footnote at the bottom right of plot area</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/chart/subtitle-footnote">Footnote at the bottom right of plot area</a>
    * @since 2.0.0
    */
  var y: js.UndefOr[Double] = js.undefined
}

object Subtitle {
  /**
    * @param align <p>The horizontal alignment of the subtitle. Can be one of &quot;left&quot;,.  &quot;center&quot; and &quot;right&quot;.</p>
    * @param floating <p>When the subtitle is floating, the plot area will not move to make. space for it.</p>
    * @param style <p>CSS styles for the title.</p>. <p>In styled mode, the subtitle style is given in the. <code>.highcharts-subtitle</code> class.</p>
    * @param text <p>The subtitle of the chart.</p>
    * @param useHTML <p>Whether to. <a href="https://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html">use HTML</a>. to render the text.</p>
    * @param verticalAlign <p>The vertical alignment of the title. Can be one of <code>&quot;top&quot;</code>,. <code>&quot;middle&quot;</code> and <code>&quot;bottom&quot;</code>. When middle, the subtitle behaves as. floating.</p>
    * @param widthAdjust <p>Adjustment made to the subtitle width, normally to reserve space. for the exporting burger menu.</p>
    * @param x <p>The x position of the subtitle relative to the alignment within. <code>chart.spacingLeft</code> and <code>chart.spacingRight</code>.</p>
    * @param y <p>The y position of the subtitle relative to the alignment within. <code>chart.spacingTop</code> and <code>chart.spacingBottom</code>. By default the subtitle. is laid out below the title unless the title is floating.</p>
    */
  def apply(align: js.UndefOr[String] = js.undefined, floating: js.UndefOr[Boolean] = js.undefined, style: js.UndefOr[js.Object] = js.undefined, text: js.UndefOr[String] = js.undefined, useHTML: js.UndefOr[Boolean] = js.undefined, verticalAlign: js.UndefOr[String] = js.undefined, widthAdjust: js.UndefOr[Double] = js.undefined, x: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined): Subtitle = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new Subtitle {
      this.align = align
      this.floating = floating
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
