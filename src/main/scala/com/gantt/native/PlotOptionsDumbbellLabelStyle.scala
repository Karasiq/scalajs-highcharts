/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/gantt]]
  */
package com.gantt.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>plotOptions-dumbbell-label-style</code>
  */
class PlotOptionsDumbbellLabelStyle extends com.highcharts.HighchartsGenericObject {

  var fontWeight: js.UndefOr[String] = js.undefined
}

object PlotOptionsDumbbellLabelStyle {
  /**
    */
  def apply(fontWeight: js.UndefOr[String] = js.undefined): PlotOptionsDumbbellLabelStyle = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsDumbbellLabelStyle {
      this.fontWeight = fontWeight
    })
  }
}
