/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/gantt]]
  */
package com.gantt.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>plotOptions-dmi-minusDILine</code>
  */
class PlotOptionsDmiMinusDILine extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Styles for the -DI line.</p>
    * @since 9.1.0
    */
  var styles: js.Any = js.undefined
}

object PlotOptionsDmiMinusDILine {
  /**
    * @param styles <p>Styles for the -DI line.</p>
    */
  def apply(styles: js.UndefOr[js.Any] = js.undefined): PlotOptionsDmiMinusDILine = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsDmiMinusDILine {
      this.styles = styles
    })
  }
}
