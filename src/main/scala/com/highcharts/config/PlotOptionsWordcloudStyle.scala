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
  * @note JavaScript name: <code>plotOptions-wordcloud-style</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsWordcloudStyle extends com.highcharts.HighchartsGenericObject {

  val fontFamily: js.UndefOr[String] = js.undefined

  val fontWeight: js.UndefOr[Double | String] = js.undefined
}

object PlotOptionsWordcloudStyle {
  /**
    */
  def apply(fontFamily: js.UndefOr[String] = js.undefined, fontWeight: js.UndefOr[Double | String] = js.undefined): PlotOptionsWordcloudStyle = {
    val fontFamilyOuter: js.UndefOr[String] = fontFamily
    val fontWeightOuter: js.UndefOr[Double | String] = fontWeight
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsWordcloudStyle {
      override val fontFamily: js.UndefOr[String] = fontFamilyOuter
      override val fontWeight: js.UndefOr[Double | String] = fontWeightOuter
    })
  }
}
