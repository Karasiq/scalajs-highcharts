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
  * @note JavaScript name: <code>colorAxis-marker</code>
  */
class ColorAxisMarker extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Animation for the marker as it moves between values. Set to
    * <code>false</code> to disable animation. Defaults to <code>{ duration: 50 }</code>.</p>
    */
  var animation: js.UndefOr[Boolean | js.Object] = js.undefined

  /**
    * <p>The color of the marker.</p>
    */
  var color: js.UndefOr[String | js.Object] = js.undefined

  var width: js.UndefOr[Double] = js.undefined
}

object ColorAxisMarker {
  /**
    * @param animation <p>Animation for the marker as it moves between values. Set to. <code>false</code> to disable animation. Defaults to <code>{ duration: 50 }</code>.</p>
    * @param color <p>The color of the marker.</p>
    */
  def apply(animation: js.UndefOr[Boolean | js.Object] = js.undefined, color: js.UndefOr[String | js.Object] = js.undefined, width: js.UndefOr[Double] = js.undefined): ColorAxisMarker = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new ColorAxisMarker {
      this.animation = animation
      this.color = color
      this.width = width
    })
  }
}
