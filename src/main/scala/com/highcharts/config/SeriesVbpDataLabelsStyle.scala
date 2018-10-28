/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highcharts]]
  */
package com.highcharts.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>series&lt;vbp&gt;-dataLabels-style</code>
  */
@js.annotation.ScalaJSDefined
class SeriesVbpDataLabelsStyle extends com.highcharts.HighchartsGenericObject {

  val fontSize: js.UndefOr[String] = js.undefined
}

object SeriesVbpDataLabelsStyle {
  /**
    */
  def apply(fontSize: js.UndefOr[String] = js.undefined): SeriesVbpDataLabelsStyle = {
    val fontSizeOuter: js.UndefOr[String] = fontSize
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesVbpDataLabelsStyle {
      override val fontSize: js.UndefOr[String] = fontSizeOuter
    })
  }
}
