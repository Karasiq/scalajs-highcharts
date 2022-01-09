/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highmaps]]
  */
package com.highmaps.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>annotations-fibonacciTimeZones-typeOptions-line</code>
  */
class AnnotationsFibonacciTimeZonesTypeOptionsLine extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The color of the lines.</p>
    * @since 9.3.0
    */
  var stroke: js.UndefOr[String] = js.undefined

  /**
    * <p>The width of the lines.</p>
    * @since 9.3.0
    */
  var strokeWidth: js.UndefOr[Double] = js.undefined

  var fill: js.UndefOr[String] = js.undefined
}

object AnnotationsFibonacciTimeZonesTypeOptionsLine {
  /**
    * @param stroke <p>The color of the lines.</p>
    * @param strokeWidth <p>The width of the lines.</p>
    */
  def apply(stroke: js.UndefOr[String] = js.undefined, strokeWidth: js.UndefOr[Double] = js.undefined, fill: js.UndefOr[String] = js.undefined): AnnotationsFibonacciTimeZonesTypeOptionsLine = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new AnnotationsFibonacciTimeZonesTypeOptionsLine {
      this.stroke = stroke
      this.strokeWidth = strokeWidth
      this.fill = fill
    })
  }
}
