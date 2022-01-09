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
  * @note JavaScript name: <code>annotations-controlPointOptions</code>
  */
class AnnotationsControlPointOptions extends com.highcharts.HighchartsGenericObject {

  var positioner: js.Any = js.undefined
}

object AnnotationsControlPointOptions {
  /**
    */
  def apply(positioner: js.UndefOr[js.Any] = js.undefined): AnnotationsControlPointOptions = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new AnnotationsControlPointOptions {
      this.positioner = positioner
    })
  }
}
