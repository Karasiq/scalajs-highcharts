/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highstock]]
  */
package com.highstock.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>plotOptions-mfi-params</code>
  */
class PlotOptionsMfiParams extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Number of maximum decimals that are used in MFI calculations.</p>
    * @since 6.0.0
    */
  var decimals: js.UndefOr[Double] = js.undefined

  /**
    * <p>The id of volume series which is mandatory.
    * For example using OHLC data, volumeSeriesID=&#39;volume&#39; means
    * the indicator will be calculated using OHLC and volume values.</p>
    * @since 6.0.0
    */
  var volumeSeriesID: js.UndefOr[String] = js.undefined

  /**
    * <p>The base period for indicator calculations. This is the number of
    * data points which are taken into account for the indicator
    * calculations.</p>
    * @since 6.0.0
    */
  var period: js.UndefOr[Double] = js.undefined
}

object PlotOptionsMfiParams {
  /**
    * @param decimals <p>Number of maximum decimals that are used in MFI calculations.</p>
    * @param volumeSeriesID <p>The id of volume series which is mandatory.. For example using OHLC data, volumeSeriesID=&#39;volume&#39; means. the indicator will be calculated using OHLC and volume values.</p>
    * @param period <p>The base period for indicator calculations. This is the number of. data points which are taken into account for the indicator. calculations.</p>
    */
  def apply(decimals: js.UndefOr[Double] = js.undefined, volumeSeriesID: js.UndefOr[String] = js.undefined, period: js.UndefOr[Double] = js.undefined): PlotOptionsMfiParams = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsMfiParams {
      this.decimals = decimals
      this.volumeSeriesID = volumeSeriesID
      this.period = period
    })
  }
}
