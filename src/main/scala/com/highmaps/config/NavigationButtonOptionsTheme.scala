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
  * @note JavaScript name: <code>navigation-buttonOptions-theme</code>
  */
@js.annotation.ScalaJSDefined
class NavigationButtonOptionsTheme extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The default fill exists only to capture hover events.</p>
    * @since 3.0
    */
  val fill: js.UndefOr[String] = js.undefined

  val stroke: js.UndefOr[String] = js.undefined

  val padding: js.UndefOr[Double] = js.undefined
}

object NavigationButtonOptionsTheme {
  /**
    * @param fill <p>The default fill exists only to capture hover events.</p>
    */
  def apply(fill: js.UndefOr[String] = js.undefined, stroke: js.UndefOr[String] = js.undefined, padding: js.UndefOr[Double] = js.undefined): NavigationButtonOptionsTheme = {
    val fillOuter: js.UndefOr[String] = fill
    val strokeOuter: js.UndefOr[String] = stroke
    val paddingOuter: js.UndefOr[Double] = padding
    com.highcharts.HighchartsGenericObject.toCleanObject(new NavigationButtonOptionsTheme {
      override val fill: js.UndefOr[String] = fillOuter
      override val stroke: js.UndefOr[String] = strokeOuter
      override val padding: js.UndefOr[Double] = paddingOuter
    })
  }
}
