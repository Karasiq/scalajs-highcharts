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
  * @note JavaScript name: <code>series&lt;dmi&gt;-marker-states-normal</code>
  */
class SeriesDmiMarkerStatesNormal extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Animation when returning to normal state after hovering.</p>
    * @since 9.1.0
    */
  var animation: js.UndefOr[Boolean | js.Object] = js.undefined
}

object SeriesDmiMarkerStatesNormal {
  /**
    * @param animation <p>Animation when returning to normal state after hovering.</p>
    */
  def apply(animation: js.UndefOr[Boolean | js.Object] = js.undefined): SeriesDmiMarkerStatesNormal = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesDmiMarkerStatesNormal {
      this.animation = animation
    })
  }
}
