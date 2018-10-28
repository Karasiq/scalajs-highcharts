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
  * @note JavaScript name: <code>navigation-menuItemHoverStyle</code>
  */
@js.annotation.ScalaJSDefined
class NavigationMenuItemHoverStyle extends com.highcharts.HighchartsGenericObject {

  val background: js.UndefOr[String] = js.undefined

  val color: js.UndefOr[String] = js.undefined
}

object NavigationMenuItemHoverStyle {
  /**
    */
  def apply(background: js.UndefOr[String] = js.undefined, color: js.UndefOr[String] = js.undefined): NavigationMenuItemHoverStyle = {
    val backgroundOuter: js.UndefOr[String] = background
    val colorOuter: js.UndefOr[String] = color
    com.highcharts.HighchartsGenericObject.toCleanObject(new NavigationMenuItemHoverStyle {
      override val background: js.UndefOr[String] = backgroundOuter
      override val color: js.UndefOr[String] = colorOuter
    })
  }
}
