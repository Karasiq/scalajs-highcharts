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
  * @note JavaScript name: <code>series&lt;dema&gt;-states-inactive-animation</code>
  */
class SeriesDemaStatesInactiveAnimation extends com.highcharts.HighchartsGenericObject {

  var duration: js.UndefOr[Double] = js.undefined
}

object SeriesDemaStatesInactiveAnimation {
  /**
    */
  def apply(duration: js.UndefOr[Double] = js.undefined): SeriesDemaStatesInactiveAnimation = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesDemaStatesInactiveAnimation {
      this.duration = duration
    })
  }
}