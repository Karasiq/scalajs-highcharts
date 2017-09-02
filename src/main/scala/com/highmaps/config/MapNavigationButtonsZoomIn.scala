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
  * @note JavaScript name: <code>mapNavigation-buttons-zoomIn</code>
  */
@js.annotation.ScalaJSDefined
class MapNavigationButtonsZoomIn extends js.Object {

  /**
    * The alignment of the navigation buttons.
    */
  val align: js.UndefOr[String] = js.undefined

  /**
    * What box to align the buttons to. Possible values are <code>plotBox</code> and <code>spacingBox</code>.
    */
  val alignTo: js.UndefOr[String] = js.undefined

  /**
    * The pixel height of the map navigation buttons.
    */
  val height: js.UndefOr[Double] = js.undefined

  /**
    * Click handler for the button. Defaults to:
    * <pre>function () {
    *    this.mapZoom(0.5);
    * }</pre>
    */
  val onclick: js.UndefOr[js.Function] = js.undefined

  /**
    * Padding for the navigation buttons.
    * @since 5.0.0
    */
  val padding: js.UndefOr[Double] = js.undefined

  /**
    * Text styles for the map navigation buttons. Defaults to
    * <pre>{
    *    fontSize: '15px',
    *    fontWeight: 'bold',
    *    textAlign: 'center'
    * }</pre>
    */
  val style: js.UndefOr[js.Object] = js.undefined

  /**
    * The text for the button. The tooltip (title) is a language option given by <a href="#lang.zoomIn">lang.zoomIn</a>.
    */
  val text: js.UndefOr[String] = js.undefined

  /**
    * A configuration object for the button theme. The object accepts SVG properties like <code>stroke-width</code>, <code>stroke</code> and <code>fill</code>. Tri-state button styles are supported by the <code>states.hover</code> and <code>states.select</code> objects.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/mapnavigation/button-theme/" target="_blank">Themed navigation buttons</a>
    */
  val theme: js.UndefOr[js.Object] = js.undefined

  /**
    * The vertical alignment of the buttons. Individual alignment can be adjusted by each button's <code>y</code> offset.
    */
  val verticalAlign: js.UndefOr[String] = js.undefined

  /**
    * The width of the map navigation buttons.
    */
  val width: js.UndefOr[Double] = js.undefined

  /**
    * The X offset of the buttons relative to its <code>align</code> setting. 
    */
  val x: js.UndefOr[Double] = js.undefined

  /**
    * The position of the zoomIn button relative to the vertical alignment. 
    */
  val y: js.UndefOr[Double] = js.undefined
}

object MapNavigationButtonsZoomIn {
  /**
    * @param align The alignment of the navigation buttons.
    * @param alignTo What box to align the buttons to. Possible values are <code>plotBox</code> and <code>spacingBox</code>.
    * @param height The pixel height of the map navigation buttons.
    * @param onclick Click handler for the button. Defaults to:. <pre>function () {.    this.mapZoom(0.5);. }</pre>
    * @param padding Padding for the navigation buttons.
    * @param style Text styles for the map navigation buttons. Defaults to. <pre>{.    fontSize: '15px',.    fontWeight: 'bold',.    textAlign: 'center'. }</pre>
    * @param text The text for the button. The tooltip (title) is a language option given by <a href="#lang.zoomIn">lang.zoomIn</a>.
    * @param theme A configuration object for the button theme. The object accepts SVG properties like <code>stroke-width</code>, <code>stroke</code> and <code>fill</code>. Tri-state button styles are supported by the <code>states.hover</code> and <code>states.select</code> objects.
    * @param verticalAlign The vertical alignment of the buttons. Individual alignment can be adjusted by each button's <code>y</code> offset.
    * @param width The width of the map navigation buttons.
    * @param x The X offset of the buttons relative to its <code>align</code> setting. 
    * @param y The position of the zoomIn button relative to the vertical alignment. 
    */
  def apply(align: js.UndefOr[String] = js.undefined, alignTo: js.UndefOr[String] = js.undefined, height: js.UndefOr[Double] = js.undefined, onclick: js.UndefOr[js.Function] = js.undefined, padding: js.UndefOr[Double] = js.undefined, style: js.UndefOr[js.Object] = js.undefined, text: js.UndefOr[String] = js.undefined, theme: js.UndefOr[js.Object] = js.undefined, verticalAlign: js.UndefOr[String] = js.undefined, width: js.UndefOr[Double] = js.undefined, x: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined): MapNavigationButtonsZoomIn = {
    val alignOuter: js.UndefOr[String] = align
    val alignToOuter: js.UndefOr[String] = alignTo
    val heightOuter: js.UndefOr[Double] = height
    val onclickOuter: js.UndefOr[js.Function] = onclick
    val paddingOuter: js.UndefOr[Double] = padding
    val styleOuter: js.UndefOr[js.Object] = style
    val textOuter: js.UndefOr[String] = text
    val themeOuter: js.UndefOr[js.Object] = theme
    val verticalAlignOuter: js.UndefOr[String] = verticalAlign
    val widthOuter: js.UndefOr[Double] = width
    val xOuter: js.UndefOr[Double] = x
    val yOuter: js.UndefOr[Double] = y
    new MapNavigationButtonsZoomIn {
      override val align: js.UndefOr[String] = alignOuter
      override val alignTo: js.UndefOr[String] = alignToOuter
      override val height: js.UndefOr[Double] = heightOuter
      override val onclick: js.UndefOr[js.Function] = onclickOuter
      override val padding: js.UndefOr[Double] = paddingOuter
      override val style: js.UndefOr[js.Object] = styleOuter
      override val text: js.UndefOr[String] = textOuter
      override val theme: js.UndefOr[js.Object] = themeOuter
      override val verticalAlign: js.UndefOr[String] = verticalAlignOuter
      override val width: js.UndefOr[Double] = widthOuter
      override val x: js.UndefOr[Double] = xOuter
      override val y: js.UndefOr[Double] = yOuter
    }
  }
}
