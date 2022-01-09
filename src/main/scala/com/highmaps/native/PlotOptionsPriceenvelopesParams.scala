/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highmaps]]
  */
package com.highmaps.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>plotOptions-priceenvelopes-params</code>
  */
class PlotOptionsPriceenvelopesParams extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Percentage below the moving average that should be displayed.
    * 0.1 means 90%. Relative to the calculated value.</p>
    * @since 6.0.0
    */
  var bottomBand: js.UndefOr[Double] = js.undefined

  /**
    * <p>The base period for indicator calculations. This is the number of
    * data points which are taken into account for the indicator
    * calculations.</p>
    * @since 6.0.0
    */
  var period: js.UndefOr[Double] = js.undefined

  /**
    * <p>Percentage above the moving average that should be displayed.
    * 0.1 means 110%. Relative to the calculated value.</p>
    * @since 6.0.0
    */
  var topBand: js.UndefOr[Double] = js.undefined

  /**
    * <p>The point index which indicator calculations will base. For
    * example using OHLC data, index=2 means the indicator will be
    * calculated using Low values.</p>
    * @since 6.0.0
    */
  var index: js.UndefOr[Double] = js.undefined
}

object PlotOptionsPriceenvelopesParams {
  /**
    * @param bottomBand <p>Percentage below the moving average that should be displayed.. 0.1 means 90%. Relative to the calculated value.</p>
    * @param period <p>The base period for indicator calculations. This is the number of. data points which are taken into account for the indicator. calculations.</p>
    * @param topBand <p>Percentage above the moving average that should be displayed.. 0.1 means 110%. Relative to the calculated value.</p>
    * @param index <p>The point index which indicator calculations will base. For. example using OHLC data, index=2 means the indicator will be. calculated using Low values.</p>
    */
  def apply(bottomBand: js.UndefOr[Double] = js.undefined, period: js.UndefOr[Double] = js.undefined, topBand: js.UndefOr[Double] = js.undefined, index: js.UndefOr[Double] = js.undefined): PlotOptionsPriceenvelopesParams = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsPriceenvelopesParams {
      this.bottomBand = bottomBand
      this.period = period
      this.topBand = topBand
      this.index = index
    })
  }
}
