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
  * @note JavaScript name: <code>series&lt;spline&gt;-data</code>
  */
@js.annotation.ScalaJSDefined
class SeriesSplineData extends js.Object {

  /**
    * Individual color for the point.
    */
  val color: js.UndefOr[String | js.Object] = js.undefined

  /**
    * Individual data label for each point. The options are the same as the ones for  <a class="internal" href="#plotOptions.series.dataLabels">plotOptions.series.dataLabels</a>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/point/datalabels/" target="_blank">Show a label for the last value</a>
    */
  val dataLabels: js.UndefOr[js.Object] = js.undefined

  /**
    * <p><i>Requires Accessibility module</i></p>
    * <p>A description of the point to add to the screen reader information about the point.</p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/maps/accessibility/accessible-map/">Accessible map</a>
    * @since 5.0.0
    */
  val description: js.UndefOr[String] = js.undefined

  val events: js.UndefOr[CleanJsObject[SeriesSplineDataEvents]] = js.undefined

  /**
    * An id for the point. This can be used after render time to get a pointer to the point object through <code>chart.get()</code>.
    */
  val id: js.UndefOr[String] = js.undefined

  /**
    * The rank for this point's data label in case of collision. If two data labels are about to overlap, only the one with the highest <code>labelrank</code> will be drawn.
    */
  val labelrank: js.UndefOr[Double] = js.undefined

  val marker: js.UndefOr[CleanJsObject[SeriesSplineDataMarker]] = js.undefined

  /**
    * The name of the point as shown in the legend, tooltip, dataLabel etc.
    */
  val name: js.UndefOr[String] = js.undefined

  /**
    * Whether the data point is selected initially.
    */
  val selected: js.UndefOr[Boolean] = js.undefined

  /**
    * The x value of the point. For datetime axes, the X value is the timestamp in milliseconds since 1970.
    */
  val x: js.UndefOr[Double] = js.undefined

  /**
    * The y value of the point.
    */
  val y: js.UndefOr[Double] = js.undefined
}

object SeriesSplineData {
  /**
    * @param color Individual color for the point.
    * @param dataLabels Individual data label for each point. The options are the same as the ones for  <a class="internal" href="#plotOptions.series.dataLabels">plotOptions.series.dataLabels</a>
    * @param description <p><i>Requires Accessibility module</i></p>. <p>A description of the point to add to the screen reader information about the point.</p>
    * @param id An id for the point. This can be used after render time to get a pointer to the point object through <code>chart.get()</code>.
    * @param labelrank The rank for this point's data label in case of collision. If two data labels are about to overlap, only the one with the highest <code>labelrank</code> will be drawn.
    * @param name The name of the point as shown in the legend, tooltip, dataLabel etc.
    * @param selected Whether the data point is selected initially.
    * @param x The x value of the point. For datetime axes, the X value is the timestamp in milliseconds since 1970.
    * @param y The y value of the point.
    */
  def apply(color: js.UndefOr[String | js.Object] = js.undefined, dataLabels: js.UndefOr[js.Object] = js.undefined, description: js.UndefOr[String] = js.undefined, events: js.UndefOr[CleanJsObject[SeriesSplineDataEvents]] = js.undefined, id: js.UndefOr[String] = js.undefined, labelrank: js.UndefOr[Double] = js.undefined, marker: js.UndefOr[CleanJsObject[SeriesSplineDataMarker]] = js.undefined, name: js.UndefOr[String] = js.undefined, selected: js.UndefOr[Boolean] = js.undefined, x: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined): SeriesSplineData = {
    val colorOuter: js.UndefOr[String | js.Object] = color
    val dataLabelsOuter: js.UndefOr[js.Object] = dataLabels
    val descriptionOuter: js.UndefOr[String] = description
    val eventsOuter: js.UndefOr[CleanJsObject[SeriesSplineDataEvents]] = events
    val idOuter: js.UndefOr[String] = id
    val labelrankOuter: js.UndefOr[Double] = labelrank
    val markerOuter: js.UndefOr[CleanJsObject[SeriesSplineDataMarker]] = marker
    val nameOuter: js.UndefOr[String] = name
    val selectedOuter: js.UndefOr[Boolean] = selected
    val xOuter: js.UndefOr[Double] = x
    val yOuter: js.UndefOr[Double] = y
    new SeriesSplineData {
      override val color: js.UndefOr[String | js.Object] = colorOuter
      override val dataLabels: js.UndefOr[js.Object] = dataLabelsOuter
      override val description: js.UndefOr[String] = descriptionOuter
      override val events: js.UndefOr[CleanJsObject[SeriesSplineDataEvents]] = eventsOuter
      override val id: js.UndefOr[String] = idOuter
      override val labelrank: js.UndefOr[Double] = labelrankOuter
      override val marker: js.UndefOr[CleanJsObject[SeriesSplineDataMarker]] = markerOuter
      override val name: js.UndefOr[String] = nameOuter
      override val selected: js.UndefOr[Boolean] = selectedOuter
      override val x: js.UndefOr[Double] = xOuter
      override val y: js.UndefOr[Double] = yOuter
    }
  }
}
