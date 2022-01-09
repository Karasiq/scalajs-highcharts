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
  * @note JavaScript name: <code>plotOptions-ikh-params</code>
  */
class PlotOptionsIkhParams extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The base period for indicator calculations. This is the number of
    * data points which are taken into account for the indicator
    * calculations.</p>
    * @since 6.0.0
    */
  var period: js.UndefOr[Double] = js.undefined

  /**
    * <p>The base period for Senkou Span B calculations</p>
    * @since 6.0.0
    */
  var periodSenkouSpanB: js.UndefOr[Double] = js.undefined

  /**
    * <p>The base period for Tenkan calculations.</p>
    * @since 6.0.0
    */
  var periodTenkan: js.UndefOr[Double] = js.undefined
}

object PlotOptionsIkhParams {
  /**
    * @param period <p>The base period for indicator calculations. This is the number of. data points which are taken into account for the indicator. calculations.</p>
    * @param periodSenkouSpanB <p>The base period for Senkou Span B calculations</p>
    * @param periodTenkan <p>The base period for Tenkan calculations.</p>
    */
  def apply(period: js.UndefOr[Double] = js.undefined, periodSenkouSpanB: js.UndefOr[Double] = js.undefined, periodTenkan: js.UndefOr[Double] = js.undefined): PlotOptionsIkhParams = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsIkhParams {
      this.period = period
      this.periodSenkouSpanB = periodSenkouSpanB
      this.periodTenkan = periodTenkan
    })
  }
}
