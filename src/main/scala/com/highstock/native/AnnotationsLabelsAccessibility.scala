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
  * @note JavaScript name: <code>annotations-labels-accessibility</code>
  */
class AnnotationsLabelsAccessibility extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Description of an annotation label for screen readers and other assistive
    * technology.</p>
    * @since 8.0.1
    */
  var description: js.UndefOr[String] = js.undefined
}

object AnnotationsLabelsAccessibility {
  /**
    * @param description <p>Description of an annotation label for screen readers and other assistive. technology.</p>
    */
  def apply(description: js.UndefOr[String] = js.undefined): AnnotationsLabelsAccessibility = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new AnnotationsLabelsAccessibility {
      this.description = description
    })
  }
}