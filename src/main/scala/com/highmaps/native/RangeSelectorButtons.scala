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
  * @note JavaScript name: <code>rangeSelector-buttons</code>
  */
class RangeSelectorButtons extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>How many units of the defined type the button should span. If <code>type</code>
    * is &quot;month&quot; and <code>count</code> is 3, the button spans three months.</p>
    */
  var count: js.UndefOr[Double] = js.undefined

  /**
    * <p>A custom data grouping object for each button.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/rangeselector/datagrouping/">Data grouping by range selector buttons</a>
    */
  var dataGrouping: js.Any = js.undefined

  var events: js.Any = js.undefined

  /**
    * <p>Additional range (in milliseconds) added to the end of the calculated
    * time span.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/rangeselector/min-max-offsets/">Button offsets</a>
    * @since 6.0.0
    */
  var offsetMax: js.UndefOr[Double] = js.undefined

  /**
    * <p>Additional range (in milliseconds) added to the start of the
    * calculated time span.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/rangeselector/min-max-offsets/">Button offsets</a>
    * @since 6.0.0
    */
  var offsetMin: js.UndefOr[Double] = js.undefined

  /**
    * <p>When buttons apply dataGrouping on a series, by default zooming
    * in/out will deselect buttons and unset dataGrouping. Enable this
    * option to keep buttons selected when extremes change.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/stock/rangeselector/preserve-datagrouping/">Different preserveDataGrouping settings</a>
    * @since 6.1.2
    */
  var preserveDataGrouping: js.UndefOr[Boolean] = js.undefined

  /**
    * <p>The text for the button itself.</p>
    */
  var text: js.UndefOr[String] = js.undefined

  /**
    * <p>Explanation for the button, shown as a tooltip on hover, and used by
    * assistive technology.</p>
    */
  var title: js.UndefOr[String] = js.undefined

  /**
    * <p>Defined the time span for the button. Can be one of <code>millisecond</code>,
    * <code>second</code>, <code>minute</code>, <code>hour</code>, <code>day</code>, <code>week</code>, <code>month</code>, <code>year</code>, <code>ytd</code>,
    * and <code>all</code>.</p>
    */
  var `type`: js.Any = js.undefined
}

object RangeSelectorButtons {
  /**
    * @param count <p>How many units of the defined type the button should span. If <code>type</code>. is &quot;month&quot; and <code>count</code> is 3, the button spans three months.</p>
    * @param dataGrouping <p>A custom data grouping object for each button.</p>
    * @param offsetMax <p>Additional range (in milliseconds) added to the end of the calculated. time span.</p>
    * @param offsetMin <p>Additional range (in milliseconds) added to the start of the. calculated time span.</p>
    * @param preserveDataGrouping <p>When buttons apply dataGrouping on a series, by default zooming. in/out will deselect buttons and unset dataGrouping. Enable this. option to keep buttons selected when extremes change.</p>
    * @param text <p>The text for the button itself.</p>
    * @param title <p>Explanation for the button, shown as a tooltip on hover, and used by. assistive technology.</p>
    * @param `type` <p>Defined the time span for the button. Can be one of <code>millisecond</code>,. <code>second</code>, <code>minute</code>, <code>hour</code>, <code>day</code>, <code>week</code>, <code>month</code>, <code>year</code>, <code>ytd</code>,. and <code>all</code>.</p>
    */
  def apply(count: js.UndefOr[Double] = js.undefined, dataGrouping: js.UndefOr[js.Any] = js.undefined, events: js.UndefOr[js.Any] = js.undefined, offsetMax: js.UndefOr[Double] = js.undefined, offsetMin: js.UndefOr[Double] = js.undefined, preserveDataGrouping: js.UndefOr[Boolean] = js.undefined, text: js.UndefOr[String] = js.undefined, title: js.UndefOr[String] = js.undefined, `type`: js.UndefOr[js.Any] = js.undefined): RangeSelectorButtons = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new RangeSelectorButtons {
      this.count = count
      this.dataGrouping = dataGrouping
      this.events = events
      this.offsetMax = offsetMax
      this.offsetMin = offsetMin
      this.preserveDataGrouping = preserveDataGrouping
      this.text = text
      this.title = title
      this.`type` = `type`
    })
  }
}
