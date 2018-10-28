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
  * @note JavaScript name: <code>series&lt;wordcloud&gt;-style</code>
  */
@js.annotation.ScalaJSDefined
class SeriesWordcloudStyle extends com.highcharts.HighchartsGenericObject {

  val fontFamily: js.UndefOr[String] = js.undefined

  val fontWeight: js.UndefOr[Double | String] = js.undefined
}

object SeriesWordcloudStyle {
  /**
    */
  def apply(fontFamily: js.UndefOr[String] = js.undefined, fontWeight: js.UndefOr[Double | String] = js.undefined): SeriesWordcloudStyle = {
    val fontFamilyOuter: js.UndefOr[String] = fontFamily
    val fontWeightOuter: js.UndefOr[Double | String] = fontWeight
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesWordcloudStyle {
      override val fontFamily: js.UndefOr[String] = fontFamilyOuter
      override val fontWeight: js.UndefOr[Double | String] = fontWeightOuter
    })
  }
}
