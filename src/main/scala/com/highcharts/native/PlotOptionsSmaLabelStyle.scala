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
  * @note JavaScript name: <code>plotOptions-sma-label-style</code>
  */
class PlotOptionsSmaLabelStyle extends com.highcharts.HighchartsGenericObject {

  var fontWeight: js.UndefOr[String] = js.undefined
}

object PlotOptionsSmaLabelStyle {
  /**
    */
  def apply(fontWeight: js.UndefOr[String] = js.undefined): PlotOptionsSmaLabelStyle = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsSmaLabelStyle {
      this.fontWeight = fontWeight
    })
  }
}
