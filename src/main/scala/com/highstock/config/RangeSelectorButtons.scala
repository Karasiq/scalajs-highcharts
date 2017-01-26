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
  * @note JavaScript name: <code>rangeSelector-buttons</code>
  */
@js.annotation.ScalaJSDefined
class RangeSelectorButtons extends js.Object {

  /**
    * How many units of the defined type the button should span. If <code>type</code> is "month" and <code>count</code> is 3, the button spans three months.
    */
  val count: js.UndefOr[Double] = js.undefined

  /**
    * A custom data grouping object for each button.
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/stock/rangeselector/datagrouping/" target="_blank">Data grouping by range selector buttons</a>.
    */
  val dataGrouping: js.UndefOr[js.Object] = js.undefined

  /**
    * The text for the button itself.
    */
  val text: js.UndefOr[String] = js.undefined

  /**
    * Defined the time span for the button. Can be one of <code>"millisecond", "second", "minute", "hour", "day", "week", "month", "ytd", "all"</code>.
    */
  val `type`: js.UndefOr[String] = js.undefined
}

object RangeSelectorButtons {
  /**
    * @param count How many units of the defined type the button should span. If <code>type</code> is "month" and <code>count</code> is 3, the button spans three months.
    * @param dataGrouping A custom data grouping object for each button.
    * @param text The text for the button itself.
    * @param `type` Defined the time span for the button. Can be one of <code>"millisecond", "second", "minute", "hour", "day", "week", "month", "ytd", "all"</code>.
    */
  def apply(count: js.UndefOr[Double] = js.undefined, dataGrouping: js.UndefOr[js.Object] = js.undefined, text: js.UndefOr[String] = js.undefined, `type`: js.UndefOr[String] = js.undefined): RangeSelectorButtons = {
    val countOuter: js.UndefOr[Double] = count
    val dataGroupingOuter: js.UndefOr[js.Object] = dataGrouping
    val textOuter: js.UndefOr[String] = text
    val typeOuter: js.UndefOr[String] = `type`
    new RangeSelectorButtons {
      override val count: js.UndefOr[Double] = countOuter
      override val dataGrouping: js.UndefOr[js.Object] = dataGroupingOuter
      override val text: js.UndefOr[String] = textOuter
      override val `type`: js.UndefOr[String] = typeOuter
    }
  }
}
