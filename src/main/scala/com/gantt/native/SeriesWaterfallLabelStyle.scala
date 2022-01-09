/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/gantt]]
  */
package com.gantt.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>series&lt;waterfall&gt;-label-style</code>
  */
class SeriesWaterfallLabelStyle extends com.highcharts.HighchartsGenericObject {

  var fontWeight: js.UndefOr[String] = js.undefined
}

object SeriesWaterfallLabelStyle {
  /**
    */
  def apply(fontWeight: js.UndefOr[String] = js.undefined): SeriesWaterfallLabelStyle = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesWaterfallLabelStyle {
      this.fontWeight = fontWeight
    })
  }
}
