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
  * @note JavaScript name: <code>plotOptions-sma-params</code>
  */
class PlotOptionsSmaParams extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The point index which indicator calculations will base. For
    * example using OHLC data, index=2 means the indicator will be
    * calculated using Low values.</p>
    * @since 6.0.0
    */
  var index: js.UndefOr[Double] = js.undefined

  /**
    * <p>The base period for indicator calculations. This is the number of
    * data points which are taken into account for the indicator
    * calculations.</p>
    * @since 6.0.0
    */
  var period: js.UndefOr[Double] = js.undefined
}

object PlotOptionsSmaParams {
  /**
    * @param index <p>The point index which indicator calculations will base. For. example using OHLC data, index=2 means the indicator will be. calculated using Low values.</p>
    * @param period <p>The base period for indicator calculations. This is the number of. data points which are taken into account for the indicator. calculations.</p>
    */
  def apply(index: js.UndefOr[Double] = js.undefined, period: js.UndefOr[Double] = js.undefined): PlotOptionsSmaParams = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsSmaParams {
      this.index = index
      this.period = period
    })
  }
}
