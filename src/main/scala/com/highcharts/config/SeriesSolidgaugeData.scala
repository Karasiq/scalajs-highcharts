/**
 * Automatically generated file. Please do not edit.
 * @author Highcharts Config Generator v1.0.3 by Karasiq
 * @see [[http://api.highcharts.com/highcharts]]
 */
package com.highcharts.config

import scalajs.js, js.UndefOr

@js.annotation.ScalaJSDefined
class SeriesSolidgaugeData extends js.Object {
  
  /**
   * Individual color for the point. By default the color is pulled from the global <code>colors</code> array.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/point/color/" target="_blank">Mark the highest point</a>
   */
  val color: UndefOr[String] = js.undefined
  
  /**
   * Individual data label for each point. The options are the same as the ones for  <a class="internal" href="#plotOptions.series.dataLabels">plotOptions.series.dataLabels</a>
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/point/datalabels/" target="_blank">Show a label for the last value</a>
   */
  val dataLabels: UndefOr[js.Object] = js.undefined
  
  /**
   * Individual point events
   */
  val events: SeriesSolidgaugeDataEvents = new SeriesSolidgaugeDataEvents
  
  /**
   * An id for the point. This can be used after render time to get a pointer to the point object through <code>chart.get()</code>.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/point/id/" target="_blank">Remove an id'd point</a>
   * @since 1.2.0
   */
  val id: UndefOr[String] = js.undefined
  
  /**
   * The inner radius of an individual point in a solid gauge. Can be given as a number (pixels) or percentage string.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/solidgauge-radius/" target="_blank">Individual radius and innerRadius</a>
   * @since 4.1.6
   */
  val innerRadius: UndefOr[js.Any] = js.undefined
  
  /**
   * <p>The name of the point as shown in the legend, tooltip, dataLabel etc.</p>
   * 
   * <p>If the <a href="#xAxis.type">xAxis.type</a> is set to <code>category</code>, and no <a href="#xAxis.categories">categories</a> option exists, the category will be pulled from the <code>point.name</code> of the last series defined. For multiple series, best practice however is to define <code>xAxis.categories</code>.</p>
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/series/data-array-of-objects/" target="_blank">Point names</a>
   */
  val name: UndefOr[String] = js.undefined
  
  /**
   * The outer radius of an individual point in a solid gauge. Can be given as a number (pixels) or percentage string.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/solidgauge-radius/" target="_blank">Individual radius and innerRadius</a>
   * @since 4.1.6
   */
  val radius: UndefOr[js.Any] = js.undefined
  
  /**
   * Whether the data point is selected initially.
   */
  val selected: Boolean = false
  
  /**
   * The y value of the point.
   */
  val y: UndefOr[Double] = js.undefined
}
