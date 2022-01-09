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
  * @note JavaScript name: <code>series&lt;obv&gt;-params</code>
  */
class SeriesObvParams extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The id of another series to use its data as volume data for the
    * indiator calculation.</p>
    * @since 6.0.0
    */
  var volumeSeriesID: js.UndefOr[String] = js.undefined
}

object SeriesObvParams {
  /**
    * @param volumeSeriesID <p>The id of another series to use its data as volume data for the. indiator calculation.</p>
    */
  def apply(volumeSeriesID: js.UndefOr[String] = js.undefined): SeriesObvParams = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesObvParams {
      this.volumeSeriesID = volumeSeriesID
    })
  }
}
