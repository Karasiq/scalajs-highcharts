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
  * @note JavaScript name: <code>plotOptions-ikh-senkouSpan-styles</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsIkhSenkouSpanStyles extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Color of the area between Senkou Span A and B.</p>
    * @since 6.0.0
    */
  val fill: js.UndefOr[Double] = js.undefined
}

object PlotOptionsIkhSenkouSpanStyles {
  /**
    * @param fill <p>Color of the area between Senkou Span A and B.</p>
    */
  def apply(fill: js.UndefOr[Double] = js.undefined): PlotOptionsIkhSenkouSpanStyles = {
    val fillOuter: js.UndefOr[Double] = fill
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsIkhSenkouSpanStyles {
      override val fill: js.UndefOr[Double] = fillOuter
    })
  }
}
