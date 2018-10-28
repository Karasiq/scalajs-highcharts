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
  * @note JavaScript name: <code>plotOptions-bb-params</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsBbParams extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The base period for indicator calculations. This is the number of
    * data points which are taken into account for the indicator
    * calculations.</p>
    * @since 6.0.0
    */
  val period: js.UndefOr[Double] = js.undefined

  /**
    * <p>Standard deviation for top and bottom bands.</p>
    * @since 6.0.0
    */
  val standardDeviation: js.UndefOr[Double] = js.undefined

  /**
    * <p>The point index which indicator calculations will base. For
    * example using OHLC data, index=2 means the indicator will be
    * calculated using Low values.</p>
    * @since 6.0.0
    */
  val index: js.UndefOr[Double] = js.undefined
}

object PlotOptionsBbParams {
  /**
    * @param period <p>The base period for indicator calculations. This is the number of. data points which are taken into account for the indicator. calculations.</p>
    * @param standardDeviation <p>Standard deviation for top and bottom bands.</p>
    * @param index <p>The point index which indicator calculations will base. For. example using OHLC data, index=2 means the indicator will be. calculated using Low values.</p>
    */
  def apply(period: js.UndefOr[Double] = js.undefined, standardDeviation: js.UndefOr[Double] = js.undefined, index: js.UndefOr[Double] = js.undefined): PlotOptionsBbParams = {
    val periodOuter: js.UndefOr[Double] = period
    val standardDeviationOuter: js.UndefOr[Double] = standardDeviation
    val indexOuter: js.UndefOr[Double] = index
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsBbParams {
      override val period: js.UndefOr[Double] = periodOuter
      override val standardDeviation: js.UndefOr[Double] = standardDeviationOuter
      override val index: js.UndefOr[Double] = indexOuter
    })
  }
}
