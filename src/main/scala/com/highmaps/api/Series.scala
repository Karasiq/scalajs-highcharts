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
  * @note JavaScript name: <code>Series</code>
  */
@js.native
trait Series extends js.Object {

  /**
    * A utility function to show or hide the series with an optional redraw.
    * @param visible Whether to show or hide the series. If undefined, the visibility is toggled.
    * @param redraw Defaults to <code>true</code>. Whether to redraw the chart after the series is altered.If doing more operations on the chart, it is a good idea to set redraw to false and call <code>chart.redraw()</code> after.
    */
  def setVisible(visible: Boolean = ???, redraw: Boolean = ???): Unit = js.native

  /**
    * Hides the series if visible. 
    */
  def hide(): Unit = js.native

  /**
    * Read only. The series' options.
    */
  val options: js.Object = js.native

  /**
    * Select or unselect the series. This means its <code>selected</code> property is set,the checkbox in the legend is toggled and when selected, the series is returned in the <code>chart.getSelectedSeries()</code> method.
    */
  def select(selected: Boolean = ???): Unit = js.native

  /**
    * Remove the series from the chart.
    * @param redraw Defaults to <code>true</code>. Whether to redraw the chart after the series is removed. If doing more operations on the chart, it is a good idea to set redraw to false and call <code>chart.redraw()</code> after.
    */
  def remove(redraw: Boolean = ???): Unit = js.native

  /**
    * Add a point to the series after render time.
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/members/series-addpoint/" target="_blank">Add point</a>
    */
  def addPoint(options: js.Object = ???, redraw: Boolean = ???, shift: Boolean = ???, animation: js.Any = ???): Unit = js.native

  /**
    * Read only. The chart that the series belongs to.
    */
  val chart: CleanJsObject[Chart] = js.native

  /**
    * Read only. An array with the series' data point objects.
    */
  val data: js.Array[CleanJsObject[Point]] = js.native

  /**
    * The series' name as given in the options.
    */
  val name: String = js.native

  /**
    * Read only. The series' selected state as set by <code>series.select()</code>.
    */
  val selected: Boolean = js.native

  /**
    * Shows the series if hidden.
    */
  def show(): Unit = js.native

  /**
    * Read only. The series' type, like "line", "area" etc.
    */
  val `type`: String = js.native

  /**
    * Read only. The series' visibility state as set by <code>series.show()</code>, <code>series.hide()</code>, or the initial configuration.
    */
  val visible: Boolean = js.native

  /**
    * Read only. The unique xAxis object associated with the series.
    */
  val xAxis: CleanJsObject[Axis] = js.native

  /**
    * Read only. The unique yAxis object associated with the series.
    */
  val yAxis: CleanJsObject[Axis] = js.native

  /**
    * <p>Apply a new set of data to the series and optionally redraw it. The new data array is passed by reference (except in case of <code>updatePoints</code>), and may later be mutated when updating the chart data.</p>
    * 
    * <p>Note the difference in behaviour when setting the same amount of points, or a different amount of points, as handled by the <code>updatePoints</code> parameter. </p>
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/members/series-setdata/" target="_blank">Set new data from a button</a>
    */
  def setData(data: js.Array[js.Any] = ???, redraw: Boolean = ???, animation: js.Any = ???, updatePoints: Boolean = ???): Unit = js.native

  /**
    * Update the series with a new set of options. For a clean and precise handling of new options, all methods and elements from the series are removed, and it is initiated from scratch. Therefore, this method is more performance expensive than some other utility methods like <code>setData</code> or <code>setVisible</code>.
    * @param options 
New options that will be merged into the series' existing options.


    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/members/series-update/" target="_blank">Updating series options</a>
    */
  def update(options: js.Object = ???, redraw: Boolean = ???): Unit = js.native
}
