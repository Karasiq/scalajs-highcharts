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
  * @note JavaScript name: <code>navigation-buttonOptions</code>
  */
@js.annotation.ScalaJSDefined
class NavigationButtonOptions extends js.Object {

  /**
    * Alignment for the buttons.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-align/" target="_blank">Center aligned</a>
    */
  val align: js.UndefOr[String] = js.undefined

  /**
    * Whether to enable buttons.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-enabled/" target="_blank">Exporting module loaded but buttons disabled</a>
    */
  val enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * Pixel height of the buttons.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-height/" target="_blank">Bigger buttons</a>
    */
  val height: js.UndefOr[Double] = js.undefined

  /**
    * Fill color for the symbol within the button.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-symbolfill/" target="_blank">Blue symbol stroke for one of the buttons</a>
    */
  val symbolFill: js.UndefOr[String | js.Object] = js.undefined

  /**
    * The pixel size of the symbol on the button.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-height/" target="_blank">Bigger buttons</a>
    */
  val symbolSize: js.UndefOr[Double] = js.undefined

  /**
    * The color of the symbol's stroke or line.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-symbolstroke/" target="_blank">Blue symbol stroke</a>
    */
  val symbolStroke: js.UndefOr[String | js.Object] = js.undefined

  /**
    * The pixel stroke width of the symbol on the button.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-height/" target="_blank">Bigger buttons</a>
    */
  val symbolStrokeWidth: js.UndefOr[Double] = js.undefined

  /**
    * The x position of the center of the symbol inside the button.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-height/" target="_blank">Bigger buttons</a>
    */
  val symbolX: js.UndefOr[Double] = js.undefined

  /**
    * The y position of the center of the symbol inside the button.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-height/" target="_blank">Bigger buttons</a>
    */
  val symbolY: js.UndefOr[Double] = js.undefined

  /**
    * A text string to add to the individual button. 
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/exporting/buttons-text/" target="_blank">Full text button</a>, <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/exporting/buttons-text-symbol/" target="_blank">combined symbol and text</a> 
    */
  val text: js.UndefOr[String] = js.undefined

  /**
    * A configuration object for the button theme. The object accepts SVG properties like <code>stroke-width</code>, <code>stroke</code> and <code>fill</code>. Tri-state button styles are supported by the <code>states.hover</code> and <code>states.select</code> objects.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-theme/" target="_blank">Theming the buttons</a>
    */
  val theme: js.UndefOr[js.Object] = js.undefined

  /**
    * The vertical alignment of the buttons. Can be one of "top", "middle" or "bottom".
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-verticalalign/" target="_blank">Buttons at lower right</a>
    */
  val verticalAlign: js.UndefOr[String] = js.undefined

  /**
    * The pixel width of the button.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-height/" target="_blank">Bigger buttons</a>
    */
  val width: js.UndefOr[Double] = js.undefined

  /**
    * The vertical offset of the button's position relative to its <code>verticalAlign</code>.			 .
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-verticalalign/" target="_blank">Buttons at lower right</a>
    */
  val y: js.UndefOr[Double] = js.undefined
}

object NavigationButtonOptions {
  /**
    * @param align Alignment for the buttons.
    * @param enabled Whether to enable buttons.
    * @param height Pixel height of the buttons.
    * @param symbolFill Fill color for the symbol within the button.
    * @param symbolSize The pixel size of the symbol on the button.
    * @param symbolStroke The color of the symbol's stroke or line.
    * @param symbolStrokeWidth The pixel stroke width of the symbol on the button.
    * @param symbolX The x position of the center of the symbol inside the button.
    * @param symbolY The y position of the center of the symbol inside the button.
    * @param text A text string to add to the individual button. 
    * @param theme A configuration object for the button theme. The object accepts SVG properties like <code>stroke-width</code>, <code>stroke</code> and <code>fill</code>. Tri-state button styles are supported by the <code>states.hover</code> and <code>states.select</code> objects.
    * @param verticalAlign The vertical alignment of the buttons. Can be one of "top", "middle" or "bottom".
    * @param width The pixel width of the button.
    * @param y The vertical offset of the button's position relative to its <code>verticalAlign</code>.			 .
    */
  def apply(align: js.UndefOr[String] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, height: js.UndefOr[Double] = js.undefined, symbolFill: js.UndefOr[String | js.Object] = js.undefined, symbolSize: js.UndefOr[Double] = js.undefined, symbolStroke: js.UndefOr[String | js.Object] = js.undefined, symbolStrokeWidth: js.UndefOr[Double] = js.undefined, symbolX: js.UndefOr[Double] = js.undefined, symbolY: js.UndefOr[Double] = js.undefined, text: js.UndefOr[String] = js.undefined, theme: js.UndefOr[js.Object] = js.undefined, verticalAlign: js.UndefOr[String] = js.undefined, width: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined): NavigationButtonOptions = {
    val alignOuter: js.UndefOr[String] = align
    val enabledOuter: js.UndefOr[Boolean] = enabled
    val heightOuter: js.UndefOr[Double] = height
    val symbolFillOuter: js.UndefOr[String | js.Object] = symbolFill
    val symbolSizeOuter: js.UndefOr[Double] = symbolSize
    val symbolStrokeOuter: js.UndefOr[String | js.Object] = symbolStroke
    val symbolStrokeWidthOuter: js.UndefOr[Double] = symbolStrokeWidth
    val symbolXOuter: js.UndefOr[Double] = symbolX
    val symbolYOuter: js.UndefOr[Double] = symbolY
    val textOuter: js.UndefOr[String] = text
    val themeOuter: js.UndefOr[js.Object] = theme
    val verticalAlignOuter: js.UndefOr[String] = verticalAlign
    val widthOuter: js.UndefOr[Double] = width
    val yOuter: js.UndefOr[Double] = y
    new NavigationButtonOptions {
      override val align: js.UndefOr[String] = alignOuter
      override val enabled: js.UndefOr[Boolean] = enabledOuter
      override val height: js.UndefOr[Double] = heightOuter
      override val symbolFill: js.UndefOr[String | js.Object] = symbolFillOuter
      override val symbolSize: js.UndefOr[Double] = symbolSizeOuter
      override val symbolStroke: js.UndefOr[String | js.Object] = symbolStrokeOuter
      override val symbolStrokeWidth: js.UndefOr[Double] = symbolStrokeWidthOuter
      override val symbolX: js.UndefOr[Double] = symbolXOuter
      override val symbolY: js.UndefOr[Double] = symbolYOuter
      override val text: js.UndefOr[String] = textOuter
      override val theme: js.UndefOr[js.Object] = themeOuter
      override val verticalAlign: js.UndefOr[String] = verticalAlignOuter
      override val width: js.UndefOr[Double] = widthOuter
      override val y: js.UndefOr[Double] = yOuter
    }
  }
}
