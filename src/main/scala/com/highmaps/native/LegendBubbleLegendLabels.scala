/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highmaps]]
  */
package com.highmaps.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>legend-bubbleLegend-labels</code>
  */
class LegendBubbleLegendLabels extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The alignment of the labels compared to the bubble
    * legend. Can be one of <code>left</code>, <code>center</code> or <code>right</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/bubble-legend/connectorandlabels/">Labels on left</a>
    * @since 7.0.0
    */
  var align: js.UndefOr[String] = js.undefined

  /**
    * <p>Whether to allow data labels to overlap.</p>
    * @since 7.0.0
    */
  var allowOverlap: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>An additional class name to apply to the bubble legend
    * label graphical elements. This option does not replace
    * default class names of the graphical element.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/css/bubble-legend/">Styling by CSS</a>
    * @since 7.0.0
    */
  var className: js.UndefOr[String] = js.undefined

  /**
    * <p>A format string for the bubble legend labels. Available
    * variables are the same as for <code>formatter</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/bubble-legend/format/">Add a unit</a>
    * @since 7.0.0
    */
  var format: js.UndefOr[String] = js.undefined

  /**
    * <p>Available <code>this</code> properties are:</p>
    * <ul>
    * <li><p><code>this.value</code>: The bubble value.</p>
    * </li>
    * <li><p><code>this.radius</code>: The radius of the bubble range.</p>
    * </li>
    * <li><p><code>this.center</code>: The center y position of the range.</p>
    * </li>
    * </ul>
    * @since 7.0.0
    */
  var formatter: js.Any = js.undefined

  /**
    * <p>CSS styles for the labels.</p>
    * @since 7.0.0
    */
  var style: js.UndefOr[js.Object] = js.undefined

  /**
    * <p>The x position offset of the label relative to the
    * connector.</p>
    * @since 7.0.0
    */
  var x: js.UndefOr[Double] = js.undefined

  /**
    * <p>The y position offset of the label relative to the
    * connector.</p>
    * @since 7.0.0
    */
  var y: js.UndefOr[Double] = js.undefined
}

object LegendBubbleLegendLabels {
  /**
    * @param align <p>The alignment of the labels compared to the bubble. legend. Can be one of <code>left</code>, <code>center</code> or <code>right</code>.</p>
    * @param allowOverlap <p>Whether to allow data labels to overlap.</p>
    * @param className <p>An additional class name to apply to the bubble legend. label graphical elements. This option does not replace. default class names of the graphical element.</p>
    * @param format <p>A format string for the bubble legend labels. Available. variables are the same as for <code>formatter</code>.</p>
    * @param formatter <p>Available <code>this</code> properties are:</p>. <ul>. <li><p><code>this.value</code>: The bubble value.</p>. </li>. <li><p><code>this.radius</code>: The radius of the bubble range.</p>. </li>. <li><p><code>this.center</code>: The center y position of the range.</p>. </li>. </ul>
    * @param style <p>CSS styles for the labels.</p>
    * @param x <p>The x position offset of the label relative to the. connector.</p>
    * @param y <p>The y position offset of the label relative to the. connector.</p>
    */
  def apply(align: js.UndefOr[String] = js.undefined, allowOverlap: js.UndefOr[Boolean] = js.undefined, className: js.UndefOr[String] = js.undefined, format: js.UndefOr[String] = js.undefined, formatter: js.UndefOr[js.Any] = js.undefined, style: js.UndefOr[js.Object] = js.undefined, x: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined): LegendBubbleLegendLabels = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new LegendBubbleLegendLabels {
      this.align = align
      this.allowOverlap = allowOverlap
      this.className = className
      this.format = format
      this.formatter = formatter
      this.style = style
      this.x = x
      this.y = y
    })
  }
}
