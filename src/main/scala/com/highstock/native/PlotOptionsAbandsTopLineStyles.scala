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
  * @note JavaScript name: <code>plotOptions-abands-topLine-styles</code>
  */
class PlotOptionsAbandsTopLineStyles extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Pixel width of the line.</p>
    * @since 7.0.0
    */
  var lineWidth: js.UndefOr[Double] = js.undefined
}

object PlotOptionsAbandsTopLineStyles {
  /**
    * @param lineWidth <p>Pixel width of the line.</p>
    */
  def apply(lineWidth: js.UndefOr[Double] = js.undefined): PlotOptionsAbandsTopLineStyles = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsAbandsTopLineStyles {
      this.lineWidth = lineWidth
    })
  }
}
