/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highmaps]]
  */
package com.highmaps.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>colorAxis-events</code>
  */
@js.annotation.ScalaJSDefined
class ColorAxisEvents extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Fires when the legend item belonging to the colorAxis is clicked.
    * One parameter, <code>event</code>, is passed to the function.</p>
    */
  val legendItemClick: js.UndefOr[js.Function] = js.undefined

  /**
    * <p>An event fired after the breaks have rendered.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/axisbreak/break-event/">AfterBreak Event</a>
    * @since 4.1.0
    */
  val afterBreaks: js.UndefOr[js.Function] = js.undefined

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
    * @since 2.3
    */
  val afterSetExtremes: js.UndefOr[js.Function] = js.undefined

  /**
    * <p>An event fired when a break from this axis occurs on a point.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/highcharts/axisbreak/break-visualized/">Visualization of a Break</a>
    * @since 4.1.0
    */
  val pointBreak: js.UndefOr[js.Function] = js.undefined

  /**
    * <p>An event fired when a point falls inside a break from this axis.</p>
    */
  val pointInBreak: js.UndefOr[js.Function] = js.undefined

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
  val setExtremes: js.UndefOr[js.Function] = js.undefined
}

object ColorAxisEvents {
  /**
    * @param legendItemClick <p>Fires when the legend item belonging to the colorAxis is clicked.. One parameter, <code>event</code>, is passed to the function.</p>
    * @param afterBreaks <p>An event fired after the breaks have rendered.</p>
    * @param afterSetExtremes <p>As opposed to the <code>setExtremes</code> event, this event fires after the. final min and max values are computed and corrected for <code>minRange</code>.</p>. <p>Fires when the minimum and maximum is set for the axis, either by. calling the <code>.setExtremes()</code> method or by selecting an area in the. chart. One parameter, <code>event</code>, is passed to the function, containing. common event information.</p>. <p>The new user set minimum and maximum values can be found by. <code>event.min</code> and <code>event.max</code>. These reflect the axis minimum and. maximum in axis values. The actual data extremes are found in. <code>event.dataMin</code> and <code>event.dataMax</code>.</p>
    * @param pointBreak <p>An event fired when a break from this axis occurs on a point.</p>
    * @param pointInBreak <p>An event fired when a point falls inside a break from this axis.</p>
    * @param setExtremes <p>Fires when the minimum and maximum is set for the axis, either by. calling the <code>.setExtremes()</code> method or by selecting an area in the. chart. One parameter, <code>event</code>, is passed to the function,. containing common event information.</p>. <p>The new user set minimum and maximum values can be found by. <code>event.min</code> and <code>event.max</code>. These reflect the axis minimum and. maximum in data values. When an axis is zoomed all the way out from. the &quot;Reset zoom&quot; button, <code>event.min</code> and <code>event.max</code> are null, and. the new extremes are set based on <code>this.dataMin</code> and <code>this.dataMax</code>.</p>
    */
  def apply(legendItemClick: js.UndefOr[js.Function] = js.undefined, afterBreaks: js.UndefOr[js.Function] = js.undefined, afterSetExtremes: js.UndefOr[js.Function] = js.undefined, pointBreak: js.UndefOr[js.Function] = js.undefined, pointInBreak: js.UndefOr[js.Function] = js.undefined, setExtremes: js.UndefOr[js.Function] = js.undefined): ColorAxisEvents = {
    val legendItemClickOuter: js.UndefOr[js.Function] = legendItemClick
    val afterBreaksOuter: js.UndefOr[js.Function] = afterBreaks
    val afterSetExtremesOuter: js.UndefOr[js.Function] = afterSetExtremes
    val pointBreakOuter: js.UndefOr[js.Function] = pointBreak
    val pointInBreakOuter: js.UndefOr[js.Function] = pointInBreak
    val setExtremesOuter: js.UndefOr[js.Function] = setExtremes
    com.highcharts.HighchartsGenericObject.toCleanObject(new ColorAxisEvents {
      override val legendItemClick: js.UndefOr[js.Function] = legendItemClickOuter
      override val afterBreaks: js.UndefOr[js.Function] = afterBreaksOuter
      override val afterSetExtremes: js.UndefOr[js.Function] = afterSetExtremesOuter
      override val pointBreak: js.UndefOr[js.Function] = pointBreakOuter
      override val pointInBreak: js.UndefOr[js.Function] = pointInBreakOuter
      override val setExtremes: js.UndefOr[js.Function] = setExtremesOuter
    })
  }
}
