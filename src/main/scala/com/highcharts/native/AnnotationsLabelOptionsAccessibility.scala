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
  * @note JavaScript name: <code>annotations-labelOptions-accessibility</code>
  */
class AnnotationsLabelOptionsAccessibility extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Description of an annotation label for screen readers and other assistive
    * technology.</p>
    * @since 8.0.1
    */
  var description: js.UndefOr[String] = js.undefined
}

object AnnotationsLabelOptionsAccessibility {
  /**
    * @param description <p>Description of an annotation label for screen readers and other assistive. technology.</p>
    */
  def apply(description: js.UndefOr[String] = js.undefined): AnnotationsLabelOptionsAccessibility = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new AnnotationsLabelOptionsAccessibility {
      this.description = description
    })
  }
}
