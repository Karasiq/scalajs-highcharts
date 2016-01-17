/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator v1.0.9 by Karasiq
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
  val color: js.UndefOr[String] = js.undefined

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
  val events: js.UndefOr[CleanJsObject[SeriesMapDataEvents]] = js.undefined

  /**
    * An id for the point. This can be used after render time to get a pointer to the point object through <code>chart.get()</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/series/data-id/" target="_blank">Highlight a point by id</a>
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
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/series/data-datalabels/" target="_blank">Point names</a>
    */
  val name: js.UndefOr[String] = js.undefined

  /**
    * <p>For map and mapline series types, the SVG path for the shape. For compatibily with old IE, not all SVG path definitions are supported, but M, L and C operators are safe.</p>
    * 
    * <p>To achieve a better separation between the structure and the data, it is recommended to use <code>mapData</code> to define that paths instead of defining them on the data points themselves.</p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/series/data-path/" target="_blank">Paths defined in data</a>
    */
  val path: js.UndefOr[String] = js.undefined

  /**
    * The numeric value of the data point.
    */
  val value: js.UndefOr[Double] = js.undefined
}
