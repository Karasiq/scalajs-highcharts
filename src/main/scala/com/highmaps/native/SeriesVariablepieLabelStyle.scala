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
  * @note JavaScript name: <code>series&lt;variablepie&gt;-label-style</code>
  */
class SeriesVariablepieLabelStyle extends com.highcharts.HighchartsGenericObject {

  var fontWeight: js.UndefOr[String] = js.undefined
}

object SeriesVariablepieLabelStyle {
  /**
    */
  def apply(fontWeight: js.UndefOr[String] = js.undefined): SeriesVariablepieLabelStyle = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesVariablepieLabelStyle {
      this.fontWeight = fontWeight
    })
  }
}
