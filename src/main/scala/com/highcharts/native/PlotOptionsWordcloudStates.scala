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
  * @note JavaScript name: <code>plotOptions-wordcloud-states</code>
  */
class PlotOptionsWordcloudStates extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Options for the hovered point. These settings override the normal
    * state options when a point is moused over or touched.</p>
    * @since 6.0.0
    */
  var hover: js.Any = js.undefined

  /**
    * <p>Options for the selected point. These settings override the
    * normal state options when a point is selected.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-allowpointselect/">Allow point select demo</a>
    * @since 6.0.0
    */
  var select: js.UndefOr[CleanJsObject[PlotOptionsWordcloudStatesSelect]] = js.undefined

  /**
    * <p>The opposite state of a hover for series.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-states-inactive-disabled">Disabled inactive state</a>
    * @since 6.0.0
    */
  var inactive: js.Any = js.undefined

  /**
    * <p>The normal state of a series, or for point items in column, pie
    * and similar series. Currently only used for setting animation
    * when returning to normal state from hover.</p>
    * @since 6.0.0
    */
  var normal: js.Any = js.undefined
}

object PlotOptionsWordcloudStates {
  /**
    * @param hover <p>Options for the hovered point. These settings override the normal. state options when a point is moused over or touched.</p>
    * @param select <p>Options for the selected point. These settings override the. normal state options when a point is selected.</p>
    * @param inactive <p>The opposite state of a hover for series.</p>
    * @param normal <p>The normal state of a series, or for point items in column, pie. and similar series. Currently only used for setting animation. when returning to normal state from hover.</p>
    */
  def apply(hover: js.UndefOr[js.Any] = js.undefined, select: js.UndefOr[CleanJsObject[PlotOptionsWordcloudStatesSelect]] = js.undefined, inactive: js.UndefOr[js.Any] = js.undefined, normal: js.UndefOr[js.Any] = js.undefined): PlotOptionsWordcloudStates = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsWordcloudStates {
      this.hover = hover
      this.select = select
      this.inactive = inactive
      this.normal = normal
    })
  }
}
