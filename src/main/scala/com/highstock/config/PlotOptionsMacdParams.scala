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
  * @note JavaScript name: <code>plotOptions-macd-params</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsMacdParams extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The short period for indicator calculations.</p>
    * @since 6.0.0
    */
  val shortPeriod: js.UndefOr[Double] = js.undefined

  /**
    * <p>The long period for indicator calculations.</p>
    * @since 6.0.0
    */
  val longPeriod: js.UndefOr[Double] = js.undefined

  /**
    * <p>The base period for signal calculations.</p>
    * @since 6.0.0
    */
  val signalPeriod: js.UndefOr[Double] = js.undefined

  /**
    * <p>The base period for indicator calculations. This is the number of
    * data points which are taken into account for the indicator
    * calculations.</p>
    * @since 6.0.0
    */
  val period: js.UndefOr[Double] = js.undefined

  /**
    * <p>The point index which indicator calculations will base. For
    * example using OHLC data, index=2 means the indicator will be
    * calculated using Low values.</p>
    * @since 6.0.0
    */
  val index: js.UndefOr[Double] = js.undefined
}

object PlotOptionsMacdParams {
  /**
    * @param shortPeriod <p>The short period for indicator calculations.</p>
    * @param longPeriod <p>The long period for indicator calculations.</p>
    * @param signalPeriod <p>The base period for signal calculations.</p>
    * @param period <p>The base period for indicator calculations. This is the number of. data points which are taken into account for the indicator. calculations.</p>
    * @param index <p>The point index which indicator calculations will base. For. example using OHLC data, index=2 means the indicator will be. calculated using Low values.</p>
    */
  def apply(shortPeriod: js.UndefOr[Double] = js.undefined, longPeriod: js.UndefOr[Double] = js.undefined, signalPeriod: js.UndefOr[Double] = js.undefined, period: js.UndefOr[Double] = js.undefined, index: js.UndefOr[Double] = js.undefined): PlotOptionsMacdParams = {
    val shortPeriodOuter: js.UndefOr[Double] = shortPeriod
    val longPeriodOuter: js.UndefOr[Double] = longPeriod
    val signalPeriodOuter: js.UndefOr[Double] = signalPeriod
    val periodOuter: js.UndefOr[Double] = period
    val indexOuter: js.UndefOr[Double] = index
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsMacdParams {
      override val shortPeriod: js.UndefOr[Double] = shortPeriodOuter
      override val longPeriod: js.UndefOr[Double] = longPeriodOuter
      override val signalPeriod: js.UndefOr[Double] = signalPeriodOuter
      override val period: js.UndefOr[Double] = periodOuter
      override val index: js.UndefOr[Double] = indexOuter
    })
  }
}
