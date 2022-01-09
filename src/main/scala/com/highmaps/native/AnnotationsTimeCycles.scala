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
  * @note JavaScript name: <code>annotations-timeCycles</code>
  */
class AnnotationsTimeCycles extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Additional options for an annotation with the type.</p>
    * @since 6.0.0
    */
  var typeOptions: js.Any = js.undefined

  var controlPointOptions: js.Any = js.undefined

  var shapeOptions: js.UndefOr[CleanJsObject[AnnotationsTimeCyclesShapeOptions]] = js.undefined
}

object AnnotationsTimeCycles {
  /**
    * @param typeOptions <p>Additional options for an annotation with the type.</p>
    */
  def apply(typeOptions: js.UndefOr[js.Any] = js.undefined, controlPointOptions: js.UndefOr[js.Any] = js.undefined, shapeOptions: js.UndefOr[CleanJsObject[AnnotationsTimeCyclesShapeOptions]] = js.undefined): AnnotationsTimeCycles = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new AnnotationsTimeCycles {
      this.typeOptions = typeOptions
      this.controlPointOptions = controlPointOptions
      this.shapeOptions = shapeOptions
    })
  }
}
