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
  * @note JavaScript name: <code>Axis</code>
  */
@js.native
trait Axis extends js.Object {

  /**
    * <p>Set the minimum and maximum of the axes after render time. The <code>setExtremes</code> method will not allow a range lower than the <a href="#xAxis.minRange">minRange</a> option.</p>
    * 
    * <p>In Highmaps, the X and Y axis will preserve the aspect ratio, so zooming on one axis will affect the other.</p>
    * @param min The new minimum value
    * @param max The new maximum value
    * @param redraw Defaults to <code>true</code>. Whether to redraw the chart or wait for an explicit call to <code>chart.redraw()</code>.
    * @param animation Defaults to true. When true, the resize will be animated with default animation options. The animation can also be a configuration object with properties <code>duration</code> and <code>easing</code>.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/members/axis-setextremes/" target="_blank">Set extremes from a button</a>
    */
  def setExtremes(min: Double = ???, max: Double = ???, redraw: Boolean = ???, animation: js.Any = ???): Unit = js.native

  /**
    * Update the title of the axis after render time. In Highmaps, X and Y axis titles are hidden by default.
    * @param title The new title options on the same format as given in <a class="internal" href="#xAxis.title">xAxis.title</a>.
    * @param redraw Whether to redraw the chart now or hold until the next chart.redraw()
    */
  def setTitle(title: js.Object = ???, redraw: Boolean = ???): Unit = js.native

  /**
    * Get the current extremes for the axis.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/members/axis-getextremes/" target="_blank">Report extremes by click on a button</a>
    */
  def getExtremes(): js.Object = js.native

  /**
    * Remove an axis from the chart. Usually in maps we have only one X and one Y axis which are defined from start, so this method is not used.
    * @param redraw 
Defaults to <code>true</code>. Whether to redraw the chart following the remove.
    */
  def remove(redraw: Boolean = ???): Unit = js.native

  /**
    * Translates a value in terms of axis units in to pixels within the chart.
    * @param value 
A value in terms of axis units.
    */
  def toPixels(value: Double = ???, paneCoordinates: Boolean = ???): Double = js.native

  /**
    * Translate a pixel position along the axis to a value in terms of axis units.
    * @param pixel 
A pixel position along the axis.
    */
  def toValue(pixel: Double = ???, paneCoordinates: Boolean = ???): Double = js.native

  /**
    * Update an axis object with a new set of options. The options are merged with the existing options, so only new or altered options need to be specified.
    * @param options 
The new options that will be merged in with existing options on the axis.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/members/axis-update/" target="_blank">Toggle options on color axis</a>
    */
  def update(options: js.Object = ???, redraw: Boolean = ???): Unit = js.native
}
