/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/gantt]]
  */
package com.gantt.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>series&lt;mappoint&gt;-data</code>
  */
class SeriesMappointData extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The geometry of a point.</p>
    * <p>To achieve a better separation between the structure and the data,
    * it is recommended to use <code>mapData</code> to define the geometry instead
    * of defining it on the data points themselves.</p>
    * <p>The geometry object is compatible to that of a <code>feature</code> in geoJSON, so
    * features of geoJSON can be passed directly into the <code>data</code>, optionally
    * after first filtering and processing it.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/series/data-geometry/">geometry defined in data</a>
    * @since 9.3.0
    */
  var geometry: js.UndefOr[CleanJsObject[SeriesMappointDataGeometry]] = js.undefined

  /**
    * <p>The latitude of the point. Must be combined with the <code>lon</code> option
    * to work. Overrides <code>x</code> and <code>y</code> values.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/mappoint-latlon/">Point position by lat/lon</a>
    * @since 1.1.0
    */
  var lat: js.UndefOr[Double] = js.undefined

  /**
    * <p>The longitude of the point. Must be combined with the <code>lon</code> option
    * to work. Overrides <code>x</code> and <code>y</code> values.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/mappoint-latlon/">Point position by lat/lon</a>
    * @since 1.1.0
    */
  var lon: js.UndefOr[Double] = js.undefined

  /**
    * <p>The x coordinate of the point in terms of the map path coordinates.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/mapline-mappoint/">Map point demo</a>
    */
  var x: js.UndefOr[Double] = js.undefined

  /**
    * <p>The x coordinate of the point in terms of the map path coordinates.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/mapline-mappoint/">Map point demo</a>
    */
  var y: js.UndefOr[Double | Null] = js.undefined

  /**
    * <p>Individual color for the point. By default the color is either used
    * to denote the value, or pulled from the global <code>colors</code> array.</p>
    */
  var color: js.UndefOr[String | js.Object] = js.undefined

  /**
    * <p>Individual data label for each point. The options are the same as
    * the ones for <a href="#plotOptions.series.dataLabels">plotOptions.series.dataLabels</a>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/series/data-datalabels/">Disable data labels for individual areas</a>
    */
  var dataLabels: js.Any = js.undefined

  /**
    * <p>The <code>id</code> of a series in the <a href="#drilldown.series">drilldown.series</a>
    * array to use for a drilldown for this point.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/map-drilldown/">Basic drilldown</a>
    */
  var drilldown: js.UndefOr[String] = js.undefined

  /**
    * <p>Individual point events</p>
    */
  var events: js.UndefOr[CleanJsObject[SeriesMappointDataEvents]] = js.undefined

  /**
    * <p>An id for the point. This can be used after render time to get a
    * pointer to the point object through <code>chart.get()</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/series/data-id/">Highlight a point by id</a>
    */
  var id: js.UndefOr[String] = js.undefined

  /**
    * <p>The name of the point as shown in the legend, tooltip, dataLabel
    * etc.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/series/data-datalabels/">Point names</a>
    */
  var name: js.UndefOr[String] = js.undefined
}

object SeriesMappointData {
  /**
    * @param geometry <p>The geometry of a point.</p>. <p>To achieve a better separation between the structure and the data,. it is recommended to use <code>mapData</code> to define the geometry instead. of defining it on the data points themselves.</p>. <p>The geometry object is compatible to that of a <code>feature</code> in geoJSON, so. features of geoJSON can be passed directly into the <code>data</code>, optionally. after first filtering and processing it.</p>
    * @param lat <p>The latitude of the point. Must be combined with the <code>lon</code> option. to work. Overrides <code>x</code> and <code>y</code> values.</p>
    * @param lon <p>The longitude of the point. Must be combined with the <code>lon</code> option. to work. Overrides <code>x</code> and <code>y</code> values.</p>
    * @param x <p>The x coordinate of the point in terms of the map path coordinates.</p>
    * @param y <p>The x coordinate of the point in terms of the map path coordinates.</p>
    * @param color <p>Individual color for the point. By default the color is either used. to denote the value, or pulled from the global <code>colors</code> array.</p>
    * @param dataLabels <p>Individual data label for each point. The options are the same as. the ones for <a href="#plotOptions.series.dataLabels">plotOptions.series.dataLabels</a>.</p>
    * @param drilldown <p>The <code>id</code> of a series in the <a href="#drilldown.series">drilldown.series</a>. array to use for a drilldown for this point.</p>
    * @param events <p>Individual point events</p>
    * @param id <p>An id for the point. This can be used after render time to get a. pointer to the point object through <code>chart.get()</code>.</p>
    * @param name <p>The name of the point as shown in the legend, tooltip, dataLabel. etc.</p>
    */
  def apply(geometry: js.UndefOr[CleanJsObject[SeriesMappointDataGeometry]] = js.undefined, lat: js.UndefOr[Double] = js.undefined, lon: js.UndefOr[Double] = js.undefined, x: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double | Null] = js.undefined, color: js.UndefOr[String | js.Object] = js.undefined, dataLabels: js.UndefOr[js.Any] = js.undefined, drilldown: js.UndefOr[String] = js.undefined, events: js.UndefOr[CleanJsObject[SeriesMappointDataEvents]] = js.undefined, id: js.UndefOr[String] = js.undefined, name: js.UndefOr[String] = js.undefined): SeriesMappointData = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesMappointData {
      this.geometry = geometry
      this.lat = lat
      this.lon = lon
      this.x = x
      this.y = y
      this.color = color
      this.dataLabels = dataLabels
      this.drilldown = drilldown
      this.events = events
      this.id = id
      this.name = name
    })
  }
}
