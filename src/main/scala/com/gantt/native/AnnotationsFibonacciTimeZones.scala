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
  * @note JavaScript name: <code>annotations-fibonacciTimeZones</code>
  */
class AnnotationsFibonacciTimeZones extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Additional options for an annotation with the type.</p>
    * @since 6.0.0
    */
  var typeOptions: js.Any = js.undefined

  var controlPointOptions: js.Any = js.undefined

  var labelOptions: js.UndefOr[CleanJsObject[AnnotationsFibonacciTimeZonesLabelOptions]] = js.undefined

  var shapeOptions: js.UndefOr[CleanJsObject[AnnotationsFibonacciTimeZonesShapeOptions]] = js.undefined
}

object AnnotationsFibonacciTimeZones {
  /**
    * @param typeOptions <p>Additional options for an annotation with the type.</p>
    */
  def apply(typeOptions: js.UndefOr[js.Any] = js.undefined, controlPointOptions: js.UndefOr[js.Any] = js.undefined, labelOptions: js.UndefOr[CleanJsObject[AnnotationsFibonacciTimeZonesLabelOptions]] = js.undefined, shapeOptions: js.UndefOr[CleanJsObject[AnnotationsFibonacciTimeZonesShapeOptions]] = js.undefined): AnnotationsFibonacciTimeZones = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new AnnotationsFibonacciTimeZones {
      this.typeOptions = typeOptions
      this.controlPointOptions = controlPointOptions
      this.labelOptions = labelOptions
      this.shapeOptions = shapeOptions
    })
  }
}
