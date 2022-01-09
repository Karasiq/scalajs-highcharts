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
  * @note JavaScript name: <code>series&lt;linearregressionintercept&gt;-label-style</code>
  */
class SeriesLinearregressioninterceptLabelStyle extends com.highcharts.HighchartsGenericObject {

  var fontWeight: js.UndefOr[String] = js.undefined
}

object SeriesLinearregressioninterceptLabelStyle {
  /**
    */
  def apply(fontWeight: js.UndefOr[String] = js.undefined): SeriesLinearregressioninterceptLabelStyle = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesLinearregressioninterceptLabelStyle {
      this.fontWeight = fontWeight
    })
  }
}
