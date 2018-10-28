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
  * @note JavaScript name: <code>navigation-buttonOptions</code>
  */
@js.annotation.ScalaJSDefined
class NavigationButtonOptions extends com.highcharts.HighchartsGenericObject {

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
    * <p>Fill color for the symbol within the button.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/navigation/buttonoptions-symbolfill/">Blue symbol stroke for one of the buttons</a>
    * @since 2.0
    */
  val symbolFill: js.UndefOr[String | js.Object] = js.undefined

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
  val theme: js.UndefOr[CleanJsObject[NavigationButtonOptionsTheme]] = js.undefined
}

object NavigationButtonOptions {
  /**
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
    * @param symbolFill <p>Fill color for the symbol within the button.</p>
    * @param symbolStroke <p>The color of the symbol&#39;s stroke or line.</p>
    * @param symbolStrokeWidth <p>The pixel stroke width of the symbol on the button.</p>
    * @param theme <p>A configuration object for the button theme. The object accepts. SVG properties like <code>stroke-width</code>, <code>stroke</code> and <code>fill</code>. Tri-state. button styles are supported by the <code>states.hover</code> and <code>states.select</code>. objects.</p>
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, symbolSize: js.UndefOr[Double] = js.undefined, symbolX: js.UndefOr[Double] = js.undefined, symbolY: js.UndefOr[Double] = js.undefined, align: js.UndefOr[String] = js.undefined, buttonSpacing: js.UndefOr[Double] = js.undefined, height: js.UndefOr[Double] = js.undefined, text: js.UndefOr[String] = js.undefined, y: js.UndefOr[Double] = js.undefined, verticalAlign: js.UndefOr[String] = js.undefined, width: js.UndefOr[Double] = js.undefined, symbolFill: js.UndefOr[String | js.Object] = js.undefined, symbolStroke: js.UndefOr[String | js.Object] = js.undefined, symbolStrokeWidth: js.UndefOr[Double] = js.undefined, theme: js.UndefOr[CleanJsObject[NavigationButtonOptionsTheme]] = js.undefined): NavigationButtonOptions = {
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
    val symbolFillOuter: js.UndefOr[String | js.Object] = symbolFill
    val symbolStrokeOuter: js.UndefOr[String | js.Object] = symbolStroke
    val symbolStrokeWidthOuter: js.UndefOr[Double] = symbolStrokeWidth
    val themeOuter: js.UndefOr[CleanJsObject[NavigationButtonOptionsTheme]] = theme
    com.highcharts.HighchartsGenericObject.toCleanObject(new NavigationButtonOptions {
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
      override val symbolFill: js.UndefOr[String | js.Object] = symbolFillOuter
      override val symbolStroke: js.UndefOr[String | js.Object] = symbolStrokeOuter
      override val symbolStrokeWidth: js.UndefOr[Double] = symbolStrokeWidthOuter
      override val theme: js.UndefOr[CleanJsObject[NavigationButtonOptionsTheme]] = themeOuter
    })
  }
}
