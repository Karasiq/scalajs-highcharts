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
  * @note JavaScript name: <code>plotOptions-disparityindex-params</code>
  */
class PlotOptionsDisparityindexParams extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The average used to calculate the Disparity Index indicator.
    * By default it uses SMA, with EMA as an option. To use other
    * averages, e.g. TEMA, the <code>stock/indicators/tema.js</code> file needs to
    * be loaded.</p>
    * <p>If value is different than <code>ema</code>, <code>dema</code>, <code>tema</code> or <code>wma</code>,
    * then sma is used.</p>
    * @since 6.0.0
    */
  var average: js.UndefOr[String] = js.undefined

  /**
    * <p>The point index which indicator calculations will base. For
    * example using OHLC data, index=2 means the indicator will be
    * calculated using Low values.</p>
    * @since 6.0.0
    */
  var index: js.UndefOr[Double] = js.undefined

  /**
    * <p>The base period for indicator calculations. This is the number of
    * data points which are taken into account for the indicator
    * calculations.</p>
    * @since 6.0.0
    */
  var period: js.UndefOr[Double] = js.undefined
}

object PlotOptionsDisparityindexParams {
  /**
    * @param average <p>The average used to calculate the Disparity Index indicator.. By default it uses SMA, with EMA as an option. To use other. averages, e.g. TEMA, the <code>stock/indicators/tema.js</code> file needs to. be loaded.</p>. <p>If value is different than <code>ema</code>, <code>dema</code>, <code>tema</code> or <code>wma</code>,. then sma is used.</p>
    * @param index <p>The point index which indicator calculations will base. For. example using OHLC data, index=2 means the indicator will be. calculated using Low values.</p>
    * @param period <p>The base period for indicator calculations. This is the number of. data points which are taken into account for the indicator. calculations.</p>
    */
  def apply(average: js.UndefOr[String] = js.undefined, index: js.UndefOr[Double] = js.undefined, period: js.UndefOr[Double] = js.undefined): PlotOptionsDisparityindexParams = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsDisparityindexParams {
      this.average = average
      this.index = index
      this.period = period
    })
  }
}