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
  * @note JavaScript name: <code>series&lt;areasplinerange&gt;-states</code>
  */
@js.annotation.ScalaJSDefined
class SeriesAreasplinerangeStates extends js.Object {

  /**
    * Options for the hovered series
    */
  val hover: js.UndefOr[CleanJsObject[SeriesAreasplinerangeStatesHover]] = js.undefined
}

object SeriesAreasplinerangeStates {
  /**
    * @param hover Options for the hovered series
    */
  def apply(hover: js.UndefOr[CleanJsObject[SeriesAreasplinerangeStatesHover]] = js.undefined): SeriesAreasplinerangeStates = {
    val hoverOuter: js.UndefOr[CleanJsObject[SeriesAreasplinerangeStatesHover]] = hover
    new SeriesAreasplinerangeStates {
      override val hover: js.UndefOr[CleanJsObject[SeriesAreasplinerangeStatesHover]] = hoverOuter
    }
  }
}
