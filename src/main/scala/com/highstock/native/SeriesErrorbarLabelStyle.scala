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
  * @note JavaScript name: <code>series&lt;errorbar&gt;-label-style</code>
  */
class SeriesErrorbarLabelStyle extends com.highcharts.HighchartsGenericObject {

  var fontWeight: js.UndefOr[String] = js.undefined
}

object SeriesErrorbarLabelStyle {
  /**
    */
  def apply(fontWeight: js.UndefOr[String] = js.undefined): SeriesErrorbarLabelStyle = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesErrorbarLabelStyle {
      this.fontWeight = fontWeight
    })
  }
}
