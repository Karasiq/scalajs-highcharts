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
  * @note JavaScript name: <code>plotOptions-scatter3d-label-style</code>
  */
class PlotOptionsScatter3dLabelStyle extends com.highcharts.HighchartsGenericObject {

  var fontWeight: js.UndefOr[String] = js.undefined
}

object PlotOptionsScatter3dLabelStyle {
  /**
    */
  def apply(fontWeight: js.UndefOr[String] = js.undefined): PlotOptionsScatter3dLabelStyle = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsScatter3dLabelStyle {
      this.fontWeight = fontWeight
    })
  }
}
