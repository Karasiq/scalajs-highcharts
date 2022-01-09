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
  * @note JavaScript name: <code>plotOptions-ad-params</code>
  */
class PlotOptionsAdParams extends com.highcharts.HighchartsGenericObject {

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

object PlotOptionsAdParams {
  /**
    * @param volumeSeriesID <p>The id of volume series which is mandatory.. For example using OHLC data, volumeSeriesID=&#39;volume&#39; means. the indicator will be calculated using OHLC and volume values.</p>
    * @param period <p>The base period for indicator calculations. This is the number of. data points which are taken into account for the indicator. calculations.</p>
    */
  def apply(volumeSeriesID: js.UndefOr[String] = js.undefined, period: js.UndefOr[Double] = js.undefined): PlotOptionsAdParams = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsAdParams {
      this.volumeSeriesID = volumeSeriesID
      this.period = period
    })
  }
}
