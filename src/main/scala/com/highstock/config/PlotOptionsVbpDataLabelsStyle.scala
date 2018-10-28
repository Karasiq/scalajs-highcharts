/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highstock]]
  */
package com.highstock.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>plotOptions-vbp-dataLabels-style</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsVbpDataLabelsStyle extends com.highcharts.HighchartsGenericObject {

  val fontSize: js.UndefOr[String] = js.undefined
}

object PlotOptionsVbpDataLabelsStyle {
  /**
    */
  def apply(fontSize: js.UndefOr[String] = js.undefined): PlotOptionsVbpDataLabelsStyle = {
    val fontSizeOuter: js.UndefOr[String] = fontSize
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsVbpDataLabelsStyle {
      override val fontSize: js.UndefOr[String] = fontSizeOuter
    })
  }
}
