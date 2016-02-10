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
  * @note JavaScript name: <code>plotOptions-bubble-states</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsBubbleStates extends js.Object {

  /**
    * Options for the hovered series
    */
  val hover: js.UndefOr[CleanJsObject[PlotOptionsBubbleStatesHover]] = js.undefined
}

object PlotOptionsBubbleStates {
  /**
    * @param hover Options for the hovered series
    */
  def apply(hover: js.UndefOr[CleanJsObject[PlotOptionsBubbleStatesHover]] = js.undefined): PlotOptionsBubbleStates = {
    val hoverOuter: js.UndefOr[CleanJsObject[PlotOptionsBubbleStatesHover]] = hover
    new PlotOptionsBubbleStates {
      override val hover: js.UndefOr[CleanJsObject[PlotOptionsBubbleStatesHover]] = hoverOuter
    }
  }
}
