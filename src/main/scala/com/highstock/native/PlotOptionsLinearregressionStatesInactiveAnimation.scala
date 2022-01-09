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
  * @note JavaScript name: <code>plotOptions-linearregression-states-inactive-animation</code>
  */
class PlotOptionsLinearregressionStatesInactiveAnimation extends com.highcharts.HighchartsGenericObject {

  var duration: js.UndefOr[Double] = js.undefined
}

object PlotOptionsLinearregressionStatesInactiveAnimation {
  /**
    */
  def apply(duration: js.UndefOr[Double] = js.undefined): PlotOptionsLinearregressionStatesInactiveAnimation = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsLinearregressionStatesInactiveAnimation {
      this.duration = duration
    })
  }
}
