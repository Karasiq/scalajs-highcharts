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
  * @note JavaScript name: <code>plotOptions-linearregressionintercept-label-style</code>
  */
class PlotOptionsLinearregressioninterceptLabelStyle extends com.highcharts.HighchartsGenericObject {

  var fontWeight: js.UndefOr[String] = js.undefined
}

object PlotOptionsLinearregressioninterceptLabelStyle {
  /**
    */
  def apply(fontWeight: js.UndefOr[String] = js.undefined): PlotOptionsLinearregressioninterceptLabelStyle = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsLinearregressioninterceptLabelStyle {
      this.fontWeight = fontWeight
    })
  }
}
