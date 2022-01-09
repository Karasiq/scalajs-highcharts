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
  * @note JavaScript name: <code>lang-accessibility-exporting</code>
  */
class LangAccessibilityExporting extends com.highcharts.HighchartsGenericObject {

  var chartMenuLabel: js.UndefOr[String] = js.undefined

  var menuButtonLabel: js.UndefOr[String] = js.undefined
}

object LangAccessibilityExporting {
  /**
    */
  def apply(chartMenuLabel: js.UndefOr[String] = js.undefined, menuButtonLabel: js.UndefOr[String] = js.undefined): LangAccessibilityExporting = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new LangAccessibilityExporting {
      this.chartMenuLabel = chartMenuLabel
      this.menuButtonLabel = menuButtonLabel
    })
  }
}
