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
  * @note JavaScript name: <code>series&lt;spline&gt;-marker-states-select</code>
  */
@js.annotation.ScalaJSDefined
class SeriesSplineMarkerStatesSelect extends js.Object {

  /**
    * Enable or disable visible feedback for selection.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-states-select-enabled/" target="_blank">Disabled select state</a>
    */
  val enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * The fill color of the point marker.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-states-select-fillcolor/" target="_blank">Solid red discs for selected points</a>
    */
  val fillColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * The color of the point marker's outline. When <code>null</code>, the series' or point's color is used.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-states-select-linecolor/" target="_blank">Red line color for selected points</a>
    */
  val lineColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * The width of the point marker's outline.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-states-select-linewidth/" target="_blank">3px line width for selected points</a>
    */
  val lineWidth: js.UndefOr[Double] = js.undefined

  /**
    * The radius of the point marker. In hover state, it defaults
    * 		to the normal state's radius + 2.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/plotoptions/series-marker-states-select-radius/" target="_blank">10px radius for selected points</a>
    */
  val radius: js.UndefOr[Double] = js.undefined
}

object SeriesSplineMarkerStatesSelect {
  /**
    * @param enabled Enable or disable visible feedback for selection.
    * @param fillColor The fill color of the point marker.
    * @param lineColor The color of the point marker's outline. When <code>null</code>, the series' or point's color is used.
    * @param lineWidth The width of the point marker's outline.
    * @param radius The radius of the point marker. In hover state, it defaults. 		to the normal state's radius + 2.
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, fillColor: js.UndefOr[String | js.Object] = js.undefined, lineColor: js.UndefOr[String | js.Object] = js.undefined, lineWidth: js.UndefOr[Double] = js.undefined, radius: js.UndefOr[Double] = js.undefined): SeriesSplineMarkerStatesSelect = {
    val enabledOuter: js.UndefOr[Boolean] = enabled
    val fillColorOuter: js.UndefOr[String | js.Object] = fillColor
    val lineColorOuter: js.UndefOr[String | js.Object] = lineColor
    val lineWidthOuter: js.UndefOr[Double] = lineWidth
    val radiusOuter: js.UndefOr[Double] = radius
    new SeriesSplineMarkerStatesSelect {
      override val enabled: js.UndefOr[Boolean] = enabledOuter
      override val fillColor: js.UndefOr[String | js.Object] = fillColorOuter
      override val lineColor: js.UndefOr[String | js.Object] = lineColorOuter
      override val lineWidth: js.UndefOr[Double] = lineWidthOuter
      override val radius: js.UndefOr[Double] = radiusOuter
    }
  }
}
