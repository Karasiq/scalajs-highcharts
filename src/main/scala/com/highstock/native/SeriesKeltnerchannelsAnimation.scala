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
  * @note JavaScript name: <code>series&lt;keltnerchannels&gt;-animation</code>
  */
class SeriesKeltnerchannelsAnimation extends com.highcharts.HighchartsGenericObject {

  var defer: js.UndefOr[Double] = js.undefined

  var duration: js.UndefOr[Double] = js.undefined
}

object SeriesKeltnerchannelsAnimation {
  /**
    */
  def apply(defer: js.UndefOr[Double] = js.undefined, duration: js.UndefOr[Double] = js.undefined): SeriesKeltnerchannelsAnimation = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesKeltnerchannelsAnimation {
      this.defer = defer
      this.duration = duration
    })
  }
}