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
  * @note JavaScript name: <code>series&lt;vbp&gt;-dataLabels-style</code>
  */
class SeriesVbpDataLabelsStyle extends com.highcharts.HighchartsGenericObject {

  var fontSize: js.UndefOr[String] = js.undefined
}

object SeriesVbpDataLabelsStyle {
  /**
    */
  def apply(fontSize: js.UndefOr[String] = js.undefined): SeriesVbpDataLabelsStyle = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesVbpDataLabelsStyle {
      this.fontSize = fontSize
    })
  }
}
