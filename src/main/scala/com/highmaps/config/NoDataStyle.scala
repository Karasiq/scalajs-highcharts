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
  * @note JavaScript name: <code>noData-style</code>
  */
@js.annotation.ScalaJSDefined
class NoDataStyle extends com.highcharts.HighchartsGenericObject {

  val fontWeight: js.UndefOr[String] = js.undefined

  val fontSize: js.UndefOr[String] = js.undefined

  val color: js.UndefOr[String] = js.undefined
}

object NoDataStyle {
  /**
    */
  def apply(fontWeight: js.UndefOr[String] = js.undefined, fontSize: js.UndefOr[String] = js.undefined, color: js.UndefOr[String] = js.undefined): NoDataStyle = {
    val fontWeightOuter: js.UndefOr[String] = fontWeight
    val fontSizeOuter: js.UndefOr[String] = fontSize
    val colorOuter: js.UndefOr[String] = color
    com.highcharts.HighchartsGenericObject.toCleanObject(new NoDataStyle {
      override val fontWeight: js.UndefOr[String] = fontWeightOuter
      override val fontSize: js.UndefOr[String] = fontSizeOuter
      override val color: js.UndefOr[String] = colorOuter
    })
  }
}
