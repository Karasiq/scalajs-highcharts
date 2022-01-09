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
  * @note JavaScript name: <code>annotations-measure-controlPointOptions</code>
  */
class AnnotationsMeasureControlPointOptions extends com.highcharts.HighchartsGenericObject {

  var events: js.Any = js.undefined
}

object AnnotationsMeasureControlPointOptions {
  /**
    */
  def apply(events: js.UndefOr[js.Any] = js.undefined): AnnotationsMeasureControlPointOptions = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new AnnotationsMeasureControlPointOptions {
      this.events = events
    })
  }
}
