/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highmaps]]
  */
package com.highmaps.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>navigator-yAxis-title-style</code>
  */
class NavigatorYAxisTitleStyle extends com.highcharts.HighchartsGenericObject {

  var color: js.UndefOr[String] = js.undefined
}

object NavigatorYAxisTitleStyle {
  /**
    */
  def apply(color: js.UndefOr[String] = js.undefined): NavigatorYAxisTitleStyle = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new NavigatorYAxisTitleStyle {
      this.color = color
    })
  }
}
