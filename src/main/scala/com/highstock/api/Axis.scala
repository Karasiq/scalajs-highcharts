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
  * @note JavaScript name: <code>Axis</code>
  */
@js.native
trait Axis extends js.Object {

  /**
    * Set the <a href="#plotOptions.series.compare">compare</a> mode on all series belonging to an Y axis after render time. 
    * @param compare 
The compare mode, can be one of <code>null</code>, <code>"value"</code> or <code>"percent"</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/members/axis-setcompare/" target="_blank">Set compare</a>
    * @since 1.3
    */
  def setCompare(compare: String = ???, redraw: Boolean = ???): Unit = js.native

  /**
    * Set the minimum and maximum of the axes after render time. If the <code>startOnTick</code> and <code>endOnTick</code> options are true, the minimum and maximum values are rounded off to the nearest tick. To prevent this, these options can be set to false before calling setExtremes. Also, <code>setExtremes</code> will not allow a range lower than the <a href="#xAxis.minRange">minRange</a> option, which by default is the range of five points.
    * @param min The new minimum value
    * @param max The new maximum value
    * @param redraw Defaults to <code>true</code>. Whether to redraw the chart or wait for an explicit call to <code>chart.redraw()</code>.
    * @param animation Defaults to true. When true, the resize will be animated with default animation options. The animation can also be a configuration object with properties <code>duration</code> and <code>easing</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/members/axis-setextremes/" target="_blank">Set extremes from button</a>
    */
  def setExtremes(min: Double = ???, max: Double = ???, redraw: Boolean = ???, animation: js.Any = ???): Unit = js.native

  /**
    * Translates a value in terms of axis units in to pixels within the chart.
    * @param value 
A value in terms of axis units.
    * @since 1.3
    */
  def toPixels(value: Double = ???, paneCoordinates: Boolean = ???): Double = js.native

  /**
    * Translate a pixel position along the axis to a value in terms of axis units.
    * @param pixel 
A pixel position along the axis.
    * @since 1.3
    */
  def toValue(pixel: Double = ???, paneCoordinates: Boolean = ???): Double = js.native

  /**
    * Update an axis object with a new set of options. The options are merged with the existing options, so only new or altered options need to be specified.
    * @param options 
The new options that will be merged in with existing options on the axis.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/highcharts/members/axis-update/" target="_blank">Axis update demo</a>
    * @since 3.0
    */
  def update(options: js.Object = ???, redraw: Boolean = ???): Unit = js.native

  /**
    * Add a plot line after render time.
    * @param options A configuration object consisting of the same members as <a class="internal" href="#xAxis.plotLines">options.xAxis.plotLines</a>
    */
  def addPlotLine(options: js.Object = ???): Unit = js.native

  /**
    * Set the data grouping and optionally redraw all series belonging to this axis.
    * @param dataGrouping 
A dataGrouping configuration like shown at <a href="#plotOptions.series.dataGrouping">series.dataGrouping</a>. Use <code>false</code> to disable data grouping dynamically.
    * @since 2.1.6
    */
  def setDataGrouping(dataGrouping: js.Object = ???, redraw: Boolean = ???): Unit = js.native

  /**
    * Remove a plot band by its <code>id</code>.
    * @param id The plot band's <code>id</code> as given in the original configuration object or in the addPlotBand method.
    */
  def removePlotBand(id: String = ???): Unit = js.native

  /**
    * Remove a plot line by its <code>id</code>.
    * @param id The plot line's <code>id</code> as given in the original configuration object or in the addPlotLine method.
    */
  def removePlotLine(id: String = ???): Unit = js.native

  /**
    * Add a plot band after render time.
    * @param options A configuration object consisting of the same members as <a class="internal" href="#xAxis.plotBands">options.xAxis.plotBands</a>
    */
  def addPlotBand(options: js.Object = ???): Unit = js.native

  /**
    * Get the current extremes for the axis. The returned object contains:
    * 
    * <dl>
    *   <dt>dataMax:</dt>
    *   <dd>The maximum value of the axis' associated series.</dd>
    * 
    *   <dt>dataMin:</dt>
    *   <dd>The minimum value of the axis' associated series.</dd>
    * 
    *   <dt>max:</dt>
    *   <dd>The maximum axis value, either automatic or set manually. If the <code>max</code> option is not set, <code>maxPadding</code> is 0 and <code>endOnTick</code> is <code>false</code>, this value will be the same as <code>dataMax</code>.</dd>
    * 
    *   <dt>min:</dt>
    *   <dd>The minimum axis value, either automatic or set manually. If the <code>min</code> option is not set, <code>minPadding</code> is 0 and <code>startOnTick</code> is <code>false</code>, this value will be the same as <code>dataMin</code>.</dd>
    * </dl>
    */
  def getExtremes(): js.Object = js.native
}
