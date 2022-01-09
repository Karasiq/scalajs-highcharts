/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highmaps]]
  */
package com.highmaps.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>plotOptions-slowstochastic-smoothedLine</code>
  */
class PlotOptionsSlowstochasticSmoothedLine extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Styles for a smoothed line.</p>
    * @since 6.0.0
    */
  var styles: js.Any = js.undefined
}

object PlotOptionsSlowstochasticSmoothedLine {
  /**
    * @param styles <p>Styles for a smoothed line.</p>
    */
  def apply(styles: js.UndefOr[js.Any] = js.undefined): PlotOptionsSlowstochasticSmoothedLine = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsSlowstochasticSmoothedLine {
      this.styles = styles
    })
  }
}
