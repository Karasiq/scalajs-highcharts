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
  * @note JavaScript name: <code>plotOptions-macd-macdLine-styles</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsMacdMacdLineStyles extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Pixel width of the line.</p>
    * @since 6.0.0
    */
  val lineWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>Color of the line.</p>
    * @since 6.0.0
    */
  val lineColor: js.UndefOr[Double] = js.undefined
}

object PlotOptionsMacdMacdLineStyles {
  /**
    * @param lineWidth <p>Pixel width of the line.</p>
    * @param lineColor <p>Color of the line.</p>
    */
  def apply(lineWidth: js.UndefOr[Double] = js.undefined, lineColor: js.UndefOr[Double] = js.undefined): PlotOptionsMacdMacdLineStyles = {
    val lineWidthOuter: js.UndefOr[Double] = lineWidth
    val lineColorOuter: js.UndefOr[Double] = lineColor
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsMacdMacdLineStyles {
      override val lineWidth: js.UndefOr[Double] = lineWidthOuter
      override val lineColor: js.UndefOr[Double] = lineColorOuter
    })
  }
}
