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
  * @note JavaScript name: <code>annotations-fibonacciTimeZones-typeOptions-points</code>
  */
class AnnotationsFibonacciTimeZonesTypeOptionsPoints extends com.highcharts.HighchartsGenericObject {

  var controlPoint: js.UndefOr[Double] = js.undefined

  /**
    * <p>The x position of the point.</p>
    * @since 9.3.0
    */
  var x: js.UndefOr[Double] = js.undefined
}

object AnnotationsFibonacciTimeZonesTypeOptionsPoints {
  /**
    * @param x <p>The x position of the point.</p>
    */
  def apply(controlPoint: js.UndefOr[Double] = js.undefined, x: js.UndefOr[Double] = js.undefined): AnnotationsFibonacciTimeZonesTypeOptionsPoints = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new AnnotationsFibonacciTimeZonesTypeOptionsPoints {
      this.controlPoint = controlPoint
      this.x = x
    })
  }
}
