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
  * @note JavaScript name: <code>series&lt;heikinashi&gt;-label-style</code>
  */
class SeriesHeikinashiLabelStyle extends com.highcharts.HighchartsGenericObject {

  var fontWeight: js.UndefOr[String] = js.undefined
}

object SeriesHeikinashiLabelStyle {
  /**
    */
  def apply(fontWeight: js.UndefOr[String] = js.undefined): SeriesHeikinashiLabelStyle = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesHeikinashiLabelStyle {
      this.fontWeight = fontWeight
    })
  }
}