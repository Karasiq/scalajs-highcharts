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
  * @note JavaScript name: <code>series&lt;mappoint&gt;-data</code>
  */
@js.annotation.ScalaJSDefined
class SeriesMappointData extends js.Object {

  /**
    * Individual color for the point. By default the color is either used to denote the value, or pulled from the global <code>colors</code> array.
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
  val events: js.UndefOr[CleanJsObject[SeriesMappointDataEvents]] = js.undefined

  /**
    * An id for the point. This can be used after render time to get a pointer to the point object through <code>chart.get()</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/series/data-id/" target="_blank">Highlight a point by id</a>
    */
  val id: js.UndefOr[String] = js.undefined

  /**
    * The latitude of the point. Must be combined with the <code>lon</code> option to work. Overrides <code>x</code> and <code>y</code> values.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/demo/mappoint-latlon/" target="_blank">Point position by lat/lon</a>
    * @since 1.1.0
    */
  val lat: js.UndefOr[Double] = js.undefined

  /**
    * The longitude of the point. Must be combined with the <code>lon</code> option to work. Overrides <code>x</code> and <code>y</code> values.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/demo/mappoint-latlon/" target="_blank">Point position by lat/lon</a>
    * @since 1.1.0
    */
  val lon: js.UndefOr[Double] = js.undefined

  /**
    * The name of the point as shown in the legend, tooltip, dataLabel etc.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/series/data-datalabels/" target="_blank">Point names</a>
    */
  val name: js.UndefOr[String] = js.undefined

  /**
    * The x coordinate of the point in terms of the map path coordinates.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/demo/mapline-mappoint/" target="_blank">Map point demo</a>
    */
  val x: js.UndefOr[Double] = js.undefined

  /**
    * The x coordinate of the point in terms of the map path coordinates.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/demo/mapline-mappoint/" target="_blank">Map point demo</a>
    */
  val y: js.UndefOr[Double] = js.undefined
}

object SeriesMappointData {
  /**
    * @param color Individual color for the point. By default the color is either used to denote the value, or pulled from the global <code>colors</code> array.
    * @param dataLabels Individual data label for each point. The options are the same as the ones for  <a class="internal" href="#plotOptions.series.dataLabels">plotOptions.series.dataLabels</a>
    * @param drilldown The <code>id</code> of a series in the <a href="#drilldown.series">drilldown.series</a> array to use for a drilldown for this point.
    * @param events Individual point events
    * @param id An id for the point. This can be used after render time to get a pointer to the point object through <code>chart.get()</code>.
    * @param lat The latitude of the point. Must be combined with the <code>lon</code> option to work. Overrides <code>x</code> and <code>y</code> values.
    * @param lon The longitude of the point. Must be combined with the <code>lon</code> option to work. Overrides <code>x</code> and <code>y</code> values.
    * @param name The name of the point as shown in the legend, tooltip, dataLabel etc.
    * @param x The x coordinate of the point in terms of the map path coordinates.
    * @param y The x coordinate of the point in terms of the map path coordinates.
    */
  def apply(color: js.UndefOr[String | js.Object] = js.undefined, dataLabels: js.UndefOr[js.Object] = js.undefined, drilldown: js.UndefOr[String] = js.undefined, events: js.UndefOr[CleanJsObject[SeriesMappointDataEvents]] = js.undefined, id: js.UndefOr[String] = js.undefined, lat: js.UndefOr[Double] = js.undefined, lon: js.UndefOr[Double] = js.undefined, name: js.UndefOr[String] = js.undefined, x: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined): SeriesMappointData = {
    val colorOuter: js.UndefOr[String | js.Object] = color
    val dataLabelsOuter: js.UndefOr[js.Object] = dataLabels
    val drilldownOuter: js.UndefOr[String] = drilldown
    val eventsOuter: js.UndefOr[CleanJsObject[SeriesMappointDataEvents]] = events
    val idOuter: js.UndefOr[String] = id
    val latOuter: js.UndefOr[Double] = lat
    val lonOuter: js.UndefOr[Double] = lon
    val nameOuter: js.UndefOr[String] = name
    val xOuter: js.UndefOr[Double] = x
    val yOuter: js.UndefOr[Double] = y
    new SeriesMappointData {
      override val color: js.UndefOr[String | js.Object] = colorOuter
      override val dataLabels: js.UndefOr[js.Object] = dataLabelsOuter
      override val drilldown: js.UndefOr[String] = drilldownOuter
      override val events: js.UndefOr[CleanJsObject[SeriesMappointDataEvents]] = eventsOuter
      override val id: js.UndefOr[String] = idOuter
      override val lat: js.UndefOr[Double] = latOuter
      override val lon: js.UndefOr[Double] = lonOuter
      override val name: js.UndefOr[String] = nameOuter
      override val x: js.UndefOr[Double] = xOuter
      override val y: js.UndefOr[Double] = yOuter
    }
  }
}
