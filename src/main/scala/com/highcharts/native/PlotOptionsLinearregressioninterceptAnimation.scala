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
  * @note JavaScript name: <code>plotOptions-linearregressionintercept-animation</code>
  */
class PlotOptionsLinearregressioninterceptAnimation extends com.highcharts.HighchartsGenericObject {

  var defer: js.UndefOr[Double] = js.undefined

  var duration: js.UndefOr[Double] = js.undefined
}

object PlotOptionsLinearregressioninterceptAnimation {
  /**
    */
  def apply(defer: js.UndefOr[Double] = js.undefined, duration: js.UndefOr[Double] = js.undefined): PlotOptionsLinearregressioninterceptAnimation = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsLinearregressioninterceptAnimation {
      this.defer = defer
      this.duration = duration
    })
  }
}
