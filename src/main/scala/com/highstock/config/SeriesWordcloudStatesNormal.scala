/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highstock]]
  */
package com.highstock.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>series&lt;wordcloud&gt;-states-normal</code>
  */
@js.annotation.ScalaJSDefined
class SeriesWordcloudStatesNormal extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Animation options for the fill color when returning from hover
    * state to normal state. The animation adds some latency in order
    * to reduce the effect of flickering when hovering in and out of
    * for example an uneven coastline.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-states-animation-false/">No animation of fill color</a>
    */
  val animation: js.UndefOr[js.Object | Boolean] = js.undefined
}

object SeriesWordcloudStatesNormal {
  /**
    * @param animation <p>Animation options for the fill color when returning from hover. state to normal state. The animation adds some latency in order. to reduce the effect of flickering when hovering in and out of. for example an uneven coastline.</p>
    */
  def apply(animation: js.UndefOr[js.Object | Boolean] = js.undefined): SeriesWordcloudStatesNormal = {
    val animationOuter: js.UndefOr[js.Object | Boolean] = animation
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesWordcloudStatesNormal {
      override val animation: js.UndefOr[js.Object | Boolean] = animationOuter
    })
  }
}
