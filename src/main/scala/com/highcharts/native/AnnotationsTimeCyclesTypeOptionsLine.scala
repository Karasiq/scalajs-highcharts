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
  * @note JavaScript name: <code>annotations-timeCycles-typeOptions-line</code>
  */
class AnnotationsTimeCyclesTypeOptionsLine extends com.highcharts.HighchartsGenericObject {

  var fill: js.UndefOr[String] = js.undefined
}

object AnnotationsTimeCyclesTypeOptionsLine {
  /**
    */
  def apply(fill: js.UndefOr[String] = js.undefined): AnnotationsTimeCyclesTypeOptionsLine = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new AnnotationsTimeCyclesTypeOptionsLine {
      this.fill = fill
    })
  }
}
