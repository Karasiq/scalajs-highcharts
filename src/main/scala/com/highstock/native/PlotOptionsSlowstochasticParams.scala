/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highstock]]
  */
package com.highstock.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>plotOptions-slowstochastic-params</code>
  */
class PlotOptionsSlowstochasticParams extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Periods for Slow Stochastic oscillator: [%K, %D, SMA(%D)].</p>
    * @since 6.0.0
    */
  var periods: js.UndefOr[js.Array[js.Array[js.Any]]] = js.undefined
}

object PlotOptionsSlowstochasticParams {
  /**
    * @param periods <p>Periods for Slow Stochastic oscillator: [%K, %D, SMA(%D)].</p>
    */
  def apply(periods: js.UndefOr[js.Array[js.Array[js.Any]]] = js.undefined): PlotOptionsSlowstochasticParams = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsSlowstochasticParams {
      this.periods = periods
    })
  }
}
