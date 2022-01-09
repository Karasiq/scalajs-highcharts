/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/gantt]]
  */
package com.gantt.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>navigator-yAxis-labels-style</code>
  */
class NavigatorYAxisLabelsStyle extends com.highcharts.HighchartsGenericObject {

  var color: js.UndefOr[String] = js.undefined

  var cursor: js.UndefOr[String] = js.undefined

  var fontSize: js.UndefOr[String] = js.undefined
}

object NavigatorYAxisLabelsStyle {
  /**
    */
  def apply(color: js.UndefOr[String] = js.undefined, cursor: js.UndefOr[String] = js.undefined, fontSize: js.UndefOr[String] = js.undefined): NavigatorYAxisLabelsStyle = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new NavigatorYAxisLabelsStyle {
      this.color = color
      this.cursor = cursor
      this.fontSize = fontSize
    })
  }
}
