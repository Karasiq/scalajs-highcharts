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
  * @note JavaScript name: <code>lang-accessibility-axis</code>
  */
class LangAccessibilityAxis extends com.highcharts.HighchartsGenericObject {

  var rangeCategories: js.UndefOr[String] = js.undefined

  var rangeFromTo: js.UndefOr[String] = js.undefined

  var timeRangeDays: js.UndefOr[String] = js.undefined

  var timeRangeHours: js.UndefOr[String] = js.undefined

  var timeRangeMinutes: js.UndefOr[String] = js.undefined

  var timeRangeSeconds: js.UndefOr[String] = js.undefined

  var xAxisDescriptionPlural: js.UndefOr[String] = js.undefined

  var xAxisDescriptionSingular: js.UndefOr[String] = js.undefined

  var yAxisDescriptionPlural: js.UndefOr[String] = js.undefined

  var yAxisDescriptionSingular: js.UndefOr[String] = js.undefined
}

object LangAccessibilityAxis {
  /**
    */
  def apply(rangeCategories: js.UndefOr[String] = js.undefined, rangeFromTo: js.UndefOr[String] = js.undefined, timeRangeDays: js.UndefOr[String] = js.undefined, timeRangeHours: js.UndefOr[String] = js.undefined, timeRangeMinutes: js.UndefOr[String] = js.undefined, timeRangeSeconds: js.UndefOr[String] = js.undefined, xAxisDescriptionPlural: js.UndefOr[String] = js.undefined, xAxisDescriptionSingular: js.UndefOr[String] = js.undefined, yAxisDescriptionPlural: js.UndefOr[String] = js.undefined, yAxisDescriptionSingular: js.UndefOr[String] = js.undefined): LangAccessibilityAxis = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new LangAccessibilityAxis {
      this.rangeCategories = rangeCategories
      this.rangeFromTo = rangeFromTo
      this.timeRangeDays = timeRangeDays
      this.timeRangeHours = timeRangeHours
      this.timeRangeMinutes = timeRangeMinutes
      this.timeRangeSeconds = timeRangeSeconds
      this.xAxisDescriptionPlural = xAxisDescriptionPlural
      this.xAxisDescriptionSingular = xAxisDescriptionSingular
      this.yAxisDescriptionPlural = yAxisDescriptionPlural
      this.yAxisDescriptionSingular = yAxisDescriptionSingular
    })
  }
}
