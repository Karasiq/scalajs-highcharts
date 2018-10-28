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
  * @note JavaScript name: <code>navigation-menuItemStyle</code>
  */
@js.annotation.ScalaJSDefined
class NavigationMenuItemStyle extends com.highcharts.HighchartsGenericObject {

  val padding: js.UndefOr[String] = js.undefined

  val background: js.UndefOr[String] = js.undefined

  val color: js.UndefOr[String] = js.undefined

  /**
    * <p>Defaults to <code>14px</code> on touch devices and <code>11px</code> on desktop.</p>
    * @since 2.0
    */
  val fontSize: js.UndefOr[String] = js.undefined

  val transition: js.UndefOr[String] = js.undefined
}

object NavigationMenuItemStyle {
  /**
    * @param fontSize <p>Defaults to <code>14px</code> on touch devices and <code>11px</code> on desktop.</p>
    */
  def apply(padding: js.UndefOr[String] = js.undefined, background: js.UndefOr[String] = js.undefined, color: js.UndefOr[String] = js.undefined, fontSize: js.UndefOr[String] = js.undefined, transition: js.UndefOr[String] = js.undefined): NavigationMenuItemStyle = {
    val paddingOuter: js.UndefOr[String] = padding
    val backgroundOuter: js.UndefOr[String] = background
    val colorOuter: js.UndefOr[String] = color
    val fontSizeOuter: js.UndefOr[String] = fontSize
    val transitionOuter: js.UndefOr[String] = transition
    com.highcharts.HighchartsGenericObject.toCleanObject(new NavigationMenuItemStyle {
      override val padding: js.UndefOr[String] = paddingOuter
      override val background: js.UndefOr[String] = backgroundOuter
      override val color: js.UndefOr[String] = colorOuter
      override val fontSize: js.UndefOr[String] = fontSizeOuter
      override val transition: js.UndefOr[String] = transitionOuter
    })
  }
}
