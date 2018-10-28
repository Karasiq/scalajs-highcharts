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
  * @note JavaScript name: <code>rangeSelector-buttonTheme</code>
  */
@js.annotation.ScalaJSDefined
class RangeSelectorButtonTheme extends com.highcharts.HighchartsGenericObject {

  val width: js.UndefOr[Double] = js.undefined

  val height: js.UndefOr[Double] = js.undefined

  val padding: js.UndefOr[Double] = js.undefined

  val zIndex: js.UndefOr[Double] = js.undefined
}

object RangeSelectorButtonTheme {
  /**
    */
  def apply(width: js.UndefOr[Double] = js.undefined, height: js.UndefOr[Double] = js.undefined, padding: js.UndefOr[Double] = js.undefined, zIndex: js.UndefOr[Double] = js.undefined): RangeSelectorButtonTheme = {
    val widthOuter: js.UndefOr[Double] = width
    val heightOuter: js.UndefOr[Double] = height
    val paddingOuter: js.UndefOr[Double] = padding
    val zIndexOuter: js.UndefOr[Double] = zIndex
    com.highcharts.HighchartsGenericObject.toCleanObject(new RangeSelectorButtonTheme {
      override val width: js.UndefOr[Double] = widthOuter
      override val height: js.UndefOr[Double] = heightOuter
      override val padding: js.UndefOr[Double] = paddingOuter
      override val zIndex: js.UndefOr[Double] = zIndexOuter
    })
  }
}
