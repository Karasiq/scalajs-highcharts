/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highmaps]]
  */
package com.highmaps.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>lang-accessibility-exporting</code>
  */
@js.annotation.ScalaJSDefined
class LangAccessibilityExporting extends com.highcharts.HighchartsGenericObject {

  val chartMenuLabel: js.UndefOr[String] = js.undefined

  val menuButtonLabel: js.UndefOr[String] = js.undefined

  val exportRegionLabel: js.UndefOr[String] = js.undefined
}

object LangAccessibilityExporting {
  /**
    */
  def apply(chartMenuLabel: js.UndefOr[String] = js.undefined, menuButtonLabel: js.UndefOr[String] = js.undefined, exportRegionLabel: js.UndefOr[String] = js.undefined): LangAccessibilityExporting = {
    val chartMenuLabelOuter: js.UndefOr[String] = chartMenuLabel
    val menuButtonLabelOuter: js.UndefOr[String] = menuButtonLabel
    val exportRegionLabelOuter: js.UndefOr[String] = exportRegionLabel
    com.highcharts.HighchartsGenericObject.toCleanObject(new LangAccessibilityExporting {
      override val chartMenuLabel: js.UndefOr[String] = chartMenuLabelOuter
      override val menuButtonLabel: js.UndefOr[String] = menuButtonLabelOuter
      override val exportRegionLabel: js.UndefOr[String] = exportRegionLabelOuter
    })
  }
}
