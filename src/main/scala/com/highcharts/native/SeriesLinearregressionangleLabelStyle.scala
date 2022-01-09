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
  * @note JavaScript name: <code>series&lt;linearregressionangle&gt;-label-style</code>
  */
class SeriesLinearregressionangleLabelStyle extends com.highcharts.HighchartsGenericObject {

  var fontWeight: js.UndefOr[String] = js.undefined
}

object SeriesLinearregressionangleLabelStyle {
  /**
    */
  def apply(fontWeight: js.UndefOr[String] = js.undefined): SeriesLinearregressionangleLabelStyle = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesLinearregressionangleLabelStyle {
      this.fontWeight = fontWeight
    })
  }
}
