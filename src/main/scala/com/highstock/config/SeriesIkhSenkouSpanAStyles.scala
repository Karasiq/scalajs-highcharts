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
  * @note JavaScript name: <code>series&lt;ikh&gt;-senkouSpanA-styles</code>
  */
@js.annotation.ScalaJSDefined
class SeriesIkhSenkouSpanAStyles extends com.highcharts.HighchartsGenericObject {

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

object SeriesIkhSenkouSpanAStyles {
  /**
    * @param lineWidth <p>Pixel width of the line.</p>
    * @param lineColor <p>Color of the line.</p>
    */
  def apply(lineWidth: js.UndefOr[Double] = js.undefined, lineColor: js.UndefOr[Double] = js.undefined): SeriesIkhSenkouSpanAStyles = {
    val lineWidthOuter: js.UndefOr[Double] = lineWidth
    val lineColorOuter: js.UndefOr[Double] = lineColor
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesIkhSenkouSpanAStyles {
      override val lineWidth: js.UndefOr[Double] = lineWidthOuter
      override val lineColor: js.UndefOr[Double] = lineColorOuter
    })
  }
}
