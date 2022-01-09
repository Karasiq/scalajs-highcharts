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
  * @note JavaScript name: <code>plotOptions-stochastic-params</code>
  */
class PlotOptionsStochasticParams extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Periods for Stochastic oscillator: [%K, %D].</p>
    * @since 6.0.0
    */
  var periods: js.UndefOr[js.Array[js.Array[js.Any]]] = js.undefined
}

object PlotOptionsStochasticParams {
  /**
    * @param periods <p>Periods for Stochastic oscillator: [%K, %D].</p>
    */
  def apply(periods: js.UndefOr[js.Array[js.Array[js.Any]]] = js.undefined): PlotOptionsStochasticParams = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsStochasticParams {
      this.periods = periods
    })
  }
}
