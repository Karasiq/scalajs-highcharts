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
  * @note JavaScript name: <code>mapNavigation-buttonOptions</code>
  */
@js.annotation.ScalaJSDefined
class MapNavigationButtonOptions extends js.Object {

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
    * Text styles for the map navigation buttons. Defaults to
    * <pre>{
    *    fontSize: '15px',
    *    fontWeight: 'bold',
    *    textAlign: 'center'
    * }</pre>
    */
  val style: js.UndefOr[js.Object] = js.undefined

  /**
    * A configuration object for the button theme. The object accepts SVG properties like <code>stroke-width</code>, <code>stroke</code> and <code>fill</code>. Tri-state button styles are supported by the <code>states.hover</code> and <code>states.select</code> objects.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/mapnavigation/button-theme/" target="_blank">Themed navigation buttons</a>
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
}
