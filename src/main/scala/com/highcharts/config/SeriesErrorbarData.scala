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
  * @note JavaScript name: <code>series&lt;errorbar&gt;-data</code>
  */
@js.annotation.ScalaJSDefined
class SeriesErrorbarData extends js.Object {

  /**
    * Individual color for the point. By default the color is pulled from the global <code>colors</code> array.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/point/color/" target="_blank">Mark the highest point</a>
    */
  val color: js.UndefOr[String | js.Object] = js.undefined

  /**
    * Individual point events
    */
  val events: js.UndefOr[CleanJsObject[SeriesErrorbarDataEvents]] = js.undefined

  /**
    * The high or maximum value for each data point.
    */
  val high: js.UndefOr[Double] = js.undefined

  /**
    * An id for the point. This can be used after render time to get a pointer to the point object through <code>chart.get()</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/point/id/" target="_blank">Remove an id'd point</a>
    * @since 1.2.0
    */
  val id: js.UndefOr[String] = js.undefined

  /**
    * The low or minimum value for each data point.
    */
  val low: js.UndefOr[Double] = js.undefined

  /**
    * <p>The name of the point as shown in the legend, tooltip, dataLabel etc.</p>
    * 
    * <p>If the <a href="#xAxis.type">xAxis.type</a> is set to <code>category</code>, and no <a href="#xAxis.categories">categories</a> option exists, the category will be pulled from the <code>point.name</code> of the last series defined. For multiple series, best practice however is to define <code>xAxis.categories</code>.</p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/series/data-array-of-objects/" target="_blank">Point names</a>
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

object SeriesErrorbarData {
  /**
    * @param color Individual color for the point. By default the color is pulled from the global <code>colors</code> array.
    * @param events Individual point events
    * @param high The high or maximum value for each data point.
    * @param id An id for the point. This can be used after render time to get a pointer to the point object through <code>chart.get()</code>.
    * @param low The low or minimum value for each data point.
    * @param name <p>The name of the point as shown in the legend, tooltip, dataLabel etc.</p>. . <p>If the <a href="#xAxis.type">xAxis.type</a> is set to <code>category</code>, and no <a href="#xAxis.categories">categories</a> option exists, the category will be pulled from the <code>point.name</code> of the last series defined. For multiple series, best practice however is to define <code>xAxis.categories</code>.</p>
    * @param selected Whether the data point is selected initially.
    * @param x The x value of the point. For datetime axes, the X value is the timestamp in milliseconds since 1970.
    */
  def apply(color: js.UndefOr[String | js.Object] = js.undefined, events: js.UndefOr[CleanJsObject[SeriesErrorbarDataEvents]] = js.undefined, high: js.UndefOr[Double] = js.undefined, id: js.UndefOr[String] = js.undefined, low: js.UndefOr[Double] = js.undefined, name: js.UndefOr[String] = js.undefined, selected: js.UndefOr[Boolean] = js.undefined, x: js.UndefOr[Double] = js.undefined): SeriesErrorbarData = {
    val colorOuter: js.UndefOr[String | js.Object] = color
    val eventsOuter: js.UndefOr[CleanJsObject[SeriesErrorbarDataEvents]] = events
    val highOuter: js.UndefOr[Double] = high
    val idOuter: js.UndefOr[String] = id
    val lowOuter: js.UndefOr[Double] = low
    val nameOuter: js.UndefOr[String] = name
    val selectedOuter: js.UndefOr[Boolean] = selected
    val xOuter: js.UndefOr[Double] = x
    new SeriesErrorbarData {
      override val color: js.UndefOr[String | js.Object] = colorOuter
      override val events: js.UndefOr[CleanJsObject[SeriesErrorbarDataEvents]] = eventsOuter
      override val high: js.UndefOr[Double] = highOuter
      override val id: js.UndefOr[String] = idOuter
      override val low: js.UndefOr[Double] = lowOuter
      override val name: js.UndefOr[String] = nameOuter
      override val selected: js.UndefOr[Boolean] = selectedOuter
      override val x: js.UndefOr[Double] = xOuter
    }
  }
}
