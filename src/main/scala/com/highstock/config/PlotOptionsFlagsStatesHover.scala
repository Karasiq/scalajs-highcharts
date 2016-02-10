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
  * @note JavaScript name: <code>plotOptions-flags-states-hover</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsFlagsStatesHover extends js.Object {

  /**
    * Enable separate styles for the hovered series to visualize that the user hovers either the series itself or the legend. Enabling it has a performance penalty as it requires that a second layer be drawn as a double buffer. This means twice  as much graphics to draw for each plot, which can make a great difference for charts with a high number of series or points.			.
    */
  val enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * Options for the halo appearing around the hovered point in line-type series as well as outside the hovered slice in pie charts. By default the halo is filled by the current point or series color with an opacity of 0.25. The halo can be disabled by setting the <code>halo</code> option to <code>false</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/halo/" target="_blank">Halo options</a>
    * @since 4.0
    */
  val halo: js.UndefOr[CleanJsObject[PlotOptionsFlagsStatesHoverHalo]] = js.undefined

  /**
    * Pixel with of the graph line.
    */
  val lineWidth: js.UndefOr[Double] = js.undefined

  /**
    * The additional line width for the graph of a hovered series.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-states-hover-linewidthplus/" target="_blank">5 pixels wider</a>
    * @since 1.0.3
    */
  val lineWidthPlus: js.UndefOr[Double] = js.undefined

  val marker: js.UndefOr[CleanJsObject[PlotOptionsFlagsStatesHoverMarker]] = js.undefined
}

object PlotOptionsFlagsStatesHover {
  /**
    * @param enabled Enable separate styles for the hovered series to visualize that the user hovers either the series itself or the legend. Enabling it has a performance penalty as it requires that a second layer be drawn as a double buffer. This means twice  as much graphics to draw for each plot, which can make a great difference for charts with a high number of series or points.			.
    * @param halo Options for the halo appearing around the hovered point in line-type series as well as outside the hovered slice in pie charts. By default the halo is filled by the current point or series color with an opacity of 0.25. The halo can be disabled by setting the <code>halo</code> option to <code>false</code>.
    * @param lineWidth Pixel with of the graph line.
    * @param lineWidthPlus The additional line width for the graph of a hovered series.
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, halo: js.UndefOr[CleanJsObject[PlotOptionsFlagsStatesHoverHalo]] = js.undefined, lineWidth: js.UndefOr[Double] = js.undefined, lineWidthPlus: js.UndefOr[Double] = js.undefined, marker: js.UndefOr[CleanJsObject[PlotOptionsFlagsStatesHoverMarker]] = js.undefined): PlotOptionsFlagsStatesHover = {
    val enabledOuter: js.UndefOr[Boolean] = enabled
    val haloOuter: js.UndefOr[CleanJsObject[PlotOptionsFlagsStatesHoverHalo]] = halo
    val lineWidthOuter: js.UndefOr[Double] = lineWidth
    val lineWidthPlusOuter: js.UndefOr[Double] = lineWidthPlus
    val markerOuter: js.UndefOr[CleanJsObject[PlotOptionsFlagsStatesHoverMarker]] = marker
    new PlotOptionsFlagsStatesHover {
      override val enabled: js.UndefOr[Boolean] = enabledOuter
      override val halo: js.UndefOr[CleanJsObject[PlotOptionsFlagsStatesHoverHalo]] = haloOuter
      override val lineWidth: js.UndefOr[Double] = lineWidthOuter
      override val lineWidthPlus: js.UndefOr[Double] = lineWidthPlusOuter
      override val marker: js.UndefOr[CleanJsObject[PlotOptionsFlagsStatesHoverMarker]] = markerOuter
    }
  }
}
