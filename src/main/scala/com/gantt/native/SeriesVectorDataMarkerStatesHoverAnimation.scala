/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/gantt]]
  */
package com.gantt.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>series&lt;vector&gt;-data-marker-states-hover-animation</code>
  */
class SeriesVectorDataMarkerStatesHoverAnimation extends com.highcharts.HighchartsGenericObject {

  var duration: js.UndefOr[Double] = js.undefined
}

object SeriesVectorDataMarkerStatesHoverAnimation {
  /**
    */
  def apply(duration: js.UndefOr[Double] = js.undefined): SeriesVectorDataMarkerStatesHoverAnimation = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesVectorDataMarkerStatesHoverAnimation {
      this.duration = duration
    })
  }
}