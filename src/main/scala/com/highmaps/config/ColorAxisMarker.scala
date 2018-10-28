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
class ColorAxisMarker extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Animation for the marker as it moves between values. Set to
    * <code>false</code> to disable animation. Defaults to <code>{ duration: 50 }</code>.</p>
    */
  val animation: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The color of the marker.</p>
    */
  val color: js.UndefOr[String | js.Object] = js.undefined
}

object ColorAxisMarker {
  /**
    * @param animation <p>Animation for the marker as it moves between values. Set to. <code>false</code> to disable animation. Defaults to <code>{ duration: 50 }</code>.</p>
    * @param color <p>The color of the marker.</p>
    */
  def apply(animation: js.UndefOr[Boolean] = js.undefined, color: js.UndefOr[String | js.Object] = js.undefined): ColorAxisMarker = {
    val animationOuter: js.UndefOr[Boolean] = animation
    val colorOuter: js.UndefOr[String | js.Object] = color
    com.highcharts.HighchartsGenericObject.toCleanObject(new ColorAxisMarker {
      override val animation: js.UndefOr[Boolean] = animationOuter
      override val color: js.UndefOr[String | js.Object] = colorOuter
    })
  }
}
