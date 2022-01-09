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
  * @note JavaScript name: <code>series&lt;waterfall&gt;-marker-states-hover-animation</code>
  */
class SeriesWaterfallMarkerStatesHoverAnimation extends com.highcharts.HighchartsGenericObject {

  var duration: js.UndefOr[Double] = js.undefined
}

object SeriesWaterfallMarkerStatesHoverAnimation {
  /**
    */
  def apply(duration: js.UndefOr[Double] = js.undefined): SeriesWaterfallMarkerStatesHoverAnimation = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesWaterfallMarkerStatesHoverAnimation {
      this.duration = duration
    })
  }
}
