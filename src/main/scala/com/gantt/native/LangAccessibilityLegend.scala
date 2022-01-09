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
  * @note JavaScript name: <code>lang-accessibility-legend</code>
  */
class LangAccessibilityLegend extends com.highcharts.HighchartsGenericObject {

  var legendItem: js.UndefOr[String] = js.undefined

  var legendLabel: js.UndefOr[String] = js.undefined

  var legendLabelNoTitle: js.UndefOr[String] = js.undefined
}

object LangAccessibilityLegend {
  /**
    */
  def apply(legendItem: js.UndefOr[String] = js.undefined, legendLabel: js.UndefOr[String] = js.undefined, legendLabelNoTitle: js.UndefOr[String] = js.undefined): LangAccessibilityLegend = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new LangAccessibilityLegend {
      this.legendItem = legendItem
      this.legendLabel = legendLabel
      this.legendLabelNoTitle = legendLabelNoTitle
    })
  }
}
