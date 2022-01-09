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
  * @note JavaScript name: <code>series&lt;chaikin&gt;-label-style</code>
  */
class SeriesChaikinLabelStyle extends com.highcharts.HighchartsGenericObject {

  var fontWeight: js.UndefOr[String] = js.undefined
}

object SeriesChaikinLabelStyle {
  /**
    */
  def apply(fontWeight: js.UndefOr[String] = js.undefined): SeriesChaikinLabelStyle = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesChaikinLabelStyle {
      this.fontWeight = fontWeight
    })
  }
}
