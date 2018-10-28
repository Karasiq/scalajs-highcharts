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
  * @note JavaScript name: <code>series&lt;stochastic&gt;-params</code>
  */
@js.annotation.ScalaJSDefined
class SeriesStochasticParams extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Periods for Stochastic oscillator: [%K, %D].</p>
    * @since 6.0.0
    */
  val periods: js.UndefOr[js.Array[js.Any]] = js.undefined
}

object SeriesStochasticParams {
  /**
    * @param periods <p>Periods for Stochastic oscillator: [%K, %D].</p>
    */
  def apply(periods: js.UndefOr[js.Array[js.Any]] = js.undefined): SeriesStochasticParams = {
    val periodsOuter: js.UndefOr[js.Array[js.Any]] = periods
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesStochasticParams {
      override val periods: js.UndefOr[js.Array[js.Any]] = periodsOuter
    })
  }
}
