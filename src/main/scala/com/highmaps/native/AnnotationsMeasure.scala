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
  * @note JavaScript name: <code>annotations-measure</code>
  */
class AnnotationsMeasure extends com.highcharts.HighchartsGenericObject {

  var controlPointOptions: js.Any = js.undefined

  /**
    * <p>Additional options for an annotation with the type.</p>
    * @since 6.0.0
    */
  var typeOptions: js.Any = js.undefined
}

object AnnotationsMeasure {
  /**
    * @param typeOptions <p>Additional options for an annotation with the type.</p>
    */
  def apply(controlPointOptions: js.UndefOr[js.Any] = js.undefined, typeOptions: js.UndefOr[js.Any] = js.undefined): AnnotationsMeasure = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new AnnotationsMeasure {
      this.controlPointOptions = controlPointOptions
      this.typeOptions = typeOptions
    })
  }
}
