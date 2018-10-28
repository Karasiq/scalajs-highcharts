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
  * @note JavaScript name: <code>plotOptions-sunburst-dataLabels-style</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsSunburstDataLabelsStyle extends com.highcharts.HighchartsGenericObject {

  val textOverflow: js.UndefOr[String] = js.undefined
}

object PlotOptionsSunburstDataLabelsStyle {
  /**
    */
  def apply(textOverflow: js.UndefOr[String] = js.undefined): PlotOptionsSunburstDataLabelsStyle = {
    val textOverflowOuter: js.UndefOr[String] = textOverflow
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsSunburstDataLabelsStyle {
      override val textOverflow: js.UndefOr[String] = textOverflowOuter
    })
  }
}
