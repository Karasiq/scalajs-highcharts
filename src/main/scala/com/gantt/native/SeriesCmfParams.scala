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
  * @note JavaScript name: <code>series&lt;cmf&gt;-params</code>
  */
class SeriesCmfParams extends com.highcharts.HighchartsGenericObject {

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

object SeriesCmfParams {
  /**
    * @param volumeSeriesID <p>The id of another series to use its data as volume data for the. indiator calculation.</p>
    * @param period <p>The base period for indicator calculations. This is the number of. data points which are taken into account for the indicator. calculations.</p>
    */
  def apply(volumeSeriesID: js.UndefOr[String] = js.undefined, period: js.UndefOr[Double] = js.undefined): SeriesCmfParams = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesCmfParams {
      this.volumeSeriesID = volumeSeriesID
      this.period = period
    })
  }
}
