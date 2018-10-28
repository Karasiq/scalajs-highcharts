/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highmaps]]
  */
package com.highmaps.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>plotOptions-pivotpoints-params</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsPivotpointsParams extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The base period for indicator calculations. This is the number of
    * data points which are taken into account for the indicator
    * calculations.</p>
    * @since 6.0.0
    */
  val period: js.UndefOr[Double] = js.undefined

  /**
    * <p>Algorithm used to calculate ressistance and support lines based
    * on pivot points. Implemented algorithms: <code>&#39;standard&#39;</code>,
    * <code>&#39;fibonacci&#39;</code> and <code>&#39;camarilla&#39;</code></p>
    * @since 6.0.0
    */
  val algorithm: js.UndefOr[String] = js.undefined
}

object PlotOptionsPivotpointsParams {
  /**
    * @param period <p>The base period for indicator calculations. This is the number of. data points which are taken into account for the indicator. calculations.</p>
    * @param algorithm <p>Algorithm used to calculate ressistance and support lines based. on pivot points. Implemented algorithms: <code>&#39;standard&#39;</code>,. <code>&#39;fibonacci&#39;</code> and <code>&#39;camarilla&#39;</code></p>
    */
  def apply(period: js.UndefOr[Double] = js.undefined, algorithm: js.UndefOr[String] = js.undefined): PlotOptionsPivotpointsParams = {
    val periodOuter: js.UndefOr[Double] = period
    val algorithmOuter: js.UndefOr[String] = algorithm
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsPivotpointsParams {
      override val period: js.UndefOr[Double] = periodOuter
      override val algorithm: js.UndefOr[String] = algorithmOuter
    })
  }
}
