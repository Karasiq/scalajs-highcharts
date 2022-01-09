/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highstock]]
  */
package com.highstock.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>colorAxis-events</code>
  */
class ColorAxisEvents extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Fires when the legend item belonging to the colorAxis is clicked.
    * One parameter, <code>event</code>, is passed to the function.</p>
    */
  var legendItemClick: js.UndefOr[js.Function] = js.undefined

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

object ColorAxisEvents {
  /**
    * @param legendItemClick <p>Fires when the legend item belonging to the colorAxis is clicked.. One parameter, <code>event</code>, is passed to the function.</p>
    * @param afterSetExtremes <p>As opposed to the <code>setExtremes</code> event, this event fires after the. final min and max values are computed and corrected for <code>minRange</code>.</p>. <p>Fires when the minimum and maximum is set for the axis, either by. calling the <code>.setExtremes()</code> method or by selecting an area in the. chart. One parameter, <code>event</code>, is passed to the function, containing. common event information.</p>. <p>The new user set minimum and maximum values can be found by. <code>event.min</code> and <code>event.max</code>. These reflect the axis minimum and. maximum in axis values. The actual data extremes are found in. <code>event.dataMin</code> and <code>event.dataMax</code>.</p>
    * @param setExtremes <p>Fires when the minimum and maximum is set for the axis, either by. calling the <code>.setExtremes()</code> method or by selecting an area in the. chart. One parameter, <code>event</code>, is passed to the function,. containing common event information.</p>. <p>The new user set minimum and maximum values can be found by. <code>event.min</code> and <code>event.max</code>. These reflect the axis minimum and. maximum in data values. When an axis is zoomed all the way out from. the &quot;Reset zoom&quot; button, <code>event.min</code> and <code>event.max</code> are null, and. the new extremes are set based on <code>this.dataMin</code> and <code>this.dataMax</code>.</p>
    */
  def apply(legendItemClick: js.UndefOr[js.Function] = js.undefined, afterSetExtremes: js.UndefOr[js.Any] = js.undefined, setExtremes: js.UndefOr[js.Any] = js.undefined): ColorAxisEvents = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new ColorAxisEvents {
      this.legendItemClick = legendItemClick
      this.afterSetExtremes = afterSetExtremes
      this.setExtremes = setExtremes
    })
  }
}
