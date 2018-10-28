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
  * @note JavaScript name: <code>series&lt;vbp&gt;-params</code>
  */
@js.annotation.ScalaJSDefined
class SeriesVbpParams extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The number of price zones.</p>
    * @since 6.0.0
    */
  val ranges: js.UndefOr[Double] = js.undefined

  /**
    * <p>The id of volume series which is mandatory. For example using
    * OHLC data, volumeSeriesID=&#39;volume&#39; means the indicator will be
    * calculated using OHLC and volume values.</p>
    * @since 6.0.0
    */
  val volumeSeriesID: js.UndefOr[String] = js.undefined
}

object SeriesVbpParams {
  /**
    * @param ranges <p>The number of price zones.</p>
    * @param volumeSeriesID <p>The id of volume series which is mandatory. For example using. OHLC data, volumeSeriesID=&#39;volume&#39; means the indicator will be. calculated using OHLC and volume values.</p>
    */
  def apply(ranges: js.UndefOr[Double] = js.undefined, volumeSeriesID: js.UndefOr[String] = js.undefined): SeriesVbpParams = {
    val rangesOuter: js.UndefOr[Double] = ranges
    val volumeSeriesIDOuter: js.UndefOr[String] = volumeSeriesID
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesVbpParams {
      override val ranges: js.UndefOr[Double] = rangesOuter
      override val volumeSeriesID: js.UndefOr[String] = volumeSeriesIDOuter
    })
  }
}
