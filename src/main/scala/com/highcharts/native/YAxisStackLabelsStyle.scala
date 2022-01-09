/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highcharts]]
  */
package com.highcharts.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>yAxis-stackLabels-style</code>
  */
class YAxisStackLabelsStyle extends com.highcharts.HighchartsGenericObject {

  var color: js.UndefOr[String] = js.undefined

  var fontSize: js.UndefOr[String] = js.undefined

  var fontWeight: js.UndefOr[String] = js.undefined

  var textOutline: js.UndefOr[String] = js.undefined
}

object YAxisStackLabelsStyle {
  /**
    */
  def apply(color: js.UndefOr[String] = js.undefined, fontSize: js.UndefOr[String] = js.undefined, fontWeight: js.UndefOr[String] = js.undefined, textOutline: js.UndefOr[String] = js.undefined): YAxisStackLabelsStyle = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new YAxisStackLabelsStyle {
      this.color = color
      this.fontSize = fontSize
      this.fontWeight = fontWeight
      this.textOutline = textOutline
    })
  }
}
