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
  * @note JavaScript name: <code>series&lt;bellcurve&gt;-states-select-animation</code>
  */
@js.annotation.ScalaJSDefined
class SeriesBellcurveStatesSelectAnimation extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The duration of the hover animation in milliseconds. By
    * default the hover state animates quickly in, and slowly back
    * to normal.</p>
    * @since 5.0.8
    */
  val duration: js.UndefOr[Double] = js.undefined
}

object SeriesBellcurveStatesSelectAnimation {
  /**
    * @param duration <p>The duration of the hover animation in milliseconds. By. default the hover state animates quickly in, and slowly back. to normal.</p>
    */
  def apply(duration: js.UndefOr[Double] = js.undefined): SeriesBellcurveStatesSelectAnimation = {
    val durationOuter: js.UndefOr[Double] = duration
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesBellcurveStatesSelectAnimation {
      override val duration: js.UndefOr[Double] = durationOuter
    })
  }
}
