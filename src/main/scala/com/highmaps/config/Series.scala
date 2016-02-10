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
  * @note JavaScript name: <code>series</code>
  */
@js.annotation.ScalaJSDefined
class Series extends js.Object {

  /**
    * <p>An array of data points for the series.</p>
    */
  val data: js.UndefOr[js.Array[js.Object | js.Array[js.Any] | Double]] = js.undefined

  /**
    * An id for the series. This can be used after render time to get a pointer to the series object through <code>chart.get()</code>.
    */
  val id: js.UndefOr[String] = js.undefined

  /**
    * The index of the series in the chart, affecting the internal index in the <code>chart.series</code> array, the visible Z index as well as the order in the legend.
    */
  val index: js.UndefOr[Double] = js.undefined

  /**
    * The sequential index of the series in the legend.
    */
  val legendIndex: js.UndefOr[Double] = js.undefined

  /**
    * An array of objects containing a <code>path</code> definition and optionally a code or property to join in the data as per the <code>joinBy</code> option. 
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/demo/category-map/" target="_blank">Map data and joinBy</a>
    */
  val mapData: js.UndefOr[js.Array[CleanJsObject[SeriesMapData]]] = js.undefined

  /**
    * The name of the series as shown in the legend, tooltip etc.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/demo/category-map/" target="_blank">Series name</a>
    */
  val name: js.UndefOr[String] = js.undefined

  /**
    * The type of series. Can be one of <code>area</code>, <code>areaspline</code>,
    *  <code>bar</code>, <code>column</code>, <code>line</code>, <code>pie</code>,
    *  <code>scatter</code> or <code>spline</code>. From version 2.3, <code>arearange</code>, <code>areasplinerange</code> and <code>columnrange</code> are supported with the highcharts-more.js component.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/demo/mapline-mappoint/" target="_blank">Multiple types in the same map</a>
    */
  val `type`: js.UndefOr[String] = js.undefined
}

object Series {
  /**
    * @param data <p>An array of data points for the series.</p>
    * @param id An id for the series. This can be used after render time to get a pointer to the series object through <code>chart.get()</code>.
    * @param index The index of the series in the chart, affecting the internal index in the <code>chart.series</code> array, the visible Z index as well as the order in the legend.
    * @param legendIndex The sequential index of the series in the legend.
    * @param mapData An array of objects containing a <code>path</code> definition and optionally a code or property to join in the data as per the <code>joinBy</code> option. 
    * @param name The name of the series as shown in the legend, tooltip etc.
    * @param `type` The type of series. Can be one of <code>area</code>, <code>areaspline</code>,.  <code>bar</code>, <code>column</code>, <code>line</code>, <code>pie</code>,.  <code>scatter</code> or <code>spline</code>. From version 2.3, <code>arearange</code>, <code>areasplinerange</code> and <code>columnrange</code> are supported with the highcharts-more.js component.
    */
  def apply(data: js.UndefOr[js.Array[js.Object | js.Array[js.Any] | Double]] = js.undefined, id: js.UndefOr[String] = js.undefined, index: js.UndefOr[Double] = js.undefined, legendIndex: js.UndefOr[Double] = js.undefined, mapData: js.UndefOr[js.Array[CleanJsObject[SeriesMapData]]] = js.undefined, name: js.UndefOr[String] = js.undefined, `type`: js.UndefOr[String] = js.undefined): Series = {
    val dataOuter: js.UndefOr[js.Array[js.Object | js.Array[js.Any] | Double]] = data
    val idOuter: js.UndefOr[String] = id
    val indexOuter: js.UndefOr[Double] = index
    val legendIndexOuter: js.UndefOr[Double] = legendIndex
    val mapDataOuter: js.UndefOr[js.Array[CleanJsObject[SeriesMapData]]] = mapData
    val nameOuter: js.UndefOr[String] = name
    val typeOuter: js.UndefOr[String] = `type`
    new Series {
      override val data: js.UndefOr[js.Array[js.Object | js.Array[js.Any] | Double]] = dataOuter
      override val id: js.UndefOr[String] = idOuter
      override val index: js.UndefOr[Double] = indexOuter
      override val legendIndex: js.UndefOr[Double] = legendIndexOuter
      override val mapData: js.UndefOr[js.Array[CleanJsObject[SeriesMapData]]] = mapDataOuter
      override val name: js.UndefOr[String] = nameOuter
      override val `type`: js.UndefOr[String] = typeOuter
    }
  }
}
