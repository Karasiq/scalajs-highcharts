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
  * @note JavaScript name: <code>xAxis-labels-style</code>
  */
class XAxisLabelsStyle extends com.highcharts.HighchartsGenericObject {

  var color: js.UndefOr[String] = js.undefined

  var cursor: js.UndefOr[String] = js.undefined

  var fontSize: js.UndefOr[String] = js.undefined
}

object XAxisLabelsStyle {
  /**
    */
  def apply(color: js.UndefOr[String] = js.undefined, cursor: js.UndefOr[String] = js.undefined, fontSize: js.UndefOr[String] = js.undefined): XAxisLabelsStyle = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new XAxisLabelsStyle {
      this.color = color
      this.cursor = cursor
      this.fontSize = fontSize
    })
  }
}
