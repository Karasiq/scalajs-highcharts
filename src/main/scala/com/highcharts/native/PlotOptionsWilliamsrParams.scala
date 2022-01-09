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
  * @note JavaScript name: <code>plotOptions-williamsr-params</code>
  */
class PlotOptionsWilliamsrParams extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Period for Williams %R oscillator</p>
    * @since 7.0.0
    */
  var period: js.UndefOr[Double] = js.undefined
}

object PlotOptionsWilliamsrParams {
  /**
    * @param period <p>Period for Williams %R oscillator</p>
    */
  def apply(period: js.UndefOr[Double] = js.undefined): PlotOptionsWilliamsrParams = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsWilliamsrParams {
      this.period = period
    })
  }
}
