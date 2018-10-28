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
  * @note JavaScript name: <code>series&lt;pyramid&gt;-animation</code>
  */
@js.annotation.ScalaJSDefined
class SeriesPyramidAnimation extends com.highcharts.HighchartsGenericObject {

  val duration: js.UndefOr[Double] = js.undefined
}

object SeriesPyramidAnimation {
  /**
    */
  def apply(duration: js.UndefOr[Double] = js.undefined): SeriesPyramidAnimation = {
    val durationOuter: js.UndefOr[Double] = duration
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesPyramidAnimation {
      override val duration: js.UndefOr[Double] = durationOuter
    })
  }
}
