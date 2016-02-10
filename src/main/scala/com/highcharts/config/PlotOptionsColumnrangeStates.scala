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
  * @note JavaScript name: <code>plotOptions-columnrange-states</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsColumnrangeStates extends js.Object {

  /**
    * Options for the hovered series
    */
  val hover: js.UndefOr[CleanJsObject[PlotOptionsColumnrangeStatesHover]] = js.undefined
}

object PlotOptionsColumnrangeStates {
  /**
    * @param hover Options for the hovered series
    */
  def apply(hover: js.UndefOr[CleanJsObject[PlotOptionsColumnrangeStatesHover]] = js.undefined): PlotOptionsColumnrangeStates = {
    val hoverOuter: js.UndefOr[CleanJsObject[PlotOptionsColumnrangeStatesHover]] = hover
    new PlotOptionsColumnrangeStates {
      override val hover: js.UndefOr[CleanJsObject[PlotOptionsColumnrangeStatesHover]] = hoverOuter
    }
  }
}
