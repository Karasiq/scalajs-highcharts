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
  * @note JavaScript name: <code>annotations-crookedLine-typeOptions-line</code>
  */
class AnnotationsCrookedLineTypeOptionsLine extends com.highcharts.HighchartsGenericObject {

  var fill: js.UndefOr[String] = js.undefined
}

object AnnotationsCrookedLineTypeOptionsLine {
  /**
    */
  def apply(fill: js.UndefOr[String] = js.undefined): AnnotationsCrookedLineTypeOptionsLine = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new AnnotationsCrookedLineTypeOptionsLine {
      this.fill = fill
    })
  }
}
