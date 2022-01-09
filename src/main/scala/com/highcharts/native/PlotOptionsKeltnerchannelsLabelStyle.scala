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
  * @note JavaScript name: <code>plotOptions-keltnerchannels-label-style</code>
  */
class PlotOptionsKeltnerchannelsLabelStyle extends com.highcharts.HighchartsGenericObject {

  var fontWeight: js.UndefOr[String] = js.undefined
}

object PlotOptionsKeltnerchannelsLabelStyle {
  /**
    */
  def apply(fontWeight: js.UndefOr[String] = js.undefined): PlotOptionsKeltnerchannelsLabelStyle = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsKeltnerchannelsLabelStyle {
      this.fontWeight = fontWeight
    })
  }
}
