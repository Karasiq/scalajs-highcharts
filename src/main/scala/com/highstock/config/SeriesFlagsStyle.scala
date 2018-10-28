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
  * @note JavaScript name: <code>series&lt;flags&gt;-style</code>
  */
@js.annotation.ScalaJSDefined
class SeriesFlagsStyle extends com.highcharts.HighchartsGenericObject {

  val fontSize: js.UndefOr[String] = js.undefined

  val fontWeight: js.UndefOr[String] = js.undefined
}

object SeriesFlagsStyle {
  /**
    */
  def apply(fontSize: js.UndefOr[String] = js.undefined, fontWeight: js.UndefOr[String] = js.undefined): SeriesFlagsStyle = {
    val fontSizeOuter: js.UndefOr[String] = fontSize
    val fontWeightOuter: js.UndefOr[String] = fontWeight
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesFlagsStyle {
      override val fontSize: js.UndefOr[String] = fontSizeOuter
      override val fontWeight: js.UndefOr[String] = fontWeightOuter
    })
  }
}
