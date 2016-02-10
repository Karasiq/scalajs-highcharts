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
  * @note JavaScript name: <code>series&lt;solidgauge&gt;-data</code>
  */
@js.annotation.ScalaJSDefined
class SeriesSolidgaugeData extends js.Object {

  /**
    * Individual color for the point. By default the color is pulled from the global <code>colors</code> array.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/point/color/" target="_blank">Mark the highest point</a>
    */
  val color: js.UndefOr[String | js.Object] = js.undefined

  /**
    * Individual data label for each point. The options are the same as the ones for  <a class="internal" href="#plotOptions.series.dataLabels">plotOptions.series.dataLabels</a>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/point/datalabels/" target="_blank">Show a label for the last value</a>
    */
  val dataLabels: js.UndefOr[js.Object] = js.undefined

  /**
    * Individual point events
    */
  val events: js.UndefOr[CleanJsObject[SeriesSolidgaugeDataEvents]] = js.undefined

  /**
    * An id for the point. This can be used after render time to get a pointer to the point object through <code>chart.get()</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/point/id/" target="_blank">Remove an id'd point</a>
    * @since 1.2.0
    */
  val id: js.UndefOr[String] = js.undefined

  /**
    * The inner radius of an individual point in a solid gauge. Can be given as a number (pixels) or percentage string.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/solidgauge-radius/" target="_blank">Individual radius and innerRadius</a>
    * @since 4.1.6
    */
  val innerRadius: js.UndefOr[Double | String] = js.undefined

  /**
    * <p>The name of the point as shown in the legend, tooltip, dataLabel etc.</p>
    * 
    * <p>If the <a href="#xAxis.type">xAxis.type</a> is set to <code>category</code>, and no <a href="#xAxis.categories">categories</a> option exists, the category will be pulled from the <code>point.name</code> of the last series defined. For multiple series, best practice however is to define <code>xAxis.categories</code>.</p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/series/data-array-of-objects/" target="_blank">Point names</a>
    */
  val name: js.UndefOr[String] = js.undefined

  /**
    * The outer radius of an individual point in a solid gauge. Can be given as a number (pixels) or percentage string.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/solidgauge-radius/" target="_blank">Individual radius and innerRadius</a>
    * @since 4.1.6
    */
  val radius: js.UndefOr[Double | String] = js.undefined

  /**
    * Whether the data point is selected initially.
    */
  val selected: js.UndefOr[Boolean] = js.undefined

  /**
    * The y value of the point.
    */
  val y: js.UndefOr[Double] = js.undefined
}

object SeriesSolidgaugeData {
  /**
    * @param color Individual color for the point. By default the color is pulled from the global <code>colors</code> array.
    * @param dataLabels Individual data label for each point. The options are the same as the ones for  <a class="internal" href="#plotOptions.series.dataLabels">plotOptions.series.dataLabels</a>
    * @param events Individual point events
    * @param id An id for the point. This can be used after render time to get a pointer to the point object through <code>chart.get()</code>.
    * @param innerRadius The inner radius of an individual point in a solid gauge. Can be given as a number (pixels) or percentage string.
    * @param name <p>The name of the point as shown in the legend, tooltip, dataLabel etc.</p>. . <p>If the <a href="#xAxis.type">xAxis.type</a> is set to <code>category</code>, and no <a href="#xAxis.categories">categories</a> option exists, the category will be pulled from the <code>point.name</code> of the last series defined. For multiple series, best practice however is to define <code>xAxis.categories</code>.</p>
    * @param radius The outer radius of an individual point in a solid gauge. Can be given as a number (pixels) or percentage string.
    * @param selected Whether the data point is selected initially.
    * @param y The y value of the point.
    */
  def apply(color: js.UndefOr[String | js.Object] = js.undefined, dataLabels: js.UndefOr[js.Object] = js.undefined, events: js.UndefOr[CleanJsObject[SeriesSolidgaugeDataEvents]] = js.undefined, id: js.UndefOr[String] = js.undefined, innerRadius: js.UndefOr[Double | String] = js.undefined, name: js.UndefOr[String] = js.undefined, radius: js.UndefOr[Double | String] = js.undefined, selected: js.UndefOr[Boolean] = js.undefined, y: js.UndefOr[Double] = js.undefined): SeriesSolidgaugeData = {
    val colorOuter: js.UndefOr[String | js.Object] = color
    val dataLabelsOuter: js.UndefOr[js.Object] = dataLabels
    val eventsOuter: js.UndefOr[CleanJsObject[SeriesSolidgaugeDataEvents]] = events
    val idOuter: js.UndefOr[String] = id
    val innerRadiusOuter: js.UndefOr[Double | String] = innerRadius
    val nameOuter: js.UndefOr[String] = name
    val radiusOuter: js.UndefOr[Double | String] = radius
    val selectedOuter: js.UndefOr[Boolean] = selected
    val yOuter: js.UndefOr[Double] = y
    new SeriesSolidgaugeData {
      override val color: js.UndefOr[String | js.Object] = colorOuter
      override val dataLabels: js.UndefOr[js.Object] = dataLabelsOuter
      override val events: js.UndefOr[CleanJsObject[SeriesSolidgaugeDataEvents]] = eventsOuter
      override val id: js.UndefOr[String] = idOuter
      override val innerRadius: js.UndefOr[Double | String] = innerRadiusOuter
      override val name: js.UndefOr[String] = nameOuter
      override val radius: js.UndefOr[Double | String] = radiusOuter
      override val selected: js.UndefOr[Boolean] = selectedOuter
      override val y: js.UndefOr[Double] = yOuter
    }
  }
}
