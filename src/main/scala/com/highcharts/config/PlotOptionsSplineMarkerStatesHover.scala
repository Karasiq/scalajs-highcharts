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
  * @note JavaScript name: <code>plotOptions-spline-marker-states-hover</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsSplineMarkerStatesHover extends js.Object {

  /**
    * Enable or disable the point marker.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-states-hover-enabled/" target="_blank">Disabled hover state</a>
    */
  val enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * The fill color of the marker in hover state.
    */
  val fillColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * The color of the point marker's outline. When <code>null</code>, the series' or point's color is used.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-states-hover-linecolor/" target="_blank">White fill color, black line color</a>
    */
  val lineColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * The width of the point marker's outline.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-states-hover-linewidth/" target="_blank">3px line width</a>
    */
  val lineWidth: js.UndefOr[Double] = js.undefined

  /**
    * The additional line width for a hovered point.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-states-hover-linewidthplus/" target="_blank">2 pixels wider on hover</a>
    * @since 4.0.3
    */
  val lineWidthPlus: js.UndefOr[Double] = js.undefined

  /**
    * The radius of the point marker. In hover state, it defaults to the normal state's radius + 2 as per the <a href="#plotOptions.series.marker.states.hover.radiusPlus">radiusPlus</a> option.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-states-hover-radius/" target="_blank">10px radius</a>
    */
  val radius: js.UndefOr[Double] = js.undefined

  /**
    * The number of pixels to increase the radius of the hovered point.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-states-hover-linewidthplus/" target="_blank">5 pixels greater radius on hover</a>
    * @since 4.0.3
    */
  val radiusPlus: js.UndefOr[Double] = js.undefined
}

object PlotOptionsSplineMarkerStatesHover {
  /**
    * @param enabled Enable or disable the point marker.
    * @param fillColor The fill color of the marker in hover state.
    * @param lineColor The color of the point marker's outline. When <code>null</code>, the series' or point's color is used.
    * @param lineWidth The width of the point marker's outline.
    * @param lineWidthPlus The additional line width for a hovered point.
    * @param radius The radius of the point marker. In hover state, it defaults to the normal state's radius + 2 as per the <a href="#plotOptions.series.marker.states.hover.radiusPlus">radiusPlus</a> option.
    * @param radiusPlus The number of pixels to increase the radius of the hovered point.
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, fillColor: js.UndefOr[String | js.Object] = js.undefined, lineColor: js.UndefOr[String | js.Object] = js.undefined, lineWidth: js.UndefOr[Double] = js.undefined, lineWidthPlus: js.UndefOr[Double] = js.undefined, radius: js.UndefOr[Double] = js.undefined, radiusPlus: js.UndefOr[Double] = js.undefined): PlotOptionsSplineMarkerStatesHover = {
    val enabledOuter: js.UndefOr[Boolean] = enabled
    val fillColorOuter: js.UndefOr[String | js.Object] = fillColor
    val lineColorOuter: js.UndefOr[String | js.Object] = lineColor
    val lineWidthOuter: js.UndefOr[Double] = lineWidth
    val lineWidthPlusOuter: js.UndefOr[Double] = lineWidthPlus
    val radiusOuter: js.UndefOr[Double] = radius
    val radiusPlusOuter: js.UndefOr[Double] = radiusPlus
    new PlotOptionsSplineMarkerStatesHover {
      override val enabled: js.UndefOr[Boolean] = enabledOuter
      override val fillColor: js.UndefOr[String | js.Object] = fillColorOuter
      override val lineColor: js.UndefOr[String | js.Object] = lineColorOuter
      override val lineWidth: js.UndefOr[Double] = lineWidthOuter
      override val lineWidthPlus: js.UndefOr[Double] = lineWidthPlusOuter
      override val radius: js.UndefOr[Double] = radiusOuter
      override val radiusPlus: js.UndefOr[Double] = radiusPlusOuter
    }
  }
}
