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
  * @note JavaScript name: <code>credits</code>
  */
@js.annotation.ScalaJSDefined
class Credits extends js.Object {

  /**
    * Whether to show the credits text.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/credits/enabled/" target="_blank">Credits disabled</a>
    */
  val enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * The URL for the credits label.
    */
  val href: js.UndefOr[String] = js.undefined

  /**
    * Position configuration for the credits label.
    */
  val position: js.UndefOr[CleanJsObject[CreditsPosition]] = js.undefined

  /**
    * CSS styles for the credits label.
    */
  val style: js.UndefOr[js.Object] = js.undefined

  /**
    * The text for the credits label.
    */
  val text: js.UndefOr[String] = js.undefined
}

object Credits {
  /**
    * @param enabled Whether to show the credits text.
    * @param href The URL for the credits label.
    * @param position Position configuration for the credits label.
    * @param style CSS styles for the credits label.
    * @param text The text for the credits label.
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, href: js.UndefOr[String] = js.undefined, position: js.UndefOr[CleanJsObject[CreditsPosition]] = js.undefined, style: js.UndefOr[js.Object] = js.undefined, text: js.UndefOr[String] = js.undefined): Credits = {
    val enabledOuter: js.UndefOr[Boolean] = enabled
    val hrefOuter: js.UndefOr[String] = href
    val positionOuter: js.UndefOr[CleanJsObject[CreditsPosition]] = position
    val styleOuter: js.UndefOr[js.Object] = style
    val textOuter: js.UndefOr[String] = text
    new Credits {
      override val enabled: js.UndefOr[Boolean] = enabledOuter
      override val href: js.UndefOr[String] = hrefOuter
      override val position: js.UndefOr[CleanJsObject[CreditsPosition]] = positionOuter
      override val style: js.UndefOr[js.Object] = styleOuter
      override val text: js.UndefOr[String] = textOuter
    }
  }
}
