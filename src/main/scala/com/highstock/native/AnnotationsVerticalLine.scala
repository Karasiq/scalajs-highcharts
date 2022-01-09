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
  * @note JavaScript name: <code>annotations-verticalLine</code>
  */
class AnnotationsVerticalLine extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Additional options for an annotation with the type.</p>
    * @since 6.0.0
    */
  var typeOptions: js.Any = js.undefined

  var labelOptions: js.UndefOr[CleanJsObject[AnnotationsVerticalLineLabelOptions]] = js.undefined

  var shapeOptions: js.UndefOr[CleanJsObject[AnnotationsVerticalLineShapeOptions]] = js.undefined
}

object AnnotationsVerticalLine {
  /**
    * @param typeOptions <p>Additional options for an annotation with the type.</p>
    */
  def apply(typeOptions: js.UndefOr[js.Any] = js.undefined, labelOptions: js.UndefOr[CleanJsObject[AnnotationsVerticalLineLabelOptions]] = js.undefined, shapeOptions: js.UndefOr[CleanJsObject[AnnotationsVerticalLineShapeOptions]] = js.undefined): AnnotationsVerticalLine = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new AnnotationsVerticalLine {
      this.typeOptions = typeOptions
      this.labelOptions = labelOptions
      this.shapeOptions = shapeOptions
    })
  }
}
