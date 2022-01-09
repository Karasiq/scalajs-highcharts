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
  * @note JavaScript name: <code>plotOptions-aroonoscillator-label-style</code>
  */
class PlotOptionsAroonoscillatorLabelStyle extends com.highcharts.HighchartsGenericObject {

  var fontWeight: js.UndefOr[String] = js.undefined
}

object PlotOptionsAroonoscillatorLabelStyle {
  /**
    */
  def apply(fontWeight: js.UndefOr[String] = js.undefined): PlotOptionsAroonoscillatorLabelStyle = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsAroonoscillatorLabelStyle {
      this.fontWeight = fontWeight
    })
  }
}
