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
  * @note JavaScript name: <code>plotOptions-klinger-signalLine</code>
  */
class PlotOptionsKlingerSignalLine extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Styles for a signal line.</p>
    * @since 9.1.0
    */
  var styles: js.Any = js.undefined
}

object PlotOptionsKlingerSignalLine {
  /**
    * @param styles <p>Styles for a signal line.</p>
    */
  def apply(styles: js.UndefOr[js.Any] = js.undefined): PlotOptionsKlingerSignalLine = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsKlingerSignalLine {
      this.styles = styles
    })
  }
}
