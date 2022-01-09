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
  * @note JavaScript name: <code>series&lt;apo&gt;-params</code>
  */
class SeriesApoParams extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Periods for Absolute Price Oscillator calculations.</p>
    * @since 7.0.0
    */
  var periods: js.UndefOr[js.Array[Double]] = js.undefined

  /**
    * <p>The point index which indicator calculations will base. For
    * example using OHLC data, index=2 means the indicator will be
    * calculated using Low values.</p>
    * <p>By default index value used to be set to 0. Since
    * Highcharts Stock 7 by default index is set to 3
    * which means that the ema indicator will be
    * calculated using Close values.</p>
    * @since 6.0.0
    */
  var index: js.UndefOr[Double] = js.undefined
}

object SeriesApoParams {
  /**
    * @param periods <p>Periods for Absolute Price Oscillator calculations.</p>
    * @param index <p>The point index which indicator calculations will base. For. example using OHLC data, index=2 means the indicator will be. calculated using Low values.</p>. <p>By default index value used to be set to 0. Since. Highcharts Stock 7 by default index is set to 3. which means that the ema indicator will be. calculated using Close values.</p>
    */
  def apply(periods: js.UndefOr[js.Array[Double]] = js.undefined, index: js.UndefOr[Double] = js.undefined): SeriesApoParams = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesApoParams {
      this.periods = periods
      this.index = index
    })
  }
}