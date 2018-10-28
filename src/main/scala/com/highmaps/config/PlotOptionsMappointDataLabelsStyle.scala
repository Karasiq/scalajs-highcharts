/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highmaps]]
  */
package com.highmaps.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>plotOptions-mappoint-dataLabels-style</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsMappointDataLabelsStyle extends com.highcharts.HighchartsGenericObject {

  val color: js.UndefOr[String] = js.undefined
}

object PlotOptionsMappointDataLabelsStyle {
  /**
    */
  def apply(color: js.UndefOr[String] = js.undefined): PlotOptionsMappointDataLabelsStyle = {
    val colorOuter: js.UndefOr[String] = color
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsMappointDataLabelsStyle {
      override val color: js.UndefOr[String] = colorOuter
    })
  }
}
