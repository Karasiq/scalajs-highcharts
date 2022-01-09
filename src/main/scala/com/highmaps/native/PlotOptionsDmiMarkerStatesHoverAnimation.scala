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
  * @note JavaScript name: <code>plotOptions-dmi-marker-states-hover-animation</code>
  */
class PlotOptionsDmiMarkerStatesHoverAnimation extends com.highcharts.HighchartsGenericObject {

  var duration: js.UndefOr[Double] = js.undefined
}

object PlotOptionsDmiMarkerStatesHoverAnimation {
  /**
    */
  def apply(duration: js.UndefOr[Double] = js.undefined): PlotOptionsDmiMarkerStatesHoverAnimation = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsDmiMarkerStatesHoverAnimation {
      this.duration = duration
    })
  }
}
