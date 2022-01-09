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
  * @note JavaScript name: <code>series&lt;networkgraph&gt;-marker-states-inactive</code>
  */
class SeriesNetworkgraphMarkerStatesInactive extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Animation when not hovering over the node.</p>
    */
  var animation: js.UndefOr[Boolean | js.Object] = js.undefined

  /**
    * <p>Opacity of inactive markers.</p>
    */
  var opacity: js.UndefOr[Double] = js.undefined
}

object SeriesNetworkgraphMarkerStatesInactive {
  /**
    * @param animation <p>Animation when not hovering over the node.</p>
    * @param opacity <p>Opacity of inactive markers.</p>
    */
  def apply(animation: js.UndefOr[Boolean | js.Object] = js.undefined, opacity: js.UndefOr[Double] = js.undefined): SeriesNetworkgraphMarkerStatesInactive = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesNetworkgraphMarkerStatesInactive {
      this.animation = animation
      this.opacity = opacity
    })
  }
}
