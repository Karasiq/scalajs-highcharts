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
  * @note JavaScript name: <code>series&lt;candlestick&gt;-data</code>
  */
@js.annotation.ScalaJSDefined
class SeriesCandlestickData extends js.Object {

  /**
    * The closing value of each data point.
    */
  val close: js.UndefOr[Double] = js.undefined

  /**
    * Individual color for the point.
    */
  val color: js.UndefOr[String | js.Object] = js.undefined

  /**
    * Individual data label for each point. The options are the same as the ones for  <a class="internal" href="#plotOptions.series.dataLabels">plotOptions.series.dataLabels</a>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/point/datalabels/" target="_blank">Show a label for the last value</a>
    */
  val dataLabels: js.UndefOr[js.Object] = js.undefined

  val events: js.UndefOr[CleanJsObject[SeriesCandlestickDataEvents]] = js.undefined

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
    * The opening value of each data point.
    */
  val open: js.UndefOr[Double] = js.undefined

  /**
    * Whether the data point is selected initially.
    */
  val selected: js.UndefOr[Boolean] = js.undefined

  /**
    * The x value of the point. For datetime axes, the X value is the timestamp in milliseconds since 1970.
    */
  val x: js.UndefOr[Double] = js.undefined
}

object SeriesCandlestickData {
  /**
    * @param close The closing value of each data point.
    * @param color Individual color for the point.
    * @param dataLabels Individual data label for each point. The options are the same as the ones for  <a class="internal" href="#plotOptions.series.dataLabels">plotOptions.series.dataLabels</a>
    * @param high The high or maximum value for each data point.
    * @param id An id for the point. This can be used after render time to get a pointer to the point object through <code>chart.get()</code>.
    * @param low The low or minimum value for each data point.
    * @param name The name of the point as shown in the legend, tooltip, dataLabel etc.
    * @param open The opening value of each data point.
    * @param selected Whether the data point is selected initially.
    * @param x The x value of the point. For datetime axes, the X value is the timestamp in milliseconds since 1970.
    */
  def apply(close: js.UndefOr[Double] = js.undefined, color: js.UndefOr[String | js.Object] = js.undefined, dataLabels: js.UndefOr[js.Object] = js.undefined, events: js.UndefOr[CleanJsObject[SeriesCandlestickDataEvents]] = js.undefined, high: js.UndefOr[Double] = js.undefined, id: js.UndefOr[String] = js.undefined, low: js.UndefOr[Double] = js.undefined, name: js.UndefOr[String] = js.undefined, open: js.UndefOr[Double] = js.undefined, selected: js.UndefOr[Boolean] = js.undefined, x: js.UndefOr[Double] = js.undefined): SeriesCandlestickData = {
    val closeOuter: js.UndefOr[Double] = close
    val colorOuter: js.UndefOr[String | js.Object] = color
    val dataLabelsOuter: js.UndefOr[js.Object] = dataLabels
    val eventsOuter: js.UndefOr[CleanJsObject[SeriesCandlestickDataEvents]] = events
    val highOuter: js.UndefOr[Double] = high
    val idOuter: js.UndefOr[String] = id
    val lowOuter: js.UndefOr[Double] = low
    val nameOuter: js.UndefOr[String] = name
    val openOuter: js.UndefOr[Double] = open
    val selectedOuter: js.UndefOr[Boolean] = selected
    val xOuter: js.UndefOr[Double] = x
    new SeriesCandlestickData {
      override val close: js.UndefOr[Double] = closeOuter
      override val color: js.UndefOr[String | js.Object] = colorOuter
      override val dataLabels: js.UndefOr[js.Object] = dataLabelsOuter
      override val events: js.UndefOr[CleanJsObject[SeriesCandlestickDataEvents]] = eventsOuter
      override val high: js.UndefOr[Double] = highOuter
      override val id: js.UndefOr[String] = idOuter
      override val low: js.UndefOr[Double] = lowOuter
      override val name: js.UndefOr[String] = nameOuter
      override val open: js.UndefOr[Double] = openOuter
      override val selected: js.UndefOr[Boolean] = selectedOuter
      override val x: js.UndefOr[Double] = xOuter
    }
  }
}
