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
  * @note JavaScript name: <code>yAxis-stackLabels-animation</code>
  */
class YAxisStackLabelsAnimation extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The animation delay time in milliseconds.
    * Set to <code>0</code> renders stackLabel immediately.
    * As <code>undefined</code> inherits defer time from the <a href="#plotOptions.series.animation.defer">series.animation.defer</a>.</p>
    * @since 8.2.0
    */
  var defer: js.UndefOr[Double] = js.undefined
}

object YAxisStackLabelsAnimation {
  /**
    * @param defer <p>The animation delay time in milliseconds.. Set to <code>0</code> renders stackLabel immediately.. As <code>undefined</code> inherits defer time from the <a href="#plotOptions.series.animation.defer">series.animation.defer</a>.</p>
    */
  def apply(defer: js.UndefOr[Double] = js.undefined): YAxisStackLabelsAnimation = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new YAxisStackLabelsAnimation {
      this.defer = defer
    })
  }
}
