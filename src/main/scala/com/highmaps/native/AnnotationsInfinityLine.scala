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
  * @note JavaScript name: <code>annotations-infinityLine</code>
  */
class AnnotationsInfinityLine extends com.highcharts.HighchartsGenericObject {

  var controlPointOptions: js.Any = js.undefined

  var labelOptions: js.UndefOr[CleanJsObject[AnnotationsInfinityLineLabelOptions]] = js.undefined

  var shapeOptions: js.UndefOr[CleanJsObject[AnnotationsInfinityLineShapeOptions]] = js.undefined

  /**
    * <p>Additional options for an annotation with the type.</p>
    * @since 6.0.0
    */
  var typeOptions: js.Any = js.undefined
}

object AnnotationsInfinityLine {
  /**
    * @param typeOptions <p>Additional options for an annotation with the type.</p>
    */
  def apply(controlPointOptions: js.UndefOr[js.Any] = js.undefined, labelOptions: js.UndefOr[CleanJsObject[AnnotationsInfinityLineLabelOptions]] = js.undefined, shapeOptions: js.UndefOr[CleanJsObject[AnnotationsInfinityLineShapeOptions]] = js.undefined, typeOptions: js.UndefOr[js.Any] = js.undefined): AnnotationsInfinityLine = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new AnnotationsInfinityLine {
      this.controlPointOptions = controlPointOptions
      this.labelOptions = labelOptions
      this.shapeOptions = shapeOptions
      this.typeOptions = typeOptions
    })
  }
}
