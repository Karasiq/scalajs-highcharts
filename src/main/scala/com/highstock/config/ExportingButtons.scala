/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highstock]]
  */
package com.highstock.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>exporting-buttons</code>
  */
@js.annotation.ScalaJSDefined
class ExportingButtons extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Options for the export button.</p>
    * <p>In styled mode, export button styles can be applied with the
    * <code>.highcharts-contextbutton</code> class.</p>
    */
  val contextButton: js.Any = js.undefined
}

object ExportingButtons {
  /**
    * @param contextButton <p>Options for the export button.</p>. <p>In styled mode, export button styles can be applied with the. <code>.highcharts-contextbutton</code> class.</p>
    */
  def apply(contextButton: js.UndefOr[js.Any] = js.undefined): ExportingButtons = {
    val contextButtonOuter: js.Any = contextButton
    com.highcharts.HighchartsGenericObject.toCleanObject(new ExportingButtons {
      override val contextButton: js.Any = contextButtonOuter
    })
  }
}
