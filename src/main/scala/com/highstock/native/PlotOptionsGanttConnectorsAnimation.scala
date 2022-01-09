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
  * @note JavaScript name: <code>plotOptions-gantt-connectors-animation</code>
  */
class PlotOptionsGanttConnectorsAnimation extends com.highcharts.HighchartsGenericObject {

  var reversed: js.UndefOr[Boolean] = js.undefined
}

object PlotOptionsGanttConnectorsAnimation {
  /**
    */
  def apply(reversed: js.UndefOr[Boolean] = js.undefined): PlotOptionsGanttConnectorsAnimation = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsGanttConnectorsAnimation {
      this.reversed = reversed
    })
  }
}
