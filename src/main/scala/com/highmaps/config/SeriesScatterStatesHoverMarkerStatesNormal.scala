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
  * @note JavaScript name: <code>series&lt;scatter&gt;-states-hover-marker-states-normal</code>
  */
@js.annotation.ScalaJSDefined
class SeriesScatterStatesHoverMarkerStatesNormal extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Animation when returning to normal state after hovering.</p>
    */
  val animation: js.UndefOr[Boolean | js.Object] = js.undefined
}

object SeriesScatterStatesHoverMarkerStatesNormal {
  /**
    * @param animation <p>Animation when returning to normal state after hovering.</p>
    */
  def apply(animation: js.UndefOr[Boolean | js.Object] = js.undefined): SeriesScatterStatesHoverMarkerStatesNormal = {
    val animationOuter: js.UndefOr[Boolean | js.Object] = animation
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesScatterStatesHoverMarkerStatesNormal {
      override val animation: js.UndefOr[Boolean | js.Object] = animationOuter
    })
  }
}
