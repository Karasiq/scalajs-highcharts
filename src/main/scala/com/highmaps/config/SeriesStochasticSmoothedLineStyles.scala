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
  * @note JavaScript name: <code>series&lt;stochastic&gt;-smoothedLine-styles</code>
  */
@js.annotation.ScalaJSDefined
class SeriesStochasticSmoothedLineStyles extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Pixel width of the line.</p>
    * @since 6.0.0
    */
  val lineWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>Color of the line. If not set, it&#39;s inherited from
    * <a href="#plotOptions.stochastic.color">plotOptions.stochastic.color</a>.</p>
    * @since 6.0.0
    */
  val lineColor: js.UndefOr[String] = js.undefined
}

object SeriesStochasticSmoothedLineStyles {
  /**
    * @param lineWidth <p>Pixel width of the line.</p>
    * @param lineColor <p>Color of the line. If not set, it&#39;s inherited from. <a href="#plotOptions.stochastic.color">plotOptions.stochastic.color</a>.</p>
    */
  def apply(lineWidth: js.UndefOr[Double] = js.undefined, lineColor: js.UndefOr[String] = js.undefined): SeriesStochasticSmoothedLineStyles = {
    val lineWidthOuter: js.UndefOr[Double] = lineWidth
    val lineColorOuter: js.UndefOr[String] = lineColor
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesStochasticSmoothedLineStyles {
      override val lineWidth: js.UndefOr[Double] = lineWidthOuter
      override val lineColor: js.UndefOr[String] = lineColorOuter
    })
  }
}
