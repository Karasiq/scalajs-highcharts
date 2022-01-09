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
  * @note JavaScript name: <code>series&lt;gantt&gt;-data-completed</code>
  */
class SeriesGanttDataCompleted extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The amount of the progress indicator, ranging from 0 (not started) to 1
    * (finished).</p>
    */
  var amount: js.UndefOr[Double] = js.undefined

  /**
    * <p>The fill of the progress indicator. Defaults to a darkened variety of the
    * main color.</p>
    */
  var fill: js.UndefOr[String | js.Object] = js.undefined
}

object SeriesGanttDataCompleted {
  /**
    * @param amount <p>The amount of the progress indicator, ranging from 0 (not started) to 1. (finished).</p>
    * @param fill <p>The fill of the progress indicator. Defaults to a darkened variety of the. main color.</p>
    */
  def apply(amount: js.UndefOr[Double] = js.undefined, fill: js.UndefOr[String | js.Object] = js.undefined): SeriesGanttDataCompleted = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesGanttDataCompleted {
      this.amount = amount
      this.fill = fill
    })
  }
}
