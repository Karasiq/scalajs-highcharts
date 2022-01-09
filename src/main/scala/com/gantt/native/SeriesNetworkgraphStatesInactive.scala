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
  * @note JavaScript name: <code>series&lt;networkgraph&gt;-states-inactive</code>
  */
class SeriesNetworkgraphStatesInactive extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Animation when not hovering over the node.</p>
    */
  var animation: js.UndefOr[Boolean | js.Object] = js.undefined

  /**
    * <p>Opacity of inactive links.</p>
    */
  var linkOpacity: js.UndefOr[Double] = js.undefined

  /**
    * <p>Enable or disable the inactive state for a series</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-states-inactive-disabled">Disabled inactive state</a>
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Opacity of inactive markers.</p>
    */
  var opacity: js.UndefOr[Double] = js.undefined
}

object SeriesNetworkgraphStatesInactive {
  /**
    * @param animation <p>Animation when not hovering over the node.</p>
    * @param linkOpacity <p>Opacity of inactive links.</p>
    * @param enabled <p>Enable or disable the inactive state for a series</p>
    * @param opacity <p>Opacity of inactive markers.</p>
    */
  def apply(animation: js.UndefOr[Boolean | js.Object] = js.undefined, linkOpacity: js.UndefOr[Double] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, opacity: js.UndefOr[Double] = js.undefined): SeriesNetworkgraphStatesInactive = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesNetworkgraphStatesInactive {
      this.animation = animation
      this.linkOpacity = linkOpacity
      this.enabled = enabled
      this.opacity = opacity
    })
  }
}
