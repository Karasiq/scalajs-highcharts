/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highcharts]]
  */
package com.highcharts.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>series&lt;vbp&gt;-params</code>
  */
class SeriesVbpParams extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The number of price zones.</p>
    * @since 6.0.0
    */
  var ranges: js.UndefOr[Double] = js.undefined

  /**
    * <p>The id of volume series which is mandatory. For example using
    * OHLC data, volumeSeriesID=&#39;volume&#39; means the indicator will be
    * calculated using OHLC and volume values.</p>
    * @since 6.0.0
    */
  var volumeSeriesID: js.UndefOr[String] = js.undefined
}

object SeriesVbpParams {
  /**
    * @param ranges <p>The number of price zones.</p>
    * @param volumeSeriesID <p>The id of volume series which is mandatory. For example using. OHLC data, volumeSeriesID=&#39;volume&#39; means the indicator will be. calculated using OHLC and volume values.</p>
    */
  def apply(ranges: js.UndefOr[Double] = js.undefined, volumeSeriesID: js.UndefOr[String] = js.undefined): SeriesVbpParams = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesVbpParams {
      this.ranges = ranges
      this.volumeSeriesID = volumeSeriesID
    })
  }
}
