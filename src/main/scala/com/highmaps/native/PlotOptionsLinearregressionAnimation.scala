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
  * @note JavaScript name: <code>plotOptions-linearregression-animation</code>
  */
class PlotOptionsLinearregressionAnimation extends com.highcharts.HighchartsGenericObject {

  var defer: js.UndefOr[Double] = js.undefined

  var duration: js.UndefOr[Double] = js.undefined
}

object PlotOptionsLinearregressionAnimation {
  /**
    */
  def apply(defer: js.UndefOr[Double] = js.undefined, duration: js.UndefOr[Double] = js.undefined): PlotOptionsLinearregressionAnimation = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsLinearregressionAnimation {
      this.defer = defer
      this.duration = duration
    })
  }
}