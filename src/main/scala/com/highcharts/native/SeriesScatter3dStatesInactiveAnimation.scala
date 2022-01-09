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
  * @note JavaScript name: <code>series&lt;scatter3d&gt;-states-inactive-animation</code>
  */
class SeriesScatter3dStatesInactiveAnimation extends com.highcharts.HighchartsGenericObject {

  var duration: js.UndefOr[Double] = js.undefined
}

object SeriesScatter3dStatesInactiveAnimation {
  /**
    */
  def apply(duration: js.UndefOr[Double] = js.undefined): SeriesScatter3dStatesInactiveAnimation = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesScatter3dStatesInactiveAnimation {
      this.duration = duration
    })
  }
}
