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
  * @note JavaScript name: <code>plotOptions-scatter-states</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsScatterStates extends js.Object {

  /**
    * Options for the hovered series
    */
  val hover: js.UndefOr[CleanJsObject[PlotOptionsScatterStatesHover]] = js.undefined
}

object PlotOptionsScatterStates {
  /**
    * @param hover Options for the hovered series
    */
  def apply(hover: js.UndefOr[CleanJsObject[PlotOptionsScatterStatesHover]] = js.undefined): PlotOptionsScatterStates = {
    val hoverOuter: js.UndefOr[CleanJsObject[PlotOptionsScatterStatesHover]] = hover
    new PlotOptionsScatterStates {
      override val hover: js.UndefOr[CleanJsObject[PlotOptionsScatterStatesHover]] = hoverOuter
    }
  }
}
