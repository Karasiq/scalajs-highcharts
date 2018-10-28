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
  * @note JavaScript name: <code>series&lt;psar&gt;-params</code>
  */
@js.annotation.ScalaJSDefined
class SeriesPsarParams extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The initial value for acceleration factor.
    * Acceleration factor is starting with this value
    * and increases by specified increment each time
    * the extreme point makes a new high.
    * AF can reach a maximum of maxAccelerationFactor,
    * no matter how long the uptrend extends.</p>
    * @since 6.0.0
    */
  val initialAccelerationFactor: js.UndefOr[Double] = js.undefined

  /**
    * <p>The Maximum value for acceleration factor.
    * AF can reach a maximum of maxAccelerationFactor,
    * no matter how long the uptrend extends.</p>
    * @since 6.0.0
    */
  val maxAccelerationFactor: js.UndefOr[Double] = js.undefined

  /**
    * <p>Acceleration factor increases by increment each time
    * the extreme point makes a new high.</p>
    * @since 6.0.0
    */
  val increment: js.UndefOr[Double] = js.undefined

  /**
    * <p>Index from which PSAR is starting calculation</p>
    * @since 6.0.0
    */
  val index: js.UndefOr[Double] = js.undefined

  /**
    * <p>Number of maximum decimals that are used in PSAR calculations.</p>
    * @since 6.0.0
    */
  val decimals: js.UndefOr[Double] = js.undefined
}

object SeriesPsarParams {
  /**
    * @param initialAccelerationFactor <p>The initial value for acceleration factor.. Acceleration factor is starting with this value. and increases by specified increment each time. the extreme point makes a new high.. AF can reach a maximum of maxAccelerationFactor,. no matter how long the uptrend extends.</p>
    * @param maxAccelerationFactor <p>The Maximum value for acceleration factor.. AF can reach a maximum of maxAccelerationFactor,. no matter how long the uptrend extends.</p>
    * @param increment <p>Acceleration factor increases by increment each time. the extreme point makes a new high.</p>
    * @param index <p>Index from which PSAR is starting calculation</p>
    * @param decimals <p>Number of maximum decimals that are used in PSAR calculations.</p>
    */
  def apply(initialAccelerationFactor: js.UndefOr[Double] = js.undefined, maxAccelerationFactor: js.UndefOr[Double] = js.undefined, increment: js.UndefOr[Double] = js.undefined, index: js.UndefOr[Double] = js.undefined, decimals: js.UndefOr[Double] = js.undefined): SeriesPsarParams = {
    val initialAccelerationFactorOuter: js.UndefOr[Double] = initialAccelerationFactor
    val maxAccelerationFactorOuter: js.UndefOr[Double] = maxAccelerationFactor
    val incrementOuter: js.UndefOr[Double] = increment
    val indexOuter: js.UndefOr[Double] = index
    val decimalsOuter: js.UndefOr[Double] = decimals
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesPsarParams {
      override val initialAccelerationFactor: js.UndefOr[Double] = initialAccelerationFactorOuter
      override val maxAccelerationFactor: js.UndefOr[Double] = maxAccelerationFactorOuter
      override val increment: js.UndefOr[Double] = incrementOuter
      override val index: js.UndefOr[Double] = indexOuter
      override val decimals: js.UndefOr[Double] = decimalsOuter
    })
  }
}
