/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highcharts]]
  */
package com.highcharts.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>plotOptions-gantt-pathfinder-animation</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsGanttPathfinderAnimation extends com.highcharts.HighchartsGenericObject {

  val reversed: js.UndefOr[Boolean] = js.undefined
}

object PlotOptionsGanttPathfinderAnimation {
  /**
    */
  def apply(reversed: js.UndefOr[Boolean] = js.undefined): PlotOptionsGanttPathfinderAnimation = {
    val reversedOuter: js.UndefOr[Boolean] = reversed
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsGanttPathfinderAnimation {
      override val reversed: js.UndefOr[Boolean] = reversedOuter
    })
  }
}
