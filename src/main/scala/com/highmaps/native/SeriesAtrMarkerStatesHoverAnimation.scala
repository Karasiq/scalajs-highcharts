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
  * @note JavaScript name: <code>series&lt;atr&gt;-marker-states-hover-animation</code>
  */
class SeriesAtrMarkerStatesHoverAnimation extends com.highcharts.HighchartsGenericObject {

  var duration: js.UndefOr[Double] = js.undefined
}

object SeriesAtrMarkerStatesHoverAnimation {
  /**
    */
  def apply(duration: js.UndefOr[Double] = js.undefined): SeriesAtrMarkerStatesHoverAnimation = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesAtrMarkerStatesHoverAnimation {
      this.duration = duration
    })
  }
}
