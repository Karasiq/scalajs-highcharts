/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highcharts]]
  */
package com.highcharts.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>series&lt;stochastic&gt;-params</code>
  */
class SeriesStochasticParams extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Periods for Stochastic oscillator: [%K, %D].</p>
    * @since 6.0.0
    */
  var periods: js.UndefOr[js.Array[js.Array[js.Any]]] = js.undefined
}

object SeriesStochasticParams {
  /**
    * @param periods <p>Periods for Stochastic oscillator: [%K, %D].</p>
    */
  def apply(periods: js.UndefOr[js.Array[js.Array[js.Any]]] = js.undefined): SeriesStochasticParams = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesStochasticParams {
      this.periods = periods
    })
  }
}
