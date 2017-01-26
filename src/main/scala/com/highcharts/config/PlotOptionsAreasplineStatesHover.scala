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
  * @note JavaScript name: <code>plotOptions-areaspline-states-hover</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsAreasplineStatesHover extends js.Object {

  /**
    * Enable separate styles for the hovered series to visualize that the user hovers either the series itself or the legend.			.
    * @example Disable hover on <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-states-hover-enabled/" target="_blank">line</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-states-hover-enabled-column/" target="_blank">column</a>,
			<a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-states-hover-enabled-pie/" target="_blank">pie</a>
    * @since 1.2
    */
  val enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>Options for the halo appearing around the hovered point in line-type series as well as outside the hovered slice in pie charts. By default the halo is filled by the current point or series color with an opacity of 0.25. The halo can be disabled by setting the <code>halo</code> option to <code>false</code>.</p>
    * 
    * <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the halo is styled with the <code>.highcharts-halo</code> class, with colors inherited from <code>.highcharts-color-{n}</code>.</p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/halo/" target="_blank">Halo options</a>
    * @since 4.0
    */
  val halo: js.UndefOr[CleanJsObject[PlotOptionsAreasplineStatesHoverHalo]] = js.undefined

  /**
    * Pixel with of the graph line.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-states-hover-linewidth/" target="_blank">5px line on hover</a>
    */
  val lineWidth: js.UndefOr[Double] = js.undefined

  /**
    * The additional line width for the graph of a hovered series.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-states-hover-linewidthplus/" target="_blank">5 pixels wider</a>
    * @since 4.0.3
    */
  val lineWidthPlus: js.UndefOr[Double] = js.undefined

  /**
    * In Highcharts 1.0, the appearance of all markers belonging to the hovered series. For settings on the hover state of the individual point, see <a href="#plotOptions.series.marker.states.hover">marker.states.hover</a>.
    */
  val marker: js.UndefOr[CleanJsObject[PlotOptionsAreasplineStatesHoverMarker]] = js.undefined
}

object PlotOptionsAreasplineStatesHover {
  /**
    * @param enabled Enable separate styles for the hovered series to visualize that the user hovers either the series itself or the legend.			.
    * @param halo <p>Options for the halo appearing around the hovered point in line-type series as well as outside the hovered slice in pie charts. By default the halo is filled by the current point or series color with an opacity of 0.25. The halo can be disabled by setting the <code>halo</code> option to <code>false</code>.</p>. . <p>In <a href="http://www.highcharts.com/docs/chart-design-and-style/style-by-css">styled mode</a>, the halo is styled with the <code>.highcharts-halo</code> class, with colors inherited from <code>.highcharts-color-{n}</code>.</p>
    * @param lineWidth Pixel with of the graph line.
    * @param lineWidthPlus The additional line width for the graph of a hovered series.
    * @param marker In Highcharts 1.0, the appearance of all markers belonging to the hovered series. For settings on the hover state of the individual point, see <a href="#plotOptions.series.marker.states.hover">marker.states.hover</a>.
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, halo: js.UndefOr[CleanJsObject[PlotOptionsAreasplineStatesHoverHalo]] = js.undefined, lineWidth: js.UndefOr[Double] = js.undefined, lineWidthPlus: js.UndefOr[Double] = js.undefined, marker: js.UndefOr[CleanJsObject[PlotOptionsAreasplineStatesHoverMarker]] = js.undefined): PlotOptionsAreasplineStatesHover = {
    val enabledOuter: js.UndefOr[Boolean] = enabled
    val haloOuter: js.UndefOr[CleanJsObject[PlotOptionsAreasplineStatesHoverHalo]] = halo
    val lineWidthOuter: js.UndefOr[Double] = lineWidth
    val lineWidthPlusOuter: js.UndefOr[Double] = lineWidthPlus
    val markerOuter: js.UndefOr[CleanJsObject[PlotOptionsAreasplineStatesHoverMarker]] = marker
    new PlotOptionsAreasplineStatesHover {
      override val enabled: js.UndefOr[Boolean] = enabledOuter
      override val halo: js.UndefOr[CleanJsObject[PlotOptionsAreasplineStatesHoverHalo]] = haloOuter
      override val lineWidth: js.UndefOr[Double] = lineWidthOuter
      override val lineWidthPlus: js.UndefOr[Double] = lineWidthPlusOuter
      override val marker: js.UndefOr[CleanJsObject[PlotOptionsAreasplineStatesHoverMarker]] = markerOuter
    }
  }
}
