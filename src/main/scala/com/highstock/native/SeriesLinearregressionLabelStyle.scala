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
  * @note JavaScript name: <code>series&lt;linearregression&gt;-label-style</code>
  */
class SeriesLinearregressionLabelStyle extends com.highcharts.HighchartsGenericObject {

  var fontWeight: js.UndefOr[String] = js.undefined
}

object SeriesLinearregressionLabelStyle {
  /**
    */
  def apply(fontWeight: js.UndefOr[String] = js.undefined): SeriesLinearregressionLabelStyle = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesLinearregressionLabelStyle {
      this.fontWeight = fontWeight
    })
  }
}
