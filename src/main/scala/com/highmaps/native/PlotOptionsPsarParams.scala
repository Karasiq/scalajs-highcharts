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
  * @note JavaScript name: <code>plotOptions-psar-params</code>
  */
class PlotOptionsPsarParams extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Number of maximum decimals that are used in PSAR calculations.</p>
    * @since 6.0.0
    */
  var decimals: js.UndefOr[Double] = js.undefined

  /**
    * <p>Acceleration factor increases by increment each time
    * the extreme point makes a new high.</p>
    * @since 6.0.0
    */
  var increment: js.UndefOr[Double] = js.undefined

  /**
    * <p>Index from which PSAR is starting calculation</p>
    * @since 6.0.0
    */
  var index: js.UndefOr[Double] = js.undefined

  /**
    * <p>The initial value for acceleration factor.
    * Acceleration factor is starting with this value
    * and increases by specified increment each time
    * the extreme point makes a new high.
    * AF can reach a maximum of maxAccelerationFactor,
    * no matter how long the uptrend extends.</p>
    * @since 6.0.0
    */
  var initialAccelerationFactor: js.UndefOr[Double] = js.undefined

  /**
    * <p>The Maximum value for acceleration factor.
    * AF can reach a maximum of maxAccelerationFactor,
    * no matter how long the uptrend extends.</p>
    * @since 6.0.0
    */
  var maxAccelerationFactor: js.UndefOr[Double] = js.undefined
}

object PlotOptionsPsarParams {
  /**
    * @param decimals <p>Number of maximum decimals that are used in PSAR calculations.</p>
    * @param increment <p>Acceleration factor increases by increment each time. the extreme point makes a new high.</p>
    * @param index <p>Index from which PSAR is starting calculation</p>
    * @param initialAccelerationFactor <p>The initial value for acceleration factor.. Acceleration factor is starting with this value. and increases by specified increment each time. the extreme point makes a new high.. AF can reach a maximum of maxAccelerationFactor,. no matter how long the uptrend extends.</p>
    * @param maxAccelerationFactor <p>The Maximum value for acceleration factor.. AF can reach a maximum of maxAccelerationFactor,. no matter how long the uptrend extends.</p>
    */
  def apply(decimals: js.UndefOr[Double] = js.undefined, increment: js.UndefOr[Double] = js.undefined, index: js.UndefOr[Double] = js.undefined, initialAccelerationFactor: js.UndefOr[Double] = js.undefined, maxAccelerationFactor: js.UndefOr[Double] = js.undefined): PlotOptionsPsarParams = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsPsarParams {
      this.decimals = decimals
      this.increment = increment
      this.index = index
      this.initialAccelerationFactor = initialAccelerationFactor
      this.maxAccelerationFactor = maxAccelerationFactor
    })
  }
}
