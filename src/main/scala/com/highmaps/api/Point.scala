/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highmaps]]
  */
package com.highmaps.api

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>Point</code>
  */
@js.native
trait Point extends js.Object {

  /**
    * Select or unselect the point.
    * @param select When <code>true</code>, the point is selected. When <code>false</code>, the point is unselected. When <code>null</code> or <code>undefined</code>, the selection state is toggled.
    * @param accumulate When <code>true</code>, the selection is added to other selected points. When <code>false</code>, other selected points are deselected. Internally in Highcharts,selected points are accumulated on Control, Shift or Cmd clicking the point.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/maps/series/data-id/" target="_blank">Select a point from a button</a>
    */
  def select(select: Boolean = ???, accumulate: Boolean = ???): Unit = js.native

  /**
    * Zoom in on the point using the global animation.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/maps/members/point-zoomto/" target="_blank">Zoom to points from buttons</a>
    */
  def zoomTo(): Unit = js.native

  /**
    * Remove the point from the series.
    * @param redraw Defaults to <code>true</code>. Whether to redraw the chart after the point is removed. If doing more operations on the chart, it is a good idea to set redraw to false and call <a href="#Chart.redraw()">Chart.redraw()</a> after.
    * @param animation Defaults to true. When true, the graph's updating will be animated with default animation options. The animation can also be a configuration object with properties <code>duration</code> and <code>easing</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/maps/members/point-remove/" target="_blank">Remove selected points</a>
    */
  def remove(redraw: Boolean = ???, animation: js.Any = ???): Unit = js.native

  /**
    * Whether the point is selected or not.
    */
  val selected: Boolean = js.native

  /**
    * The series object associated with the point.
    */
  val series: CleanJsObject[Series] = js.native

  /**
    * The x value for the point.
    */
  val x: Double = js.native

  /**
    * The y value for the point.
    */
  val y: Double = js.native

  /**
    * Update the point with new values.
    * @param redraw Defaults to <code>true</code>. Whether to redraw the chart after the point is updated.If doing more operations on the chart, it is a good idea to set redraw to false and call <code>chart.redraw()</code> after.


    * @param animation Defaults to true. When true, the update will be animated with default animation options. The animation can also be a configuration object with properties <code>duration</code> and <code>easing</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/maps/members/point-update/" target="_blank">Update area value</a>
    */
  def update(options: js.Any = ???, redraw: Boolean = ???, animation: js.Any = ???): Unit = js.native

  /**
    * For certain series types, like pie. Whether the Point instance is visible.
    */
  val visible: js.Any = js.native
}
