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
  * @note JavaScript name: <code>series&lt;mapline&gt;-animation</code>
  */
@js.annotation.ScalaJSDefined
class SeriesMaplineAnimation extends com.highcharts.HighchartsGenericObject {

  val duration: js.UndefOr[Double] = js.undefined
}

object SeriesMaplineAnimation {
  /**
    */
  def apply(duration: js.UndefOr[Double] = js.undefined): SeriesMaplineAnimation = {
    val durationOuter: js.UndefOr[Double] = duration
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesMaplineAnimation {
      override val duration: js.UndefOr[Double] = durationOuter
    })
  }
}