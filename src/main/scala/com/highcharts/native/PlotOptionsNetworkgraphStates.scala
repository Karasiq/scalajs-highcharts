/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highcharts]]
  */
package com.highcharts.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>plotOptions-networkgraph-states</code>
  */
class PlotOptionsNetworkgraphStates extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The opposite state of a hover for a single point link. Applied
    * to all links that are not comming from the hovered node.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-states-inactive-disabled">Disabled inactive state</a>
    * @since 7.0.0
    */
  var inactive: js.Any = js.undefined

  /**
    * <p>Options for the hovered series. These settings override the
    * normal state options when a series is moused over or touched.</p>
    * @since 7.0.0
    */
  var hover: js.Any = js.undefined

  /**
    * <p>The normal state of a series, or for point items in column, pie
    * and similar series. Currently only used for setting animation
    * when returning to normal state from hover.</p>
    * @since 7.0.0
    */
  var normal: js.Any = js.undefined

  /**
    * <p>Specific options for point in selected states, after being
    * selected by
    * <a href="#plotOptions.series.allowPointSelect">allowPointSelect</a>
    * or programmatically.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-allowpointselect/">Allow point select demo</a>
    * @since 7.0.0
    */
  var select: js.UndefOr[CleanJsObject[PlotOptionsNetworkgraphStatesSelect]] = js.undefined
}

object PlotOptionsNetworkgraphStates {
  /**
    * @param inactive <p>The opposite state of a hover for a single point link. Applied. to all links that are not comming from the hovered node.</p>
    * @param hover <p>Options for the hovered series. These settings override the. normal state options when a series is moused over or touched.</p>
    * @param normal <p>The normal state of a series, or for point items in column, pie. and similar series. Currently only used for setting animation. when returning to normal state from hover.</p>
    * @param select <p>Specific options for point in selected states, after being. selected by. <a href="#plotOptions.series.allowPointSelect">allowPointSelect</a>. or programmatically.</p>
    */
  def apply(inactive: js.UndefOr[js.Any] = js.undefined, hover: js.UndefOr[js.Any] = js.undefined, normal: js.UndefOr[js.Any] = js.undefined, select: js.UndefOr[CleanJsObject[PlotOptionsNetworkgraphStatesSelect]] = js.undefined): PlotOptionsNetworkgraphStates = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsNetworkgraphStates {
      this.inactive = inactive
      this.hover = hover
      this.normal = normal
      this.select = select
    })
  }
}
