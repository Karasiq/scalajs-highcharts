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
  * @note JavaScript name: <code>series&lt;mapline&gt;-data</code>
  */
class SeriesMaplineData extends com.highcharts.HighchartsGenericObject {

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
    * <p>Individual point events</p>
    */
  var events: js.UndefOr[CleanJsObject[SeriesMaplineDataEvents]] = js.undefined

  /**
    * <p>For map and mapline series types, the geometry of a point.</p>
    * <p>To achieve a better separation between the structure and the data,
    * it is recommended to use <code>mapData</code> to define the geometry instead
    * of defining it on the data points themselves.</p>
    * <p>The geometry object is compatible to that of a <code>feature</code> in geoJSON, so
    * features of geoJSON can be passed directly into the <code>data</code>, optionally
    * after first filtering and processing it.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/series/data-geometry/">Geometry defined in data</a>
    * @since 9.3.0
    */
  var geometry: js.UndefOr[CleanJsObject[SeriesMaplineDataGeometry]] = js.undefined

  /**
    * <p>An id for the point. This can be used after render time to get a
    * pointer to the point object through <code>chart.get()</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/series/data-id/">Highlight a point by id</a>
    */
  var id: js.UndefOr[String] = js.undefined

  /**
    * <p>When data labels are laid out on a map, Highmaps runs a simplified
    * algorithm to detect collision. When two labels collide, the one with
    * the lowest rank is hidden. By default the rank is computed from the
    * area.</p>
    */
  var labelrank: js.UndefOr[Double] = js.undefined

  /**
    * <p>The relative mid point of an area, used to place the data label.
    * Ranges from 0 to 1. When <code>mapData</code> is used, middleX can be defined
    * there.</p>
    */
  var middleX: js.UndefOr[Double] = js.undefined

  /**
    * <p>The relative mid point of an area, used to place the data label.
    * Ranges from 0 to 1. When <code>mapData</code> is used, middleY can be defined
    * there.</p>
    */
  var middleY: js.UndefOr[Double] = js.undefined

  /**
    * <p>The name of the point as shown in the legend, tooltip, dataLabel
    * etc.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/series/data-datalabels/">Point names</a>
    */
  var name: js.UndefOr[String] = js.undefined

  /**
    * <p>For map and mapline series types, the SVG path for the shape. For
    * compatibily with old IE, not all SVG path definitions are supported,
    * but M, L and C operators are safe.</p>
    * <p>To achieve a better separation between the structure and the data,
    * it is recommended to use <code>mapData</code> to define that paths instead
    * of defining them on the data points themselves.</p>
    * <p>For providing true geographical shapes based on longitude and latitude, use
    * the <code>geometry</code> option instead.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/series/data-path/">Paths defined in data</a>
    */
  var path: js.UndefOr[String] = js.undefined

  /**
    * <p>The numeric value of the data point.</p>
    */
  var value: js.UndefOr[Double | Null] = js.undefined
}

object SeriesMaplineData {
  /**
    * @param color <p>Individual color for the point. By default the color is either used. to denote the value, or pulled from the global <code>colors</code> array.</p>
    * @param dataLabels <p>Individual data label for each point. The options are the same as. the ones for <a href="#plotOptions.series.dataLabels">plotOptions.series.dataLabels</a>.</p>
    * @param events <p>Individual point events</p>
    * @param geometry <p>For map and mapline series types, the geometry of a point.</p>. <p>To achieve a better separation between the structure and the data,. it is recommended to use <code>mapData</code> to define the geometry instead. of defining it on the data points themselves.</p>. <p>The geometry object is compatible to that of a <code>feature</code> in geoJSON, so. features of geoJSON can be passed directly into the <code>data</code>, optionally. after first filtering and processing it.</p>
    * @param id <p>An id for the point. This can be used after render time to get a. pointer to the point object through <code>chart.get()</code>.</p>
    * @param labelrank <p>When data labels are laid out on a map, Highmaps runs a simplified. algorithm to detect collision. When two labels collide, the one with. the lowest rank is hidden. By default the rank is computed from the. area.</p>
    * @param middleX <p>The relative mid point of an area, used to place the data label.. Ranges from 0 to 1. When <code>mapData</code> is used, middleX can be defined. there.</p>
    * @param middleY <p>The relative mid point of an area, used to place the data label.. Ranges from 0 to 1. When <code>mapData</code> is used, middleY can be defined. there.</p>
    * @param name <p>The name of the point as shown in the legend, tooltip, dataLabel. etc.</p>
    * @param path <p>For map and mapline series types, the SVG path for the shape. For. compatibily with old IE, not all SVG path definitions are supported,. but M, L and C operators are safe.</p>. <p>To achieve a better separation between the structure and the data,. it is recommended to use <code>mapData</code> to define that paths instead. of defining them on the data points themselves.</p>. <p>For providing true geographical shapes based on longitude and latitude, use. the <code>geometry</code> option instead.</p>
    * @param value <p>The numeric value of the data point.</p>
    */
  def apply(color: js.UndefOr[String | js.Object] = js.undefined, dataLabels: js.UndefOr[js.Any] = js.undefined, events: js.UndefOr[CleanJsObject[SeriesMaplineDataEvents]] = js.undefined, geometry: js.UndefOr[CleanJsObject[SeriesMaplineDataGeometry]] = js.undefined, id: js.UndefOr[String] = js.undefined, labelrank: js.UndefOr[Double] = js.undefined, middleX: js.UndefOr[Double] = js.undefined, middleY: js.UndefOr[Double] = js.undefined, name: js.UndefOr[String] = js.undefined, path: js.UndefOr[String] = js.undefined, value: js.UndefOr[Double | Null] = js.undefined): SeriesMaplineData = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesMaplineData {
      this.color = color
      this.dataLabels = dataLabels
      this.events = events
      this.geometry = geometry
      this.id = id
      this.labelrank = labelrank
      this.middleX = middleX
      this.middleY = middleY
      this.name = name
      this.path = path
      this.value = value
    })
  }
}
