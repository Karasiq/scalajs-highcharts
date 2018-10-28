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
  * @note JavaScript name: <code>series&lt;gantt&gt;-data-completed</code>
  */
@js.annotation.ScalaJSDefined
class SeriesGanttDataCompleted extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The amount of the progress indicator, ranging from 0 (not started) to 1
    * (finished).</p>
    */
  val amount: js.UndefOr[Double] = js.undefined

  /**
    * <p>The fill of the progress indicator. Defaults to a darkened variety of the
    * main color.</p>
    */
  val fill: js.UndefOr[String | js.Object] = js.undefined
}

object SeriesGanttDataCompleted {
  /**
    * @param amount <p>The amount of the progress indicator, ranging from 0 (not started) to 1. (finished).</p>
    * @param fill <p>The fill of the progress indicator. Defaults to a darkened variety of the. main color.</p>
    */
  def apply(amount: js.UndefOr[Double] = js.undefined, fill: js.UndefOr[String | js.Object] = js.undefined): SeriesGanttDataCompleted = {
    val amountOuter: js.UndefOr[Double] = amount
    val fillOuter: js.UndefOr[String | js.Object] = fill
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesGanttDataCompleted {
      override val amount: js.UndefOr[Double] = amountOuter
      override val fill: js.UndefOr[String | js.Object] = fillOuter
    })
  }
}
