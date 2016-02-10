/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highstock]]
  */
package com.highstock.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>yAxis-events</code>
  */
@js.annotation.ScalaJSDefined
class YAxisEvents extends js.Object {

  /**
    * As opposed to the <code>setExtremes</code> event, this event fires after the final min and max values are computed and corrected for <code>minRange</code>.
    * @since 1.2
    */
  val afterSetExtremes: js.UndefOr[js.Function] = js.undefined

  /**
    * An event fired when a point falls inside a break from this axis.
    */
  val pointInBreak: js.UndefOr[js.Function] = js.undefined

  /**
    * <p>Fires when the minimum and maximum is set for the axis, either by calling the <code>.setExtremes()</code> method or by selecting an area in the chart. One parameter, <code>event</code>, is passed to the function. This contains common event information based on jQuery or MooTools depending on which library is used as the base for Highcharts.</p>
    * 
    * <p>The new user set minimum and maximum values can be found by <code>event.min</code> and <code>event.max</code>. When an axis is zoomed all the way out from the "Reset zoom" button, <code>event.min</code> and <code>event.max</code> are null, and the new extremes are set based on <code>this.dataMin</code> and <code>this.dataMax</code>.</p>
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/stock/xaxis/events-setextremes/" target="_blank">Log new extremes on x axis</a>
    */
  val setExtremes: js.UndefOr[js.Function] = js.undefined
}

object YAxisEvents {
  /**
    * @param afterSetExtremes As opposed to the <code>setExtremes</code> event, this event fires after the final min and max values are computed and corrected for <code>minRange</code>.
    * @param pointInBreak An event fired when a point falls inside a break from this axis.
    * @param setExtremes <p>Fires when the minimum and maximum is set for the axis, either by calling the <code>.setExtremes()</code> method or by selecting an area in the chart. One parameter, <code>event</code>, is passed to the function. This contains common event information based on jQuery or MooTools depending on which library is used as the base for Highcharts.</p>. . <p>The new user set minimum and maximum values can be found by <code>event.min</code> and <code>event.max</code>. When an axis is zoomed all the way out from the "Reset zoom" button, <code>event.min</code> and <code>event.max</code> are null, and the new extremes are set based on <code>this.dataMin</code> and <code>this.dataMax</code>.</p>
    */
  def apply(afterSetExtremes: js.UndefOr[js.Function] = js.undefined, pointInBreak: js.UndefOr[js.Function] = js.undefined, setExtremes: js.UndefOr[js.Function] = js.undefined): YAxisEvents = {
    val afterSetExtremesOuter: js.UndefOr[js.Function] = afterSetExtremes
    val pointInBreakOuter: js.UndefOr[js.Function] = pointInBreak
    val setExtremesOuter: js.UndefOr[js.Function] = setExtremes
    new YAxisEvents {
      override val afterSetExtremes: js.UndefOr[js.Function] = afterSetExtremesOuter
      override val pointInBreak: js.UndefOr[js.Function] = pointInBreakOuter
      override val setExtremes: js.UndefOr[js.Function] = setExtremesOuter
    }
  }
}
