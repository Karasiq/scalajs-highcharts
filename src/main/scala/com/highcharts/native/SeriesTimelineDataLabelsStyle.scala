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
  * @note JavaScript name: <code>series&lt;timeline&gt;-dataLabels-style</code>
  */
class SeriesTimelineDataLabelsStyle extends com.highcharts.HighchartsGenericObject {

  var fontSize: js.UndefOr[String] = js.undefined

  var fontWeight: js.UndefOr[String] = js.undefined

  var textOutline: js.UndefOr[String] = js.undefined
}

object SeriesTimelineDataLabelsStyle {
  /**
    */
  def apply(fontSize: js.UndefOr[String] = js.undefined, fontWeight: js.UndefOr[String] = js.undefined, textOutline: js.UndefOr[String] = js.undefined): SeriesTimelineDataLabelsStyle = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesTimelineDataLabelsStyle {
      this.fontSize = fontSize
      this.fontWeight = fontWeight
      this.textOutline = textOutline
    })
  }
}
