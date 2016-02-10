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
  * @note JavaScript name: <code>series&lt;heatmap&gt;-data</code>
  */
@js.annotation.ScalaJSDefined
class SeriesHeatmapData extends js.Object {

  /**
    * The color of the point. In heat maps the point color is rarely set explicitly, as we use the color to denote the <code>value</code>. Options for this are set in the <a href="#colorAxis">colorAxis</a> configuration.
    */
  val color: js.UndefOr[String | js.Object] = js.undefined

  /**
    * Individual data label for each point. The options are the same as the ones for  <a class="internal" href="#plotOptions.series.dataLabels">plotOptions.series.dataLabels</a>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/series/data-datalabels/" target="_blank">Disable data labels for individual areas</a>
    */
  val dataLabels: js.UndefOr[js.Object] = js.undefined

  /**
    * The <code>id</code> of a series in the <a href="#drilldown.series">drilldown.series</a> array to use for a drilldown for this point.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/demo/map-drilldown/" target="_blank">Basic drilldown</a>
    */
  val drilldown: js.UndefOr[String] = js.undefined

  /**
    * Individual point events
    */
  val events: js.UndefOr[CleanJsObject[SeriesHeatmapDataEvents]] = js.undefined

  /**
    * An id for the point. This can be used after render time to get a pointer to the point object through <code>chart.get()</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/series/data-id/" target="_blank">Highlight a point by id</a>
    */
  val id: js.UndefOr[String] = js.undefined

  /**
    * The name of the point as shown in the legend, tooltip, dataLabel etc.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/series/data-datalabels/" target="_blank">Point names</a>
    */
  val name: js.UndefOr[String] = js.undefined

  /**
    * The value of the point, resulting in a color controled by options as set in the <a href="#colorAxis">colorAxis</a> configuration.
    */
  val value: js.UndefOr[Double] = js.undefined

  /**
    * The x coordinate of the point.
    */
  val x: js.UndefOr[Double] = js.undefined

  /**
    * The y coordinate of the point.
    */
  val y: js.UndefOr[Double] = js.undefined
}

object SeriesHeatmapData {
  /**
    * @param color The color of the point. In heat maps the point color is rarely set explicitly, as we use the color to denote the <code>value</code>. Options for this are set in the <a href="#colorAxis">colorAxis</a> configuration.
    * @param dataLabels Individual data label for each point. The options are the same as the ones for  <a class="internal" href="#plotOptions.series.dataLabels">plotOptions.series.dataLabels</a>
    * @param drilldown The <code>id</code> of a series in the <a href="#drilldown.series">drilldown.series</a> array to use for a drilldown for this point.
    * @param events Individual point events
    * @param id An id for the point. This can be used after render time to get a pointer to the point object through <code>chart.get()</code>.
    * @param name The name of the point as shown in the legend, tooltip, dataLabel etc.
    * @param value The value of the point, resulting in a color controled by options as set in the <a href="#colorAxis">colorAxis</a> configuration.
    * @param x The x coordinate of the point.
    * @param y The y coordinate of the point.
    */
  def apply(color: js.UndefOr[String | js.Object] = js.undefined, dataLabels: js.UndefOr[js.Object] = js.undefined, drilldown: js.UndefOr[String] = js.undefined, events: js.UndefOr[CleanJsObject[SeriesHeatmapDataEvents]] = js.undefined, id: js.UndefOr[String] = js.undefined, name: js.UndefOr[String] = js.undefined, value: js.UndefOr[Double] = js.undefined, x: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined): SeriesHeatmapData = {
    val colorOuter: js.UndefOr[String | js.Object] = color
    val dataLabelsOuter: js.UndefOr[js.Object] = dataLabels
    val drilldownOuter: js.UndefOr[String] = drilldown
    val eventsOuter: js.UndefOr[CleanJsObject[SeriesHeatmapDataEvents]] = events
    val idOuter: js.UndefOr[String] = id
    val nameOuter: js.UndefOr[String] = name
    val valueOuter: js.UndefOr[Double] = value
    val xOuter: js.UndefOr[Double] = x
    val yOuter: js.UndefOr[Double] = y
    new SeriesHeatmapData {
      override val color: js.UndefOr[String | js.Object] = colorOuter
      override val dataLabels: js.UndefOr[js.Object] = dataLabelsOuter
      override val drilldown: js.UndefOr[String] = drilldownOuter
      override val events: js.UndefOr[CleanJsObject[SeriesHeatmapDataEvents]] = eventsOuter
      override val id: js.UndefOr[String] = idOuter
      override val name: js.UndefOr[String] = nameOuter
      override val value: js.UndefOr[Double] = valueOuter
      override val x: js.UndefOr[Double] = xOuter
      override val y: js.UndefOr[Double] = yOuter
    }
  }
}
