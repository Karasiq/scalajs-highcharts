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
  * @note JavaScript name: <code>plotOptions-linearregressionangle-label-style</code>
  */
class PlotOptionsLinearregressionangleLabelStyle extends com.highcharts.HighchartsGenericObject {

  var fontWeight: js.UndefOr[String] = js.undefined
}

object PlotOptionsLinearregressionangleLabelStyle {
  /**
    */
  def apply(fontWeight: js.UndefOr[String] = js.undefined): PlotOptionsLinearregressionangleLabelStyle = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsLinearregressionangleLabelStyle {
      this.fontWeight = fontWeight
    })
  }
}