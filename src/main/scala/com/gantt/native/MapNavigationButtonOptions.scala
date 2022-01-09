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
  * @note JavaScript name: <code>mapNavigation-buttonOptions</code>
  */
class MapNavigationButtonOptions extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The alignment of the navigation buttons.</p>
    */
  var align: js.UndefOr[String] = js.undefined

  /**
    * <p>What box to align the buttons to. Possible values are <code>plotBox</code>
    * and <code>spacingBox</code>.</p>
    */
  var alignTo: js.Any = js.undefined

  /**
    * <p>The pixel height of the map navigation buttons.</p>
    */
  var height: js.UndefOr[Double] = js.undefined

  /**
    * <p>Padding for the navigation buttons.</p>
    * @since 5.0.0
    */
  var padding: js.UndefOr[Double] = js.undefined

  /**
    * <p>Text styles for the map navigation buttons.</p>
    */
  var style: js.UndefOr[js.Object] = js.undefined

  /**
    * <p>A configuration object for the button theme. The object accepts
    * SVG properties like <code>stroke-width</code>, <code>stroke</code> and <code>fill</code>. Tri-state
    * button styles are supported by the <code>states.hover</code> and <code>states.select</code>
    * objects.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/mapnavigation/button-theme/">Themed navigation buttons</a>
    */
  var theme: js.UndefOr[js.Object] = js.undefined

  /**
    * <p>The vertical alignment of the buttons. Individual alignment can
    * be adjusted by each button&#39;s <code>y</code> offset.</p>
    */
  var verticalAlign: js.UndefOr[String] = js.undefined

  /**
    * <p>The width of the map navigation buttons.</p>
    */
  var width: js.UndefOr[Double] = js.undefined

  /**
    * <p>The X offset of the buttons relative to its <code>align</code> setting.</p>
    */
  var x: js.UndefOr[Double] = js.undefined
}

object MapNavigationButtonOptions {
  /**
    * @param align <p>The alignment of the navigation buttons.</p>
    * @param alignTo <p>What box to align the buttons to. Possible values are <code>plotBox</code>. and <code>spacingBox</code>.</p>
    * @param height <p>The pixel height of the map navigation buttons.</p>
    * @param padding <p>Padding for the navigation buttons.</p>
    * @param style <p>Text styles for the map navigation buttons.</p>
    * @param theme <p>A configuration object for the button theme. The object accepts. SVG properties like <code>stroke-width</code>, <code>stroke</code> and <code>fill</code>. Tri-state. button styles are supported by the <code>states.hover</code> and <code>states.select</code>. objects.</p>
    * @param verticalAlign <p>The vertical alignment of the buttons. Individual alignment can. be adjusted by each button&#39;s <code>y</code> offset.</p>
    * @param width <p>The width of the map navigation buttons.</p>
    * @param x <p>The X offset of the buttons relative to its <code>align</code> setting.</p>
    */
  def apply(align: js.UndefOr[String] = js.undefined, alignTo: js.UndefOr[js.Any] = js.undefined, height: js.UndefOr[Double] = js.undefined, padding: js.UndefOr[Double] = js.undefined, style: js.UndefOr[js.Object] = js.undefined, theme: js.UndefOr[js.Object] = js.undefined, verticalAlign: js.UndefOr[String] = js.undefined, width: js.UndefOr[Double] = js.undefined, x: js.UndefOr[Double] = js.undefined): MapNavigationButtonOptions = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new MapNavigationButtonOptions {
      this.align = align
      this.alignTo = alignTo
      this.height = height
      this.padding = padding
      this.style = style
      this.theme = theme
      this.verticalAlign = verticalAlign
      this.width = width
      this.x = x
    })
  }
}