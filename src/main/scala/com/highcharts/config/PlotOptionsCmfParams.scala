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
  * @note JavaScript name: <code>plotOptions-cmf-params</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsCmfParams extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The base period for indicator calculations. This is the number of
    * data points which are taken into account for the indicator
    * calculations.</p>
    * @since 6.0.0
    */
  val period: js.UndefOr[Double] = js.undefined

  /**
    * <p>The id of another series to use its data as volume data for the
    * indiator calculation.</p>
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
}

object PlotOptionsCmfParams {
  /**
    * @param period <p>The base period for indicator calculations. This is the number of. data points which are taken into account for the indicator. calculations.</p>
    * @param volumeSeriesID <p>The id of another series to use its data as volume data for the. indiator calculation.</p>
    * @param index <p>The point index which indicator calculations will base. For. example using OHLC data, index=2 means the indicator will be. calculated using Low values.</p>
    */
  def apply(period: js.UndefOr[Double] = js.undefined, volumeSeriesID: js.UndefOr[String] = js.undefined, index: js.UndefOr[Double] = js.undefined): PlotOptionsCmfParams = {
    val periodOuter: js.UndefOr[Double] = period
    val volumeSeriesIDOuter: js.UndefOr[String] = volumeSeriesID
    val indexOuter: js.UndefOr[Double] = index
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsCmfParams {
      override val period: js.UndefOr[Double] = periodOuter
      override val volumeSeriesID: js.UndefOr[String] = volumeSeriesIDOuter
      override val index: js.UndefOr[Double] = indexOuter
    })
  }
}
