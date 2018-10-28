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
  * @note JavaScript name: <code>plotOptions-macd-signalLine</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsMacdSignalLine extends com.highcharts.HighchartsGenericObject {

  val zones: js.UndefOr[CleanJsObject[PlotOptionsMacdSignalLineZones]] = js.undefined

  val styles: js.Any = js.undefined
}

object PlotOptionsMacdSignalLine {
  /**
    */
  def apply(zones: js.UndefOr[CleanJsObject[PlotOptionsMacdSignalLineZones]] = js.undefined, styles: js.UndefOr[js.Any] = js.undefined): PlotOptionsMacdSignalLine = {
    val zonesOuter: js.UndefOr[CleanJsObject[PlotOptionsMacdSignalLineZones]] = zones
    val stylesOuter: js.Any = styles
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsMacdSignalLine {
      override val zones: js.UndefOr[CleanJsObject[PlotOptionsMacdSignalLineZones]] = zonesOuter
      override val styles: js.Any = stylesOuter
    })
  }
}
