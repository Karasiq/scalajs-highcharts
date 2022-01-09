/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highstock]]
  */
package com.highstock.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>plotOptions-slowstochastic-marker-states-normal</code>
  */
class PlotOptionsSlowstochasticMarkerStatesNormal extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Animation when returning to normal state after hovering.</p>
    * @since 8.0.0
    */
  var animation: js.UndefOr[Boolean | js.Object] = js.undefined
}

object PlotOptionsSlowstochasticMarkerStatesNormal {
  /**
    * @param animation <p>Animation when returning to normal state after hovering.</p>
    */
  def apply(animation: js.UndefOr[Boolean | js.Object] = js.undefined): PlotOptionsSlowstochasticMarkerStatesNormal = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsSlowstochasticMarkerStatesNormal {
      this.animation = animation
    })
  }
}
