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
  * @note JavaScript name: <code>plotOptions-vbp-marker-states-hover-animation</code>
  */
class PlotOptionsVbpMarkerStatesHoverAnimation extends com.highcharts.HighchartsGenericObject {

  var duration: js.UndefOr[Double] = js.undefined
}

object PlotOptionsVbpMarkerStatesHoverAnimation {
  /**
    */
  def apply(duration: js.UndefOr[Double] = js.undefined): PlotOptionsVbpMarkerStatesHoverAnimation = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsVbpMarkerStatesHoverAnimation {
      this.duration = duration
    })
  }
}
