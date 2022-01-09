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
  * @note JavaScript name: <code>plotOptions-wma-dataLabels-animation</code>
  */
class PlotOptionsWmaDataLabelsAnimation extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The animation delay time in milliseconds.
    * Set to <code>0</code> renders dataLabel immediately.
    * As <code>undefined</code> inherits defer time from the <a href="#plotOptions.series.animation.defer">series.animation.defer</a>.</p>
    * @since 8.2.0
    */
  var defer: js.UndefOr[Double] = js.undefined
}

object PlotOptionsWmaDataLabelsAnimation {
  /**
    * @param defer <p>The animation delay time in milliseconds.. Set to <code>0</code> renders dataLabel immediately.. As <code>undefined</code> inherits defer time from the <a href="#plotOptions.series.animation.defer">series.animation.defer</a>.</p>
    */
  def apply(defer: js.UndefOr[Double] = js.undefined): PlotOptionsWmaDataLabelsAnimation = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsWmaDataLabelsAnimation {
      this.defer = defer
    })
  }
}
