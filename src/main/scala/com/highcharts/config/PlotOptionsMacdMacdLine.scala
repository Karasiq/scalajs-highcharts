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
  * @note JavaScript name: <code>plotOptions-macd-macdLine</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsMacdMacdLine extends com.highcharts.HighchartsGenericObject {

  val zones: js.UndefOr[CleanJsObject[PlotOptionsMacdMacdLineZones]] = js.undefined

  val styles: js.Any = js.undefined
}

object PlotOptionsMacdMacdLine {
  /**
    */
  def apply(zones: js.UndefOr[CleanJsObject[PlotOptionsMacdMacdLineZones]] = js.undefined, styles: js.UndefOr[js.Any] = js.undefined): PlotOptionsMacdMacdLine = {
    val zonesOuter: js.UndefOr[CleanJsObject[PlotOptionsMacdMacdLineZones]] = zones
    val stylesOuter: js.Any = styles
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsMacdMacdLine {
      override val zones: js.UndefOr[CleanJsObject[PlotOptionsMacdMacdLineZones]] = zonesOuter
      override val styles: js.Any = stylesOuter
    })
  }
}
