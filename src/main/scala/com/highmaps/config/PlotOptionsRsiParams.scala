/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highmaps]]
  */
package com.highmaps.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>plotOptions-rsi-params</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsRsiParams extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The base period for indicator calculations. This is the number of
    * data points which are taken into account for the indicator
    * calculations.</p>
    * @since 6.0.0
    */
  val period: js.UndefOr[Double] = js.undefined

  /**
    * <p>Number of maximum decimals that are used in RSI calculations.</p>
    * @since 6.0.0
    */
  val decimals: js.UndefOr[Double] = js.undefined
}

object PlotOptionsRsiParams {
  /**
    * @param period <p>The base period for indicator calculations. This is the number of. data points which are taken into account for the indicator. calculations.</p>
    * @param decimals <p>Number of maximum decimals that are used in RSI calculations.</p>
    */
  def apply(period: js.UndefOr[Double] = js.undefined, decimals: js.UndefOr[Double] = js.undefined): PlotOptionsRsiParams = {
    val periodOuter: js.UndefOr[Double] = period
    val decimalsOuter: js.UndefOr[Double] = decimals
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsRsiParams {
      override val period: js.UndefOr[Double] = periodOuter
      override val decimals: js.UndefOr[Double] = decimalsOuter
    })
  }
}
