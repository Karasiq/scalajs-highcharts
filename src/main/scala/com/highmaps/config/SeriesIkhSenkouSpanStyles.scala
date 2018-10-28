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
  * @note JavaScript name: <code>series&lt;ikh&gt;-senkouSpan-styles</code>
  */
@js.annotation.ScalaJSDefined
class SeriesIkhSenkouSpanStyles extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Color of the area between Senkou Span A and B.</p>
    * @since 6.0.0
    */
  val fill: js.UndefOr[Double] = js.undefined
}

object SeriesIkhSenkouSpanStyles {
  /**
    * @param fill <p>Color of the area between Senkou Span A and B.</p>
    */
  def apply(fill: js.UndefOr[Double] = js.undefined): SeriesIkhSenkouSpanStyles = {
    val fillOuter: js.UndefOr[Double] = fill
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesIkhSenkouSpanStyles {
      override val fill: js.UndefOr[Double] = fillOuter
    })
  }
}
