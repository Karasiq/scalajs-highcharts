/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/gantt]]
  */
package com.gantt.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>plotOptions-dpo-params</code>
  */
class PlotOptionsDpoParams extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The point index which indicator calculations will base. For
    * example using OHLC data, index=2 means the indicator will be
    * calculated using Low values.</p>
    * @since 6.0.0
    */
  var index: js.UndefOr[Double] = js.undefined

  /**
    * <p>Period for Detrended Price Oscillator</p>
    * @since 7.0.0
    */
  var period: js.UndefOr[Double] = js.undefined
}

object PlotOptionsDpoParams {
  /**
    * @param index <p>The point index which indicator calculations will base. For. example using OHLC data, index=2 means the indicator will be. calculated using Low values.</p>
    * @param period <p>Period for Detrended Price Oscillator</p>
    */
  def apply(index: js.UndefOr[Double] = js.undefined, period: js.UndefOr[Double] = js.undefined): PlotOptionsDpoParams = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsDpoParams {
      this.index = index
      this.period = period
    })
  }
}
