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
  * @note JavaScript name: <code>plotOptions-areaspline-states</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsAreasplineStates extends js.Object {

  /**
    * Options for the hovered series
    */
  val hover: js.UndefOr[CleanJsObject[PlotOptionsAreasplineStatesHover]] = js.undefined
}

object PlotOptionsAreasplineStates {
  /**
    * @param hover Options for the hovered series
    */
  def apply(hover: js.UndefOr[CleanJsObject[PlotOptionsAreasplineStatesHover]] = js.undefined): PlotOptionsAreasplineStates = {
    val hoverOuter: js.UndefOr[CleanJsObject[PlotOptionsAreasplineStatesHover]] = hover
    new PlotOptionsAreasplineStates {
      override val hover: js.UndefOr[CleanJsObject[PlotOptionsAreasplineStatesHover]] = hoverOuter
    }
  }
}
