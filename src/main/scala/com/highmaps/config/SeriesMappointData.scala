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
class SeriesMappointData extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The latitude of the point. Must be combined with the <code>lon</code> option
    * to work. Overrides <code>x</code> and <code>y</code> values.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/mappoint-latlon/">Point position by lat/lon</a>
    * @since 1.1.0
    */
  val lat: js.UndefOr[Double] = js.undefined

  /**
    * <p>The longitude of the point. Must be combined with the <code>lon</code> option
    * to work. Overrides <code>x</code> and <code>y</code> values.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/mappoint-latlon/">Point position by lat/lon</a>
    * @since 1.1.0
    */
  val lon: js.UndefOr[Double] = js.undefined

  /**
    * <p>The x coordinate of the point in terms of the map path coordinates.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/mapline-mappoint/">Map point demo</a>
    */
  val x: js.UndefOr[Double] = js.undefined

  /**
    * <p>The x coordinate of the point in terms of the map path coordinates.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/mapline-mappoint/">Map point demo</a>
    */
  val y: js.UndefOr[Double] = js.undefined

  /**
    * <p>Individual color for the point. By default the color is either used
    * to denote the value, or pulled from the global <code>colors</code> array.</p>
    */
  val color: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>Individual data label for each point. The options are the same as
    * the ones for <a href="#plotOptions.series.dataLabels">plotOptions.series.dataLabels</a>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/series/data-datalabels/">Disable data labels for individual areas</a>
    */
  val dataLabels: js.UndefOr[js.Object] = js.undefined

  /**
    * <p>The <code>id</code> of a series in the <a href="#drilldown.series">drilldown.series</a>
    * array to use for a drilldown for this point.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/map-drilldown/">Basic drilldown</a>
    */
  val drilldown: js.UndefOr[String] = js.undefined

  /**
    * <p>An id for the point. This can be used after render time to get a
    * pointer to the point object through <code>chart.get()</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/series/data-id/">Highlight a point by id</a>
    */
  val id: js.UndefOr[String] = js.undefined

  /**
    * <p>The name of the point as shown in the legend, tooltip, dataLabel
    * etc.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/series/data-datalabels/">Point names</a>
    */
  val name: js.UndefOr[String] = js.undefined

  /**
    * <p>Individual point events</p>
    */
  val events: js.UndefOr[CleanJsObject[SeriesMappointDataEvents]] = js.undefined
}

object SeriesMappointData {
  /**
    * @param lat <p>The latitude of the point. Must be combined with the <code>lon</code> option. to work. Overrides <code>x</code> and <code>y</code> values.</p>
    * @param lon <p>The longitude of the point. Must be combined with the <code>lon</code> option. to work. Overrides <code>x</code> and <code>y</code> values.</p>
    * @param x <p>The x coordinate of the point in terms of the map path coordinates.</p>
    * @param y <p>The x coordinate of the point in terms of the map path coordinates.</p>
    * @param color <p>Individual color for the point. By default the color is either used. to denote the value, or pulled from the global <code>colors</code> array.</p>
    * @param dataLabels <p>Individual data label for each point. The options are the same as. the ones for <a href="#plotOptions.series.dataLabels">plotOptions.series.dataLabels</a>.</p>
    * @param drilldown <p>The <code>id</code> of a series in the <a href="#drilldown.series">drilldown.series</a>. array to use for a drilldown for this point.</p>
    * @param id <p>An id for the point. This can be used after render time to get a. pointer to the point object through <code>chart.get()</code>.</p>
    * @param name <p>The name of the point as shown in the legend, tooltip, dataLabel. etc.</p>
    * @param events <p>Individual point events</p>
    */
  def apply(lat: js.UndefOr[Double] = js.undefined, lon: js.UndefOr[Double] = js.undefined, x: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined, color: js.UndefOr[String | js.Object] = js.undefined, dataLabels: js.UndefOr[js.Object] = js.undefined, drilldown: js.UndefOr[String] = js.undefined, id: js.UndefOr[String] = js.undefined, name: js.UndefOr[String] = js.undefined, events: js.UndefOr[CleanJsObject[SeriesMappointDataEvents]] = js.undefined): SeriesMappointData = {
    val latOuter: js.UndefOr[Double] = lat
    val lonOuter: js.UndefOr[Double] = lon
    val xOuter: js.UndefOr[Double] = x
    val yOuter: js.UndefOr[Double] = y
    val colorOuter: js.UndefOr[String | js.Object] = color
    val dataLabelsOuter: js.UndefOr[js.Object] = dataLabels
    val drilldownOuter: js.UndefOr[String] = drilldown
    val idOuter: js.UndefOr[String] = id
    val nameOuter: js.UndefOr[String] = name
    val eventsOuter: js.UndefOr[CleanJsObject[SeriesMappointDataEvents]] = events
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesMappointData {
      override val lat: js.UndefOr[Double] = latOuter
      override val lon: js.UndefOr[Double] = lonOuter
      override val x: js.UndefOr[Double] = xOuter
      override val y: js.UndefOr[Double] = yOuter
      override val color: js.UndefOr[String | js.Object] = colorOuter
      override val dataLabels: js.UndefOr[js.Object] = dataLabelsOuter
      override val drilldown: js.UndefOr[String] = drilldownOuter
      override val id: js.UndefOr[String] = idOuter
      override val name: js.UndefOr[String] = nameOuter
      override val events: js.UndefOr[CleanJsObject[SeriesMappointDataEvents]] = eventsOuter
    })
  }
}
