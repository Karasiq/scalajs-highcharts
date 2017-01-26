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
  * @note JavaScript name: <code>exporting-buttons-contextButton</code>
  */
@js.annotation.ScalaJSDefined
class ExportingButtonsContextButton extends js.Object {

  /**
    * Alignment for the buttons.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-align/" target="_blank">Center aligned</a>
    * @since 2.0
    */
  val align: js.UndefOr[String] = js.undefined

  /**
    * Whether to enable buttons.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-enabled/" target="_blank">Exporting module loaded but buttons disabled</a>
    * @since 2.0
    */
  val enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * Pixel height of the buttons.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-height/" target="_blank">Bigger buttons</a>
    * @since 2.0
    */
  val height: js.UndefOr[Double] = js.undefined

  /**
    * <p>A collection of config options for the menu items. Each options object consists
    *  of a <code>text</code> option which is a string to show in the menu item, as
    *  well as an <code>onclick</code> parameter which is a callback function to run
    *  on click.</p>
    *  <p>By default, there is the "Print" menu item plus one menu item for each of the available export types.
    *  Menu items can be customized by defining a new array of items and assigning 
    *  <code>null</code> to unwanted positions (see override example below).</p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/exporting/buttons-contextbutton-onclick/" target="_blank">Skip the menu and export the chart directly</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/exporting/buttons-contextbutton-menuitems/" target="_blank">override the menu items</a>
    * @since 2.0
    */
  val menuItems: js.UndefOr[js.Array[js.Object]] = js.undefined

  /**
    * A click handler callback to use on the button directly instead of the popup menu.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/exporting/buttons-contextbutton-onclick/" target="_blank">Skip the menu and export the chart directly</a>
    * @since 2.0
    */
  val onclick: js.UndefOr[js.Function] = js.undefined

  /**
    * The symbol for the button. Points to a definition function in the 
    *  <code>Highcharts.Renderer.symbols</code> collection. The default
    *  <code>exportIcon</code> function is part of the exporting module.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/exporting/buttons-contextbutton-symbol/" target="_blank">Use a circle for symbol</a>
    * @since 2.0
    */
  val symbol: js.UndefOr[String] = js.undefined

  /**
    * See <a class="internal" href="#navigation.buttonOptions">navigation.buttonOptions</a> =&gt; symbolFill.
    * @since 2.0
    */
  val symbolFill: js.UndefOr[String | js.Object] = js.undefined

  /**
    * The pixel size of the symbol on the button.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-height/" target="_blank">Bigger buttons</a>
    * @since 2.0
    */
  val symbolSize: js.UndefOr[Double] = js.undefined

  /**
    * The color of the symbol's stroke or line.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-symbolstroke/" target="_blank">Blue symbol stroke</a>
    * @since 2.0
    */
  val symbolStroke: js.UndefOr[String | js.Object] = js.undefined

  /**
    * The pixel stroke width of the symbol on the button.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-height/" target="_blank">Bigger buttons</a>
    * @since 2.0
    */
  val symbolStrokeWidth: js.UndefOr[Double] = js.undefined

  /**
    * The x position of the center of the symbol inside the button.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-height/" target="_blank">Bigger buttons</a>
    * @since 2.0
    */
  val symbolX: js.UndefOr[Double] = js.undefined

  /**
    * The y position of the center of the symbol inside the button.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-height/" target="_blank">Bigger buttons</a>
    * @since 2.0
    */
  val symbolY: js.UndefOr[Double] = js.undefined

  /**
    * A text string to add to the individual button. 
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/exporting/buttons-text/" target="_blank">Full text button</a>, <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/exporting/buttons-text-symbol/" target="_blank">combined symbol and text</a> 
    * @since 3.0
    */
  val text: js.UndefOr[String] = js.undefined

  /**
    * A configuration object for the button theme. The object accepts SVG properties like <code>stroke-width</code>, <code>stroke</code> and <code>fill</code>. Tri-state button styles are supported by the <code>states.hover</code> and <code>states.select</code> objects.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-theme/" target="_blank">Theming the buttons</a>
    * @since 3.0
    */
  val theme: js.UndefOr[js.Object] = js.undefined

  /**
    * The vertical alignment of the buttons. Can be one of "top", "middle" or "bottom".
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-verticalalign/" target="_blank">Buttons at lower right</a>
    * @since 2.0
    */
  val verticalAlign: js.UndefOr[String] = js.undefined

  /**
    * The pixel width of the button.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-height/" target="_blank">Bigger buttons</a>
    * @since 2.0
    */
  val width: js.UndefOr[Double] = js.undefined

