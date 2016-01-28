/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highcharts]]
  */
package com.highcharts.api

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>Point</code>
  */
@js.native
trait Point extends js.Object {

  /**
    * The series object associated with the point.
    * @since 1.2.0
    */
  val series: CleanJsObject[Series] = js.native

  /**
    * The percentage for points in a stacked series or pies.
    * @since 1.2.0
    */
  val percentage: Double = js.native

  /**
    * Remove the point from the series.
    * @param redraw Defaults to <code>true</code>. Whether to redraw the chart after the point is removed.If doing more operations on the chart, it is a good idea to set redraw to false and call <code>chart.redraw()</code> after.
    * @param animation Defaults to true. When true, the graph's updating will be animated with default animation options. The animation can also be a configuration object with properties <code>duration</code> and <code>easing</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-point-events-remove/" target="_blank">Remove point and confirm</a>,<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/members/point-remove/" target="_blank">Remove pie slice</a>
    * @since 1.2.0
    */
  def remove(redraw: Boolean = ???, animation: js.Any = ???): Unit = js.native

  /**
    * Whether the point is selected or not.
    * @since 1.2.0
    */
  val selected: Boolean = js.native

  /**
    * Slice out or set back in a pie chart slice. This is the default way of Highcharts to visualize that a pie point is selected.
    * @param sliced When <code>true</code>, the point is sliced out. When <code>false</code>, the point is set in. When <code>null</code> or <code>undefined</code>, the sliced state is toggled.
    * @param redraw Defaults to <code>true</code>. Whether to redraw the chart after the point is altered.
    * @param animation Defaults to true. When true, the move will be animated with default animation options. The animation can also be a configuration object with properties <code>duration</code> and <code>easing</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/members/point-slice/" target="_blank">Slice and unslice a point from a button</a>
    * @since 1.2.0
    */
  def slice(sliced: Boolean = ???, redraw: Boolean = ???, animation: js.Any = ???): Unit = js.native

  /**
    * The x value for the point.
    * @since 1.2.0
    */
  val x: Double = js.native

  /**
    * The y value for the point.
    * @since 1.2.0
    */
  val y: Double = js.native

  /**
    * For categorized axes this property holds the category name for the point. For other axis it holds the x value.
    * @since 1.2.0
    */
  val category: String | Double = js.native

  /**
    * The total of a stack for stacked series, or pie in pie charts.
    */
  val total: Double = js.native

  /**
    * Update the point with new values.
    * @param redraw Defaults to <code>true</code>. Whether to redraw the chart after the point is updated.If doing more operations on the chart, it is a good idea to set redraw to false and call <code>chart.redraw()</code> after.


    * @param animation Defaults to true. When true, the update will be animated with default animation options. The animation can also be a configuration object with properties <code>duration</code> and <code>easing</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/members/point-update-column/" target="_blank">Update column value</a>,<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/members/point-update-pie/" target="_blank">update pie slice</a>
    * @since 1.2.0
    */
  def update(options: js.Any = ???, redraw: Boolean = ???, animation: js.Any = ???): Unit = js.native

  /**
    * Select or unselect the point.
    * @param select When <code>true</code>, the point is selected. When <code>false</code>, the point is unselected. When <code>null</code> or <code>undefined</code>, the selection state is toggled.
    * @param accumulate When <code>true</code>, the selection is added to other selected points. When <code>false</code>, other selected points are deselected. Internally in Highcharts,selected points are accumulated on Control, Shift or Cmd clicking the point.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/members/point-select/" target="_blank">Select a point from a button</a>, <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/chart/events-selection-points/" target="_blank">select a range of points through a drag selection</a>.
    * @since 1.2.0
    */
  def select(select: Boolean = ???, accumulate: Boolean = ???): Unit = js.native

  /**
    * For certain series types, like pie. Whether the Point instance is visible.
    */
  val visible: js.Any = js.native
}
