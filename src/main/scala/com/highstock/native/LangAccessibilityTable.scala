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
  * @note JavaScript name: <code>lang-accessibility-table</code>
  */
class LangAccessibilityTable extends com.highcharts.HighchartsGenericObject {

  var tableSummary: js.UndefOr[String] = js.undefined

  var viewAsDataTableButtonText: js.UndefOr[String] = js.undefined
}

object LangAccessibilityTable {
  /**
    */
  def apply(tableSummary: js.UndefOr[String] = js.undefined, viewAsDataTableButtonText: js.UndefOr[String] = js.undefined): LangAccessibilityTable = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new LangAccessibilityTable {
      this.tableSummary = tableSummary
      this.viewAsDataTableButtonText = viewAsDataTableButtonText
    })
  }
}
