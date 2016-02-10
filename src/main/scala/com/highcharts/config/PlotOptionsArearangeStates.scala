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
  * @note JavaScript name: <code>plotOptions-arearange-states</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsArearangeStates extends js.Object {

  /**
    * Options for the hovered series
    */
  val hover: js.UndefOr[CleanJsObject[PlotOptionsArearangeStatesHover]] = js.undefined
}

object PlotOptionsArearangeStates {
  /**
    * @param hover Options for the hovered series
    */
  def apply(hover: js.UndefOr[CleanJsObject[PlotOptionsArearangeStatesHover]] = js.undefined): PlotOptionsArearangeStates = {
    val hoverOuter: js.UndefOr[CleanJsObject[PlotOptionsArearangeStatesHover]] = hover
    new PlotOptionsArearangeStates {
      override val hover: js.UndefOr[CleanJsObject[PlotOptionsArearangeStatesHover]] = hoverOuter
    }
  }
}
