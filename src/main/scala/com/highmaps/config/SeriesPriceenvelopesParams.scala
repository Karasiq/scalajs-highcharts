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
  * @note JavaScript name: <code>series&lt;priceenvelopes&gt;-params</code>
  */
@js.annotation.ScalaJSDefined
class SeriesPriceenvelopesParams extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The base period for indicator calculations. This is the number of
    * data points which are taken into account for the indicator
    * calculations.</p>
    * @since 6.0.0
    */
  val period: js.UndefOr[Double] = js.undefined

  /**
    * <p>Percentage above the moving average that should be displayed.
    * 0.1 means 110%. Relative to the calculated value.</p>
    * @since 6.0.0
    */
  val topBand: js.UndefOr[Double] = js.undefined

  /**
    * <p>Percentage below the moving average that should be displayed.
    * 0.1 means 90%. Relative to the calculated value.</p>
    * @since 6.0.0
    */
  val bottomBand: js.UndefOr[Double] = js.undefined

  /**
    * <p>The point index which indicator calculations will base. For
    * example using OHLC data, index=2 means the indicator will be
    * calculated using Low values.</p>
    * @since 6.0.0
    */
  val index: js.UndefOr[Double] = js.undefined
}

object SeriesPriceenvelopesParams {
  /**
    * @param period <p>The base period for indicator calculations. This is the number of. data points which are taken into account for the indicator. calculations.</p>
    * @param topBand <p>Percentage above the moving average that should be displayed.. 0.1 means 110%. Relative to the calculated value.</p>
    * @param bottomBand <p>Percentage below the moving average that should be displayed.. 0.1 means 90%. Relative to the calculated value.</p>
    * @param index <p>The point index which indicator calculations will base. For. example using OHLC data, index=2 means the indicator will be. calculated using Low values.</p>
    */
  def apply(period: js.UndefOr[Double] = js.undefined, topBand: js.UndefOr[Double] = js.undefined, bottomBand: js.UndefOr[Double] = js.undefined, index: js.UndefOr[Double] = js.undefined): SeriesPriceenvelopesParams = {
    val periodOuter: js.UndefOr[Double] = period
    val topBandOuter: js.UndefOr[Double] = topBand
    val bottomBandOuter: js.UndefOr[Double] = bottomBand
    val indexOuter: js.UndefOr[Double] = index
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesPriceenvelopesParams {
      override val period: js.UndefOr[Double] = periodOuter
      override val topBand: js.UndefOr[Double] = topBandOuter
      override val bottomBand: js.UndefOr[Double] = bottomBandOuter
      override val index: js.UndefOr[Double] = indexOuter
    })
  }
}
