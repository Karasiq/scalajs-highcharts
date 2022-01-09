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
  * @note JavaScript name: <code>plotOptions-dependencywheel-states</code>
  */
class PlotOptionsDependencywheelStates extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Options for the hovered point. These settings override the normal
    * state options when a point is moused over or touched.</p>
    * @since 7.1.0
    */
  var hover: js.Any = js.undefined

  /**
    * <p>The opposite state of a hover for a single point node/link.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-states-inactive-disabled">Disabled inactive state</a>
    * @since 7.1.0
    */
  var inactive: js.Any = js.undefined

  /**
    * <p>Options for the selected point. These settings override the
    * normal state options when a point is selected.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-allowpointselect/">Allow point select demo</a>
    * @since 7.1.0
    */
  var select: js.UndefOr[CleanJsObject[PlotOptionsDependencywheelStatesSelect]] = js.undefined

  /**
    * <p>The normal state of a series, or for point items in column, pie
    * and similar series. Currently only used for setting animation
    * when returning to normal state from hover.</p>
    * @since 7.1.0
    */
  var normal: js.Any = js.undefined
}

object PlotOptionsDependencywheelStates {
  /**
    * @param hover <p>Options for the hovered point. These settings override the normal. state options when a point is moused over or touched.</p>
    * @param inactive <p>The opposite state of a hover for a single point node/link.</p>
    * @param select <p>Options for the selected point. These settings override the. normal state options when a point is selected.</p>
    * @param normal <p>The normal state of a series, or for point items in column, pie. and similar series. Currently only used for setting animation. when returning to normal state from hover.</p>
    */
  def apply(hover: js.UndefOr[js.Any] = js.undefined, inactive: js.UndefOr[js.Any] = js.undefined, select: js.UndefOr[CleanJsObject[PlotOptionsDependencywheelStatesSelect]] = js.undefined, normal: js.UndefOr[js.Any] = js.undefined): PlotOptionsDependencywheelStates = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsDependencywheelStates {
      this.hover = hover
      this.inactive = inactive
      this.select = select
      this.normal = normal
    })
  }
}
