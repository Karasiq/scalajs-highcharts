/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highstock]]
  */
package com.highstock.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>series&lt;bar&gt;-animation</code>
  */
@js.annotation.ScalaJSDefined
class SeriesBarAnimation extends com.highcharts.HighchartsGenericObject {

  val duration: js.UndefOr[Double] = js.undefined
}

object SeriesBarAnimation {
  /**
    */
  def apply(duration: js.UndefOr[Double] = js.undefined): SeriesBarAnimation = {
    val durationOuter: js.UndefOr[Double] = duration
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesBarAnimation {
      override val duration: js.UndefOr[Double] = durationOuter
    })
  }
}
