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
  * @note JavaScript name: <code>series&lt;gauge&gt;-animation</code>
  */
@js.annotation.ScalaJSDefined
class SeriesGaugeAnimation extends com.highcharts.HighchartsGenericObject {

  val duration: js.UndefOr[Double] = js.undefined
}

object SeriesGaugeAnimation {
  /**
    */
  def apply(duration: js.UndefOr[Double] = js.undefined): SeriesGaugeAnimation = {
    val durationOuter: js.UndefOr[Double] = duration
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesGaugeAnimation {
      override val duration: js.UndefOr[Double] = durationOuter
    })
  }
}
