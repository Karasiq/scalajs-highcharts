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
  * @note JavaScript name: <code>plotOptions-linearregressionslope-label-style</code>
  */
class PlotOptionsLinearregressionslopeLabelStyle extends com.highcharts.HighchartsGenericObject {

  var fontWeight: js.UndefOr[String] = js.undefined
}

object PlotOptionsLinearregressionslopeLabelStyle {
  /**
    */
  def apply(fontWeight: js.UndefOr[String] = js.undefined): PlotOptionsLinearregressionslopeLabelStyle = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsLinearregressionslopeLabelStyle {
      this.fontWeight = fontWeight
    })
  }
}
