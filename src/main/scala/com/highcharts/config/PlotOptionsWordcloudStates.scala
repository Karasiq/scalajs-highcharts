/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highcharts]]
  */
package com.highcharts.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>plotOptions-wordcloud-states</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsWordcloudStates extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Options for the hovered point. These settings override the normal
    * state options when a point is moused over or touched.</p>
    * @since 6.0.0
    */
  val hover: js.Any = js.undefined

  /**
    * <p>Options for the selected point. These settings override the normal
    * state options when a point is selected.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-allowpointselect/">Allow point select demo</a>
    * @since 6.0.0
    */
  val select: js.Any = js.undefined

  /**
    * <p>Overrides for the normal state.</p>
    * @since 6.0.0
    */
  val normal: js.UndefOr[CleanJsObject[PlotOptionsWordcloudStatesNormal]] = js.undefined
}

object PlotOptionsWordcloudStates {
  /**
    * @param hover <p>Options for the hovered point. These settings override the normal. state options when a point is moused over or touched.</p>
    * @param select <p>Options for the selected point. These settings override the normal. state options when a point is selected.</p>
    * @param normal <p>Overrides for the normal state.</p>
    */
  def apply(hover: js.UndefOr[js.Any] = js.undefined, select: js.UndefOr[js.Any] = js.undefined, normal: js.UndefOr[CleanJsObject[PlotOptionsWordcloudStatesNormal]] = js.undefined): PlotOptionsWordcloudStates = {
    val hoverOuter: js.Any = hover
    val selectOuter: js.Any = select
    val normalOuter: js.UndefOr[CleanJsObject[PlotOptionsWordcloudStatesNormal]] = normal
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsWordcloudStates {
      override val hover: js.Any = hoverOuter
      override val select: js.Any = selectOuter
      override val normal: js.UndefOr[CleanJsObject[PlotOptionsWordcloudStatesNormal]] = normalOuter
    })
  }
}
