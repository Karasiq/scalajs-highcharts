/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator v1.0.6 by Karasiq
  * @see [[http://api.highcharts.com/highcharts]]
  */
package com.highcharts.api

import scalajs.js
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>Axis</code>
  */
@js.native
trait Axis extends js.Object {

  /**
    * Get the current extremes for the axis.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/members/axis-getextremes/" target="_blank">Report extremes by click on a button</a>
    * @since 1.2.0
    */
  def getExtremes(): js.Object = js.native

  /**
    * Remove an axis from the chart.
    * @param redraw 
Defaults to <code>true</code>. Whether to redraw the chart following the remove. 
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/members/chart-addaxis/" target="_blank">Add and remove axes</a>
    * @since 3.0
    */
  def remove(redraw: js.UndefOr[Boolean] = js.undefined): Unit = js.native

  /**
    * Remove a plot band by its <code>id</code>.
    * @param id The plot band's <code>id</code> as given in the original configuration object or in the addPlotBand method.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/members/axis-removeplotband/" target="_blank">Remove plot band by id</a>, <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/members/axis-addplotband/" target="_blank">Toggle the plot band from a button</a>
    * @since 1.2.0
    */
  def removePlotBand(id: js.UndefOr[String] = js.undefined): Unit = js.native

  /**
    * Remove a plot line by its <code>id</code>.
    * @param id The plot line's <code>id</code> as given in the original configuration object or in the addPlotLine method.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/xaxis/plotlines-id/" target="_blank">Remove plot line by id</a>,<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/members/axis-addplotline/" target="_blank">toggle the plot line from a button</a>
    * @since 1.2.0
    */
  def removePlotLine(id: js.UndefOr[String] = js.undefined): Unit = js.native

  /**
    * Set new categories for the axis.
    * @param categories The new category names.
    * @param redraw Defaults to <code>true</code>. Whether to redraw the axis or wait for an explicit call to <code>chart.redraw()</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/members/axis-setcategories/" target="_blank">Set categories by click on a button</a>
    * @since 1.2.0
    */
  def setCategories(cateories: js.UndefOr[js.Array[js.Any]] = js.undefined, redraw: js.UndefOr[Boolean] = js.undefined): Unit = js.native

  /**
    * Set the minimum and maximum of the axes after render time. If the <code>startOnTick</code> and <code>endOnTick</code> options are true, the minimum and maximum values are rounded off to the nearest tick. To prevent this, these options can be set to false before calling setExtremes. Also, <code>setExtremes</code> will not allow a range lower than the <a href="#xAxis.minRange">minRange</a> option, which by default is the range of five points.
    * @param min The new minimum value
    * @param max The new maximum value
    * @param redraw Defaults to <code>true</code>. Whether to redraw the chart or wait for an explicit call to <code>chart.redraw()</code>.
    * @param animation Defaults to true. When true, the resize will be animated with default animation options. The animation can also be a configuration object with properties <code>duration</code> and <code>easing</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/members/axis-setextremes/" target="_blank">Set extremes from button</a>,<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/members/axis-setextremes-datetime/" target="_blank">Set extremes on datetime axis</a>,<a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/members/axis-setextremes-off-ticks/" target="_blank">setting extremes off ticks</a>
    * @since 1.2.0
    */
  def setExtremes(min: js.UndefOr[Double] = js.undefined, max: js.UndefOr[Double] = js.undefined, redraw: js.UndefOr[Boolean] = js.undefined, animation: js.Any = js.undefined): Unit = js.native

  /**
    * Translates a value in terms of axis units in to pixels within the chart.
    * @param value 
A value in terms of axis units.
    * @since 3.0
    */
  def toPixels(value: js.UndefOr[Double] = js.undefined, paneCoordinates: js.UndefOr[Boolean] = js.undefined): Double = js.native

  /**
    * Translate a pixel position along the axis to a value in terms of axis units.
    * @param pixel 
A pixel position along the axis.
    * @since 3.0
    */
  def toValue(pixel: js.UndefOr[Double] = js.undefined, paneCoordinates: js.UndefOr[Boolean] = js.undefined): Double = js.native

  /**
    * Update an axis object with a new set of options. The options are merged with the existing options, so only new or altered options need to be specified.
    * @param options 
The new options that will be merged in with existing options on the axis.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/members/axis-update/" target="_blank">Axis update demo</a>
    * @since 3.0
    */
  def update(options: js.UndefOr[js.Object] = js.undefined, redraw: js.UndefOr[Boolean] = js.undefined): Unit = js.native

  /**
    * Update the title of the axis after render time.
    * @param title The new title options on the same format as given in <a class="internal" href="#xAxis.title">xAxis.title</a>.
    * @param redraw Whether to redraw the chart now or hold until the next chart.redraw()
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/members/axis-settitle/" target="_blank">Set a new Y axis title</a>
    * @since 2.2
    */
  def setTitle(title: js.UndefOr[js.Object] = js.undefined, redraw: js.UndefOr[Boolean] = js.undefined): Unit = js.native

  /**
    * Add a plot line after render time.
    * @param options A configuration object consisting of the same members as <a class="internal" href="#xAxis.plotLines">options.xAxis.plotLines</a>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/members/axis-addplotline/" target="_blank">Toggle the plot line from a button</a>
    * @since 1.2.0
    */
  def addPlotLine(options: js.UndefOr[js.Object] = js.undefined): Unit = js.native

  /**
    * Add a plot band after render time.
    * @param options A configuration object consisting of the same members as <a class="internal" href="#xAxis.plotBands">options.xAxis.plotBands</a>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/members/axis-addplotband/" target="_blank">Toggle the plot band from a button</a>
    * @since 1.2.0
    */
  def addPlotBand(options: js.UndefOr[js.Object] = js.undefined): Unit = js.native
}
