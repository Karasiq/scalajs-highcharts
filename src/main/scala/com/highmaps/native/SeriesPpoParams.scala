/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highmaps]]
  */
package com.highmaps.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>series&lt;ppo&gt;-params</code>
  */
class SeriesPpoParams extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Periods for Percentage Price Oscillator calculations.</p>
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

object SeriesPpoParams {
  /**
    * @param periods <p>Periods for Percentage Price Oscillator calculations.</p>
    * @param index <p>The point index which indicator calculations will base. For. example using OHLC data, index=2 means the indicator will be. calculated using Low values.</p>. <p>By default index value used to be set to 0. Since. Highcharts Stock 7 by default index is set to 3. which means that the ema indicator will be. calculated using Close values.</p>
    */
  def apply(periods: js.UndefOr[js.Array[Double]] = js.undefined, index: js.UndefOr[Double] = js.undefined): SeriesPpoParams = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesPpoParams {
      this.periods = periods
      this.index = index
    })
  }
}
