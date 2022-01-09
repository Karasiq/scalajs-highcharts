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
  * @note JavaScript name: <code>plotOptions-networkgraph-marker-states-inactive</code>
  */
class PlotOptionsNetworkgraphMarkerStatesInactive extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Animation when not hovering over the node.</p>
    * @since 7.0.0
    */
  var animation: js.UndefOr[Boolean | js.Object] = js.undefined

  /**
    * <p>Opacity of inactive markers.</p>
    * @since 7.0.0
    */
  var opacity: js.UndefOr[Double] = js.undefined
}

object PlotOptionsNetworkgraphMarkerStatesInactive {
  /**
    * @param animation <p>Animation when not hovering over the node.</p>
    * @param opacity <p>Opacity of inactive markers.</p>
    */
  def apply(animation: js.UndefOr[Boolean | js.Object] = js.undefined, opacity: js.UndefOr[Double] = js.undefined): PlotOptionsNetworkgraphMarkerStatesInactive = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsNetworkgraphMarkerStatesInactive {
      this.animation = animation
      this.opacity = opacity
    })
  }
}
