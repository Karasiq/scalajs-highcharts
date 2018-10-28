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
  * @note JavaScript name: <code>plotOptions-zigzag-params</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsZigzagParams extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The point index which indicator calculations will base - low
    * value.</p>
    * <p>For example using OHLC data, index=2 means the indicator will be
    * calculated using Low values.</p>
    * @since 6.0.0
    */
  val lowIndex: js.UndefOr[Double] = js.undefined

  /**
    * <p>The point index which indicator calculations will base - high
    * value.</p>
    * <p>For example using OHLC data, index=1 means the indicator will be
    * calculated using High values.</p>
    * @since 6.0.0
    */
  val highIndex: js.UndefOr[Double] = js.undefined

  /**
    * <p>The threshold for the value change.</p>
    * <p>For example deviation=1 means the indicator will ignore all price
    * movements less than 1%.</p>
    * @since 6.0.0
    */
  val deviation: js.UndefOr[Double] = js.undefined
}

object PlotOptionsZigzagParams {
  /**
    * @param lowIndex <p>The point index which indicator calculations will base - low. value.</p>. <p>For example using OHLC data, index=2 means the indicator will be. calculated using Low values.</p>
    * @param highIndex <p>The point index which indicator calculations will base - high. value.</p>. <p>For example using OHLC data, index=1 means the indicator will be. calculated using High values.</p>
    * @param deviation <p>The threshold for the value change.</p>. <p>For example deviation=1 means the indicator will ignore all price. movements less than 1%.</p>
    */
  def apply(lowIndex: js.UndefOr[Double] = js.undefined, highIndex: js.UndefOr[Double] = js.undefined, deviation: js.UndefOr[Double] = js.undefined): PlotOptionsZigzagParams = {
    val lowIndexOuter: js.UndefOr[Double] = lowIndex
    val highIndexOuter: js.UndefOr[Double] = highIndex
    val deviationOuter: js.UndefOr[Double] = deviation
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsZigzagParams {
      override val lowIndex: js.UndefOr[Double] = lowIndexOuter
      override val highIndex: js.UndefOr[Double] = highIndexOuter
      override val deviation: js.UndefOr[Double] = deviationOuter
    })
  }
}
