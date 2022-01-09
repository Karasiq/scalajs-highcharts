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
  * @note JavaScript name: <code>series&lt;macd&gt;-params</code>
  */
class SeriesMacdParams extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The long period for indicator calculations.</p>
    * @since 6.0.0
    */
  var longPeriod: js.UndefOr[Double] = js.undefined

  /**
    * <p>The base period for indicator calculations. This is the number of
    * data points which are taken into account for the indicator
    * calculations.</p>
    * @since 6.0.0
    */
  var period: js.UndefOr[Double] = js.undefined

  /**
    * <p>The short period for indicator calculations.</p>
    * @since 6.0.0
    */
  var shortPeriod: js.UndefOr[Double] = js.undefined

  /**
    * <p>The base period for signal calculations.</p>
    * @since 6.0.0
    */
  var signalPeriod: js.UndefOr[Double] = js.undefined

  /**
    * <p>The point index which indicator calculations will base. For
    * example using OHLC data, index=2 means the indicator will be
    * calculated using Low values.</p>
    * @since 6.0.0
    */
  var index: js.UndefOr[Double] = js.undefined
}

object SeriesMacdParams {
  /**
    * @param longPeriod <p>The long period for indicator calculations.</p>
    * @param period <p>The base period for indicator calculations. This is the number of. data points which are taken into account for the indicator. calculations.</p>
    * @param shortPeriod <p>The short period for indicator calculations.</p>
    * @param signalPeriod <p>The base period for signal calculations.</p>
    * @param index <p>The point index which indicator calculations will base. For. example using OHLC data, index=2 means the indicator will be. calculated using Low values.</p>
    */
  def apply(longPeriod: js.UndefOr[Double] = js.undefined, period: js.UndefOr[Double] = js.undefined, shortPeriod: js.UndefOr[Double] = js.undefined, signalPeriod: js.UndefOr[Double] = js.undefined, index: js.UndefOr[Double] = js.undefined): SeriesMacdParams = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesMacdParams {
      this.longPeriod = longPeriod
      this.period = period
      this.shortPeriod = shortPeriod
      this.signalPeriod = signalPeriod
      this.index = index
    })
  }
}
