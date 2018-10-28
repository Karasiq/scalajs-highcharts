/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highcharts]]
  */
package com.highcharts.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>series&lt;ikh&gt;-params</code>
  */
@js.annotation.ScalaJSDefined
class SeriesIkhParams extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The base period for indicator calculations. This is the number of
    * data points which are taken into account for the indicator
    * calculations.</p>
    * @since 6.0.0
    */
  val period: js.UndefOr[Double] = js.undefined

  /**
    * <p>The base period for Tenkan calculations.</p>
    * @since 6.0.0
    */
  val periodTenkan: js.UndefOr[Double] = js.undefined

  /**
    * <p>The base period for Senkou Span B calculations</p>
    * @since 6.0.0
    */
  val periodSenkouSpanB: js.UndefOr[Double] = js.undefined

  /**
    * <p>The point index which indicator calculations will base. For
    * example using OHLC data, index=2 means the indicator will be
    * calculated using Low values.</p>
    * @since 6.0.0
    */
  val index: js.UndefOr[Double] = js.undefined
}

object SeriesIkhParams {
  /**
    * @param period <p>The base period for indicator calculations. This is the number of. data points which are taken into account for the indicator. calculations.</p>
    * @param periodTenkan <p>The base period for Tenkan calculations.</p>
    * @param periodSenkouSpanB <p>The base period for Senkou Span B calculations</p>
    * @param index <p>The point index which indicator calculations will base. For. example using OHLC data, index=2 means the indicator will be. calculated using Low values.</p>
    */
  def apply(period: js.UndefOr[Double] = js.undefined, periodTenkan: js.UndefOr[Double] = js.undefined, periodSenkouSpanB: js.UndefOr[Double] = js.undefined, index: js.UndefOr[Double] = js.undefined): SeriesIkhParams = {
    val periodOuter: js.UndefOr[Double] = period
    val periodTenkanOuter: js.UndefOr[Double] = periodTenkan
    val periodSenkouSpanBOuter: js.UndefOr[Double] = periodSenkouSpanB
    val indexOuter: js.UndefOr[Double] = index
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesIkhParams {
      override val period: js.UndefOr[Double] = periodOuter
      override val periodTenkan: js.UndefOr[Double] = periodTenkanOuter
      override val periodSenkouSpanB: js.UndefOr[Double] = periodSenkouSpanBOuter
      override val index: js.UndefOr[Double] = indexOuter
    })
  }
}
