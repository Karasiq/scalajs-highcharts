/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/gantt]]
  */
package com.gantt.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>plotOptions-chaikin-params</code>
  */
class PlotOptionsChaikinParams extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Parameter used indirectly for calculating the <code>AD</code> indicator.
    * Decides about the number of data points that are taken
    * into account for the indicator calculations.</p>
    * @since 7.0.0
    */
  var period: js.UndefOr[Double] = js.undefined

  /**
    * <p>Periods for Chaikin Oscillator calculations.</p>
    * @since 7.0.0
    */
  var periods: js.UndefOr[js.Array[Double]] = js.undefined

  /**
    * <p>The id of volume series which is mandatory.
    * For example using OHLC data, volumeSeriesID=&#39;volume&#39; means
    * the indicator will be calculated using OHLC and volume values.</p>
    * @since 7.0.0
    */
  var volumeSeriesID: js.UndefOr[String] = js.undefined
}

object PlotOptionsChaikinParams {
  /**
    * @param period <p>Parameter used indirectly for calculating the <code>AD</code> indicator.. Decides about the number of data points that are taken. into account for the indicator calculations.</p>
    * @param periods <p>Periods for Chaikin Oscillator calculations.</p>
    * @param volumeSeriesID <p>The id of volume series which is mandatory.. For example using OHLC data, volumeSeriesID=&#39;volume&#39; means. the indicator will be calculated using OHLC and volume values.</p>
    */
  def apply(period: js.UndefOr[Double] = js.undefined, periods: js.UndefOr[js.Array[Double]] = js.undefined, volumeSeriesID: js.UndefOr[String] = js.undefined): PlotOptionsChaikinParams = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsChaikinParams {
      this.period = period
      this.periods = periods
      this.volumeSeriesID = volumeSeriesID
    })
  }
}