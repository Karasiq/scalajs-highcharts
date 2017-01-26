/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highstock]]
  */
package com.highstock.api

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>Point</code>
  */
@js.native
trait Point extends js.Object {

  /**
    * For categorized axes this property holds the category name for the point. For other axis it holds the x value.
    */
  val category: String | Double = js.native

  /**
    * The series object associated with the point.
    */
  val series: CleanJsObject[Series] = js.native

  /**
    * The percentage for points in a stacked series.
    */
  val percentage: Double = js.native

  /**
    * Whether the point is selected or not.
    */
  val selected: Boolean = js.native

  /**
    * The x value for the point.
    */
  val x: Double = js.native

  /**
    * The y value for the point.
    */
  val y: Double = js.native

  /**
    * Remove the point from the series.
    * @param redraw Defaults to <code>true</code>. Whether to redraw the chart after the point is removed.If doing more operations on the chart, it is a good idea to set redraw to false and call <code>chart.redraw()</code> after.
    * @param animation Defaults to true. When true, the graph's updating will be animated with default animation options. The animation can also be a configuration object with properties <code>duration</code> and <code>easing</code>.
    */
  def remove(redraw: Boolean = ???, animation: js.Any = ???): Unit = js.native

  /**
    * Select or unselect the point.
    * @param select When <code>true</code>, the point is selected. When <code>false</code>, the point is unselected. When <code>null</code> or <code>undefined</code>, the selection state is toggled.
    * @param accumulate When <code>true</code>, the selection is added to other selected points. When <code>false</code>, other selected points are deselected. Internally in Highcharts,selected points are accumulated on Control, Shift or Cmd clicking the point.
    */
  def select(select: Boolean = ???, accumulate: Boolean = ???): Unit = js.native

  /**
    * Update the point with new values.
    * @param redraw Defaults to <code>true</code>. Whether to redraw the chart after the point is updated.If doing more operations on the chart, it is a good idea to set redraw to false and call <code>chart.redraw()</code> after.


    * @param animation Defaults to true. When true, the update will be animated with default animation options. The animation can also be a configuration object with properties <code>duration</code> and <code>easing</code>.
    */
  def update(options: js.Any = ???, redraw: Boolean = ???, animation: js.Any = ???): Unit = js.native

  /**
    * If a point object is created by data grouping, it doesn't reflect actual points in the raw data. In this case, the <code>dataGroup</code> property holds information that points back to the raw data:
    * <ul>
    * <li><code>dataGroup.start</code> is the index of the first raw data point in the group.</li>
    * <li><code>dataGroup.length</code> is the amount of points in the group.</li>
    * </ul>
    * @since 4.2.4
    */
  val dataGroup: js.Object = js.native
}
