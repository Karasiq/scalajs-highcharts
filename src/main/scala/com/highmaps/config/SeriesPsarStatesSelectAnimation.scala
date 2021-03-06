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
  * @note JavaScript name: <code>series&lt;psar&gt;-states-select-animation</code>
  */
@js.annotation.ScalaJSDefined
class SeriesPsarStatesSelectAnimation extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The duration of the hover animation in milliseconds. By
    * default the hover state animates quickly in, and slowly back
    * to normal.</p>
    * @since 5.0.8
    */
  val duration: js.UndefOr[Double] = js.undefined
}

object SeriesPsarStatesSelectAnimation {
  /**
    * @param duration <p>The duration of the hover animation in milliseconds. By. default the hover state animates quickly in, and slowly back. to normal.</p>
    */
  def apply(duration: js.UndefOr[Double] = js.undefined): SeriesPsarStatesSelectAnimation = {
    val durationOuter: js.UndefOr[Double] = duration
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesPsarStatesSelectAnimation {
      override val duration: js.UndefOr[Double] = durationOuter
    })
  }
}
