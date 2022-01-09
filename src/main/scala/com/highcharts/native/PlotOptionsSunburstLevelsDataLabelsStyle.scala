/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highcharts]]
  */
package com.highcharts.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>plotOptions-sunburst-levels-dataLabels-style</code>
  */
class PlotOptionsSunburstLevelsDataLabelsStyle extends com.highcharts.HighchartsGenericObject {

  var textOverflow: js.UndefOr[String] = js.undefined
}

object PlotOptionsSunburstLevelsDataLabelsStyle {
  /**
    */
  def apply(textOverflow: js.UndefOr[String] = js.undefined): PlotOptionsSunburstLevelsDataLabelsStyle = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsSunburstLevelsDataLabelsStyle {
      this.textOverflow = textOverflow
    })
  }
}
