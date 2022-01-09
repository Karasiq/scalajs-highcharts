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
  * @note JavaScript name: <code>series&lt;linearregressionslope&gt;-animation</code>
  */
class SeriesLinearregressionslopeAnimation extends com.highcharts.HighchartsGenericObject {

  var defer: js.UndefOr[Double] = js.undefined

  var duration: js.UndefOr[Double] = js.undefined
}

object SeriesLinearregressionslopeAnimation {
  /**
    */
  def apply(defer: js.UndefOr[Double] = js.undefined, duration: js.UndefOr[Double] = js.undefined): SeriesLinearregressionslopeAnimation = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesLinearregressionslopeAnimation {
      this.defer = defer
      this.duration = duration
    })
  }
}
