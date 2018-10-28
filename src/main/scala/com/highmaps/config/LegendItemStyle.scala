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
  * @note JavaScript name: <code>legend-itemStyle</code>
  */
@js.annotation.ScalaJSDefined
class LegendItemStyle extends com.highcharts.HighchartsGenericObject {

  val cursor: js.UndefOr[String] = js.undefined
}

object LegendItemStyle {
  /**
    */
  def apply(cursor: js.UndefOr[String] = js.undefined): LegendItemStyle = {
    val cursorOuter: js.UndefOr[String] = cursor
    com.highcharts.HighchartsGenericObject.toCleanObject(new LegendItemStyle {
      override val cursor: js.UndefOr[String] = cursorOuter
    })
  }
}
