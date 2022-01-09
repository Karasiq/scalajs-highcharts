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
  * @note JavaScript name: <code>annotations-measure-typeOptions-label-style</code>
  */
class AnnotationsMeasureTypeOptionsLabelStyle extends com.highcharts.HighchartsGenericObject {

  var color: js.UndefOr[String] = js.undefined

  var fontSize: js.UndefOr[String] = js.undefined
}

object AnnotationsMeasureTypeOptionsLabelStyle {
  /**
    */
  def apply(color: js.UndefOr[String] = js.undefined, fontSize: js.UndefOr[String] = js.undefined): AnnotationsMeasureTypeOptionsLabelStyle = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new AnnotationsMeasureTypeOptionsLabelStyle {
      this.color = color
      this.fontSize = fontSize
    })
  }
}
