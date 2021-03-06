/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highstock]]
  */
package com.highstock.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>series&lt;ema&gt;-params</code>
  */
@js.annotation.ScalaJSDefined
class SeriesEmaParams extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The point index which indicator calculations will base. For
    * example using OHLC data, index=2 means the indicator will be
    * calculated using Low values.</p>
    * @since 6.0.0
    */
  val index: js.UndefOr[Double] = js.undefined

  /**
    * <p>The base period for indicator calculations. This is the number of
    * data points which are taken into account for the indicator
    * calculations.</p>
    * @since 6.0.0
    */
  val period: js.UndefOr[Double] = js.undefined
}

object SeriesEmaParams {
  /**
    * @param index <p>The point index which indicator calculations will base. For. example using OHLC data, index=2 means the indicator will be. calculated using Low values.</p>
    * @param period <p>The base period for indicator calculations. This is the number of. data points which are taken into account for the indicator. calculations.</p>
    */
  def apply(index: js.UndefOr[Double] = js.undefined, period: js.UndefOr[Double] = js.undefined): SeriesEmaParams = {
    val indexOuter: js.UndefOr[Double] = index
    val periodOuter: js.UndefOr[Double] = period
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesEmaParams {
      override val index: js.UndefOr[Double] = indexOuter
      override val period: js.UndefOr[Double] = periodOuter
    })
  }
}
