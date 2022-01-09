/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highmaps]]
  */
package com.highmaps.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>series&lt;arearange&gt;-marker-states-normal</code>
  */
class SeriesArearangeMarkerStatesNormal extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Animation when returning to normal state after hovering.</p>
    */
  var animation: js.UndefOr[Boolean | js.Object] = js.undefined
}

object SeriesArearangeMarkerStatesNormal {
  /**
    * @param animation <p>Animation when returning to normal state after hovering.</p>
    */
  def apply(animation: js.UndefOr[Boolean | js.Object] = js.undefined): SeriesArearangeMarkerStatesNormal = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesArearangeMarkerStatesNormal {
      this.animation = animation
    })
  }
}
