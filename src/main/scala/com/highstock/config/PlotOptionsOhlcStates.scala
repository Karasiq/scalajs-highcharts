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
  * @note JavaScript name: <code>plotOptions-ohlc-states</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsOhlcStates extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Options for the hovered point. These settings override the normal
    * state options when a point is moused over or touched.</p>
    */
  val hover: js.Any = js.undefined

  /**
    * <p>Options for the selected point. These settings override the normal
    * state options when a point is selected.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-allowpointselect/">Allow point select demo</a>
    */
  val select: js.Any = js.undefined

  /**
    * <p>Overrides for the normal state.</p>
    */
  val normal: js.UndefOr[CleanJsObject[PlotOptionsOhlcStatesNormal]] = js.undefined
}

object PlotOptionsOhlcStates {
  /**
    * @param hover <p>Options for the hovered point. These settings override the normal. state options when a point is moused over or touched.</p>
    * @param select <p>Options for the selected point. These settings override the normal. state options when a point is selected.</p>
    * @param normal <p>Overrides for the normal state.</p>
    */
  def apply(hover: js.UndefOr[js.Any] = js.undefined, select: js.UndefOr[js.Any] = js.undefined, normal: js.UndefOr[CleanJsObject[PlotOptionsOhlcStatesNormal]] = js.undefined): PlotOptionsOhlcStates = {
    val hoverOuter: js.Any = hover
    val selectOuter: js.Any = select
    val normalOuter: js.UndefOr[CleanJsObject[PlotOptionsOhlcStatesNormal]] = normal
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsOhlcStates {
      override val hover: js.Any = hoverOuter
      override val select: js.Any = selectOuter
      override val normal: js.UndefOr[CleanJsObject[PlotOptionsOhlcStatesNormal]] = normalOuter
    })
  }
}
