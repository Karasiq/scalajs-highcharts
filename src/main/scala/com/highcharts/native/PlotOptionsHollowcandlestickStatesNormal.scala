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
  * @note JavaScript name: <code>plotOptions-hollowcandlestick-states-normal</code>
  */
class PlotOptionsHollowcandlestickStatesNormal extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Animation when returning to normal state after hovering.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-states-animation-false/">No animation of fill color</a>
    */
  var animation: js.UndefOr[Boolean | js.Object] = js.undefined
}

object PlotOptionsHollowcandlestickStatesNormal {
  /**
    * @param animation <p>Animation when returning to normal state after hovering.</p>
    */
  def apply(animation: js.UndefOr[Boolean | js.Object] = js.undefined): PlotOptionsHollowcandlestickStatesNormal = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsHollowcandlestickStatesNormal {
      this.animation = animation
    })
  }
}