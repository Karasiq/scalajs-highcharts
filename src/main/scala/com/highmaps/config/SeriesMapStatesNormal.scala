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
  * @note JavaScript name: <code>series&lt;map&gt;-states-normal</code>
  */
@js.annotation.ScalaJSDefined
class SeriesMapStatesNormal extends js.Object {

  /**
    * Animation options for the fill color when returning from hover state to normal state. The animation adds some latency in order to reduce the effect of flickering when hovering in and out of for example an uneven coastline.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-states-animation-false/" target="_blank">No animation of fill color</a>
    */
  val animation: js.UndefOr[js.Object | Boolean] = js.undefined
}

object SeriesMapStatesNormal {
  /**
    * @param animation Animation options for the fill color when returning from hover state to normal state. The animation adds some latency in order to reduce the effect of flickering when hovering in and out of for example an uneven coastline.
    */
  def apply(animation: js.UndefOr[js.Object | Boolean] = js.undefined): SeriesMapStatesNormal = {
    val animationOuter: js.UndefOr[js.Object | Boolean] = animation
    new SeriesMapStatesNormal {
      override val animation: js.UndefOr[js.Object | Boolean] = animationOuter
    }
  }
}
