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
  * @note JavaScript name: <code>chart-parallelAxes-resize-controlledAxis</code>
  */
class ChartParallelAxesResizeControlledAxis extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Array of axes that should move out of the way of resizing
    * being done for the current axis. If not set, the next axis
    * will be used.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/yaxis/multiple-resizers">Three panes with resizers</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/yaxis/resize-multiple-axes">One resizer controlling multiple axes</a>
    * @since 6.0.0
    */
  var next: js.UndefOr[js.Array[Double | String]] = js.undefined

  /**
    * <p>Array of axes that should move with the current axis
    * while resizing.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/yaxis/multiple-resizers">Three panes with resizers</a>
<a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/yaxis/resize-multiple-axes">One resizer controlling multiple axes</a>
    * @since 6.0.0
    */
  var prev: js.UndefOr[js.Array[Double | String]] = js.undefined
}

object ChartParallelAxesResizeControlledAxis {
  /**
    * @param next <p>Array of axes that should move out of the way of resizing. being done for the current axis. If not set, the next axis. will be used.</p>
    * @param prev <p>Array of axes that should move with the current axis. while resizing.</p>
    */
  def apply(next: js.UndefOr[js.Array[Double | String]] = js.undefined, prev: js.UndefOr[js.Array[Double | String]] = js.undefined): ChartParallelAxesResizeControlledAxis = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new ChartParallelAxesResizeControlledAxis {
      this.next = next
      this.prev = prev
    })
  }
}
