/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highcharts]]
  */
package com.highcharts.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>drilldown-activeAxisLabelStyle</code>
  */
@js.annotation.ScalaJSDefined
class DrilldownActiveAxisLabelStyle extends com.highcharts.HighchartsGenericObject {

  val cursor: js.UndefOr[String] = js.undefined

  val color: js.UndefOr[String] = js.undefined

  val fontWeight: js.UndefOr[String] = js.undefined

  val textDecoration: js.UndefOr[String] = js.undefined
}

object DrilldownActiveAxisLabelStyle {
  /**
    */
  def apply(cursor: js.UndefOr[String] = js.undefined, color: js.UndefOr[String] = js.undefined, fontWeight: js.UndefOr[String] = js.undefined, textDecoration: js.UndefOr[String] = js.undefined): DrilldownActiveAxisLabelStyle = {
    val cursorOuter: js.UndefOr[String] = cursor
    val colorOuter: js.UndefOr[String] = color
    val fontWeightOuter: js.UndefOr[String] = fontWeight
    val textDecorationOuter: js.UndefOr[String] = textDecoration
    com.highcharts.HighchartsGenericObject.toCleanObject(new DrilldownActiveAxisLabelStyle {
      override val cursor: js.UndefOr[String] = cursorOuter
      override val color: js.UndefOr[String] = colorOuter
      override val fontWeight: js.UndefOr[String] = fontWeightOuter
      override val textDecoration: js.UndefOr[String] = textDecorationOuter
    })
  }
}
