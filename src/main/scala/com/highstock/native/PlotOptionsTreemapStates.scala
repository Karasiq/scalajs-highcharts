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
  * @note JavaScript name: <code>plotOptions-treemap-states</code>
  */
class PlotOptionsTreemapStates extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Options for the hovered series</p>
    */
  var hover: js.Any = js.undefined

  /**
    * <p>The opposite state of a hover for series.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-states-inactive-disabled">Disabled inactive state</a>
    */
  var inactive: js.Any = js.undefined

  /**
    * <p>The normal state of a series, or for point items in column, pie
    * and similar series. Currently only used for setting animation
    * when returning to normal state from hover.</p>
    */
  var normal: js.Any = js.undefined

  /**
    * <p>Specific options for point in selected states, after being
    * selected by
    * <a href="#plotOptions.series.allowPointSelect">allowPointSelect</a>
    * or programmatically.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-allowpointselect/">Allow point select demo</a>
    */
  var select: js.UndefOr[CleanJsObject[PlotOptionsTreemapStatesSelect]] = js.undefined
}

object PlotOptionsTreemapStates {
  /**
    * @param hover <p>Options for the hovered series</p>
    * @param inactive <p>The opposite state of a hover for series.</p>
    * @param normal <p>The normal state of a series, or for point items in column, pie. and similar series. Currently only used for setting animation. when returning to normal state from hover.</p>
    * @param select <p>Specific options for point in selected states, after being. selected by. <a href="#plotOptions.series.allowPointSelect">allowPointSelect</a>. or programmatically.</p>
    */
  def apply(hover: js.UndefOr[js.Any] = js.undefined, inactive: js.UndefOr[js.Any] = js.undefined, normal: js.UndefOr[js.Any] = js.undefined, select: js.UndefOr[CleanJsObject[PlotOptionsTreemapStatesSelect]] = js.undefined): PlotOptionsTreemapStates = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsTreemapStates {
      this.hover = hover
      this.inactive = inactive
      this.normal = normal
      this.select = select
    })
  }
}
