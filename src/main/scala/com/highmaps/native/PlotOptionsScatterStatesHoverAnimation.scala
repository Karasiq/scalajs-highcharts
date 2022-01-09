/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highmaps]]
  */
package com.highmaps.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>plotOptions-scatter-states-hover-animation</code>
  */
class PlotOptionsScatterStatesHoverAnimation extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The duration of the hover animation in milliseconds. By
    * default the hover state animates quickly in, and slowly
    * back to normal.</p>
    * @since 5.0.8
    */
  var duration: js.UndefOr[Double] = js.undefined
}

object PlotOptionsScatterStatesHoverAnimation {
  /**
    * @param duration <p>The duration of the hover animation in milliseconds. By. default the hover state animates quickly in, and slowly. back to normal.</p>
    */
  def apply(duration: js.UndefOr[Double] = js.undefined): PlotOptionsScatterStatesHoverAnimation = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsScatterStatesHoverAnimation {
      this.duration = duration
    })
  }
}
