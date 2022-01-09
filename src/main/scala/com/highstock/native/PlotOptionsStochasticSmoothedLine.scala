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
  * @note JavaScript name: <code>plotOptions-stochastic-smoothedLine</code>
  */
class PlotOptionsStochasticSmoothedLine extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Styles for a smoothed line.</p>
    * @since 6.0.0
    */
  var styles: js.Any = js.undefined
}

object PlotOptionsStochasticSmoothedLine {
  /**
    * @param styles <p>Styles for a smoothed line.</p>
    */
  def apply(styles: js.UndefOr[js.Any] = js.undefined): PlotOptionsStochasticSmoothedLine = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsStochasticSmoothedLine {
      this.styles = styles
    })
  }
}
