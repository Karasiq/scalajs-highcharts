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
class ExportingButtonsContextButton extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The class name of the context button.</p>
    */
  val className: js.UndefOr[String] = js.undefined

  /**
    * <p>The class name of the menu appearing from the button.</p>
    */
  val menuClassName: js.UndefOr[String] = js.undefined

  /**
    * <p>The symbol for the button. Points to a definition function in
    * the <code>Highcharts.Renderer.symbols</code> collection. The default
    * <code>exportIcon</code> function is part of the exporting module.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/exporting/buttons-contextbutton-symbol/">Use a circle for symbol</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/exporting/buttons-contextbutton-symbol-custom/">Custom shape as symbol</a>
    * @since 2.0
    */
  val symbol: js.UndefOr[String] = js.undefined

  /**
    * <p>The key to a <a href="#lang">lang</a> option setting that is used for the
    * button&#39;s title tooltip. When the key is <code>contextButtonTitle</code>, it
    * refers to <a href="#lang.contextButtonTitle">lang.contextButtonTitle</a>
    * that defaults to &quot;Chart context menu&quot;.</p>
    * @since 6.1.4
    */
  val titleKey: js.UndefOr[String] = js.undefined

  /**
    * <p>A collection of strings pointing to config options for the menu
    * items. The config options are defined in the
    * <code>menuItemDefinitions</code> option.</p>
    * <p>By default, there is the &quot;Print&quot; menu item plus one menu item
    * for each of the available export types.</p>
    * <p>Defaults to</p>
    * <pre>
    * [
    *    'printChart',
    *    'separator',
    *    'downloadPNG',
    *    'downloadJPEG',
    *    'downloadPDF',
    *    'downloadSVG'
    * ]
    * </pre>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/exporting/menuitemdefinitions/">Menu item definitions</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/exporting/menuitemdefinitions/">Menu item definitions</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/exporting/menuitemdefinitions/">Menu item definitions</a>
    * @since 2.0
    */
  val menuItems: js.UndefOr[js.Array[String] | js.Array[js.Object]] = js.undefined

  /**
    * <p>A click handler callback to use on the button directly instead of
    * the popup menu.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/exporting/buttons-contextbutton-onclick/">Skip the menu and export the chart directly</a>
    * @since 2.0
    */
  val onclick: js.UndefOr[js.Function] = js.undefined

  /**
    * <p>See <a href="#navigation.buttonOptions.symbolFill">navigation.buttonOptions.symbolFill</a>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-symbolfill/">Blue symbol stroke for one of the buttons</a>
    * @since 2.0
    */
  val symbolFill: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The horizontal position of the button relative to the <code>align</code>
    * option.</p>
    * @since 2.0
    */
  val x: js.UndefOr[Double] = js.undefined

  /**
    * <p>This option is deprecated, use
    * <a href="#exporting.buttons.contextButton.titleKey">titleKey</a> instead.</p>
    */
  val _titleKey: js.UndefOr[String] = js.undefined

  /**
    * <p>Whether to enable buttons.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-enabled/">Exporting module loaded but buttons disabled</a>
    * @since 2.0
    */
  val enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The pixel size of the symbol on the button.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-height/">Bigger buttons</a>
    * @since 2.0
    */
  val symbolSize: js.UndefOr[Double] = js.undefined

  /**
    * <p>The x position of the center of the symbol inside the button.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-height/">Bigger buttons</a>
    * @since 2.0
    */
  val symbolX: js.UndefOr[Double] = js.undefined

  /**
    * <p>The y position of the center of the symbol inside the button.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-height/">Bigger buttons</a>
    * @since 2.0
    */
  val symbolY: js.UndefOr[Double] = js.undefined

  /**
    * <p>Alignment for the buttons.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-align/">Center aligned</a>
    * @since 2.0
    */
  val align: js.UndefOr[String] = js.undefined

  /**
    * <p>The pixel spacing between buttons.</p>
    * @since 2.0
    */
  val buttonSpacing: js.UndefOr[Double] = js.undefined

  /**
    * <p>Pixel height of the buttons.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-height/">Bigger buttons</a>
    * @since 2.0
    */
  val height: js.UndefOr[Double] = js.undefined

  /**
    * <p>A text string to add to the individual button.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/exporting/buttons-text/">Full text button</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/exporting/buttons-text-symbol/">Combined symbol and text</a>
    * @since 3.0
    */
  val text: js.UndefOr[String] = js.undefined

  /**
    * <p>The vertical offset of the button&#39;s position relative to its
    * <code>verticalAlign</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-verticalalign/">Buttons at lower right</a>
    * @since 2.0
    */
  val y: js.UndefOr[Double] = js.undefined

  /**
    * <p>The vertical alignment of the buttons. Can be one of &quot;top&quot;, &quot;middle&quot;
    * or &quot;bottom&quot;.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-verticalalign/">Buttons at lower right</a>
    * @since 2.0
    */
  val verticalAlign: js.UndefOr[String] = js.undefined

  /**
    * <p>The pixel width of the button.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-height/">Bigger buttons</a>
    * @since 2.0
    */
  val width: js.UndefOr[Double] = js.undefined

  /**
    * <p>The color of the symbol&#39;s stroke or line.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-symbolstroke/">Blue symbol stroke</a>
    * @since 2.0
    */
  val symbolStroke: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>The pixel stroke width of the symbol on the button.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-height/">Bigger buttons</a>
    * @since 2.0
    */
  val symbolStrokeWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>A configuration object for the button theme. The object accepts
    * SVG properties like <code>stroke-width</code>, <code>stroke</code> and <code>fill</code>. Tri-state
    * button styles are supported by the <code>states.hover</code> and <code>states.select</code>
    * objects.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-theme/">Theming the buttons</a>
    * @since 3.0
    */
  val theme: js.UndefOr[CleanJsObject[ExportingButtonsContextButtonTheme]] = js.undefined
}

