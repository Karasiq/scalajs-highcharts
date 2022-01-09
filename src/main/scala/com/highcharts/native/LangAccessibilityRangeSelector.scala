/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highcharts]]
  */
package com.highcharts.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>lang-accessibility-rangeSelector</code>
  */
class LangAccessibilityRangeSelector extends com.highcharts.HighchartsGenericObject {

  var clickButtonAnnouncement: js.UndefOr[String] = js.undefined

  var dropdownLabel: js.UndefOr[String] = js.undefined

  var maxInputLabel: js.UndefOr[String] = js.undefined

  var minInputLabel: js.UndefOr[String] = js.undefined
}

object LangAccessibilityRangeSelector {
  /**
    */
  def apply(clickButtonAnnouncement: js.UndefOr[String] = js.undefined, dropdownLabel: js.UndefOr[String] = js.undefined, maxInputLabel: js.UndefOr[String] = js.undefined, minInputLabel: js.UndefOr[String] = js.undefined): LangAccessibilityRangeSelector = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new LangAccessibilityRangeSelector {
      this.clickButtonAnnouncement = clickButtonAnnouncement
      this.dropdownLabel = dropdownLabel
      this.maxInputLabel = maxInputLabel
      this.minInputLabel = minInputLabel
    })
  }
}
