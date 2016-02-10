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
  * @note JavaScript name: <code>plotOptions-solidgauge-states</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsSolidgaugeStates extends js.Object {

  /**
    * Options for the hovered series
    */
  val hover: js.UndefOr[CleanJsObject[PlotOptionsSolidgaugeStatesHover]] = js.undefined
}

object PlotOptionsSolidgaugeStates {
  /**
    * @param hover Options for the hovered series
    */
  def apply(hover: js.UndefOr[CleanJsObject[PlotOptionsSolidgaugeStatesHover]] = js.undefined): PlotOptionsSolidgaugeStates = {
    val hoverOuter: js.UndefOr[CleanJsObject[PlotOptionsSolidgaugeStatesHover]] = hover
    new PlotOptionsSolidgaugeStates {
      override val hover: js.UndefOr[CleanJsObject[PlotOptionsSolidgaugeStatesHover]] = hoverOuter
    }
  }
}
