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
  * @note JavaScript name: <code>series&lt;areasplinerange&gt;-data</code>
  */
@js.annotation.ScalaJSDefined
class SeriesAreasplinerangeData extends js.Object {

  /**
    * Individual color for the point.
    */
  val color: js.UndefOr[String | js.Object] = js.undefined

  /**
    * Individual data label for each point. The options are the same as the ones for  <a class="internal" href="#plotOptions.series.dataLabels">plotOptions.series.dataLabels</a>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/point/datalabels/" target="_blank">Show a label for the last value</a>
    */
  val dataLabels: js.UndefOr[js.Object] = js.undefined

  val events: js.UndefOr[CleanJsObject[SeriesAreasplinerangeDataEvents]] = js.undefined

  /**
    * The high or maximum value for each data point.
    */
  val high: js.UndefOr[Double] = js.undefined

  /**
    * An id for the point. This can be used after render time to get a pointer to the point object through <code>chart.get()</code>.
    */
  val id: js.UndefOr[String] = js.undefined

  /**
    * The low or minimum value for each data point.
    */
  val low: js.UndefOr[Double] = js.undefined

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
}

object SeriesAreasplinerangeData {
  /**
    * @param color Individual color for the point.
    * @param dataLabels Individual data label for each point. The options are the same as the ones for  <a class="internal" href="#plotOptions.series.dataLabels">plotOptions.series.dataLabels</a>
    * @param high The high or maximum value for each data point.
    * @param id An id for the point. This can be used after render time to get a pointer to the point object through <code>chart.get()</code>.
    * @param low The low or minimum value for each data point.
    * @param name The name of the point as shown in the legend, tooltip, dataLabel etc.
    * @param selected Whether the data point is selected initially.
    * @param x The x value of the point. For datetime axes, the X value is the timestamp in milliseconds since 1970.
    */
  def apply(color: js.UndefOr[String | js.Object] = js.undefined, dataLabels: js.UndefOr[js.Object] = js.undefined, events: js.UndefOr[CleanJsObject[SeriesAreasplinerangeDataEvents]] = js.undefined, high: js.UndefOr[Double] = js.undefined, id: js.UndefOr[String] = js.undefined, low: js.UndefOr[Double] = js.undefined, name: js.UndefOr[String] = js.undefined, selected: js.UndefOr[Boolean] = js.undefined, x: js.UndefOr[Double] = js.undefined): SeriesAreasplinerangeData = {
    val colorOuter: js.UndefOr[String | js.Object] = color
    val dataLabelsOuter: js.UndefOr[js.Object] = dataLabels
    val eventsOuter: js.UndefOr[CleanJsObject[SeriesAreasplinerangeDataEvents]] = events
    val highOuter: js.UndefOr[Double] = high
    val idOuter: js.UndefOr[String] = id
    val lowOuter: js.UndefOr[Double] = low
    val nameOuter: js.UndefOr[String] = name
    val selectedOuter: js.UndefOr[Boolean] = selected
    val xOuter: js.UndefOr[Double] = x
    new SeriesAreasplinerangeData {
      override val color: js.UndefOr[String | js.Object] = colorOuter
      override val dataLabels: js.UndefOr[js.Object] = dataLabelsOuter
      override val events: js.UndefOr[CleanJsObject[SeriesAreasplinerangeDataEvents]] = eventsOuter
      override val high: js.UndefOr[Double] = highOuter
      override val id: js.UndefOr[String] = idOuter
      override val low: js.UndefOr[Double] = lowOuter
      override val name: js.UndefOr[String] = nameOuter
      override val selected: js.UndefOr[Boolean] = selectedOuter
      override val x: js.UndefOr[Double] = xOuter
    }
  }
}
