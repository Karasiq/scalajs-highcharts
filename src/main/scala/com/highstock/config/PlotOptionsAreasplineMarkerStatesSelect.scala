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
  * @note JavaScript name: <code>plotOptions-areaspline-marker-states-select</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsAreasplineMarkerStatesSelect extends js.Object {

  /**
    * Enable or disable visible feedback for selection.
    */
  val enabled: js.UndefOr[Boolean] = js.undefined

  /**
    * The fill color of the point marker.
    */
  val fillColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * The color of the point marker's outline. When <code>null</code>, the series' or point's color is used.
    */
  val lineColor: js.UndefOr[String | js.Object] = js.undefined

  /**
    * The width of the point marker's outline.
    */
  val lineWidth: js.UndefOr[Double] = js.undefined

  /**
    * The radius of the point marker. In hover state, it defaults
    * 		to the normal state's radius + 2.
    */
  val radius: js.UndefOr[Double] = js.undefined
}

object PlotOptionsAreasplineMarkerStatesSelect {
  /**
    * @param enabled Enable or disable visible feedback for selection.
    * @param fillColor The fill color of the point marker.
    * @param lineColor The color of the point marker's outline. When <code>null</code>, the series' or point's color is used.
    * @param lineWidth The width of the point marker's outline.
    * @param radius The radius of the point marker. In hover state, it defaults. 		to the normal state's radius + 2.
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, fillColor: js.UndefOr[String | js.Object] = js.undefined, lineColor: js.UndefOr[String | js.Object] = js.undefined, lineWidth: js.UndefOr[Double] = js.undefined, radius: js.UndefOr[Double] = js.undefined): PlotOptionsAreasplineMarkerStatesSelect = {
    val enabledOuter: js.UndefOr[Boolean] = enabled
    val fillColorOuter: js.UndefOr[String | js.Object] = fillColor
    val lineColorOuter: js.UndefOr[String | js.Object] = lineColor
    val lineWidthOuter: js.UndefOr[Double] = lineWidth
    val radiusOuter: js.UndefOr[Double] = radius
    new PlotOptionsAreasplineMarkerStatesSelect {
      override val enabled: js.UndefOr[Boolean] = enabledOuter
      override val fillColor: js.UndefOr[String | js.Object] = fillColorOuter
      override val lineColor: js.UndefOr[String | js.Object] = lineColorOuter
      override val lineWidth: js.UndefOr[Double] = lineWidthOuter
      override val radius: js.UndefOr[Double] = radiusOuter
    }
  }
}
