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
  * @note JavaScript name: <code>plotOptions-linearregressionangle-states-inactive-animation</code>
  */
class PlotOptionsLinearregressionangleStatesInactiveAnimation extends com.highcharts.HighchartsGenericObject {

  var duration: js.UndefOr[Double] = js.undefined
}

object PlotOptionsLinearregressionangleStatesInactiveAnimation {
  /**
    */
  def apply(duration: js.UndefOr[Double] = js.undefined): PlotOptionsLinearregressionangleStatesInactiveAnimation = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsLinearregressionangleStatesInactiveAnimation {
      this.duration = duration
    })
  }
}