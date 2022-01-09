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
  * @note JavaScript name: <code>plotOptions-timeline-dataLabels-style</code>
  */
class PlotOptionsTimelineDataLabelsStyle extends com.highcharts.HighchartsGenericObject {

  var fontSize: js.UndefOr[String] = js.undefined

  var fontWeight: js.UndefOr[String] = js.undefined

  var textOutline: js.UndefOr[String] = js.undefined
}

object PlotOptionsTimelineDataLabelsStyle {
  /**
    */
  def apply(fontSize: js.UndefOr[String] = js.undefined, fontWeight: js.UndefOr[String] = js.undefined, textOutline: js.UndefOr[String] = js.undefined): PlotOptionsTimelineDataLabelsStyle = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsTimelineDataLabelsStyle {
      this.fontSize = fontSize
      this.fontWeight = fontWeight
      this.textOutline = textOutline
    })
  }
}
