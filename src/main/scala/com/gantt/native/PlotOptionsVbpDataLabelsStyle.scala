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
  * @note JavaScript name: <code>plotOptions-vbp-dataLabels-style</code>
  */
class PlotOptionsVbpDataLabelsStyle extends com.highcharts.HighchartsGenericObject {

  var fontSize: js.UndefOr[String] = js.undefined
}

object PlotOptionsVbpDataLabelsStyle {
  /**
    */
  def apply(fontSize: js.UndefOr[String] = js.undefined): PlotOptionsVbpDataLabelsStyle = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsVbpDataLabelsStyle {
      this.fontSize = fontSize
    })
  }
}
