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
  * @note JavaScript name: <code>plotOptions-williamsr-label-style</code>
  */
class PlotOptionsWilliamsrLabelStyle extends com.highcharts.HighchartsGenericObject {

  var fontWeight: js.UndefOr[String] = js.undefined
}

object PlotOptionsWilliamsrLabelStyle {
  /**
    */
  def apply(fontWeight: js.UndefOr[String] = js.undefined): PlotOptionsWilliamsrLabelStyle = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsWilliamsrLabelStyle {
      this.fontWeight = fontWeight
    })
  }
}
