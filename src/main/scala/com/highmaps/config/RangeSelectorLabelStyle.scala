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
  * @note JavaScript name: <code>rangeSelector-labelStyle</code>
  */
@js.annotation.ScalaJSDefined
class RangeSelectorLabelStyle extends com.highcharts.HighchartsGenericObject {

  val color: js.UndefOr[String] = js.undefined
}

object RangeSelectorLabelStyle {
  /**
    */
  def apply(color: js.UndefOr[String] = js.undefined): RangeSelectorLabelStyle = {
    val colorOuter: js.UndefOr[String] = color
    com.highcharts.HighchartsGenericObject.toCleanObject(new RangeSelectorLabelStyle {
      override val color: js.UndefOr[String] = colorOuter
    })
  }
}
