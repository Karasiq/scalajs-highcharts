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
  * @note JavaScript name: <code>plotOptions-networkgraph-states-inactive</code>
  */
class PlotOptionsNetworkgraphStatesInactive extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Animation when not hovering over the node.</p>
    * @since 7.0.0
    */
  var animation: js.UndefOr[Boolean | js.Object] = js.undefined

  /**
    * <p>Opacity of inactive links.</p>
    * @since 7.0.0
    */
  var linkOpacity: js.UndefOr[Double] = js.undefined

  /**
    * <p>Enable or disable the inactive state for a series</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-states-inactive-disabled">Disabled inactive state</a>
    * @since 7.0.0
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Opacity of inactive markers.</p>
    * @since 7.0.0
    */
  var opacity: js.UndefOr[Double] = js.undefined
}

object PlotOptionsNetworkgraphStatesInactive {
  /**
    * @param animation <p>Animation when not hovering over the node.</p>
    * @param linkOpacity <p>Opacity of inactive links.</p>
    * @param enabled <p>Enable or disable the inactive state for a series</p>
    * @param opacity <p>Opacity of inactive markers.</p>
    */
  def apply(animation: js.UndefOr[Boolean | js.Object] = js.undefined, linkOpacity: js.UndefOr[Double] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, opacity: js.UndefOr[Double] = js.undefined): PlotOptionsNetworkgraphStatesInactive = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsNetworkgraphStatesInactive {
      this.animation = animation
      this.linkOpacity = linkOpacity
      this.enabled = enabled
      this.opacity = opacity
    })
  }
}
