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
  * @note JavaScript name: <code>plotOptions-macd-states-inactive-animation</code>
  */
class PlotOptionsMacdStatesInactiveAnimation extends com.highcharts.HighchartsGenericObject {

  var duration: js.UndefOr[Double] = js.undefined
}

object PlotOptionsMacdStatesInactiveAnimation {
  /**
    */
  def apply(duration: js.UndefOr[Double] = js.undefined): PlotOptionsMacdStatesInactiveAnimation = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsMacdStatesInactiveAnimation {
      this.duration = duration
    })
  }
}