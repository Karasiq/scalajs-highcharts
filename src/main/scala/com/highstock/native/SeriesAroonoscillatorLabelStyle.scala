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
  * @note JavaScript name: <code>series&lt;aroonoscillator&gt;-label-style</code>
  */
class SeriesAroonoscillatorLabelStyle extends com.highcharts.HighchartsGenericObject {

  var fontWeight: js.UndefOr[String] = js.undefined
}

object SeriesAroonoscillatorLabelStyle {
  /**
    */
  def apply(fontWeight: js.UndefOr[String] = js.undefined): SeriesAroonoscillatorLabelStyle = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesAroonoscillatorLabelStyle {
      this.fontWeight = fontWeight
    })
  }
}
