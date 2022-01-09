/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highstock]]
  */
package com.highstock.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>mapView</code>
  */
class MapView extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The center of the map in terms of longitude and latitude. For
    * preprojected maps (like in Map Collection v1.x), the units are projected
    * x and y units.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/mapview/center-zoom">Custom view of a world map</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/mapview/get-view">Report the current view of a preprojected map</a>
    * @since 9.3.0
    */
  var center: js.Any = js.undefined

  /**
    * <p>Prevents the end user from zooming too far in on the map. See
    * <a href="#mapView.zoom">zoom</a>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/mapview/maxzoom">Prevent zooming in too far</a>
    * @since 9.3.0
    */
  var maxZoom: js.UndefOr[js.UndefOr[Double]] = js.undefined

  /**
    * <p>The padding inside the plot area when auto fitting to the map bounds. A
    * number signifies pixels, and a percentage is relative to the plot area
    * size.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/chart/plotbackgroundcolor-color">Visible plot area and percentage padding</a>
    * @since 9.3.0
    */
  var padding: js.UndefOr[Double] = js.undefined

  /**
    * <p>Beta feature in v9.3. The projection options allow applying client side
    * projection to a map given in coordinates, typically from TopoJSON or
    * GeoJSON.</p>
    * <p>Sub-options are:</p>
    * <ul>
    * <li><code>name</code>, which as of v9.3 can be <code>EqualEarth</code>,
    * <code>LambertConformalConic</code>, <code>Miller</code>, <code>Orthographic</code> or <code>WebMercator</code>.</li>
    * <li><code>parallels</code>, the standard parallels for the LambertConformalConic
    * projection.</li>
    * <li><code>rotation</code>, a three-axis rotation of the globe prior to projection,
    * which in practice can be used for example to render a world map with the
    * Americas centered (<code>[90, 0]</code>), or to rotate an orthographic projection.</li>
    * </ul>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/topojson-projection">Orthographic projection</a>
    * @since 9.3.0
    */
  var projection: js.UndefOr[js.Object] = js.undefined

  /**
    * <p>The zoom level of a map. Higher zoom levels means more zoomed in. An
    * increase of 1 zooms in to a quarter of the viewed area (half the width
    * and height). Defaults to fitting to the map bounds.</p>
    * <p>In a <code>WebMercator</code> projection, a zoom level of 0 represents
    * the world in a 256x256 pixel square. This is a common concept for WMS
    * tiling software.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/mapview/center-zoom">Custom view of a world map</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/mapview/get-view">Report the current view of a preprojected map</a>
    * @since 9.3.0
    */
  var zoom: js.UndefOr[js.UndefOr[Double]] = js.undefined
}

object MapView {
  /**
    * @param center <p>The center of the map in terms of longitude and latitude. For. preprojected maps (like in Map Collection v1.x), the units are projected. x and y units.</p>
    * @param maxZoom <p>Prevents the end user from zooming too far in on the map. See. <a href="#mapView.zoom">zoom</a>.</p>
    * @param padding <p>The padding inside the plot area when auto fitting to the map bounds. A. number signifies pixels, and a percentage is relative to the plot area. size.</p>
    * @param projection <p>Beta feature in v9.3. The projection options allow applying client side. projection to a map given in coordinates, typically from TopoJSON or. GeoJSON.</p>. <p>Sub-options are:</p>. <ul>. <li><code>name</code>, which as of v9.3 can be <code>EqualEarth</code>,. <code>LambertConformalConic</code>, <code>Miller</code>, <code>Orthographic</code> or <code>WebMercator</code>.</li>. <li><code>parallels</code>, the standard parallels for the LambertConformalConic. projection.</li>. <li><code>rotation</code>, a three-axis rotation of the globe prior to projection,. which in practice can be used for example to render a world map with the. Americas centered (<code>[90, 0]</code>), or to rotate an orthographic projection.</li>. </ul>
    * @param zoom <p>The zoom level of a map. Higher zoom levels means more zoomed in. An. increase of 1 zooms in to a quarter of the viewed area (half the width. and height). Defaults to fitting to the map bounds.</p>. <p>In a <code>WebMercator</code> projection, a zoom level of 0 represents. the world in a 256x256 pixel square. This is a common concept for WMS. tiling software.</p>
    */
  def apply(center: js.UndefOr[js.Any] = js.undefined, maxZoom: js.UndefOr[js.UndefOr[Double]] = js.undefined, padding: js.UndefOr[Double] = js.undefined, projection: js.UndefOr[js.Object] = js.undefined, zoom: js.UndefOr[js.UndefOr[Double]] = js.undefined): MapView = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new MapView {
      this.center = center
      this.maxZoom = maxZoom
      this.padding = padding
      this.projection = projection
      this.zoom = zoom
    })
  }
}
