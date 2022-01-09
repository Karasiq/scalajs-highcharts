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
  * @note JavaScript name: <code>chart-parallelAxes-labels-style</code>
  */
class ChartParallelAxesLabelsStyle extends com.highcharts.HighchartsGenericObject {

  var color: js.UndefOr[String] = js.undefined

  var cursor: js.UndefOr[String] = js.undefined

  var fontSize: js.UndefOr[String] = js.undefined
}

object ChartParallelAxesLabelsStyle {
  /**
    */
  def apply(color: js.UndefOr[String] = js.undefined, cursor: js.UndefOr[String] = js.undefined, fontSize: js.UndefOr[String] = js.undefined): ChartParallelAxesLabelsStyle = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new ChartParallelAxesLabelsStyle {
      this.color = color
      this.cursor = cursor
      this.fontSize = fontSize
    })
  }
}
