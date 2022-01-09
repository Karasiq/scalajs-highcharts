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
  * @note JavaScript name: <code>plotOptions-zigzag-params</code>
  */
class PlotOptionsZigzagParams extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The threshold for the value change.</p>
    * <p>For example deviation=1 means the indicator will ignore all price
    * movements less than 1%.</p>
    * @since 6.0.0
    */
  var deviation: js.UndefOr[Double] = js.undefined

  /**
    * <p>The point index which indicator calculations will base - high
    * value.</p>
    * <p>For example using OHLC data, index=1 means the indicator will be
    * calculated using High values.</p>
    * @since 6.0.0
    */
  var highIndex: js.UndefOr[Double] = js.undefined

  /**
    * <p>The point index which indicator calculations will base - low
    * value.</p>
    * <p>For example using OHLC data, index=2 means the indicator will be
    * calculated using Low values.</p>
    * @since 6.0.0
    */
  var lowIndex: js.UndefOr[Double] = js.undefined
}

object PlotOptionsZigzagParams {
  /**
    * @param deviation <p>The threshold for the value change.</p>. <p>For example deviation=1 means the indicator will ignore all price. movements less than 1%.</p>
    * @param highIndex <p>The point index which indicator calculations will base - high. value.</p>. <p>For example using OHLC data, index=1 means the indicator will be. calculated using High values.</p>
    * @param lowIndex <p>The point index which indicator calculations will base - low. value.</p>. <p>For example using OHLC data, index=2 means the indicator will be. calculated using Low values.</p>
    */
  def apply(deviation: js.UndefOr[Double] = js.undefined, highIndex: js.UndefOr[Double] = js.undefined, lowIndex: js.UndefOr[Double] = js.undefined): PlotOptionsZigzagParams = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsZigzagParams {
      this.deviation = deviation
      this.highIndex = highIndex
      this.lowIndex = lowIndex
    })
  }
}
