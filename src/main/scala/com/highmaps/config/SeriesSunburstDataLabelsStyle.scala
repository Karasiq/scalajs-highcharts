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
  * @note JavaScript name: <code>series&lt;sunburst&gt;-dataLabels-style</code>
  */
@js.annotation.ScalaJSDefined
class SeriesSunburstDataLabelsStyle extends com.highcharts.HighchartsGenericObject {

  val textOverflow: js.UndefOr[String] = js.undefined
}

object SeriesSunburstDataLabelsStyle {
  /**
    */
  def apply(textOverflow: js.UndefOr[String] = js.undefined): SeriesSunburstDataLabelsStyle = {
    val textOverflowOuter: js.UndefOr[String] = textOverflow
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesSunburstDataLabelsStyle {
      override val textOverflow: js.UndefOr[String] = textOverflowOuter
    })
  }
}
