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
  * @note JavaScript name: <code>series&lt;column&gt;-states</code>
  */
@js.annotation.ScalaJSDefined
class SeriesColumnStates extends js.Object {

  /**
    * Options for the hovered series
    */
  val hover: js.UndefOr[CleanJsObject[SeriesColumnStatesHover]] = js.undefined
}

object SeriesColumnStates {
  /**
    * @param hover Options for the hovered series
    */
  def apply(hover: js.UndefOr[CleanJsObject[SeriesColumnStatesHover]] = js.undefined): SeriesColumnStates = {
    val hoverOuter: js.UndefOr[CleanJsObject[SeriesColumnStatesHover]] = hover
    new SeriesColumnStates {
      override val hover: js.UndefOr[CleanJsObject[SeriesColumnStatesHover]] = hoverOuter
    }
  }
}
