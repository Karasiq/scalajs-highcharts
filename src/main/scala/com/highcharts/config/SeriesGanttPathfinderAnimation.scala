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
  * @note JavaScript name: <code>series&lt;gantt&gt;-pathfinder-animation</code>
  */
@js.annotation.ScalaJSDefined
class SeriesGanttPathfinderAnimation extends com.highcharts.HighchartsGenericObject {

  val reversed: js.UndefOr[Boolean] = js.undefined
}

object SeriesGanttPathfinderAnimation {
  /**
    */
  def apply(reversed: js.UndefOr[Boolean] = js.undefined): SeriesGanttPathfinderAnimation = {
    val reversedOuter: js.UndefOr[Boolean] = reversed
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesGanttPathfinderAnimation {
      override val reversed: js.UndefOr[Boolean] = reversedOuter
    })
  }
}
