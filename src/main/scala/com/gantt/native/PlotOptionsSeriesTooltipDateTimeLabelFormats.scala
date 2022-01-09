/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/gantt]]
  */
package com.gantt.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>plotOptions-series-tooltip-dateTimeLabelFormats</code>
  */
class PlotOptionsSeriesTooltipDateTimeLabelFormats extends com.highcharts.HighchartsGenericObject {

  var day: js.UndefOr[String] = js.undefined

  var hour: js.UndefOr[String] = js.undefined

  var millisecond: js.UndefOr[String] = js.undefined

  var minute: js.UndefOr[String] = js.undefined

  var month: js.UndefOr[String] = js.undefined

  var second: js.UndefOr[String] = js.undefined

  var week: js.UndefOr[String] = js.undefined

  var year: js.UndefOr[String] = js.undefined
}

object PlotOptionsSeriesTooltipDateTimeLabelFormats {
  /**
    */
  def apply(day: js.UndefOr[String] = js.undefined, hour: js.UndefOr[String] = js.undefined, millisecond: js.UndefOr[String] = js.undefined, minute: js.UndefOr[String] = js.undefined, month: js.UndefOr[String] = js.undefined, second: js.UndefOr[String] = js.undefined, week: js.UndefOr[String] = js.undefined, year: js.UndefOr[String] = js.undefined): PlotOptionsSeriesTooltipDateTimeLabelFormats = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsSeriesTooltipDateTimeLabelFormats {
      this.day = day
      this.hour = hour
      this.millisecond = millisecond
      this.minute = minute
      this.month = month
      this.second = second
      this.week = week
      this.year = year
    })
  }
}
