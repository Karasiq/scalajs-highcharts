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
  * @note JavaScript name: <code>yAxis-labels-style</code>
  */
class YAxisLabelsStyle extends com.highcharts.HighchartsGenericObject {

  var color: js.UndefOr[String] = js.undefined

  var cursor: js.UndefOr[String] = js.undefined

  var fontSize: js.UndefOr[String] = js.undefined
}

object YAxisLabelsStyle {
  /**
    */
  def apply(color: js.UndefOr[String] = js.undefined, cursor: js.UndefOr[String] = js.undefined, fontSize: js.UndefOr[String] = js.undefined): YAxisLabelsStyle = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new YAxisLabelsStyle {
      this.color = color
      this.cursor = cursor
      this.fontSize = fontSize
    })
  }
}
