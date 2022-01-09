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
  * @note JavaScript name: <code>series&lt;aroon&gt;-params</code>
  */
class SeriesAroonParams extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The base period for indicator calculations. This is the number of
    * data points which are taken into account for the indicator
    * calculations.</p>
    * @since 6.0.0
    */
  var period: js.UndefOr[Double] = js.undefined
}

object SeriesAroonParams {
  /**
    * @param period <p>The base period for indicator calculations. This is the number of. data points which are taken into account for the indicator. calculations.</p>
    */
  def apply(period: js.UndefOr[Double] = js.undefined): SeriesAroonParams = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesAroonParams {
      this.period = period
    })
  }
}
