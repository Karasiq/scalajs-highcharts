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
  * @note JavaScript name: <code>series&lt;waterfall&gt;-states-inactive-animation</code>
  */
class SeriesWaterfallStatesInactiveAnimation extends com.highcharts.HighchartsGenericObject {

  var duration: js.UndefOr[Double] = js.undefined
}

object SeriesWaterfallStatesInactiveAnimation {
  /**
    */
  def apply(duration: js.UndefOr[Double] = js.undefined): SeriesWaterfallStatesInactiveAnimation = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesWaterfallStatesInactiveAnimation {
      this.duration = duration
    })
  }
}