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
  * @note JavaScript name: <code>plotOptions-histogram-states-normal</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsHistogramStatesNormal extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Animation options for the fill color when returning from hover
    * state to normal state. The animation adds some latency in order
    * to reduce the effect of flickering when hovering in and out of
    * for example an uneven coastline.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-states-animation-false/">No animation of fill color</a>
    * @since 6.0.0
    */
  val animation: js.UndefOr[js.Object | Boolean] = js.undefined
}

object PlotOptionsHistogramStatesNormal {
  /**
    * @param animation <p>Animation options for the fill color when returning from hover. state to normal state. The animation adds some latency in order. to reduce the effect of flickering when hovering in and out of. for example an uneven coastline.</p>
    */
  def apply(animation: js.UndefOr[js.Object | Boolean] = js.undefined): PlotOptionsHistogramStatesNormal = {
    val animationOuter: js.UndefOr[js.Object | Boolean] = animation
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsHistogramStatesNormal {
      override val animation: js.UndefOr[js.Object | Boolean] = animationOuter
    })
  }
}
