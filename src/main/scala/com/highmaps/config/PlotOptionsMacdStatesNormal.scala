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
  * @note JavaScript name: <code>plotOptions-macd-states-normal</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsMacdStatesNormal extends com.highcharts.HighchartsGenericObject {

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

object PlotOptionsMacdStatesNormal {
  /**
    * @param animation <p>Animation options for the fill color when returning from hover. state to normal state. The animation adds some latency in order. to reduce the effect of flickering when hovering in and out of. for example an uneven coastline.</p>
    */
  def apply(animation: js.UndefOr[js.Object | Boolean] = js.undefined): PlotOptionsMacdStatesNormal = {
    val animationOuter: js.UndefOr[js.Object | Boolean] = animation
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsMacdStatesNormal {
      override val animation: js.UndefOr[js.Object | Boolean] = animationOuter
    })
  }
}
