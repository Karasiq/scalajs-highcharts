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
  * @note JavaScript name: <code>annotations-verticalLine-typeOptions-line</code>
  */
class AnnotationsVerticalLineTypeOptionsLine extends com.highcharts.HighchartsGenericObject {

  var fill: js.UndefOr[String] = js.undefined
}

object AnnotationsVerticalLineTypeOptionsLine {
  /**
    */
  def apply(fill: js.UndefOr[String] = js.undefined): AnnotationsVerticalLineTypeOptionsLine = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new AnnotationsVerticalLineTypeOptionsLine {
      this.fill = fill
    })
  }
}
