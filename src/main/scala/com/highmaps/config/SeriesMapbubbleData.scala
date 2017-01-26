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
  * @note JavaScript name: <code>series&lt;mapbubble&gt;-data</code>
  */
@js.annotation.ScalaJSDefined
class SeriesMapbubbleData extends js.Object {

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
  val events: js.UndefOr[CleanJsObject[SeriesMapbubbleDataEvents]] = js.undefined

  /**
    * An id for the point. This can be used after render time to get a pointer to the point object through <code>chart.get()</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/maps/series/data-id/" target="_blank">Highlight a point by id</a>
    */
  val id: js.UndefOr[String] = js.undefined

  /**
    * The name of the point as shown in the legend, tooltip, dataLabel etc.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/maps/series/data-datalabels/" target="_blank">Point names</a>
    */
  val name: js.UndefOr[String] = js.undefined

  /**
    * While the <code>x</code> and <code>y</code> values of the bubble are determined by the underlying map, the <code>z</code> indicates the actual value that gives the size of the bubble. 
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/maps/demo/map-bubble/" target="_blank">Bubble</a>
    */
  val z: js.UndefOr[Double] = js.undefined
}

object SeriesMapbubbleData {
  /**
    * @param color Individual color for the point. By default the color is either used to denote the value, or pulled from the global <code>colors</code> array.
    * @param dataLabels Individual data label for each point. The options are the same as the ones for  <a class="internal" href="#plotOptions.series.dataLabels">plotOptions.series.dataLabels</a>
    * @param drilldown The <code>id</code> of a series in the <a href="#drilldown.series">drilldown.series</a> array to use for a drilldown for this point.
    * @param events Individual point events
    * @param id An id for the point. This can be used after render time to get a pointer to the point object through <code>chart.get()</code>.
    * @param name The name of the point as shown in the legend, tooltip, dataLabel etc.
    * @param z While the <code>x</code> and <code>y</code> values of the bubble are determined by the underlying map, the <code>z</code> indicates the actual value that gives the size of the bubble. 
    */
  def apply(color: js.UndefOr[String | js.Object] = js.undefined, dataLabels: js.UndefOr[js.Object] = js.undefined, drilldown: js.UndefOr[String] = js.undefined, events: js.UndefOr[CleanJsObject[SeriesMapbubbleDataEvents]] = js.undefined, id: js.UndefOr[String] = js.undefined, name: js.UndefOr[String] = js.undefined, z: js.UndefOr[Double] = js.undefined): SeriesMapbubbleData = {
    val colorOuter: js.UndefOr[String | js.Object] = color
    val dataLabelsOuter: js.UndefOr[js.Object] = dataLabels
    val drilldownOuter: js.UndefOr[String] = drilldown
    val eventsOuter: js.UndefOr[CleanJsObject[SeriesMapbubbleDataEvents]] = events
    val idOuter: js.UndefOr[String] = id
    val nameOuter: js.UndefOr[String] = name
    val zOuter: js.UndefOr[Double] = z
    new SeriesMapbubbleData {
      override val color: js.UndefOr[String | js.Object] = colorOuter
      override val dataLabels: js.UndefOr[js.Object] = dataLabelsOuter
      override val drilldown: js.UndefOr[String] = drilldownOuter
      override val events: js.UndefOr[CleanJsObject[SeriesMapbubbleDataEvents]] = eventsOuter
      override val id: js.UndefOr[String] = idOuter
      override val name: js.UndefOr[String] = nameOuter
      override val z: js.UndefOr[Double] = zOuter
    }
  }
}
