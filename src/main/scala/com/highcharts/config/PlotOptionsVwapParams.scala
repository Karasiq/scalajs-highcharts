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
  * @note JavaScript name: <code>plotOptions-vwap-params</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsVwapParams extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The base period for indicator calculations. This is the number of
    * data points which are taken into account for the indicator
    * calculations.</p>
    * @since 6.0.0
    */
  val period: js.UndefOr[Double] = js.undefined

  /**
    * <p>The id of volume series which is mandatory. For example using
    * OHLC data, volumeSeriesID=&#39;volume&#39; means the indicator will be
    * calculated using OHLC and volume values.</p>
    * @since 6.0.0
    */
  val volumeSeriesID: js.UndefOr[String] = js.undefined
}

object PlotOptionsVwapParams {
  /**
    * @param period <p>The base period for indicator calculations. This is the number of. data points which are taken into account for the indicator. calculations.</p>
    * @param volumeSeriesID <p>The id of volume series which is mandatory. For example using. OHLC data, volumeSeriesID=&#39;volume&#39; means the indicator will be. calculated using OHLC and volume values.</p>
    */
  def apply(period: js.UndefOr[Double] = js.undefined, volumeSeriesID: js.UndefOr[String] = js.undefined): PlotOptionsVwapParams = {
    val periodOuter: js.UndefOr[Double] = period
    val volumeSeriesIDOuter: js.UndefOr[String] = volumeSeriesID
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsVwapParams {
      override val period: js.UndefOr[Double] = periodOuter
      override val volumeSeriesID: js.UndefOr[String] = volumeSeriesIDOuter
    })
  }
}
