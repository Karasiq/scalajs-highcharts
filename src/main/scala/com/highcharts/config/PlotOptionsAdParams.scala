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
  * @note JavaScript name: <code>plotOptions-ad-params</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsAdParams extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The id of volume series which is mandatory.
    * For example using OHLC data, volumeSeriesID=&#39;volume&#39; means
    * the indicator will be calculated using OHLC and volume values.</p>
    * @since 6.0.0
    */
  val volumeSeriesID: js.UndefOr[String] = js.undefined

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

object PlotOptionsAdParams {
  /**
    * @param volumeSeriesID <p>The id of volume series which is mandatory.. For example using OHLC data, volumeSeriesID=&#39;volume&#39; means. the indicator will be calculated using OHLC and volume values.</p>
    * @param index <p>The point index which indicator calculations will base. For. example using OHLC data, index=2 means the indicator will be. calculated using Low values.</p>
    * @param period <p>The base period for indicator calculations. This is the number of. data points which are taken into account for the indicator. calculations.</p>
    */
  def apply(volumeSeriesID: js.UndefOr[String] = js.undefined, index: js.UndefOr[Double] = js.undefined, period: js.UndefOr[Double] = js.undefined): PlotOptionsAdParams = {
    val volumeSeriesIDOuter: js.UndefOr[String] = volumeSeriesID
    val indexOuter: js.UndefOr[Double] = index
    val periodOuter: js.UndefOr[Double] = period
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsAdParams {
      override val volumeSeriesID: js.UndefOr[String] = volumeSeriesIDOuter
      override val index: js.UndefOr[Double] = indexOuter
      override val period: js.UndefOr[Double] = periodOuter
    })
  }
}
