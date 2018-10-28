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
  * @note JavaScript name: <code>series&lt;cci&gt;-animation</code>
  */
@js.annotation.ScalaJSDefined
class SeriesCciAnimation extends com.highcharts.HighchartsGenericObject {

  val duration: js.UndefOr[Double] = js.undefined
}

object SeriesCciAnimation {
  /**
    */
  def apply(duration: js.UndefOr[Double] = js.undefined): SeriesCciAnimation = {
    val durationOuter: js.UndefOr[Double] = duration
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesCciAnimation {
      override val duration: js.UndefOr[Double] = durationOuter
    })
  }
}
