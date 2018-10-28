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
  * @note JavaScript name: <code>credits</code>
  */
@js.annotation.ScalaJSDefined
class Credits extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Whether to show the credits text.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/credits/enabled-false/">Credits disabled</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/credits/enabled/">Credits disabled</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/credits/enabled-false/">Credits disabled</a>
    */
  val enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The URL for the credits label.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/credits/href/">Custom URL and text</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/credits/customized/">Custom URL and text</a>
    */
  val href: js.UndefOr[String] = js.undefined

  /**
    * <p>Position configuration for the credits label.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/credits/position-left/">Left aligned</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/credits/position-left/">Left aligned</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/credits/customized/">Left aligned</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/credits/customized/">Left aligned</a>
    * @since 2.1
    */
  val position: js.Any = js.undefined

  /**
    * <p>CSS styles for the credits label.</p>
    */
  val style: js.UndefOr[js.Object] = js.undefined

  /**
    * <p>The text for the credits label.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/credits/href/">Custom URL and text</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/credits/customized/">Custom URL and text</a>
    */
  val text: js.UndefOr[String] = js.undefined

  /**
    * <p>Credits for map source to be concatenated with conventional credit
    * text. By default this is a format string that collects copyright
    * information from the map if available.</p>
    * @since 4.2.2
    */
  val mapText: js.UndefOr[String] = js.undefined

  /**
    * <p>Detailed credits for map source to be displayed on hover of credits
    * text. By default this is a format string that collects copyright
    * information from the map if available.</p>
    * @since 4.2.2
    */
  val mapTextFull: js.UndefOr[String] = js.undefined
}

object Credits {
  /**
    * @param enabled <p>Whether to show the credits text.</p>
    * @param href <p>The URL for the credits label.</p>
    * @param position <p>Position configuration for the credits label.</p>
    * @param style <p>CSS styles for the credits label.</p>
    * @param text <p>The text for the credits label.</p>
    * @param mapText <p>Credits for map source to be concatenated with conventional credit. text. By default this is a format string that collects copyright. information from the map if available.</p>
    * @param mapTextFull <p>Detailed credits for map source to be displayed on hover of credits. text. By default this is a format string that collects copyright. information from the map if available.</p>
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, href: js.UndefOr[String] = js.undefined, position: js.UndefOr[js.Any] = js.undefined, style: js.UndefOr[js.Object] = js.undefined, text: js.UndefOr[String] = js.undefined, mapText: js.UndefOr[String] = js.undefined, mapTextFull: js.UndefOr[String] = js.undefined): Credits = {
    val enabledOuter: js.UndefOr[Boolean] = enabled
    val hrefOuter: js.UndefOr[String] = href
    val positionOuter: js.Any = position
    val styleOuter: js.UndefOr[js.Object] = style
    val textOuter: js.UndefOr[String] = text
    val mapTextOuter: js.UndefOr[String] = mapText
    val mapTextFullOuter: js.UndefOr[String] = mapTextFull
    com.highcharts.HighchartsGenericObject.toCleanObject(new Credits {
      override val enabled: js.UndefOr[Boolean] = enabledOuter
      override val href: js.UndefOr[String] = hrefOuter
      override val position: js.Any = positionOuter
      override val style: js.UndefOr[js.Object] = styleOuter
      override val text: js.UndefOr[String] = textOuter
      override val mapText: js.UndefOr[String] = mapTextOuter
      override val mapTextFull: js.UndefOr[String] = mapTextFullOuter
    })
  }
}
