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
  * @note JavaScript name: <code>series&lt;trendline&gt;-label-style</code>
  */
class SeriesTrendlineLabelStyle extends com.highcharts.HighchartsGenericObject {

  var fontWeight: js.UndefOr[String] = js.undefined
}

object SeriesTrendlineLabelStyle {
  /**
    */
  def apply(fontWeight: js.UndefOr[String] = js.undefined): SeriesTrendlineLabelStyle = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesTrendlineLabelStyle {
      this.fontWeight = fontWeight
    })
  }
}
