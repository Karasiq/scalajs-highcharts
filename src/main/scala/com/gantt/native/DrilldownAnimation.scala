/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/gantt]]
  */
package com.gantt.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>drilldown-animation</code>
  */
class DrilldownAnimation extends com.highcharts.HighchartsGenericObject {

  var duration: js.UndefOr[Double] = js.undefined
}

object DrilldownAnimation {
  /**
    */
  def apply(duration: js.UndefOr[Double] = js.undefined): DrilldownAnimation = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new DrilldownAnimation {
      this.duration = duration
    })
  }
}
