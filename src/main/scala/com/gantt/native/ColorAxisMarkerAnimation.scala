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
  * @note JavaScript name: <code>colorAxis-marker-animation</code>
  */
class ColorAxisMarkerAnimation extends com.highcharts.HighchartsGenericObject {

  var duration: js.UndefOr[Double] = js.undefined
}

object ColorAxisMarkerAnimation {
  /**
    */
  def apply(duration: js.UndefOr[Double] = js.undefined): ColorAxisMarkerAnimation = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new ColorAxisMarkerAnimation {
      this.duration = duration
    })
  }
}
