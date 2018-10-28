/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highcharts]]
  */
package com.highcharts.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>drilldown-animation</code>
  */
@js.annotation.ScalaJSDefined
class DrilldownAnimation extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Duration for the drilldown animation.</p>
    * @since 3.0.8
    */
  val duration: js.UndefOr[Double | String] = js.undefined
}

object DrilldownAnimation {
  /**
    * @param duration <p>Duration for the drilldown animation.</p>
    */
  def apply(duration: js.UndefOr[Double | String] = js.undefined): DrilldownAnimation = {
    val durationOuter: js.UndefOr[Double | String] = duration
    com.highcharts.HighchartsGenericObject.toCleanObject(new DrilldownAnimation {
      override val duration: js.UndefOr[Double | String] = durationOuter
    })
  }
}
