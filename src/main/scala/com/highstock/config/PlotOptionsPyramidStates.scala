/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highstock]]
  */
package com.highstock.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>plotOptions-pyramid-states</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsPyramidStates extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Options for a selected funnel item.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-allowpointselect/">Allow point select demo</a>
    */
  val select: js.Any = js.undefined

  /**
    * <p>Options for the hovered series. These settings override the normal
    * state options when a series is moused over or touched.</p>
    */
  val hover: js.Any = js.undefined

  /**
    * <p>Overrides for the normal state.</p>
    */
  val normal: js.UndefOr[CleanJsObject[PlotOptionsPyramidStatesNormal]] = js.undefined
}

object PlotOptionsPyramidStates {
  /**
    * @param select <p>Options for a selected funnel item.</p>
    * @param hover <p>Options for the hovered series. These settings override the normal. state options when a series is moused over or touched.</p>
    * @param normal <p>Overrides for the normal state.</p>
    */
  def apply(select: js.UndefOr[js.Any] = js.undefined, hover: js.UndefOr[js.Any] = js.undefined, normal: js.UndefOr[CleanJsObject[PlotOptionsPyramidStatesNormal]] = js.undefined): PlotOptionsPyramidStates = {
    val selectOuter: js.Any = select
    val hoverOuter: js.Any = hover
    val normalOuter: js.UndefOr[CleanJsObject[PlotOptionsPyramidStatesNormal]] = normal
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsPyramidStates {
      override val select: js.Any = selectOuter
      override val hover: js.Any = hoverOuter
      override val normal: js.UndefOr[CleanJsObject[PlotOptionsPyramidStatesNormal]] = normalOuter
    })
  }
}
