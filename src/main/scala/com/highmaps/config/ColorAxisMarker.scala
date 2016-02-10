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
  * @note JavaScript name: <code>colorAxis-marker</code>
  */
@js.annotation.ScalaJSDefined
class ColorAxisMarker extends js.Object {

  /**
    * Animation for the marker as it moves between values. Set to <code>false</code> to disable animation. Defaults to <code>{ duration: 50 }</code>.
    */
  val animation: js.UndefOr[js.Object | Boolean] = js.undefined

  /**
    * The color of the marker.
    */
  val color: js.UndefOr[String | js.Object] = js.undefined
}

object ColorAxisMarker {
  /**
    * @param animation Animation for the marker as it moves between values. Set to <code>false</code> to disable animation. Defaults to <code>{ duration: 50 }</code>.
    * @param color The color of the marker.
    */
  def apply(animation: js.UndefOr[js.Object | Boolean] = js.undefined, color: js.UndefOr[String | js.Object] = js.undefined): ColorAxisMarker = {
    val animationOuter: js.UndefOr[js.Object | Boolean] = animation
    val colorOuter: js.UndefOr[String | js.Object] = color
    new ColorAxisMarker {
      override val animation: js.UndefOr[js.Object | Boolean] = animationOuter
      override val color: js.UndefOr[String | js.Object] = colorOuter
    }
  }
}
