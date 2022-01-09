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
  * @note JavaScript name: <code>annotations-fibonacci-typeOptions-line</code>
  */
class AnnotationsFibonacciTypeOptionsLine extends com.highcharts.HighchartsGenericObject {

  var fill: js.UndefOr[String] = js.undefined
}

object AnnotationsFibonacciTypeOptionsLine {
  /**
    */
  def apply(fill: js.UndefOr[String] = js.undefined): AnnotationsFibonacciTypeOptionsLine = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new AnnotationsFibonacciTypeOptionsLine {
      this.fill = fill
    })
  }
}
