/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highmaps]]
  */
package com.highmaps.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>yAxis-events</code>
  */
class YAxisEvents extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>An event fired after the breaks have rendered.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/axisbreak/break-event/">AfterBreak Event</a>
    * @since 4.1.0
    */
  var afterBreaks: js.Any = js.undefined

  /**
    * <p>As opposed to the <code>setExtremes</code> event, this event fires after the
    * final min and max values are computed and corrected for <code>minRange</code>.</p>
    * <p>Fires when the minimum and maximum is set for the axis, either by
    * calling the <code>.setExtremes()</code> method or by selecting an area in the
    * chart. One parameter, <code>event</code>, is passed to the function, containing
    * common event information.</p>
    * <p>The new user set minimum and maximum values can be found by
    * <code>event.min</code> and <code>event.max</code>. These reflect the axis minimum and
    * maximum in axis values. The actual data extremes are found in
    * <code>event.dataMin</code> and <code>event.dataMax</code>.</p>
    * @since 2.3.0
    */
  var afterSetExtremes: js.Any = js.undefined

  /**
    * <p>An event fired when a break from this axis occurs on a point.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/axisbreak/break-visualized/">Visualization of a Break</a>
    * @since 4.1.0
    */
  var pointBreak: js.Any = js.undefined

  /**
    * <p>An event fired when a point falls inside a break from this axis.</p>
    */
  var pointInBreak: js.Any = js.undefined

  /**
    * <p>Fires when the minimum and maximum is set for the axis, either by
    * calling the <code>.setExtremes()</code> method or by selecting an area in the
    * chart. One parameter, <code>event</code>, is passed to the function,
    * containing common event information.</p>
    * <p>The new user set minimum and maximum values can be found by
    * <code>event.min</code> and <code>event.max</code>. These reflect the axis minimum and
    * maximum in data values. When an axis is zoomed all the way out from
    * the &quot;Reset zoom&quot; button, <code>event.min</code> and <code>event.max</code> are null, and
    * the new extremes are set based on <code>this.dataMin</code> and <code>this.dataMax</code>.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/xaxis/events-setextremes/">Log new extremes on x axis</a>
    * @since 1.2.0
    */
  var setExtremes: js.Any = js.undefined
}

object YAxisEvents {
  /**
    * @param afterBreaks <p>An event fired after the breaks have rendered.</p>
    * @param afterSetExtremes <p>As opposed to the <code>setExtremes</code> event, this event fires after the. final min and max values are computed and corrected for <code>minRange</code>.</p>. <p>Fires when the minimum and maximum is set for the axis, either by. calling the <code>.setExtremes()</code> method or by selecting an area in the. chart. One parameter, <code>event</code>, is passed to the function, containing. common event information.</p>. <p>The new user set minimum and maximum values can be found by. <code>event.min</code> and <code>event.max</code>. These reflect the axis minimum and. maximum in axis values. The actual data extremes are found in. <code>event.dataMin</code> and <code>event.dataMax</code>.</p>
    * @param pointBreak <p>An event fired when a break from this axis occurs on a point.</p>
    * @param pointInBreak <p>An event fired when a point falls inside a break from this axis.</p>
    * @param setExtremes <p>Fires when the minimum and maximum is set for the axis, either by. calling the <code>.setExtremes()</code> method or by selecting an area in the. chart. One parameter, <code>event</code>, is passed to the function,. containing common event information.</p>. <p>The new user set minimum and maximum values can be found by. <code>event.min</code> and <code>event.max</code>. These reflect the axis minimum and. maximum in data values. When an axis is zoomed all the way out from. the &quot;Reset zoom&quot; button, <code>event.min</code> and <code>event.max</code> are null, and. the new extremes are set based on <code>this.dataMin</code> and <code>this.dataMax</code>.</p>
    */
  def apply(afterBreaks: js.UndefOr[js.Any] = js.undefined, afterSetExtremes: js.UndefOr[js.Any] = js.undefined, pointBreak: js.UndefOr[js.Any] = js.undefined, pointInBreak: js.UndefOr[js.Any] = js.undefined, setExtremes: js.UndefOr[js.Any] = js.undefined): YAxisEvents = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new YAxisEvents {
      this.afterBreaks = afterBreaks
      this.afterSetExtremes = afterSetExtremes
      this.pointBreak = pointBreak
      this.pointInBreak = pointInBreak
      this.setExtremes = setExtremes
    })
  }
}
