/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highstock]]
  */
package com.highstock.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>series&lt;mapbubble&gt;-data</code>
  */
@js.annotation.ScalaJSDefined
class SeriesMapbubbleData extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>While the <code>x</code> and <code>y</code> values of the bubble are determined by the
    * underlying map, the <code>z</code> indicates the actual value that gives the
    * size of the bubble.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/demo/map-bubble/">Bubble</a>
    */
  val z: js.UndefOr[Double] = js.undefined

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
  val events: js.UndefOr[CleanJsObject[SeriesMapbubbleDataEvents]] = js.undefined
}

object SeriesMapbubbleData {
  /**
    * @param z <p>While the <code>x</code> and <code>y</code> values of the bubble are determined by the. underlying map, the <code>z</code> indicates the actual value that gives the. size of the bubble.</p>
    * @param color <p>Individual color for the point. By default the color is either used. to denote the value, or pulled from the global <code>colors</code> array.</p>
    * @param dataLabels <p>Individual data label for each point. The options are the same as. the ones for <a href="#plotOptions.series.dataLabels">plotOptions.series.dataLabels</a>.</p>
    * @param drilldown <p>The <code>id</code> of a series in the <a href="#drilldown.series">drilldown.series</a>. array to use for a drilldown for this point.</p>
    * @param id <p>An id for the point. This can be used after render time to get a. pointer to the point object through <code>chart.get()</code>.</p>
    * @param name <p>The name of the point as shown in the legend, tooltip, dataLabel. etc.</p>
    * @param events <p>Individual point events</p>
    */
  def apply(z: js.UndefOr[Double] = js.undefined, color: js.UndefOr[String | js.Object] = js.undefined, dataLabels: js.UndefOr[js.Object] = js.undefined, drilldown: js.UndefOr[String] = js.undefined, id: js.UndefOr[String] = js.undefined, name: js.UndefOr[String] = js.undefined, events: js.UndefOr[CleanJsObject[SeriesMapbubbleDataEvents]] = js.undefined): SeriesMapbubbleData = {
    val zOuter: js.UndefOr[Double] = z
    val colorOuter: js.UndefOr[String | js.Object] = color
    val dataLabelsOuter: js.UndefOr[js.Object] = dataLabels
    val drilldownOuter: js.UndefOr[String] = drilldown
    val idOuter: js.UndefOr[String] = id
    val nameOuter: js.UndefOr[String] = name
    val eventsOuter: js.UndefOr[CleanJsObject[SeriesMapbubbleDataEvents]] = events
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesMapbubbleData {
      override val z: js.UndefOr[Double] = zOuter
      override val color: js.UndefOr[String | js.Object] = colorOuter
      override val dataLabels: js.UndefOr[js.Object] = dataLabelsOuter
      override val drilldown: js.UndefOr[String] = drilldownOuter
      override val id: js.UndefOr[String] = idOuter
      override val name: js.UndefOr[String] = nameOuter
      override val events: js.UndefOr[CleanJsObject[SeriesMapbubbleDataEvents]] = eventsOuter
    })
  }
}
