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
  * @note JavaScript name: <code>series&lt;bb&gt;-animation</code>
  */
@js.annotation.ScalaJSDefined
class SeriesBbAnimation extends com.highcharts.HighchartsGenericObject {

  val duration: js.UndefOr[Double] = js.undefined
}

object SeriesBbAnimation {
  /**
    */
  def apply(duration: js.UndefOr[Double] = js.undefined): SeriesBbAnimation = {
    val durationOuter: js.UndefOr[Double] = duration
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesBbAnimation {
      override val duration: js.UndefOr[Double] = durationOuter
    })
  }
}
