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
  * @note JavaScript name: <code>plotOptions-streamgraph-states-select-marker-states-hover-animation</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsStreamgraphStatesSelectMarkerStatesHoverAnimation extends com.highcharts.HighchartsGenericObject {

  val duration: js.UndefOr[Double] = js.undefined
}

object PlotOptionsStreamgraphStatesSelectMarkerStatesHoverAnimation {
  /**
    */
  def apply(duration: js.UndefOr[Double] = js.undefined): PlotOptionsStreamgraphStatesSelectMarkerStatesHoverAnimation = {
    val durationOuter: js.UndefOr[Double] = duration
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsStreamgraphStatesSelectMarkerStatesHoverAnimation {
      override val duration: js.UndefOr[Double] = durationOuter
    })
  }
}
