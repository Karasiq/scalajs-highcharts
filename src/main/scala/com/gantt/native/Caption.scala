/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/gantt]]
  */
package com.gantt.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>caption</code>
  */
class Caption extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The horizontal alignment of the caption. Can be one of &quot;left&quot;,
    *  &quot;center&quot; and &quot;right&quot;.</p>
    * @since 7.2.0
    */
  var align: js.UndefOr[String] = js.undefined

  /**
    * <p>When the caption is floating, the plot area will not move to make
    * space for it.</p>
    * @since 7.2.0
    */
  var floating: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The margin between the caption and the plot area.</p>
    * @since 7.2.0
    */
  var margin: js.UndefOr[Double] = js.undefined

  /**
    * <p>CSS styles for the caption.</p>
    * <p>In styled mode, the caption style is given in the
    * <code>.highcharts-caption</code> class.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/titles/">Styled mode</a>
    * @since 7.2.0
    */
  var style: js.UndefOr[js.Object] = js.undefined

  /**
    * <p>The caption text of the chart.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/caption/text/">Custom caption</a>
    * @since 7.2.0
    */
  var text: js.UndefOr[String] = js.undefined

  /**
    * <p>Whether to
    * <a href="https://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html">use HTML</a>
    * to render the text.</p>
    * @since 7.2.0
    */
  var useHTML: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The vertical alignment of the caption. Can be one of <code>&quot;top&quot;</code>,
    * <code>&quot;middle&quot;</code> and <code>&quot;bottom&quot;</code>. When middle, the caption behaves as
    * floating.</p>
    * @since 7.2.0
    */
  var verticalAlign: js.UndefOr[String] = js.undefined

  /**
    * <p>The x position of the caption relative to the alignment within
    * <code>chart.spacingLeft</code> and <code>chart.spacingRight</code>.</p>
    * @since 7.2.0
    */
  var x: js.UndefOr[Double] = js.undefined

  /**
    * <p>The y position of the caption relative to the alignment within
    * <code>chart.spacingTop</code> and <code>chart.spacingBottom</code>.</p>
    * @since 7.2.0
    */
  var y: js.UndefOr[Double] = js.undefined
}

object Caption {
  /**
    * @param align <p>The horizontal alignment of the caption. Can be one of &quot;left&quot;,.  &quot;center&quot; and &quot;right&quot;.</p>
    * @param floating <p>When the caption is floating, the plot area will not move to make. space for it.</p>
    * @param margin <p>The margin between the caption and the plot area.</p>
    * @param style <p>CSS styles for the caption.</p>. <p>In styled mode, the caption style is given in the. <code>.highcharts-caption</code> class.</p>
    * @param text <p>The caption text of the chart.</p>
    * @param useHTML <p>Whether to. <a href="https://www.highcharts.com/docs/chart-concepts/labels-and-string-formatting#html">use HTML</a>. to render the text.</p>
    * @param verticalAlign <p>The vertical alignment of the caption. Can be one of <code>&quot;top&quot;</code>,. <code>&quot;middle&quot;</code> and <code>&quot;bottom&quot;</code>. When middle, the caption behaves as. floating.</p>
    * @param x <p>The x position of the caption relative to the alignment within. <code>chart.spacingLeft</code> and <code>chart.spacingRight</code>.</p>
    * @param y <p>The y position of the caption relative to the alignment within. <code>chart.spacingTop</code> and <code>chart.spacingBottom</code>.</p>
    */
  def apply(align: js.UndefOr[String] = js.undefined, floating: js.UndefOr[Boolean] = js.undefined, margin: js.UndefOr[Double] = js.undefined, style: js.UndefOr[js.Object] = js.undefined, text: js.UndefOr[String] = js.undefined, useHTML: js.UndefOr[Boolean] = js.undefined, verticalAlign: js.UndefOr[String] = js.undefined, x: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined): Caption = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new Caption {
      this.align = align
      this.floating = floating
      this.margin = margin
      this.style = style
      this.text = text
      this.useHTML = useHTML
      this.verticalAlign = verticalAlign
      this.x = x
      this.y = y
    })
  }
}
