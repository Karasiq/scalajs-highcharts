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
  * @note JavaScript name: <code>annotations-tunnel-typeOptions-background</code>
  */
class AnnotationsTunnelTypeOptionsBackground extends com.highcharts.HighchartsGenericObject {

  var fill: js.UndefOr[String] = js.undefined

  var strokeWidth: js.UndefOr[Double] = js.undefined
}

object AnnotationsTunnelTypeOptionsBackground {
  /**
    */
  def apply(fill: js.UndefOr[String] = js.undefined, strokeWidth: js.UndefOr[Double] = js.undefined): AnnotationsTunnelTypeOptionsBackground = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new AnnotationsTunnelTypeOptionsBackground {
      this.fill = fill
      this.strokeWidth = strokeWidth
    })
  }
}
