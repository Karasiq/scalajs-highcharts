/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator v1.0.7 by Karasiq
  * @see [[http://api.highcharts.com/highcharts]]
  */
package com.highcharts.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>xAxis-events</code>
  */
@js.annotation.ScalaJSDefined
class XAxisEvents extends js.Object {

  /**
    * An event fired after the breaks have rendered.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/axisbreak/break-event//" target="_blank">afterBreak Event</a>
    * @since 4.1.0
    */
  val afterBreaks: js.UndefOr[js.Function] = js.undefined

  /**
    * As opposed to the <code>setExtremes</code> event, this event fires after the final min and max values are computed and corrected for <code>minRange</code>.
    * @since 2.3
    */
  val afterSetExtremes: js.UndefOr[js.Function] = js.undefined

  /**
    * An event fired when a break from this axis occurs on a point.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/highcharts/axisbreak/break-visualized/" target="_blank">Visualization of a Break</a>
    * @since 4.1.0
    */
  val pointBreak: js.UndefOr[js.Function] = js.undefined

  /**
    * <p>Fires when the minimum and maximum is set for the axis, either by calling the <code>.setExtremes()</code> method or by selecting an area in the chart. One parameter, <code>event</code>, is passed to the function. This contains common event information based on jQuery or MooTools depending on which library is used as the base for Highcharts.</p>
    * 
    * <p>The new user set minimum and maximum values can be found by <code>event.min</code> and <code>event.max</code>. When an axis is zoomed all the way out from the "Reset zoom" button, <code>event.min</code> and <code>event.max</code> are null, and the new extremes are set based on <code>this.dataMin</code> and <code>this.dataMax</code>.</p>
    * @since 1.2.0
    */
  val setExtremes: js.UndefOr[js.Function] = js.undefined
}
