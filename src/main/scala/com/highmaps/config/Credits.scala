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
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/maps/credits/enabled-false/" target="_blank">Credits disabled</a>
    */
  val enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * The URL for the credits label.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/maps/credits/customized/" target="_blank">Custom URL and text</a>
    */
  val href: js.UndefOr[String] = js.undefined

  /**
    * Credits for map source to be concatenated with conventional credit text. By default this is a format string that collects copyright information from the map if available.
    * @since 4.2.2
    */
  val mapText: js.UndefOr[String] = js.undefined

  /**
    * Detailed credits for map source to be displayed on hover of credits text. By default this is a format string that collects copyright information from the map if available.
    * @since 4.2.2
    */
  val mapTextFull: js.UndefOr[String] = js.undefined

  /**
    * Position configuration for the credits label.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/maps/credits/customized/" target="_blank">Left aligned</a>
    */
  val position: js.UndefOr[CleanJsObject[CreditsPosition]] = js.undefined

  /**
    * CSS styles for the credits label.
    */
  val style: js.UndefOr[js.Object] = js.undefined

  /**
    * The text for the credits label. If a map is loaded as GeoJSON, the text defaults to "Highcharts @ {map-credits}". Otherwise, it defaults to "Highcharts.com". 
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/maps/credits/customized/" target="_blank">Custom URL and text</a>
    */
  val text: js.UndefOr[String] = js.undefined
}

object Credits {
  /**
    * @param enabled Whether to show the credits text.
    * @param href The URL for the credits label.
    * @param mapText Credits for map source to be concatenated with conventional credit text. By default this is a format string that collects copyright information from the map if available.
    * @param mapTextFull Detailed credits for map source to be displayed on hover of credits text. By default this is a format string that collects copyright information from the map if available.
    * @param position Position configuration for the credits label.
    * @param style CSS styles for the credits label.
    * @param text The text for the credits label. If a map is loaded as GeoJSON, the text defaults to "Highcharts @ {map-credits}". Otherwise, it defaults to "Highcharts.com". 
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, href: js.UndefOr[String] = js.undefined, mapText: js.UndefOr[String] = js.undefined, mapTextFull: js.UndefOr[String] = js.undefined, position: js.UndefOr[CleanJsObject[CreditsPosition]] = js.undefined, style: js.UndefOr[js.Object] = js.undefined, text: js.UndefOr[String] = js.undefined): Credits = {
    val enabledOuter: js.UndefOr[Boolean] = enabled
    val hrefOuter: js.UndefOr[String] = href
    val mapTextOuter: js.UndefOr[String] = mapText
    val mapTextFullOuter: js.UndefOr[String] = mapTextFull
    val positionOuter: js.UndefOr[CleanJsObject[CreditsPosition]] = position
    val styleOuter: js.UndefOr[js.Object] = style
    val textOuter: js.UndefOr[String] = text
    new Credits {
      override val enabled: js.UndefOr[Boolean] = enabledOuter
      override val href: js.UndefOr[String] = hrefOuter
      override val mapText: js.UndefOr[String] = mapTextOuter
      override val mapTextFull: js.UndefOr[String] = mapTextFullOuter
      override val position: js.UndefOr[CleanJsObject[CreditsPosition]] = positionOuter
      override val style: js.UndefOr[js.Object] = styleOuter
      override val text: js.UndefOr[String] = textOuter
    }
  }
}
