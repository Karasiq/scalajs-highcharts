/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highmaps]]
  */
package com.highmaps.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>plotOptions-macd-macdLine</code>
  */
class PlotOptionsMacdMacdLine extends com.highcharts.HighchartsGenericObject {

  var styles: js.Any = js.undefined

  var zones: js.UndefOr[CleanJsObject[PlotOptionsMacdMacdLineZones]] = js.undefined
}

object PlotOptionsMacdMacdLine {
  /**
    */
  def apply(styles: js.UndefOr[js.Any] = js.undefined, zones: js.UndefOr[CleanJsObject[PlotOptionsMacdMacdLineZones]] = js.undefined): PlotOptionsMacdMacdLine = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsMacdMacdLine {
      this.styles = styles
      this.zones = zones
    })
  }
}
