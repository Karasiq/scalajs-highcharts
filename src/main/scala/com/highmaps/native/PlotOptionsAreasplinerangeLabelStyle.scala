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
  * @note JavaScript name: <code>plotOptions-areasplinerange-label-style</code>
  */
class PlotOptionsAreasplinerangeLabelStyle extends com.highcharts.HighchartsGenericObject {

  var fontWeight: js.UndefOr[String] = js.undefined
}

object PlotOptionsAreasplinerangeLabelStyle {
  /**
    */
  def apply(fontWeight: js.UndefOr[String] = js.undefined): PlotOptionsAreasplinerangeLabelStyle = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsAreasplinerangeLabelStyle {
      this.fontWeight = fontWeight
    })
  }
}
