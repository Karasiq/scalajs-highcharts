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
  * @note JavaScript name: <code>series&lt;mfi&gt;-animation</code>
  */
@js.annotation.ScalaJSDefined
class SeriesMfiAnimation extends com.highcharts.HighchartsGenericObject {

  val duration: js.UndefOr[Double] = js.undefined
}

object SeriesMfiAnimation {
  /**
    */
  def apply(duration: js.UndefOr[Double] = js.undefined): SeriesMfiAnimation = {
    val durationOuter: js.UndefOr[Double] = duration
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesMfiAnimation {
      override val duration: js.UndefOr[Double] = durationOuter
    })
  }
}
