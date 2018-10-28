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
class RangeSelectorButtons extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>How many units of the defined type the button should span. If <code>type</code>
    * is &quot;month&quot; and <code>count</code> is 3, the button spans three months.</p>
    */
  val count: js.UndefOr[Double] = js.undefined

  val events: js.Any = js.undefined

  /**
    * <p>Additional range (in milliseconds) added to the end of the calculated
    * time span.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/rangeselector/min-max-offsets/">Button offsets</a>
    * @since 6.0.0
    */
  val offsetMax: js.UndefOr[Double] = js.undefined

  /**
    * <p>Additional range (in milliseconds) added to the start of the
    * calculated time span.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/rangeselector/min-max-offsets/">Button offsets</a>
    * @since 6.0.0
    */
  val offsetMin: js.UndefOr[Double] = js.undefined

  /**
    * <p>When buttons apply dataGrouping on a series, by default zooming
    * in/out will deselect buttons and unset dataGrouping. Enable this
    * option to keep buttons selected when extremes change.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/rangeselector/preserve-datagrouping/">Different preserveDataGrouping settings</a>
    * @since 6.1.2
    */
  val preserveDataGrouping: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>A custom data grouping object for each button.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/rangeselector/datagrouping/">Data grouping by range selector buttons</a>
    */
  val dataGrouping: js.Any = js.undefined

  /**
    * <p>The text for the button itself.</p>
    */
  val text: js.UndefOr[String] = js.undefined

  /**
    * <p>Defined the time span for the button. Can be one of <code>millisecond</code>,
    * <code>second</code>, <code>minute</code>, <code>hour</code>, <code>day</code>, <code>week</code>, <code>month</code>, <code>ytd</code>, <code>all</code>.</p>
    */
  val `type`: js.UndefOr[String] = js.undefined
}

object RangeSelectorButtons {
  /**
    * @param count <p>How many units of the defined type the button should span. If <code>type</code>. is &quot;month&quot; and <code>count</code> is 3, the button spans three months.</p>
    * @param offsetMax <p>Additional range (in milliseconds) added to the end of the calculated. time span.</p>
    * @param offsetMin <p>Additional range (in milliseconds) added to the start of the. calculated time span.</p>
    * @param preserveDataGrouping <p>When buttons apply dataGrouping on a series, by default zooming. in/out will deselect buttons and unset dataGrouping. Enable this. option to keep buttons selected when extremes change.</p>
    * @param dataGrouping <p>A custom data grouping object for each button.</p>
    * @param text <p>The text for the button itself.</p>
    * @param `type` <p>Defined the time span for the button. Can be one of <code>millisecond</code>,. <code>second</code>, <code>minute</code>, <code>hour</code>, <code>day</code>, <code>week</code>, <code>month</code>, <code>ytd</code>, <code>all</code>.</p>
    */
  def apply(count: js.UndefOr[Double] = js.undefined, events: js.UndefOr[js.Any] = js.undefined, offsetMax: js.UndefOr[Double] = js.undefined, offsetMin: js.UndefOr[Double] = js.undefined, preserveDataGrouping: js.UndefOr[Boolean] = js.undefined, dataGrouping: js.UndefOr[js.Any] = js.undefined, text: js.UndefOr[String] = js.undefined, `type`: js.UndefOr[String] = js.undefined): RangeSelectorButtons = {
    val countOuter: js.UndefOr[Double] = count
    val eventsOuter: js.Any = events
    val offsetMaxOuter: js.UndefOr[Double] = offsetMax
    val offsetMinOuter: js.UndefOr[Double] = offsetMin
    val preserveDataGroupingOuter: js.UndefOr[Boolean] = preserveDataGrouping
    val dataGroupingOuter: js.Any = dataGrouping
    val textOuter: js.UndefOr[String] = text
    val typeOuter: js.UndefOr[String] = `type`
    com.highcharts.HighchartsGenericObject.toCleanObject(new RangeSelectorButtons {
      override val count: js.UndefOr[Double] = countOuter
      override val events: js.Any = eventsOuter
      override val offsetMax: js.UndefOr[Double] = offsetMaxOuter
      override val offsetMin: js.UndefOr[Double] = offsetMinOuter
      override val preserveDataGrouping: js.UndefOr[Boolean] = preserveDataGroupingOuter
      override val dataGrouping: js.Any = dataGroupingOuter
      override val text: js.UndefOr[String] = textOuter
      override val `type`: js.UndefOr[String] = typeOuter
    })
  }
}
