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
  * @note JavaScript name: <code>series&lt;bb&gt;-topLine-styles</code>
  */
@js.annotation.ScalaJSDefined
class SeriesBbTopLineStyles extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Pixel width of the line.</p>
    * @since 6.0.0
    */
  val lineWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>Color of the line. If not set, it&#39;s inherited from
    * <a href="#plotOptions.bb.color">plotOptions.bb.color</a>.</p>
    * @since 6.0.0
    */
  val lineColor: js.UndefOr[String] = js.undefined
}

object SeriesBbTopLineStyles {
  /**
    * @param lineWidth <p>Pixel width of the line.</p>
    * @param lineColor <p>Color of the line. If not set, it&#39;s inherited from. <a href="#plotOptions.bb.color">plotOptions.bb.color</a>.</p>
    */
  def apply(lineWidth: js.UndefOr[Double] = js.undefined, lineColor: js.UndefOr[String] = js.undefined): SeriesBbTopLineStyles = {
    val lineWidthOuter: js.UndefOr[Double] = lineWidth
    val lineColorOuter: js.UndefOr[String] = lineColor
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesBbTopLineStyles {
      override val lineWidth: js.UndefOr[Double] = lineWidthOuter
      override val lineColor: js.UndefOr[String] = lineColorOuter
    })
  }
}
