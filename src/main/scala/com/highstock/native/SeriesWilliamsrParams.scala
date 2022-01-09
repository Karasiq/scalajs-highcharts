/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highstock]]
  */
package com.highstock.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>series&lt;williamsr&gt;-params</code>
  */
class SeriesWilliamsrParams extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Period for Williams %R oscillator</p>
    * @since 7.0.0
    */
  var period: js.UndefOr[Double] = js.undefined
}

object SeriesWilliamsrParams {
  /**
    * @param period <p>Period for Williams %R oscillator</p>
    */
  def apply(period: js.UndefOr[Double] = js.undefined): SeriesWilliamsrParams = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesWilliamsrParams {
      this.period = period
    })
  }
}
