/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highmaps]]
  */
package com.highmaps.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>navigator-series</code>
  */
@js.annotation.ScalaJSDefined
class NavigatorSeries extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The type of the navigator series. Defaults to <code>areaspline</code> if
    * defined, otherwise <code>line</code>.</p>
    */
  val `type`: js.UndefOr[String] = "areaspline"

  /**
    * <p>The fill opacity of the navigator series.</p>
    */
  val fillOpacity: js.UndefOr[Double] = js.undefined

  /**
    * <p>The pixel line width of the navigator series.</p>
    */
  val lineWidth: js.UndefOr[Double] = js.undefined

  /**
    * <p>Data grouping options for the navigator series.</p>
    */
  val dataGrouping: js.Any = js.undefined

  /**
    * <p>Data label options for the navigator series. Data labels are
    * disabled by default on the navigator series.</p>
    */
  val dataLabels: js.Any = js.undefined

  val id: js.UndefOr[String] = js.undefined

  val className: js.UndefOr[String] = js.undefined

  /**
    * <p>Line color for the navigator series. Allows setting the color
    * while disallowing the default candlestick setting.</p>
    */
  val lineColor: js.UndefOr[String | js.Object | Null] = js.undefined

  val marker: js.Any = js.undefined

  val pointRange: js.UndefOr[Double] = js.undefined

  /**
    * <p>The threshold option. Setting it to 0 will make the default
    * navigator area series draw its area from the 0 value and up.</p>
    */
  val threshold: js.UndefOr[Double | Null] = js.undefined
}

object NavigatorSeries {
  /**
    * @param `type` <p>The type of the navigator series. Defaults to <code>areaspline</code> if. defined, otherwise <code>line</code>.</p>
    * @param fillOpacity <p>The fill opacity of the navigator series.</p>
    * @param lineWidth <p>The pixel line width of the navigator series.</p>
    * @param dataGrouping <p>Data grouping options for the navigator series.</p>
    * @param dataLabels <p>Data label options for the navigator series. Data labels are. disabled by default on the navigator series.</p>
    * @param lineColor <p>Line color for the navigator series. Allows setting the color. while disallowing the default candlestick setting.</p>
    * @param threshold <p>The threshold option. Setting it to 0 will make the default. navigator area series draw its area from the 0 value and up.</p>
    */
  def apply(`type`: js.UndefOr[String] = "areaspline", fillOpacity: js.UndefOr[Double] = js.undefined, lineWidth: js.UndefOr[Double] = js.undefined, dataGrouping: js.UndefOr[js.Any] = js.undefined, dataLabels: js.UndefOr[js.Any] = js.undefined, id: js.UndefOr[String] = js.undefined, className: js.UndefOr[String] = js.undefined, lineColor: js.UndefOr[String | js.Object | Null] = js.undefined, marker: js.UndefOr[js.Any] = js.undefined, pointRange: js.UndefOr[Double] = js.undefined, threshold: js.UndefOr[Double | Null] = js.undefined): NavigatorSeries = {
    val typeOuter: js.UndefOr[String] = `type`
    val fillOpacityOuter: js.UndefOr[Double] = fillOpacity
    val lineWidthOuter: js.UndefOr[Double] = lineWidth
    val dataGroupingOuter: js.Any = dataGrouping
    val dataLabelsOuter: js.Any = dataLabels
    val idOuter: js.UndefOr[String] = id
    val classNameOuter: js.UndefOr[String] = className
    val lineColorOuter: js.UndefOr[String | js.Object | Null] = lineColor
    val markerOuter: js.Any = marker
    val pointRangeOuter: js.UndefOr[Double] = pointRange
    val thresholdOuter: js.UndefOr[Double | Null] = threshold
    com.highcharts.HighchartsGenericObject.toCleanObject(new NavigatorSeries {
      override val `type`: js.UndefOr[String] = typeOuter
      override val fillOpacity: js.UndefOr[Double] = fillOpacityOuter
      override val lineWidth: js.UndefOr[Double] = lineWidthOuter
      override val dataGrouping: js.Any = dataGroupingOuter
      override val dataLabels: js.Any = dataLabelsOuter
      override val id: js.UndefOr[String] = idOuter
      override val className: js.UndefOr[String] = classNameOuter
      override val lineColor: js.UndefOr[String | js.Object | Null] = lineColorOuter
      override val marker: js.Any = markerOuter
      override val pointRange: js.UndefOr[Double] = pointRangeOuter
      override val threshold: js.UndefOr[Double | Null] = thresholdOuter
    })
  }
}
