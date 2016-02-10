/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highstock]]
  */
package com.highstock.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>subtitle</code>
  */
@js.annotation.ScalaJSDefined
class Subtitle extends js.Object {

  /**
    * The horizontal alignment of the subtitle. Can be one of "left", "center" and "right".
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/chart/subtitle-footnote" target="_blank">Footnote at bottom right of plot area</a>
    */
  val align: js.UndefOr[String] = js.undefined

  /**
    * When the subtitle is floating, the plot area will not move to make space for it.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/chart/subtitle-footnote" target="_blank">Footnote floating at bottom right of plot area</a>
    */
  val floating: js.UndefOr[Boolean] = js.undefined

  /**
    * CSS styles for the title. Exact positioning of the title can be achieved by changing the margin property, or by adding <code>position: "absolute"</code> and  left and top properties.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/chart/subtitle-style" target="_blank">Custom color and weight</a>
    */
  val style: js.UndefOr[js.Object] = js.undefined

  /**
    * The subtitle of the chart.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/chart/subtitle-text" target="_blank">Custom subtitle</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/chart/subtitle-text-formatted" target="_blank">formatted and linked text.</a>
    */
  val text: js.UndefOr[String] = js.undefined

  /**
    * Whether to <a href="http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html">use HTML</a> to render the text.
    */
  val useHTML: js.UndefOr[Boolean] = js.undefined

  /**
    * The vertical alignment of the title. Can be one of "top", "middle" and "bottom". When a value is given, the title behaves as floating.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/chart/subtitle-footnote" target="_blank">Footnote at the bottom right of plot area</a>
    */
  val verticalAlign: js.UndefOr[String] = js.undefined

  /**
    * The x position of the subtitle relative to the alignment within chart.spacingLeft and chart.spacingRight.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/chart/subtitle-footnote" target="_blank">Footnote at the bottom right of plot area</a>
    */
  val x: js.UndefOr[Double] = js.undefined

  /**
    * The y position of the subtitle relative to the alignment within chart.spacingTop and chart.spacingBottom. By default the subtitle is laid out below the title unless the title is floating.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/chart/subtitle-footnote" target="_blank">Footnote at the bottom right of plot area</a>
    */
  val y: js.UndefOr[Double] = js.undefined
}

object Subtitle {
  /**
    * @param align The horizontal alignment of the subtitle. Can be one of "left", "center" and "right".
    * @param floating When the subtitle is floating, the plot area will not move to make space for it.
    * @param style CSS styles for the title. Exact positioning of the title can be achieved by changing the margin property, or by adding <code>position: "absolute"</code> and  left and top properties.
    * @param text The subtitle of the chart.
    * @param useHTML Whether to <a href="http://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html">use HTML</a> to render the text.
    * @param verticalAlign The vertical alignment of the title. Can be one of "top", "middle" and "bottom". When a value is given, the title behaves as floating.
    * @param x The x position of the subtitle relative to the alignment within chart.spacingLeft and chart.spacingRight.
    * @param y The y position of the subtitle relative to the alignment within chart.spacingTop and chart.spacingBottom. By default the subtitle is laid out below the title unless the title is floating.
    */
  def apply(align: js.UndefOr[String] = js.undefined, floating: js.UndefOr[Boolean] = js.undefined, style: js.UndefOr[js.Object] = js.undefined, text: js.UndefOr[String] = js.undefined, useHTML: js.UndefOr[Boolean] = js.undefined, verticalAlign: js.UndefOr[String] = js.undefined, x: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined): Subtitle = {
    val alignOuter: js.UndefOr[String] = align
    val floatingOuter: js.UndefOr[Boolean] = floating
    val styleOuter: js.UndefOr[js.Object] = style
    val textOuter: js.UndefOr[String] = text
    val useHTMLOuter: js.UndefOr[Boolean] = useHTML
    val verticalAlignOuter: js.UndefOr[String] = verticalAlign
    val xOuter: js.UndefOr[Double] = x
    val yOuter: js.UndefOr[Double] = y
    new Subtitle {
      override val align: js.UndefOr[String] = alignOuter
      override val floating: js.UndefOr[Boolean] = floatingOuter
      override val style: js.UndefOr[js.Object] = styleOuter
      override val text: js.UndefOr[String] = textOuter
      override val useHTML: js.UndefOr[Boolean] = useHTMLOuter
      override val verticalAlign: js.UndefOr[String] = verticalAlignOuter
      override val x: js.UndefOr[Double] = xOuter
      override val y: js.UndefOr[Double] = yOuter
    }
  }
}
