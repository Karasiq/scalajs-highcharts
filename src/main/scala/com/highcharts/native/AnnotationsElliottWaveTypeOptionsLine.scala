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
  * @note JavaScript name: <code>annotations-elliottWave-typeOptions-line</code>
  */
class AnnotationsElliottWaveTypeOptionsLine extends com.highcharts.HighchartsGenericObject {

  var strokeWidth: js.UndefOr[Double] = js.undefined

  var fill: js.UndefOr[String] = js.undefined
}

object AnnotationsElliottWaveTypeOptionsLine {
  /**
    */
  def apply(strokeWidth: js.UndefOr[Double] = js.undefined, fill: js.UndefOr[String] = js.undefined): AnnotationsElliottWaveTypeOptionsLine = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new AnnotationsElliottWaveTypeOptionsLine {
      this.strokeWidth = strokeWidth
      this.fill = fill
    })
  }
}
