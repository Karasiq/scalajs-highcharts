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
  * @note JavaScript name: <code>accessibility-keyboardNavigation-focusBorder-style</code>
  */
@js.annotation.ScalaJSDefined
class AccessibilityKeyboardNavigationFocusBorderStyle extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Color of the focus border.</p>
    * @since 6.0.3
    */
  val color: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>Line width of the focus border.</p>
    * @since 6.0.3
    */
  val lineWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>Border radius of the focus border.</p>
    * @since 6.0.3
    */
  val borderRadius: js.UndefOr[Double] = js.undefined
}

object AccessibilityKeyboardNavigationFocusBorderStyle {
  /**
    * @param color <p>Color of the focus border.</p>
    * @param lineWidth <p>Line width of the focus border.</p>
    * @param borderRadius <p>Border radius of the focus border.</p>
    */
  def apply(color: js.UndefOr[String | js.Object] = js.undefined, lineWidth: js.UndefOr[Double] = js.undefined, borderRadius: js.UndefOr[Double] = js.undefined): AccessibilityKeyboardNavigationFocusBorderStyle = {
    val colorOuter: js.UndefOr[String | js.Object] = color
    val lineWidthOuter: js.UndefOr[Double] = lineWidth
    val borderRadiusOuter: js.UndefOr[Double] = borderRadius
    com.highcharts.HighchartsGenericObject.toCleanObject(new AccessibilityKeyboardNavigationFocusBorderStyle {
      override val color: js.UndefOr[String | js.Object] = colorOuter
      override val lineWidth: js.UndefOr[Double] = lineWidthOuter
      override val borderRadius: js.UndefOr[Double] = borderRadiusOuter
    })
  }
}
