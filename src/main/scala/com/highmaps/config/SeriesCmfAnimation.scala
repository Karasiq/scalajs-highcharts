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
  * @note JavaScript name: <code>series&lt;cmf&gt;-animation</code>
  */
@js.annotation.ScalaJSDefined
class SeriesCmfAnimation extends com.highcharts.HighchartsGenericObject {

  val duration: js.UndefOr[Double] = js.undefined
}

object SeriesCmfAnimation {
  /**
    */
  def apply(duration: js.UndefOr[Double] = js.undefined): SeriesCmfAnimation = {
    val durationOuter: js.UndefOr[Double] = duration
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesCmfAnimation {
      override val duration: js.UndefOr[Double] = durationOuter
    })
  }
}
