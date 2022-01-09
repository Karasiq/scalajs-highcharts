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
  * @note JavaScript name: <code>series&lt;networkgraph&gt;-marker-states</code>
  */
class SeriesNetworkgraphMarkerStates extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The opposite state of a hover for a single point node.
    * Applied to all not connected nodes to the hovered one.</p>
    */
  var inactive: js.Any = js.undefined

  /**
    * <p>The hover state for a single point marker.</p>
    */
  var hover: js.Any = js.undefined

  /**
    * <p>The normal state of a single point marker. Currently only
    * used for setting animation when returning to normal state
    * from hover.</p>
    */
  var normal: js.Any = js.undefined

  /**
    * <p>The appearance of the point marker when selected. In order to
    * allow a point to be selected, set the
    * <code>series.allowPointSelect</code> option to true.</p>
    */
  var select: js.Any = js.undefined
}

object SeriesNetworkgraphMarkerStates {
  /**
    * @param inactive <p>The opposite state of a hover for a single point node.. Applied to all not connected nodes to the hovered one.</p>
    * @param hover <p>The hover state for a single point marker.</p>
    * @param normal <p>The normal state of a single point marker. Currently only. used for setting animation when returning to normal state. from hover.</p>
    * @param select <p>The appearance of the point marker when selected. In order to. allow a point to be selected, set the. <code>series.allowPointSelect</code> option to true.</p>
    */
  def apply(inactive: js.UndefOr[js.Any] = js.undefined, hover: js.UndefOr[js.Any] = js.undefined, normal: js.UndefOr[js.Any] = js.undefined, select: js.UndefOr[js.Any] = js.undefined): SeriesNetworkgraphMarkerStates = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesNetworkgraphMarkerStates {
      this.inactive = inactive
      this.hover = hover
      this.normal = normal
      this.select = select
    })
  }
}
