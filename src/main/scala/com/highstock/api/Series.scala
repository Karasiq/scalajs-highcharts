/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator v1.0.9 by Karasiq
  * @see [[http://api.highcharts.com/highstock]]
  */
package com.highstock.api

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>Series</code>
  */
@js.native
trait Series extends js.Object {

  /**
    * Read only. The chart that the series belongs to.
    */
  val chart: CleanJsObject[Chart] = js.native

  /**
    * Read only. An array with the series' data point objects. In case the series data length exceeds the cropThreshold, or if the data is grouped, series.data doesn't contain all the points. It only contains the points that have been created on demand. In these cases, all original X and Y values can be read from <code>series.xData</code> and <code>series.yData</code>. Additionally, <code>series.options.data</code> contains all configuration objects for the points, whether they be numbers, arrays or objects.
    */
  val data: js.Array[CleanJsObject[Point]] = js.native

  /**
    * Read only. The unique xAxis object associated with the series.
    */
  val xAxis: CleanJsObject[Axis] = js.native

  /**
    * Add a point to the series after render time. The point can be added at the end, or by giving it an X value, to the start or in the middle of the series.
    * @param shift Defaults to <code>false</code>. When shift is true, one point is shifted off the start of the series as one is appended to the end. Use this option for live charts monitoring a value over time.
    * @param animation Defaults to true. When true, the graph will be animated with default animation options. The animation can also be a configuration object with properties <code>duration</code> and <code>easing</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/members/series-addpoint/" target="_blank">Append 100 points</a>,<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/members/series-addpoint-shift/" target="_blank">append and shift</a>
    */
  def addPoint(options: js.Object = ???, redraw: Boolean = ???, shift: Boolean = ???, animation: js.Any = ???): Unit = js.native

  /**
    * Hides the series if visible. If the <code>chart.ignoreHiddenSeries</code> option is true,the chart is redrawn without this series.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/members/series-show-hide/" target="_blank">Toggle visibility from a button</a>
    */
  def hide(): Unit = js.native

  /**
    * The series' name as given in the options.
    */
  val name: String = js.native

  /**
    * Read only. The series' options.
    */
  val options: js.Object = js.native

  /**
    * Read only. The series' selected state as set by <code>series.select()</code>.
    */
  val selected: Boolean = js.native

  /**
    * Set the <a href="#plotOptions.series.compare">compare</a> mode of the series after render time. In most cases it is more useful running <a href="#Axis.setCompare">Axis.setCompare</a> on the X axis to update all its series.
    * @param compare 
Can be one of <code>null</code>, <code>"percent"</code> or <code>"value"</code>.
    * @since 1.3
    */
  def setCompare(compare: String = ???): Unit = js.native

  /**
    * A utility function to show or hide the series with an optional redraw.
    * @param visible Whether to show or hide the series. If undefined, the visibility is toggled.
    * @param redraw Defaults to <code>true</code>. Whether to redraw the chart after the series is altered.If doing more operations on the chart, it is a good idea to set redraw to false and call <code>chart.redraw()</code> after.
    */
  def setVisible(visible: Boolean = ???, redraw: Boolean = ???): Unit = js.native

  /**
    * Shows the series if hidden.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/members/series-show-hide/" target="_blank">Toggle visibility from a button</a>
    */
  def show(): Unit = js.native

  /**
    * Read only. The series' type, like "line", "area" etc.
    */
  val `type`: String = js.native

  /**
    * Update the series with a new set of options. For a clean and precise handling of new options, all methods and elements from the series is removed, and it is initiated from scratch. Therefore, this method is more performance expensive than some other utility methods like <code>setData</code> or <code>setVisible</code>.
    * @param options 
New options that will be merged into the series' existing options.


    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/members/series-update/" target="_blank">Updating series options</a>
    * @since 1.3
    */
  def update(options: js.Object = ???, redraw: Boolean = ???): Unit = js.native

  /**
    * Read only. The series' visibility state as set by <code>series.show()</code>, <code>series.hide()</code>, or the initial configuration.
    */
  val visible: Boolean = js.native

  /**
    * Remove the series from the chart.
    * @param redraw Defaults to <code>true</code>. Whether to redraw the chart after the series is removed.If doing more operations on the chart, it is a good idea to set redraw to false and call <code>chart.redraw()</code> after.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/members/series-remove/" target="_blank">Remove first series from a button</a>
    */
  def remove(redraw: Boolean = ???): Unit = js.native

  /**
    * Select or unselect the series. This means its <code>selected</code> property is set,the checkbox in the legend is toggled and when selected, the series is returned in the <code>chart.getSelectedSeries()</code> method.
    */
  def select(`selected|null`: Boolean = ???): Unit = js.native

  /**
    * Read only. The unique yAxis object associated with the series.
    */
  val yAxis: CleanJsObject[Axis] = js.native

  /**
    * Remove a point from the series. Unlike the <a href="#Point.remove">Point.remove</a> method, this can also be done on a point that is not instanciated because it is outside the view or subject to data grouping.
    * @param index The index of the point in the data array.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/members/series-removepoint/" target="_blank">Remove cropped point</a>
    * @since 2.1.0
    */
  def removePoint(index: js.Object = ???, redraw: Boolean = ???, animation: js.Any = ???): Unit = js.native

  /**
    * Apply a new set of data to the series and optionally redraw it. Note that this method throws away all points and creates new ones. For updating the values of existing points, use <a href="#Point.update()">Point.update()</a> instead. To keep memory usage low, Highcharts mutates the passed data array instead of copying it, so if you are going to reuse the same array it is a good idea to pass a clone to <code>setData</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/members/series-setdata/" target="_blank">Set new data from a button</a>
    */
  def setData(data: js.Any = ???, redraw: Boolean = ???, animation: js.Any = ???, updatePoints: Boolean = ???): Unit = js.native
}
