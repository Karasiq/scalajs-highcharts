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
  * @note JavaScript name: <code>annotations-fibonacci-labelOptions-accessibility</code>
  */
class AnnotationsFibonacciLabelOptionsAccessibility extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Description of an annotation label for screen readers and other assistive
    * technology.</p>
    * @since 8.0.1
    */
  var description: js.UndefOr[String] = js.undefined
}

object AnnotationsFibonacciLabelOptionsAccessibility {
  /**
    * @param description <p>Description of an annotation label for screen readers and other assistive. technology.</p>
    */
  def apply(description: js.UndefOr[String] = js.undefined): AnnotationsFibonacciLabelOptionsAccessibility = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new AnnotationsFibonacciLabelOptionsAccessibility {
      this.description = description
    })
  }
}