  /**
    * The horizontal position of the button relative to the <code>align</code>
    *  option.
    * @example  
    * @since 2.0
    */
  val x: js.UndefOr[Double] = js.undefined

  /**
    * The vertical offset of the button's position relative to its <code>verticalAlign</code>.			 .
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-verticalalign/" target="_blank">Buttons at lower right</a>
    * @since 2.0
    */
  val y: js.UndefOr[Double] = js.undefined
}

object ExportingButtonsContextButton {
  /**
    * @param align Alignment for the buttons.
    * @param enabled Whether to enable buttons.
    * @param height Pixel height of the buttons.
    * @param menuItems <p>A collection of config options for the menu items. Each options object consists.  of a <code>text</code> option which is a string to show in the menu item, as.  well as an <code>onclick</code> parameter which is a callback function to run.  on click.</p>.  <p>By default, there is the "Print" menu item plus one menu item for each of the available export types..  Menu items can be customized by defining a new array of items and assigning .  <code>null</code> to unwanted positions (see override example below).</p>
    * @param onclick A click handler callback to use on the button directly instead of the popup menu.
    * @param symbol The symbol for the button. Points to a definition function in the .  <code>Highcharts.Renderer.symbols</code> collection. The default.  <code>exportIcon</code> function is part of the exporting module.
    * @param symbolFill See <a class="internal" href="#navigation.buttonOptions">navigation.buttonOptions</a> =&gt; symbolFill.
    * @param symbolSize The pixel size of the symbol on the button.
    * @param symbolStroke The color of the symbol's stroke or line.
    * @param symbolStrokeWidth The pixel stroke width of the symbol on the button.
    * @param symbolX The x position of the center of the symbol inside the button.
    * @param symbolY The y position of the center of the symbol inside the button.
    * @param text A text string to add to the individual button. 
    * @param theme A configuration object for the button theme. The object accepts SVG properties like <code>stroke-width</code>, <code>stroke</code> and <code>fill</code>. Tri-state button styles are supported by the <code>states.hover</code> and <code>states.select</code> objects.
    * @param verticalAlign The vertical alignment of the buttons. Can be one of "top", "middle" or "bottom".
    * @param width The pixel width of the button.
    * @param x The horizontal position of the button relative to the <code>align</code>.  option.
    * @param y The vertical offset of the button's position relative to its <code>verticalAlign</code>.			 .
    */
  def apply(align: js.UndefOr[String] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, height: js.UndefOr[Double] = js.undefined, menuItems: js.UndefOr[js.Array[js.Object]] = js.undefined, onclick: js.UndefOr[js.Function] = js.undefined, symbol: js.UndefOr[String] = js.undefined, symbolFill: js.UndefOr[String | js.Object] = js.undefined, symbolSize: js.UndefOr[Double] = js.undefined, symbolStroke: js.UndefOr[String | js.Object] = js.undefined, symbolStrokeWidth: js.UndefOr[Double] = js.undefined, symbolX: js.UndefOr[Double] = js.undefined, symbolY: js.UndefOr[Double] = js.undefined, text: js.UndefOr[String] = js.undefined, theme: js.UndefOr[js.Object] = js.undefined, verticalAlign: js.UndefOr[String] = js.undefined, width: js.UndefOr[Double] = js.undefined, x: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined): ExportingButtonsContextButton = {
    val alignOuter: js.UndefOr[String] = align
    val enabledOuter: js.UndefOr[Boolean] = enabled
    val heightOuter: js.UndefOr[Double] = height
    val menuItemsOuter: js.UndefOr[js.Array[js.Object]] = menuItems
    val onclickOuter: js.UndefOr[js.Function] = onclick
    val symbolOuter: js.UndefOr[String] = symbol
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
    val xOuter: js.UndefOr[Double] = x
    val yOuter: js.UndefOr[Double] = y
    new ExportingButtonsContextButton {
      override val align: js.UndefOr[String] = alignOuter
      override val enabled: js.UndefOr[Boolean] = enabledOuter
      override val height: js.UndefOr[Double] = heightOuter
      override val menuItems: js.UndefOr[js.Array[js.Object]] = menuItemsOuter
      override val onclick: js.UndefOr[js.Function] = onclickOuter
      override val symbol: js.UndefOr[String] = symbolOuter
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
      override val x: js.UndefOr[Double] = xOuter
      override val y: js.UndefOr[Double] = yOuter
    }
  }
}
