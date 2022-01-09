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
  * @note JavaScript name: <code>plotOptions-pivotpoints-params</code>
  */
class PlotOptionsPivotpointsParams extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Algorithm used to calculate ressistance and support lines based
    * on pivot points. Implemented algorithms: <code>&#39;standard&#39;</code>,
    * <code>&#39;fibonacci&#39;</code> and <code>&#39;camarilla&#39;</code></p>
    * @since 6.0.0
    */
  var algorithm: js.UndefOr[String] = js.undefined

  /**
    * <p>The base period for indicator calculations. This is the number of
    * data points which are taken into account for the indicator
    * calculations.</p>
    * @since 6.0.0
    */
  var period: js.UndefOr[Double] = js.undefined
}

object PlotOptionsPivotpointsParams {
  /**
    * @param algorithm <p>Algorithm used to calculate ressistance and support lines based. on pivot points. Implemented algorithms: <code>&#39;standard&#39;</code>,. <code>&#39;fibonacci&#39;</code> and <code>&#39;camarilla&#39;</code></p>
    * @param period <p>The base period for indicator calculations. This is the number of. data points which are taken into account for the indicator. calculations.</p>
    */
  def apply(algorithm: js.UndefOr[String] = js.undefined, period: js.UndefOr[Double] = js.undefined): PlotOptionsPivotpointsParams = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsPivotpointsParams {
      this.algorithm = algorithm
      this.period = period
    })
  }
}