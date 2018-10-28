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
  * @note JavaScript name: <code>series&lt;solidgauge&gt;-animation</code>
  */
@js.annotation.ScalaJSDefined
class SeriesSolidgaugeAnimation extends com.highcharts.HighchartsGenericObject {

  val duration: js.UndefOr[Double] = js.undefined
}

object SeriesSolidgaugeAnimation {
  /**
    */
  def apply(duration: js.UndefOr[Double] = js.undefined): SeriesSolidgaugeAnimation = {
    val durationOuter: js.UndefOr[Double] = duration
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesSolidgaugeAnimation {
      override val duration: js.UndefOr[Double] = durationOuter
    })
  }
}
