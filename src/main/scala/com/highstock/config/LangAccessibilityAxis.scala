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
  * @note JavaScript name: <code>lang-accessibility-axis</code>
  */
@js.annotation.ScalaJSDefined
class LangAccessibilityAxis extends com.highcharts.HighchartsGenericObject {

  val xAxisDescriptionSingular: js.UndefOr[String] = js.undefined

  val xAxisDescriptionPlural: js.UndefOr[String] = js.undefined

  val yAxisDescriptionSingular: js.UndefOr[String] = js.undefined

  val yAxisDescriptionPlural: js.UndefOr[String] = js.undefined
}

object LangAccessibilityAxis {
  /**
    */
  def apply(xAxisDescriptionSingular: js.UndefOr[String] = js.undefined, xAxisDescriptionPlural: js.UndefOr[String] = js.undefined, yAxisDescriptionSingular: js.UndefOr[String] = js.undefined, yAxisDescriptionPlural: js.UndefOr[String] = js.undefined): LangAccessibilityAxis = {
    val xAxisDescriptionSingularOuter: js.UndefOr[String] = xAxisDescriptionSingular
    val xAxisDescriptionPluralOuter: js.UndefOr[String] = xAxisDescriptionPlural
    val yAxisDescriptionSingularOuter: js.UndefOr[String] = yAxisDescriptionSingular
    val yAxisDescriptionPluralOuter: js.UndefOr[String] = yAxisDescriptionPlural
    com.highcharts.HighchartsGenericObject.toCleanObject(new LangAccessibilityAxis {
      override val xAxisDescriptionSingular: js.UndefOr[String] = xAxisDescriptionSingularOuter
      override val xAxisDescriptionPlural: js.UndefOr[String] = xAxisDescriptionPluralOuter
      override val yAxisDescriptionSingular: js.UndefOr[String] = yAxisDescriptionSingularOuter
      override val yAxisDescriptionPlural: js.UndefOr[String] = yAxisDescriptionPluralOuter
    })
  }
}
