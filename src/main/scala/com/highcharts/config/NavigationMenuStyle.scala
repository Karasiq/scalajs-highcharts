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
  * @note JavaScript name: <code>navigation-menuStyle</code>
  */
@js.annotation.ScalaJSDefined
class NavigationMenuStyle extends com.highcharts.HighchartsGenericObject {

  val border: js.UndefOr[String] = js.undefined

  val background: js.UndefOr[String] = js.undefined

  val padding: js.UndefOr[String] = js.undefined
}

object NavigationMenuStyle {
  /**
    */
  def apply(border: js.UndefOr[String] = js.undefined, background: js.UndefOr[String] = js.undefined, padding: js.UndefOr[String] = js.undefined): NavigationMenuStyle = {
    val borderOuter: js.UndefOr[String] = border
    val backgroundOuter: js.UndefOr[String] = background
    val paddingOuter: js.UndefOr[String] = padding
    com.highcharts.HighchartsGenericObject.toCleanObject(new NavigationMenuStyle {
      override val border: js.UndefOr[String] = borderOuter
      override val background: js.UndefOr[String] = backgroundOuter
      override val padding: js.UndefOr[String] = paddingOuter
    })
  }
}
