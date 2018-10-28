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
  * @note JavaScript name: <code>series&lt;mappoint&gt;-dataLabels-style</code>
  */
@js.annotation.ScalaJSDefined
class SeriesMappointDataLabelsStyle extends com.highcharts.HighchartsGenericObject {

  val color: js.UndefOr[String] = js.undefined
}

object SeriesMappointDataLabelsStyle {
  /**
    */
  def apply(color: js.UndefOr[String] = js.undefined): SeriesMappointDataLabelsStyle = {
    val colorOuter: js.UndefOr[String] = color
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesMappointDataLabelsStyle {
      override val color: js.UndefOr[String] = colorOuter
    })
  }
}
