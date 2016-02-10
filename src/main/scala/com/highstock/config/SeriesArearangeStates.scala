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
  * @note JavaScript name: <code>series&lt;arearange&gt;-states</code>
  */
@js.annotation.ScalaJSDefined
class SeriesArearangeStates extends js.Object {

  /**
    * Options for the hovered series
    */
  val hover: js.UndefOr[CleanJsObject[SeriesArearangeStatesHover]] = js.undefined
}

object SeriesArearangeStates {
  /**
    * @param hover Options for the hovered series
    */
  def apply(hover: js.UndefOr[CleanJsObject[SeriesArearangeStatesHover]] = js.undefined): SeriesArearangeStates = {
    val hoverOuter: js.UndefOr[CleanJsObject[SeriesArearangeStatesHover]] = hover
    new SeriesArearangeStates {
      override val hover: js.UndefOr[CleanJsObject[SeriesArearangeStatesHover]] = hoverOuter
    }
  }
}
