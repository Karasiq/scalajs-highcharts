/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highstock]]
  */
package com.highstock.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>series&lt;errorbar&gt;-marker-states-hover-animation</code>
  */
class SeriesErrorbarMarkerStatesHoverAnimation extends com.highcharts.HighchartsGenericObject {

  var duration: js.UndefOr[Double] = js.undefined
}

object SeriesErrorbarMarkerStatesHoverAnimation {
  /**
    */
  def apply(duration: js.UndefOr[Double] = js.undefined): SeriesErrorbarMarkerStatesHoverAnimation = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesErrorbarMarkerStatesHoverAnimation {
      this.duration = duration
    })
  }
}