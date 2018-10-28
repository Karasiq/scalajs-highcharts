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
  * @note JavaScript name: <code>series&lt;funnel&gt;-animation</code>
  */
@js.annotation.ScalaJSDefined
class SeriesFunnelAnimation extends com.highcharts.HighchartsGenericObject {

  val duration: js.UndefOr[Double] = js.undefined
}

object SeriesFunnelAnimation {
  /**
    */
  def apply(duration: js.UndefOr[Double] = js.undefined): SeriesFunnelAnimation = {
    val durationOuter: js.UndefOr[Double] = duration
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesFunnelAnimation {
      override val duration: js.UndefOr[Double] = durationOuter
    })
  }
}
