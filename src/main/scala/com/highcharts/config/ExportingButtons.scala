/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highcharts]]
  */
package com.highcharts.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>exporting-buttons</code>
  */
@js.annotation.ScalaJSDefined
class ExportingButtons extends js.Object {

  /**
    * Options for the export button.
    */
  val contextButton: js.UndefOr[CleanJsObject[ExportingButtonsContextButton]] = js.undefined
}

object ExportingButtons {
  /**
    * @param contextButton Options for the export button.
    */
  def apply(contextButton: js.UndefOr[CleanJsObject[ExportingButtonsContextButton]] = js.undefined): ExportingButtons = {
    val contextButtonOuter: js.UndefOr[CleanJsObject[ExportingButtonsContextButton]] = contextButton
    new ExportingButtons {
      override val contextButton: js.UndefOr[CleanJsObject[ExportingButtonsContextButton]] = contextButtonOuter
    }
  }
}
