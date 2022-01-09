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
  * @note JavaScript name: <code>series&lt;stochastic&gt;-smoothedLine</code>
  */
class SeriesStochasticSmoothedLine extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Styles for a smoothed line.</p>
    * @since 6.0.0
    */
  var styles: js.Any = js.undefined
}

object SeriesStochasticSmoothedLine {
  /**
    * @param styles <p>Styles for a smoothed line.</p>
    */
  def apply(styles: js.UndefOr[js.Any] = js.undefined): SeriesStochasticSmoothedLine = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesStochasticSmoothedLine {
      this.styles = styles
    })
  }
}
