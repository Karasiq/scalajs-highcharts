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
  * @note JavaScript name: <code>annotations-fibonacci</code>
  */
class AnnotationsFibonacci extends com.highcharts.HighchartsGenericObject {

  var labelOptions: js.Any = js.undefined

  /**
    * <p>Additional options for an annotation with the type.</p>
    * @since 6.0.0
    */
  var typeOptions: js.Any = js.undefined

  var controlPointOptions: js.Any = js.undefined

  var shapeOptions: js.UndefOr[CleanJsObject[AnnotationsFibonacciShapeOptions]] = js.undefined
}

object AnnotationsFibonacci {
  /**
    * @param typeOptions <p>Additional options for an annotation with the type.</p>
    */
  def apply(labelOptions: js.UndefOr[js.Any] = js.undefined, typeOptions: js.UndefOr[js.Any] = js.undefined, controlPointOptions: js.UndefOr[js.Any] = js.undefined, shapeOptions: js.UndefOr[CleanJsObject[AnnotationsFibonacciShapeOptions]] = js.undefined): AnnotationsFibonacci = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new AnnotationsFibonacci {
      this.labelOptions = labelOptions
      this.typeOptions = typeOptions
      this.controlPointOptions = controlPointOptions
      this.shapeOptions = shapeOptions
    })
  }
}
