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
  * @note JavaScript name: <code>series&lt;rsi&gt;-params</code>
  */
@js.annotation.ScalaJSDefined
class SeriesRsiParams extends com.highcharts.HighchartsGenericObject {

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

object SeriesRsiParams {
  /**
    * @param period <p>The base period for indicator calculations. This is the number of. data points which are taken into account for the indicator. calculations.</p>
    * @param decimals <p>Number of maximum decimals that are used in RSI calculations.</p>
    */
  def apply(period: js.UndefOr[Double] = js.undefined, decimals: js.UndefOr[Double] = js.undefined): SeriesRsiParams = {
    val periodOuter: js.UndefOr[Double] = period
    val decimalsOuter: js.UndefOr[Double] = decimals
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesRsiParams {
      override val period: js.UndefOr[Double] = periodOuter
      override val decimals: js.UndefOr[Double] = decimalsOuter
    })
  }
}
