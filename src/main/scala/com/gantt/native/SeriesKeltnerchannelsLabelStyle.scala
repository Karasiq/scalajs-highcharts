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
  * @note JavaScript name: <code>series&lt;keltnerchannels&gt;-label-style</code>
  */
class SeriesKeltnerchannelsLabelStyle extends com.highcharts.HighchartsGenericObject {

  var fontWeight: js.UndefOr[String] = js.undefined
}

object SeriesKeltnerchannelsLabelStyle {
  /**
    */
  def apply(fontWeight: js.UndefOr[String] = js.undefined): SeriesKeltnerchannelsLabelStyle = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesKeltnerchannelsLabelStyle {
      this.fontWeight = fontWeight
    })
  }
}
