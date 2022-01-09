/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highcharts]]
  */
package com.highcharts.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>plotOptions-hollowcandlestick-dragDrop-guideBox</code>
  */
class PlotOptionsHollowcandlestickDragDropGuideBox extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Style options for the guide box default state.</p>
    * @since 6.2.0
    */
  var default: js.Any = js.undefined
}

object PlotOptionsHollowcandlestickDragDropGuideBox {
  /**
    * @param default <p>Style options for the guide box default state.</p>
    */
  def apply(default: js.UndefOr[js.Any] = js.undefined): PlotOptionsHollowcandlestickDragDropGuideBox = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsHollowcandlestickDragDropGuideBox {
      this.default = default
    })
  }
}