object ExportingButtonsContextButton {
  /**
    * @param className <p>The class name of the context button.</p>
    * @param menuClassName <p>The class name of the menu appearing from the button.</p>
    * @param symbol <p>The symbol for the button. Points to a definition function in. the <code>Highcharts.Renderer.symbols</code> collection. The default. <code>exportIcon</code> function is part of the exporting module.</p>
    * @param titleKey <p>The key to a <a href="#lang">lang</a> option setting that is used for the. button&#39;s title tooltip. When the key is <code>contextButtonTitle</code>, it. refers to <a href="#lang.contextButtonTitle">lang.contextButtonTitle</a>. that defaults to &quot;Chart context menu&quot;.</p>
    * @param menuItems <p>A collection of strings pointing to config options for the menu. items. The config options are defined in the. <code>menuItemDefinitions</code> option.</p>. <p>By default, there is the &quot;Print&quot; menu item plus one menu item. for each of the available export types.</p>. <p>Defaults to</p>. <pre>. [.    'printChart',.    'separator',.    'downloadPNG',.    'downloadJPEG',.    'downloadPDF',.    'downloadSVG'. ]. </pre>
    * @param onclick <p>A click handler callback to use on the button directly instead of. the popup menu.</p>
    * @param symbolFill <p>See <a href="#navigation.buttonOptions.symbolFill">navigation.buttonOptions.symbolFill</a>.</p>
    * @param x <p>The horizontal position of the button relative to the <code>align</code>. option.</p>
    * @param _titleKey <p>This option is deprecated, use. <a href="#exporting.buttons.contextButton.titleKey">titleKey</a> instead.</p>
    * @param enabled <p>Whether to enable buttons.</p>
    * @param symbolSize <p>The pixel size of the symbol on the button.</p>
    * @param symbolX <p>The x position of the center of the symbol inside the button.</p>
    * @param symbolY <p>The y position of the center of the symbol inside the button.</p>
    * @param align <p>Alignment for the buttons.</p>
    * @param buttonSpacing <p>The pixel spacing between buttons.</p>
    * @param height <p>Pixel height of the buttons.</p>
    * @param text <p>A text string to add to the individual button.</p>
    * @param y <p>The vertical offset of the button&#39;s position relative to its. <code>verticalAlign</code>.</p>
    * @param verticalAlign <p>The vertical alignment of the buttons. Can be one of &quot;top&quot;, &quot;middle&quot;. or &quot;bottom&quot;.</p>
    * @param width <p>The pixel width of the button.</p>
    * @param symbolStroke <p>The color of the symbol&#39;s stroke or line.</p>
    * @param symbolStrokeWidth <p>The pixel stroke width of the symbol on the button.</p>
    * @param theme <p>A configuration object for the button theme. The object accepts. SVG properties like <code>stroke-width</code>, <code>stroke</code> and <code>fill</code>. Tri-state. button styles are supported by the <code>states.hover</code> and <code>states.select</code>. objects.</p>
    */
  def apply(className: js.UndefOr[String] = js.undefined, menuClassName: js.UndefOr[String] = js.undefined, symbol: js.UndefOr[String] = js.undefined, titleKey: js.UndefOr[String] = js.undefined, menuItems: js.UndefOr[js.Array[String] | js.Array[js.Object]] = js.undefined, onclick: js.UndefOr[js.Function] = js.undefined, symbolFill: js.UndefOr[String | js.Object] = js.undefined, x: js.UndefOr[Double] = js.undefined, _titleKey: js.UndefOr[String] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, symbolSize: js.UndefOr[Double] = js.undefined, symbolX: js.UndefOr[Double] = js.undefined, symbolY: js.UndefOr[Double] = js.undefined, align: js.UndefOr[String] = js.undefined, buttonSpacing: js.UndefOr[Double] = js.undefined, height: js.UndefOr[Double] = js.undefined, text: js.UndefOr[String] = js.undefined, y: js.UndefOr[Double] = js.undefined, verticalAlign: js.UndefOr[String] = js.undefined, width: js.UndefOr[Double] = js.undefined, symbolStroke: js.UndefOr[String | js.Object] = js.undefined, symbolStrokeWidth: js.UndefOr[Double] = js.undefined, theme: js.UndefOr[CleanJsObject[ExportingButtonsContextButtonTheme]] = js.undefined): ExportingButtonsContextButton = {
    val classNameOuter: js.UndefOr[String] = className
    val menuClassNameOuter: js.UndefOr[String] = menuClassName
    val symbolOuter: js.UndefOr[String] = symbol
    val titleKeyOuter: js.UndefOr[String] = titleKey
    val menuItemsOuter: js.UndefOr[js.Array[String] | js.Array[js.Object]] = menuItems
    val onclickOuter: js.UndefOr[js.Function] = onclick
    val symbolFillOuter: js.UndefOr[String | js.Object] = symbolFill
    val xOuter: js.UndefOr[Double] = x
    val _titleKeyOuter: js.UndefOr[String] = _titleKey
    val enabledOuter: js.UndefOr[Boolean] = enabled
    val symbolSizeOuter: js.UndefOr[Double] = symbolSize
    val symbolXOuter: js.UndefOr[Double] = symbolX
    val symbolYOuter: js.UndefOr[Double] = symbolY
    val alignOuter: js.UndefOr[String] = align
    val buttonSpacingOuter: js.UndefOr[Double] = buttonSpacing
    val heightOuter: js.UndefOr[Double] = height
    val textOuter: js.UndefOr[String] = text
    val yOuter: js.UndefOr[Double] = y
    val verticalAlignOuter: js.UndefOr[String] = verticalAlign
    val widthOuter: js.UndefOr[Double] = width
    val symbolStrokeOuter: js.UndefOr[String | js.Object] = symbolStroke
    val symbolStrokeWidthOuter: js.UndefOr[Double] = symbolStrokeWidth
    val themeOuter: js.UndefOr[CleanJsObject[ExportingButtonsContextButtonTheme]] = theme
    com.highcharts.HighchartsGenericObject.toCleanObject(new ExportingButtonsContextButton {
      override val className: js.UndefOr[String] = classNameOuter
      override val menuClassName: js.UndefOr[String] = menuClassNameOuter
      override val symbol: js.UndefOr[String] = symbolOuter
      override val titleKey: js.UndefOr[String] = titleKeyOuter
      override val menuItems: js.UndefOr[js.Array[String] | js.Array[js.Object]] = menuItemsOuter
      override val onclick: js.UndefOr[js.Function] = onclickOuter
      override val symbolFill: js.UndefOr[String | js.Object] = symbolFillOuter
      override val x: js.UndefOr[Double] = xOuter
      override val _titleKey: js.UndefOr[String] = _titleKeyOuter
      override val enabled: js.UndefOr[Boolean] = enabledOuter
      override val symbolSize: js.UndefOr[Double] = symbolSizeOuter
      override val symbolX: js.UndefOr[Double] = symbolXOuter
      override val symbolY: js.UndefOr[Double] = symbolYOuter
      override val align: js.UndefOr[String] = alignOuter
      override val buttonSpacing: js.UndefOr[Double] = buttonSpacingOuter
      override val height: js.UndefOr[Double] = heightOuter
      override val text: js.UndefOr[String] = textOuter
      override val y: js.UndefOr[Double] = yOuter
      override val verticalAlign: js.UndefOr[String] = verticalAlignOuter
      override val width: js.UndefOr[Double] = widthOuter
      override val symbolStroke: js.UndefOr[String | js.Object] = symbolStrokeOuter
      override val symbolStrokeWidth: js.UndefOr[Double] = symbolStrokeWidthOuter
      override val theme: js.UndefOr[CleanJsObject[ExportingButtonsContextButtonTheme]] = themeOuter
    })
  }
}
