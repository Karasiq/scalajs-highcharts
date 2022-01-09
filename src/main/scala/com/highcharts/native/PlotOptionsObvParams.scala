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
  * @note JavaScript name: <code>plotOptions-obv-params</code>
  */
class PlotOptionsObvParams extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The id of another series to use its data as volume data for the
    * indiator calculation.</p>
    * @since 6.0.0
    */
  var volumeSeriesID: js.UndefOr[String] = js.undefined
}

object PlotOptionsObvParams {
  /**
    * @param volumeSeriesID <p>The id of another series to use its data as volume data for the. indiator calculation.</p>
    */
  def apply(volumeSeriesID: js.UndefOr[String] = js.undefined): PlotOptionsObvParams = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsObvParams {
      this.volumeSeriesID = volumeSeriesID
    })
  }
}
