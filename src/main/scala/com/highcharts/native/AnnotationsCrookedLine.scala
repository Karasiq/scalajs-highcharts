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
  * @note JavaScript name: <code>annotations-crookedLine</code>
  */
class AnnotationsCrookedLine extends com.highcharts.HighchartsGenericObject {

  var controlPointOptions: js.Any = js.undefined

  var labelOptions: js.UndefOr[CleanJsObject[AnnotationsCrookedLineLabelOptions]] = js.undefined

  var shapeOptions: js.UndefOr[CleanJsObject[AnnotationsCrookedLineShapeOptions]] = js.undefined

  /**
    * <p>Additional options for an annotation with the type.</p>
    * @since 6.0.0
    */
  var typeOptions: js.Any = js.undefined
}

object AnnotationsCrookedLine {
  /**
    * @param typeOptions <p>Additional options for an annotation with the type.</p>
    */
  def apply(controlPointOptions: js.UndefOr[js.Any] = js.undefined, labelOptions: js.UndefOr[CleanJsObject[AnnotationsCrookedLineLabelOptions]] = js.undefined, shapeOptions: js.UndefOr[CleanJsObject[AnnotationsCrookedLineShapeOptions]] = js.undefined, typeOptions: js.UndefOr[js.Any] = js.undefined): AnnotationsCrookedLine = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new AnnotationsCrookedLine {
      this.controlPointOptions = controlPointOptions
      this.labelOptions = labelOptions
      this.shapeOptions = shapeOptions
      this.typeOptions = typeOptions
    })
  }
}
