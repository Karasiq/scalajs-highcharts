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
  * @note JavaScript name: <code>plotOptions-cmf-params</code>
  */
class PlotOptionsCmfParams extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The id of another series to use its data as volume data for the
    * indiator calculation.</p>
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

object PlotOptionsCmfParams {
  /**
    * @param volumeSeriesID <p>The id of another series to use its data as volume data for the. indiator calculation.</p>
    * @param period <p>The base period for indicator calculations. This is the number of. data points which are taken into account for the indicator. calculations.</p>
    */
  def apply(volumeSeriesID: js.UndefOr[String] = js.undefined, period: js.UndefOr[Double] = js.undefined): PlotOptionsCmfParams = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsCmfParams {
      this.volumeSeriesID = volumeSeriesID
      this.period = period
    })
  }
}
