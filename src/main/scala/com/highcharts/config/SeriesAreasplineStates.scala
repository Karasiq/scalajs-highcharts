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
  * @note JavaScript name: <code>series&lt;areaspline&gt;-states</code>
  */
@js.annotation.ScalaJSDefined
class SeriesAreasplineStates extends js.Object {

  /**
    * Options for the hovered series
    */
  val hover: js.UndefOr[CleanJsObject[SeriesAreasplineStatesHover]] = js.undefined
}

object SeriesAreasplineStates {
  /**
    * @param hover Options for the hovered series
    */
  def apply(hover: js.UndefOr[CleanJsObject[SeriesAreasplineStatesHover]] = js.undefined): SeriesAreasplineStates = {
    val hoverOuter: js.UndefOr[CleanJsObject[SeriesAreasplineStatesHover]] = hover
    new SeriesAreasplineStates {
      override val hover: js.UndefOr[CleanJsObject[SeriesAreasplineStatesHover]] = hoverOuter
    }
  }
}
