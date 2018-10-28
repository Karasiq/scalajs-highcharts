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
  * @note JavaScript name: <code>series&lt;vbp&gt;-animation</code>
  */
@js.annotation.ScalaJSDefined
class SeriesVbpAnimation extends com.highcharts.HighchartsGenericObject {

  val duration: js.UndefOr[Double] = js.undefined
}

object SeriesVbpAnimation {
  /**
    */
  def apply(duration: js.UndefOr[Double] = js.undefined): SeriesVbpAnimation = {
    val durationOuter: js.UndefOr[Double] = duration
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesVbpAnimation {
      override val duration: js.UndefOr[Double] = durationOuter
    })
  }
}
