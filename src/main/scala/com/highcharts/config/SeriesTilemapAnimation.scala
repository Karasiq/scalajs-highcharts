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
  * @note JavaScript name: <code>series&lt;tilemap&gt;-animation</code>
  */
@js.annotation.ScalaJSDefined
class SeriesTilemapAnimation extends com.highcharts.HighchartsGenericObject {

  val duration: js.UndefOr[Double] = js.undefined
}

object SeriesTilemapAnimation {
  /**
    */
  def apply(duration: js.UndefOr[Double] = js.undefined): SeriesTilemapAnimation = {
    val durationOuter: js.UndefOr[Double] = duration
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesTilemapAnimation {
      override val duration: js.UndefOr[Double] = durationOuter
    })
  }
}
