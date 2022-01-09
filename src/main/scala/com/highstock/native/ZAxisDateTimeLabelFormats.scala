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
  * @note JavaScript name: <code>zAxis-dateTimeLabelFormats</code>
  */
class ZAxisDateTimeLabelFormats extends com.highcharts.HighchartsGenericObject {

  var day: js.UndefOr[String | js.Any] = js.undefined

  var hour: js.UndefOr[String | js.Any] = js.undefined

  var millisecond: js.UndefOr[String | js.Any] = js.undefined

  var minute: js.UndefOr[String | js.Any] = js.undefined

  var month: js.UndefOr[String | js.Any] = js.undefined

  var second: js.UndefOr[String | js.Any] = js.undefined

  var week: js.UndefOr[String | js.Any] = js.undefined

  var year: js.UndefOr[String | js.Any] = js.undefined
}

object ZAxisDateTimeLabelFormats {
  /**
    */
  def apply(day: js.UndefOr[String | js.Any] = js.undefined, hour: js.UndefOr[String | js.Any] = js.undefined, millisecond: js.UndefOr[String | js.Any] = js.undefined, minute: js.UndefOr[String | js.Any] = js.undefined, month: js.UndefOr[String | js.Any] = js.undefined, second: js.UndefOr[String | js.Any] = js.undefined, week: js.UndefOr[String | js.Any] = js.undefined, year: js.UndefOr[String | js.Any] = js.undefined): ZAxisDateTimeLabelFormats = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new ZAxisDateTimeLabelFormats {
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
