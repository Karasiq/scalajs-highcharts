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
  * @note JavaScript name: <code>series&lt;dumbbell&gt;-label-style</code>
  */
class SeriesDumbbellLabelStyle extends com.highcharts.HighchartsGenericObject {

  var fontWeight: js.UndefOr[String] = js.undefined
}

object SeriesDumbbellLabelStyle {
  /**
    */
  def apply(fontWeight: js.UndefOr[String] = js.undefined): SeriesDumbbellLabelStyle = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesDumbbellLabelStyle {
      this.fontWeight = fontWeight
    })
  }
}
