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
  * @note JavaScript name: <code>exporting-accessibility</code>
  */
class ExportingAccessibility extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Enable accessibility support for the export menu.</p>
    * @since 7.1.0
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
}

object ExportingAccessibility {
  /**
    * @param enabled <p>Enable accessibility support for the export menu.</p>
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined): ExportingAccessibility = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new ExportingAccessibility {
      this.enabled = enabled
    })
  }
}
