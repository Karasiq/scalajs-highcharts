/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highstock]]
  */
package com.highstock.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>plotOptions-flags-states</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsFlagsStates extends js.Object {

  /**
    * Options for the hovered series
    */
  val hover: js.UndefOr[CleanJsObject[PlotOptionsFlagsStatesHover]] = js.undefined
}

object PlotOptionsFlagsStates {
  /**
    * @param hover Options for the hovered series
    */
  def apply(hover: js.UndefOr[CleanJsObject[PlotOptionsFlagsStatesHover]] = js.undefined): PlotOptionsFlagsStates = {
    val hoverOuter: js.UndefOr[CleanJsObject[PlotOptionsFlagsStatesHover]] = hover
    new PlotOptionsFlagsStates {
      override val hover: js.UndefOr[CleanJsObject[PlotOptionsFlagsStatesHover]] = hoverOuter
    }
  }
}
