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
  * @note JavaScript name: <code>series&lt;pie&gt;-label-style</code>
  */
@js.annotation.ScalaJSDefined
class SeriesPieLabelStyle extends com.highcharts.HighchartsGenericObject {

  val fontWeight: js.UndefOr[String] = js.undefined
}

object SeriesPieLabelStyle {
  /**
    */
  def apply(fontWeight: js.UndefOr[String] = js.undefined): SeriesPieLabelStyle = {
    val fontWeightOuter: js.UndefOr[String] = fontWeight
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesPieLabelStyle {
      override val fontWeight: js.UndefOr[String] = fontWeightOuter
    })
  }
}
