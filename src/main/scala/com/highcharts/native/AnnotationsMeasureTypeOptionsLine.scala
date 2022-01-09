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
  * @note JavaScript name: <code>annotations-measure-typeOptions-line</code>
  */
class AnnotationsMeasureTypeOptionsLine extends com.highcharts.HighchartsGenericObject {

  var fill: js.UndefOr[String] = js.undefined
}

object AnnotationsMeasureTypeOptionsLine {
  /**
    */
  def apply(fill: js.UndefOr[String] = js.undefined): AnnotationsMeasureTypeOptionsLine = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new AnnotationsMeasureTypeOptionsLine {
      this.fill = fill
    })
  }
}
