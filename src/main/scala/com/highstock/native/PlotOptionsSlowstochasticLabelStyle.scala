/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highstock]]
  */
package com.highstock.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>plotOptions-slowstochastic-label-style</code>
  */
class PlotOptionsSlowstochasticLabelStyle extends com.highcharts.HighchartsGenericObject {

  var fontWeight: js.UndefOr[String] = js.undefined
}

object PlotOptionsSlowstochasticLabelStyle {
  /**
    */
  def apply(fontWeight: js.UndefOr[String] = js.undefined): PlotOptionsSlowstochasticLabelStyle = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsSlowstochasticLabelStyle {
      this.fontWeight = fontWeight
    })
  }
}
