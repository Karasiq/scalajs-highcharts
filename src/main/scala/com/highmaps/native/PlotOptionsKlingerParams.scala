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
  * @note JavaScript name: <code>plotOptions-klinger-params</code>
  */
class PlotOptionsKlingerParams extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The fast period for indicator calculations.</p>
    * @since 9.1.0
    */
  var fastAvgPeriod: js.UndefOr[Double] = js.undefined

  /**
    * <p>The base period for signal calculations.</p>
    * @since 9.1.0
    */
  var signalPeriod: js.UndefOr[Double] = js.undefined

  /**
    * <p>The slow period for indicator calculations.</p>
    * @since 9.1.0
    */
  var slowAvgPeriod: js.UndefOr[Double] = js.undefined

  /**
    * <p>The id of another series to use its data as volume data for the
    * indiator calculation.</p>
    * @since 9.1.0
    */
  var volumeSeriesID: js.UndefOr[String] = js.undefined
}

object PlotOptionsKlingerParams {
  /**
    * @param fastAvgPeriod <p>The fast period for indicator calculations.</p>
    * @param signalPeriod <p>The base period for signal calculations.</p>
    * @param slowAvgPeriod <p>The slow period for indicator calculations.</p>
    * @param volumeSeriesID <p>The id of another series to use its data as volume data for the. indiator calculation.</p>
    */
  def apply(fastAvgPeriod: js.UndefOr[Double] = js.undefined, signalPeriod: js.UndefOr[Double] = js.undefined, slowAvgPeriod: js.UndefOr[Double] = js.undefined, volumeSeriesID: js.UndefOr[String] = js.undefined): PlotOptionsKlingerParams = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsKlingerParams {
      this.fastAvgPeriod = fastAvgPeriod
      this.signalPeriod = signalPeriod
      this.slowAvgPeriod = slowAvgPeriod
      this.volumeSeriesID = volumeSeriesID
    })
  }
}
