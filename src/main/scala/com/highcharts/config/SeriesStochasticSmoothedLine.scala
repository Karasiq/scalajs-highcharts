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
  * @note JavaScript name: <code>series&lt;stochastic&gt;-smoothedLine</code>
  */
@js.annotation.ScalaJSDefined
class SeriesStochasticSmoothedLine extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Styles for a smoothed line.</p>
    * @since 6.0.0
    */
  val styles: js.Any = js.undefined
}

object SeriesStochasticSmoothedLine {
  /**
    * @param styles <p>Styles for a smoothed line.</p>
    */
  def apply(styles: js.UndefOr[js.Any] = js.undefined): SeriesStochasticSmoothedLine = {
    val stylesOuter: js.Any = styles
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesStochasticSmoothedLine {
      override val styles: js.Any = stylesOuter
    })
  }
}
