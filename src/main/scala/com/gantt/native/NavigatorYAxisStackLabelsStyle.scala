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
  * @note JavaScript name: <code>navigator-yAxis-stackLabels-style</code>
  */
class NavigatorYAxisStackLabelsStyle extends com.highcharts.HighchartsGenericObject {

  var color: js.UndefOr[String] = js.undefined

  var fontSize: js.UndefOr[String] = js.undefined

  var fontWeight: js.UndefOr[String] = js.undefined

  var textOutline: js.UndefOr[String] = js.undefined
}

object NavigatorYAxisStackLabelsStyle {
  /**
    */
  def apply(color: js.UndefOr[String] = js.undefined, fontSize: js.UndefOr[String] = js.undefined, fontWeight: js.UndefOr[String] = js.undefined, textOutline: js.UndefOr[String] = js.undefined): NavigatorYAxisStackLabelsStyle = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new NavigatorYAxisStackLabelsStyle {
      this.color = color
      this.fontSize = fontSize
      this.fontWeight = fontWeight
      this.textOutline = textOutline
    })
  }
}
