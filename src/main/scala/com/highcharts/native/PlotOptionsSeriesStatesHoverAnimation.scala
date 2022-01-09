/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highcharts]]
  */
package com.highcharts.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>plotOptions-series-states-hover-animation</code>
  */
class PlotOptionsSeriesStatesHoverAnimation extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The duration of the hover animation in milliseconds. By
    * default the hover state animates quickly in, and slowly
    * back to normal.</p>
    * @since 5.0.8
    */
  var duration: js.UndefOr[Double] = js.undefined
}

object PlotOptionsSeriesStatesHoverAnimation {
  /**
    * @param duration <p>The duration of the hover animation in milliseconds. By. default the hover state animates quickly in, and slowly. back to normal.</p>
    */
  def apply(duration: js.UndefOr[Double] = js.undefined): PlotOptionsSeriesStatesHoverAnimation = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsSeriesStatesHoverAnimation {
      this.duration = duration
    })
  }
}
