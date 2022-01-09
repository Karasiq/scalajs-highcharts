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
  * @note JavaScript name: <code>series&lt;vector&gt;-marker-states-normal</code>
  */
class SeriesVectorMarkerStatesNormal extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Animation when returning to normal state after hovering.</p>
    */
  var animation: js.UndefOr[Boolean | js.Object] = js.undefined
}

object SeriesVectorMarkerStatesNormal {
  /**
    * @param animation <p>Animation when returning to normal state after hovering.</p>
    */
  def apply(animation: js.UndefOr[Boolean | js.Object] = js.undefined): SeriesVectorMarkerStatesNormal = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesVectorMarkerStatesNormal {
      this.animation = animation
    })
  }
}
