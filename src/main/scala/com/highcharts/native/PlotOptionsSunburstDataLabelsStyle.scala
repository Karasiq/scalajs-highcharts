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
  * @note JavaScript name: <code>plotOptions-sunburst-dataLabels-style</code>
  */
class PlotOptionsSunburstDataLabelsStyle extends com.highcharts.HighchartsGenericObject {

  var textOverflow: js.UndefOr[String] = js.undefined
}

object PlotOptionsSunburstDataLabelsStyle {
  /**
    */
  def apply(textOverflow: js.UndefOr[String] = js.undefined): PlotOptionsSunburstDataLabelsStyle = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsSunburstDataLabelsStyle {
      this.textOverflow = textOverflow
    })
  }
}
