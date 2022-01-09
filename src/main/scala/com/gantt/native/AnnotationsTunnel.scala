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
  * @note JavaScript name: <code>annotations-tunnel</code>
  */
class AnnotationsTunnel extends com.highcharts.HighchartsGenericObject {

  var controlPointOptions: js.Any = js.undefined

  /**
    * <p>Additional options for an annotation with the type.</p>
    * @since 6.0.0
    */
  var typeOptions: js.Any = js.undefined

  var labelOptions: js.UndefOr[CleanJsObject[AnnotationsTunnelLabelOptions]] = js.undefined

  var shapeOptions: js.UndefOr[CleanJsObject[AnnotationsTunnelShapeOptions]] = js.undefined
}

object AnnotationsTunnel {
  /**
    * @param typeOptions <p>Additional options for an annotation with the type.</p>
    */
  def apply(controlPointOptions: js.UndefOr[js.Any] = js.undefined, typeOptions: js.UndefOr[js.Any] = js.undefined, labelOptions: js.UndefOr[CleanJsObject[AnnotationsTunnelLabelOptions]] = js.undefined, shapeOptions: js.UndefOr[CleanJsObject[AnnotationsTunnelShapeOptions]] = js.undefined): AnnotationsTunnel = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new AnnotationsTunnel {
      this.controlPointOptions = controlPointOptions
      this.typeOptions = typeOptions
      this.labelOptions = labelOptions
      this.shapeOptions = shapeOptions
    })
  }
}
