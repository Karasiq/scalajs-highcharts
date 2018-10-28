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
  * @note JavaScript name: <code>legend-itemCheckboxStyle</code>
  */
@js.annotation.ScalaJSDefined
class LegendItemCheckboxStyle extends com.highcharts.HighchartsGenericObject {

  val height: js.UndefOr[String] = js.undefined
}

object LegendItemCheckboxStyle {
  /**
    */
  def apply(height: js.UndefOr[String] = js.undefined): LegendItemCheckboxStyle = {
    val heightOuter: js.UndefOr[String] = height
    com.highcharts.HighchartsGenericObject.toCleanObject(new LegendItemCheckboxStyle {
      override val height: js.UndefOr[String] = heightOuter
    })
  }
}
