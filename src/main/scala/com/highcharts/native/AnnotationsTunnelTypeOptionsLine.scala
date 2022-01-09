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
  * @note JavaScript name: <code>annotations-tunnel-typeOptions-line</code>
  */
class AnnotationsTunnelTypeOptionsLine extends com.highcharts.HighchartsGenericObject {

  var strokeWidth: js.UndefOr[Double] = js.undefined

  var fill: js.UndefOr[String] = js.undefined
}

object AnnotationsTunnelTypeOptionsLine {
  /**
    */
  def apply(strokeWidth: js.UndefOr[Double] = js.undefined, fill: js.UndefOr[String] = js.undefined): AnnotationsTunnelTypeOptionsLine = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new AnnotationsTunnelTypeOptionsLine {
      this.strokeWidth = strokeWidth
      this.fill = fill
    })
  }
}
