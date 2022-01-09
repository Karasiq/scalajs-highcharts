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
  * @note JavaScript name: <code>navigator-xAxis-title-style</code>
  */
class NavigatorXAxisTitleStyle extends com.highcharts.HighchartsGenericObject {

  var color: js.UndefOr[String] = js.undefined
}

object NavigatorXAxisTitleStyle {
  /**
    */
  def apply(color: js.UndefOr[String] = js.undefined): NavigatorXAxisTitleStyle = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new NavigatorXAxisTitleStyle {
      this.color = color
    })
  }
}
