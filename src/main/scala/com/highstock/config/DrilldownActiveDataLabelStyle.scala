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
  * @note JavaScript name: <code>drilldown-activeDataLabelStyle</code>
  */
@js.annotation.ScalaJSDefined
class DrilldownActiveDataLabelStyle extends com.highcharts.HighchartsGenericObject {

  val cursor: js.UndefOr[String] = js.undefined

  val color: js.UndefOr[String] = js.undefined

  val fontWeight: js.UndefOr[String] = js.undefined

  val textDecoration: js.UndefOr[String] = js.undefined
}

object DrilldownActiveDataLabelStyle {
  /**
    */
  def apply(cursor: js.UndefOr[String] = js.undefined, color: js.UndefOr[String] = js.undefined, fontWeight: js.UndefOr[String] = js.undefined, textDecoration: js.UndefOr[String] = js.undefined): DrilldownActiveDataLabelStyle = {
    val cursorOuter: js.UndefOr[String] = cursor
    val colorOuter: js.UndefOr[String] = color
    val fontWeightOuter: js.UndefOr[String] = fontWeight
    val textDecorationOuter: js.UndefOr[String] = textDecoration
    com.highcharts.HighchartsGenericObject.toCleanObject(new DrilldownActiveDataLabelStyle {
      override val cursor: js.UndefOr[String] = cursorOuter
      override val color: js.UndefOr[String] = colorOuter
      override val fontWeight: js.UndefOr[String] = fontWeightOuter
      override val textDecoration: js.UndefOr[String] = textDecorationOuter
    })
  }
}
