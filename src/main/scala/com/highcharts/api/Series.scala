/**
 * Automatically generated file. Please do not edit.
 * @author Highcharts Config Generator v1.0.1 by Karasiq
 * @see [[http://api.highcharts.com/highcharts]]
 */
package com.highcharts.api

import scalajs.js, js.UndefOr

@js.native
trait Series extends js.Object {
  
  /**
   * Add a point to the series after render time. The point can be added at the end, or by giving it an X value, to the start or in the middle of the series.
   * @param animation Defaults to true. When true, the graph will be animated with default animation options. The animation can also be a configuration object with properties <code>duration</code> and <code>easing</code>.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/members/series-addpoint-append/" target="_blank">Append point</a>,<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/members/series-addpoint-append-and-shift/" target="_blank">append and shift</a>,<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/members/series-addpoint-x-and-y/" target="_blank">both x and y values given</a>,<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/members/series-addpoint-pie/" target="_blank">append pie slice</a>
   * @since 1.2.0
   */
  def addPoint(options: UndefOr[js.Object] = js.undefined, redraw: UndefOr[Boolean] = js.undefined, shift: UndefOr[Boolean] = js.undefined, animation: UndefOr[js.Any] = js.undefined): Unit = js.native
  
  /**
   * Hides the series if visible. If the <code>chart.ignoreHiddenSeries</code> option is true,the chart is redrawn without this series.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/members/series-hide/" target="_blank">Toggle visibility from a button</a>
   * @since 1.2.0
   */
  def hide(): Unit = js.native
  
  /**
   * The series' name as given in the options.
   * @since 1.2.0
   */
  var name: UndefOr[String] = js.native
  
  /**
   * Read only. The series' options.
   * @since 1.2.0
   */
  var options: UndefOr[js.Object] = js.native
  
  /**
   * Select or unselect the series. This means its <code>selected</code> property is set,the checkbox in the legend is toggled and when selected, the series is returned in the <code>chart.getSelectedSeries()</code> method.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/members/series-select/" target="_blank">Select a series from a button</a>
   * @since 1.2.0
   */
  def select(`selected|null`: UndefOr[Boolean] = js.undefined): Unit = js.native
  
  /**
   * Read only. The series' selected state as set by <code>series.select()</code>.
   * @since 1.2.0
   */
  var selected: UndefOr[Boolean] = js.native
  
  /**
   * A utility function to show or hide the series with an optional redraw.
   * @param visible Whether to show or hide the series. If undefined, the visibility is toggled.
   * @param redraw Defaults to <code>true</code>. Whether to redraw the chart after the series is altered.If doing more operations on the chart, it is a good idea to set redraw to false and call <code>chart.redraw()</code> after.
   */
  def setVisible(visible: UndefOr[Boolean] = js.undefined, redraw: UndefOr[Boolean] = js.undefined): Unit = js.native
  
  /**
   * Shows the series if hidden.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/members/series-hide/" target="_blank">Toggle visibility from a button</a>
   * @since 1.2.0
   */
  def show(): Unit = js.native
  
  /**
   * Read only. The series' type, like "line", "area" etc.
   * @since 1.2.0
   */
  var `type`: UndefOr[String] = js.native
  
  /**
   * Update the series with a new set of options. For a clean and precise handling of new options, all methods and elements from the series is removed, and it is initiated from scratch. Therefore, this method is more performance expensive than some other utility methods like <code>setData</code> or <code>setVisible</code>.
   * @param options 
New options that will be merged into the series' existing options.


   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/members/series-update/" target="_blank">Updating series options</a>
   * @since 3.0
   */
  def update(options: UndefOr[js.Object] = js.undefined, redraw: UndefOr[Boolean] = js.undefined): Unit = js.native
  
  /**
   * Read only. The series' visibility state as set by <code>series.show()</code>, <code>series.hide()</code>, or the initial configuration.
   * @since 1.2.0
   */
  var visible: UndefOr[Boolean] = js.native
  
  /**
   * Remove the series from the chart.
   * @param redraw Defaults to <code>true</code>. Whether to redraw the chart after the series is removed.If doing more operations on the chart, it is a good idea to set redraw to false and call <code>chart.redraw()</code> after.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/members/series-remove/" target="_blank">Remove first series from a button</a>
   * @since 1.2.0
   */
  def remove(redraw: UndefOr[Boolean] = js.undefined): Unit = js.native
  
  /**
   * Read only. The chart that the series belongs to.
   * @since 1.2.0
   */
  var chart: UndefOr[Chart] = js.native
  
  /**
   * Read only. An array with the series' data point objects.
   * @since 1.2.0
   */
  var data: UndefOr[js.Array[Point]] = js.native
  
  /**
   * Read only. The unique xAxis object associated with the series.
   * @since 1.2.0
   */
  var xAxis: UndefOr[Axis] = js.native
  
  /**
   * Read only. The unique yAxis object associated with the series.
   * @since 1.2.0
   */
  var yAxis: UndefOr[Axis] = js.native
  
  /**
   * Remove a point from the series. Unlike the <a href="#Point.remove">Point.remove</a> method, this can also be done on a point that is not instanciated because it is outside the view or subject to data grouping.
   * @param index The index of the point in the data array.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/members/series-removepoint/" target="_blank">Remove cropped point</a>
   * @since 4.1.0
   */
  def removePoint(index: UndefOr[js.Object] = js.undefined, redraw: UndefOr[Boolean] = js.undefined, animation: UndefOr[js.Any] = js.undefined): Unit = js.native
  
  /**
   * Apply a new set of data to the series and optionally redraw it. Note that this method throws away all points and creates new ones. For updating the values of existing points, use <a href="#Point.update()">Point.update()</a> instead. To keep memory usage low, Highcharts mutates the passed data array instead of copying it, so if you are going to reuse the same array it is a good idea to pass a clone to <code>setData</code>.
   * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/members/series-setdata/" target="_blank">Set new data from a button</a>,<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/members/series-setdata-pie/" target="_blank">set data in a pie</a>
   * @since 1.2.0
   */
  def setData(data: UndefOr[js.Any] = js.undefined, redraw: UndefOr[Boolean] = js.undefined, animation: UndefOr[js.Any] = js.undefined, updatePoints: UndefOr[Boolean] = js.undefined): Unit = js.native
}