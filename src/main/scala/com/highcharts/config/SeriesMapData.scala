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
  * @note JavaScript name: <code>series&lt;map&gt;-data</code>
  */
@js.annotation.ScalaJSDefined
class SeriesMapData extends com.highcharts.HighchartsGenericObject {

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
    * <p>When data labels are laid out on a map, Highmaps runs a simplified
    * algorithm to detect collision. When two labels collide, the one with
    * the lowest rank is hidden. By default the rank is computed from the
    * area.</p>
    */
  val labelrank: js.UndefOr[Double] = js.undefined

  /**
    * <p>The relative mid point of an area, used to place the data label.
    * Ranges from 0 to 1. When <code>mapData</code> is used, middleX can be defined
    * there.</p>
    */
  val middleX: js.UndefOr[Double] = js.undefined

  /**
    * <p>The relative mid point of an area, used to place the data label.
    * Ranges from 0 to 1. When <code>mapData</code> is used, middleY can be defined
    * there.</p>
    */
  val middleY: js.UndefOr[Double] = js.undefined

  /**
    * <p>The name of the point as shown in the legend, tooltip, dataLabel
    * etc.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/series/data-datalabels/">Point names</a>
    */
  val name: js.UndefOr[String] = js.undefined

  /**
    * <p>For map and mapline series types, the SVG path for the shape. For
    * compatibily with old IE, not all SVG path definitions are supported,
    * but M, L and C operators are safe.</p>
    * <p>To achieve a better separation between the structure and the data,
    * it is recommended to use <code>mapData</code> to define that paths instead
    * of defining them on the data points themselves.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/series/data-path/">Paths defined in data</a>
    */
  val path: js.UndefOr[String] = js.undefined

  /**
    * <p>The numeric value of the data point.</p>
    */
  val value: js.UndefOr[Double] = js.undefined

  /**
    * <p>Individual point events</p>
    */
  val events: js.UndefOr[CleanJsObject[SeriesMapDataEvents]] = js.undefined
}

object SeriesMapData {
  /**
    * @param color <p>Individual color for the point. By default the color is either used. to denote the value, or pulled from the global <code>colors</code> array.</p>
    * @param dataLabels <p>Individual data label for each point. The options are the same as. the ones for <a href="#plotOptions.series.dataLabels">plotOptions.series.dataLabels</a>.</p>
    * @param drilldown <p>The <code>id</code> of a series in the <a href="#drilldown.series">drilldown.series</a>. array to use for a drilldown for this point.</p>
    * @param id <p>An id for the point. This can be used after render time to get a. pointer to the point object through <code>chart.get()</code>.</p>
    * @param labelrank <p>When data labels are laid out on a map, Highmaps runs a simplified. algorithm to detect collision. When two labels collide, the one with. the lowest rank is hidden. By default the rank is computed from the. area.</p>
    * @param middleX <p>The relative mid point of an area, used to place the data label.. Ranges from 0 to 1. When <code>mapData</code> is used, middleX can be defined. there.</p>
    * @param middleY <p>The relative mid point of an area, used to place the data label.. Ranges from 0 to 1. When <code>mapData</code> is used, middleY can be defined. there.</p>
    * @param name <p>The name of the point as shown in the legend, tooltip, dataLabel. etc.</p>
    * @param path <p>For map and mapline series types, the SVG path for the shape. For. compatibily with old IE, not all SVG path definitions are supported,. but M, L and C operators are safe.</p>. <p>To achieve a better separation between the structure and the data,. it is recommended to use <code>mapData</code> to define that paths instead. of defining them on the data points themselves.</p>
    * @param value <p>The numeric value of the data point.</p>
    * @param events <p>Individual point events</p>
    */
  def apply(color: js.UndefOr[String | js.Object] = js.undefined, dataLabels: js.UndefOr[js.Object] = js.undefined, drilldown: js.UndefOr[String] = js.undefined, id: js.UndefOr[String] = js.undefined, labelrank: js.UndefOr[Double] = js.undefined, middleX: js.UndefOr[Double] = js.undefined, middleY: js.UndefOr[Double] = js.undefined, name: js.UndefOr[String] = js.undefined, path: js.UndefOr[String] = js.undefined, value: js.UndefOr[Double] = js.undefined, events: js.UndefOr[CleanJsObject[SeriesMapDataEvents]] = js.undefined): SeriesMapData = {
    val colorOuter: js.UndefOr[String | js.Object] = color
    val dataLabelsOuter: js.UndefOr[js.Object] = dataLabels
    val drilldownOuter: js.UndefOr[String] = drilldown
    val idOuter: js.UndefOr[String] = id
    val labelrankOuter: js.UndefOr[Double] = labelrank
    val middleXOuter: js.UndefOr[Double] = middleX
    val middleYOuter: js.UndefOr[Double] = middleY
    val nameOuter: js.UndefOr[String] = name
    val pathOuter: js.UndefOr[String] = path
    val valueOuter: js.UndefOr[Double] = value
    val eventsOuter: js.UndefOr[CleanJsObject[SeriesMapDataEvents]] = events
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesMapData {
      override val color: js.UndefOr[String | js.Object] = colorOuter
      override val dataLabels: js.UndefOr[js.Object] = dataLabelsOuter
      override val drilldown: js.UndefOr[String] = drilldownOuter
      override val id: js.UndefOr[String] = idOuter
      override val labelrank: js.UndefOr[Double] = labelrankOuter
      override val middleX: js.UndefOr[Double] = middleXOuter
      override val middleY: js.UndefOr[Double] = middleYOuter
      override val name: js.UndefOr[String] = nameOuter
      override val path: js.UndefOr[String] = pathOuter
      override val value: js.UndefOr[Double] = valueOuter
      override val events: js.UndefOr[CleanJsObject[SeriesMapDataEvents]] = eventsOuter
    })
  }
}
