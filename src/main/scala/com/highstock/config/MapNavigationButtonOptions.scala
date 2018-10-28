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
  * @note JavaScript name: <code>mapNavigation-buttonOptions</code>
  */
@js.annotation.ScalaJSDefined
class MapNavigationButtonOptions extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>What box to align the buttons to. Possible values are <code>plotBox</code>
    * and <code>spacingBox</code>.</p>
    */
  val alignTo: js.UndefOr[String] = js.undefined

  /**
    * <p>The alignment of the navigation buttons.</p>
    */
  val align: js.UndefOr[String] = js.undefined

  /**
    * <p>The vertical alignment of the buttons. Individual alignment can
    * be adjusted by each button&#39;s <code>y</code> offset.</p>
    */
  val verticalAlign: js.UndefOr[String] = js.undefined

  /**
    * <p>The X offset of the buttons relative to its <code>align</code> setting.</p>
    */
  val x: js.UndefOr[Double] = js.undefined

  /**
    * <p>The width of the map navigation buttons.</p>
    */
  val width: js.UndefOr[Double] = js.undefined

  /**
    * <p>The pixel height of the map navigation buttons.</p>
    */
  val height: js.UndefOr[Double] = js.undefined

  /**
    * <p>Padding for the navigation buttons.</p>
    * @since 5.0.0
    */
  val padding: js.UndefOr[Double] = js.undefined

  /**
    * <p>Text styles for the map navigation buttons. Defaults to</p>
    * <pre>{
    *     fontSize: '15px',
    *     fontWeight: 'bold',
    *     textAlign: 'center'
    * }</pre>
    */
  val style: js.UndefOr[js.Object] = js.undefined

  /**
    * <p>A configuration object for the button theme. The object accepts
    * SVG properties like <code>stroke-width</code>, <code>stroke</code> and <code>fill</code>. Tri-state
    * button styles are supported by the <code>states.hover</code> and <code>states.select</code>
    * objects.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/mapnavigation/button-theme/">Themed navigation buttons</a>
    */
  val theme: js.Any = js.undefined
}

object MapNavigationButtonOptions {
  /**
    * @param alignTo <p>What box to align the buttons to. Possible values are <code>plotBox</code>. and <code>spacingBox</code>.</p>
    * @param align <p>The alignment of the navigation buttons.</p>
    * @param verticalAlign <p>The vertical alignment of the buttons. Individual alignment can. be adjusted by each button&#39;s <code>y</code> offset.</p>
    * @param x <p>The X offset of the buttons relative to its <code>align</code> setting.</p>
    * @param width <p>The width of the map navigation buttons.</p>
    * @param height <p>The pixel height of the map navigation buttons.</p>
    * @param padding <p>Padding for the navigation buttons.</p>
    * @param style <p>Text styles for the map navigation buttons. Defaults to</p>. <pre>{.     fontSize: '15px',.     fontWeight: 'bold',.     textAlign: 'center'. }</pre>
    * @param theme <p>A configuration object for the button theme. The object accepts. SVG properties like <code>stroke-width</code>, <code>stroke</code> and <code>fill</code>. Tri-state. button styles are supported by the <code>states.hover</code> and <code>states.select</code>. objects.</p>
    */
  def apply(alignTo: js.UndefOr[String] = js.undefined, align: js.UndefOr[String] = js.undefined, verticalAlign: js.UndefOr[String] = js.undefined, x: js.UndefOr[Double] = js.undefined, width: js.UndefOr[Double] = js.undefined, height: js.UndefOr[Double] = js.undefined, padding: js.UndefOr[Double] = js.undefined, style: js.UndefOr[js.Object] = js.undefined, theme: js.UndefOr[js.Any] = js.undefined): MapNavigationButtonOptions = {
    val alignToOuter: js.UndefOr[String] = alignTo
    val alignOuter: js.UndefOr[String] = align
    val verticalAlignOuter: js.UndefOr[String] = verticalAlign
    val xOuter: js.UndefOr[Double] = x
    val widthOuter: js.UndefOr[Double] = width
    val heightOuter: js.UndefOr[Double] = height
    val paddingOuter: js.UndefOr[Double] = padding
    val styleOuter: js.UndefOr[js.Object] = style
    val themeOuter: js.Any = theme
    com.highcharts.HighchartsGenericObject.toCleanObject(new MapNavigationButtonOptions {
      override val alignTo: js.UndefOr[String] = alignToOuter
      override val align: js.UndefOr[String] = alignOuter
      override val verticalAlign: js.UndefOr[String] = verticalAlignOuter
      override val x: js.UndefOr[Double] = xOuter
      override val width: js.UndefOr[Double] = widthOuter
      override val height: js.UndefOr[Double] = heightOuter
      override val padding: js.UndefOr[Double] = paddingOuter
      override val style: js.UndefOr[js.Object] = styleOuter
      override val theme: js.Any = themeOuter
    })
  }
}
