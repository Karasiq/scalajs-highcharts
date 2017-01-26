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
  * @note JavaScript name: <code>series&lt;map&gt;-data</code>
  */
@js.annotation.ScalaJSDefined
class SeriesMapData extends js.Object {

  /**
    * Individual color for the point. By default the color is either used to denote the value, or pulled from the global <code>colors</code> array.
    */
  val color: js.UndefOr[String | js.Object] = js.undefined

  /**
    * Individual data label for each point. The options are the same as the ones for  <a class="internal" href="#plotOptions.series.dataLabels">plotOptions.series.dataLabels</a>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/maps/series/data-datalabels/" target="_blank">Disable data labels for individual areas</a>
    */
  val dataLabels: js.UndefOr[js.Object] = js.undefined

  /**
    * The <code>id</code> of a series in the <a href="#drilldown.series">drilldown.series</a> array to use for a drilldown for this point.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/maps/demo/map-drilldown/" target="_blank">Basic drilldown</a>
    */
  val drilldown: js.UndefOr[String] = js.undefined

  /**
    * Individual point events
    */
  val events: js.UndefOr[CleanJsObject[SeriesMapDataEvents]] = js.undefined

  /**
    * An id for the point. This can be used after render time to get a pointer to the point object through <code>chart.get()</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/maps/series/data-id/" target="_blank">Highlight a point by id</a>
    */
  val id: js.UndefOr[String] = js.undefined

  /**
    * When data labels are laid out on a map, Highmaps runs a simplified algorithm to detect collision. When two labels collide, the one with the lowest rank is hidden. By default the rank is computed from the area.
    */
  val labelrank: js.UndefOr[Double] = js.undefined

  /**
    * The relative mid point of an area, used to place the data label. Ranges from 0 to 1. When <code>mapData</code> is used, middleX can be defined there. 
    */
  val middleX: js.UndefOr[Double] = js.undefined

  /**
    * The relative mid point of an area, used to place the data label. Ranges from 0 to 1. When <code>mapData</code> is used, middleY can be defined there. 
    */
  val middleY: js.UndefOr[Double] = js.undefined

  /**
    * The name of the point as shown in the legend, tooltip, dataLabel etc.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/maps/series/data-datalabels/" target="_blank">Point names</a>
    */
  val name: js.UndefOr[String] = js.undefined

  /**
    * <p>For map and mapline series types, the SVG path for the shape. For compatibily with old IE, not all SVG path definitions are supported, but M, L and C operators are safe.</p>
    * 
    * <p>To achieve a better separation between the structure and the data, it is recommended to use <code>mapData</code> to define that paths instead of defining them on the data points themselves.</p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/maps/series/data-path/" target="_blank">Paths defined in data</a>
    */
  val path: js.UndefOr[String] = js.undefined

  /**
    * The numeric value of the data point.
    */
  val value: js.UndefOr[Double] = js.undefined
}

object SeriesMapData {
  /**
    * @param color Individual color for the point. By default the color is either used to denote the value, or pulled from the global <code>colors</code> array.
    * @param dataLabels Individual data label for each point. The options are the same as the ones for  <a class="internal" href="#plotOptions.series.dataLabels">plotOptions.series.dataLabels</a>
    * @param drilldown The <code>id</code> of a series in the <a href="#drilldown.series">drilldown.series</a> array to use for a drilldown for this point.
    * @param events Individual point events
    * @param id An id for the point. This can be used after render time to get a pointer to the point object through <code>chart.get()</code>.
    * @param labelrank When data labels are laid out on a map, Highmaps runs a simplified algorithm to detect collision. When two labels collide, the one with the lowest rank is hidden. By default the rank is computed from the area.
    * @param middleX The relative mid point of an area, used to place the data label. Ranges from 0 to 1. When <code>mapData</code> is used, middleX can be defined there. 
    * @param middleY The relative mid point of an area, used to place the data label. Ranges from 0 to 1. When <code>mapData</code> is used, middleY can be defined there. 
    * @param name The name of the point as shown in the legend, tooltip, dataLabel etc.
    * @param path <p>For map and mapline series types, the SVG path for the shape. For compatibily with old IE, not all SVG path definitions are supported, but M, L and C operators are safe.</p>. . <p>To achieve a better separation between the structure and the data, it is recommended to use <code>mapData</code> to define that paths instead of defining them on the data points themselves.</p>
    * @param value The numeric value of the data point.
    */
  def apply(color: js.UndefOr[String | js.Object] = js.undefined, dataLabels: js.UndefOr[js.Object] = js.undefined, drilldown: js.UndefOr[String] = js.undefined, events: js.UndefOr[CleanJsObject[SeriesMapDataEvents]] = js.undefined, id: js.UndefOr[String] = js.undefined, labelrank: js.UndefOr[Double] = js.undefined, middleX: js.UndefOr[Double] = js.undefined, middleY: js.UndefOr[Double] = js.undefined, name: js.UndefOr[String] = js.undefined, path: js.UndefOr[String] = js.undefined, value: js.UndefOr[Double] = js.undefined): SeriesMapData = {
    val colorOuter: js.UndefOr[String | js.Object] = color
    val dataLabelsOuter: js.UndefOr[js.Object] = dataLabels
    val drilldownOuter: js.UndefOr[String] = drilldown
    val eventsOuter: js.UndefOr[CleanJsObject[SeriesMapDataEvents]] = events
    val idOuter: js.UndefOr[String] = id
    val labelrankOuter: js.UndefOr[Double] = labelrank
    val middleXOuter: js.UndefOr[Double] = middleX
    val middleYOuter: js.UndefOr[Double] = middleY
    val nameOuter: js.UndefOr[String] = name
    val pathOuter: js.UndefOr[String] = path
    val valueOuter: js.UndefOr[Double] = value
    new SeriesMapData {
      override val color: js.UndefOr[String | js.Object] = colorOuter
      override val dataLabels: js.UndefOr[js.Object] = dataLabelsOuter
      override val drilldown: js.UndefOr[String] = drilldownOuter
      override val events: js.UndefOr[CleanJsObject[SeriesMapDataEvents]] = eventsOuter
      override val id: js.UndefOr[String] = idOuter
      override val labelrank: js.UndefOr[Double] = labelrankOuter
      override val middleX: js.UndefOr[Double] = middleXOuter
      override val middleY: js.UndefOr[Double] = middleYOuter
      override val name: js.UndefOr[String] = nameOuter
      override val path: js.UndefOr[String] = pathOuter
      override val value: js.UndefOr[Double] = valueOuter
    }
  }
}
