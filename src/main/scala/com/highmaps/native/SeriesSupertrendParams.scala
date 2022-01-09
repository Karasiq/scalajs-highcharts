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
  * @note JavaScript name: <code>series&lt;supertrend&gt;-params</code>
  */
class SeriesSupertrendParams extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Multiplier for Supertrend Indicator.</p>
    * @since 7.0.0
    */
  var multiplier: js.UndefOr[Double] = js.undefined

  /**
    * <p>The base period for indicator Supertrend Indicator calculations.
    * This is the number of data points which are taken into account
    * for the indicator calculations.</p>
    * @since 7.0.0
    */
  var period: js.UndefOr[Double] = js.undefined
}

object SeriesSupertrendParams {
  /**
    * @param multiplier <p>Multiplier for Supertrend Indicator.</p>
    * @param period <p>The base period for indicator Supertrend Indicator calculations.. This is the number of data points which are taken into account. for the indicator calculations.</p>
    */
  def apply(multiplier: js.UndefOr[Double] = js.undefined, period: js.UndefOr[Double] = js.undefined): SeriesSupertrendParams = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesSupertrendParams {
      this.multiplier = multiplier
      this.period = period
    })
  }
}
