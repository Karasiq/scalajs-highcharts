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
  * @note JavaScript name: <code>credits</code>
  */
@js.annotation.ScalaJSDefined
class Credits extends js.Object {

  /**
    * Whether to show the credits text.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/credits/enabled-false/" target="_blank">Credits disabled</a>
    */
  val enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * The URL for the credits label.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/credits/customized/" target="_blank">Custom URL and text</a>
    */
  val href: js.UndefOr[String] = js.undefined

  /**
    * Position configuration for the credits label. Supported properties are  <code>align</code>, <code>verticalAlign</code>, <code>x</code> and <code>y</code>. Defaults to 
    * <pre>position: {
    * 	align: 'right',
    * 	x: -10,
    * 	verticalAlign: 'bottom',
    * 	y: -5
    * }</pre>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/credits/customized/" target="_blank">Left aligned</a>
    */
  val position: js.UndefOr[js.Object] = js.undefined

  /**
    * CSS styles for the credits label. Defaults to:
    * <pre>style: {
    * 	cursor: 'pointer',
    * 	color: '#909090',
    * 	fontSize: '10px'
    * 
    * }</pre>
    */
  val style: js.UndefOr[js.Object] = js.undefined

  /**
    * The text for the credits label. If a map is loaded as GeoJSON, the text defaults to "Highcharts @ {map-credits}". Otherwise, it defaults to "Highcharts.com". 
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/credits/customized/" target="_blank">Custom URL and text</a>
    */
  val text: js.UndefOr[String] = js.undefined
}

object Credits {
  /**
    * @param enabled Whether to show the credits text.
    * @param href The URL for the credits label.
    * @param position Position configuration for the credits label. Supported properties are  <code>align</code>, <code>verticalAlign</code>, <code>x</code> and <code>y</code>. Defaults to . <pre>position: {. 	align: 'right',. 	x: -10,. 	verticalAlign: 'bottom',. 	y: -5. }</pre>
    * @param style CSS styles for the credits label. Defaults to:. <pre>style: {. 	cursor: 'pointer',. 	color: '#909090',. 	fontSize: '10px'. . }</pre>
    * @param text The text for the credits label. If a map is loaded as GeoJSON, the text defaults to "Highcharts @ {map-credits}". Otherwise, it defaults to "Highcharts.com". 
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, href: js.UndefOr[String] = js.undefined, position: js.UndefOr[js.Object] = js.undefined, style: js.UndefOr[js.Object] = js.undefined, text: js.UndefOr[String] = js.undefined): Credits = {
    val enabledOuter: js.UndefOr[Boolean] = enabled
    val hrefOuter: js.UndefOr[String] = href
    val positionOuter: js.UndefOr[js.Object] = position
    val styleOuter: js.UndefOr[js.Object] = style
    val textOuter: js.UndefOr[String] = text
    new Credits {
      override val enabled: js.UndefOr[Boolean] = enabledOuter
      override val href: js.UndefOr[String] = hrefOuter
      override val position: js.UndefOr[js.Object] = positionOuter
      override val style: js.UndefOr[js.Object] = styleOuter
      override val text: js.UndefOr[String] = textOuter
    }
  }
}
