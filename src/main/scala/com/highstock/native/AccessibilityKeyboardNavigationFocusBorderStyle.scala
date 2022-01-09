/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highstock]]
  */
package com.highstock.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>accessibility-keyboardNavigation-focusBorder-style</code>
  */
class AccessibilityKeyboardNavigationFocusBorderStyle extends com.highcharts.HighchartsGenericObject {

  var borderRadius: js.UndefOr[Double] = js.undefined

  var color: js.UndefOr[String] = js.undefined

  var lineWidth: js.UndefOr[Double] = js.undefined
}

object AccessibilityKeyboardNavigationFocusBorderStyle {
  /**
    */
  def apply(borderRadius: js.UndefOr[Double] = js.undefined, color: js.UndefOr[String] = js.undefined, lineWidth: js.UndefOr[Double] = js.undefined): AccessibilityKeyboardNavigationFocusBorderStyle = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new AccessibilityKeyboardNavigationFocusBorderStyle {
      this.borderRadius = borderRadius
      this.color = color
      this.lineWidth = lineWidth
    })
  }
}
