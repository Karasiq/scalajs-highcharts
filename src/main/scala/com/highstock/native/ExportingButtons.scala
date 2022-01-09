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
  * @note JavaScript name: <code>exporting-buttons</code>
  */
class ExportingButtons extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Options for the export button.</p>
    * <p>In styled mode, export button styles can be applied with the
    * <code>.highcharts-contextbutton</code> class.</p>
    */
  var contextButton: js.UndefOr[CleanJsObject[ExportingButtonsContextButton]] = js.undefined
}

object ExportingButtons {
  /**
    * @param contextButton <p>Options for the export button.</p>. <p>In styled mode, export button styles can be applied with the. <code>.highcharts-contextbutton</code> class.</p>
    */
  def apply(contextButton: js.UndefOr[CleanJsObject[ExportingButtonsContextButton]] = js.undefined): ExportingButtons = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new ExportingButtons {
      this.contextButton = contextButton
    })
  }
}
