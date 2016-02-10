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
  * @note JavaScript name: <code>series&lt;pie&gt;-states</code>
  */
@js.annotation.ScalaJSDefined
class SeriesPieStates extends js.Object {

  /**
    * Options for the hovered series
    */
  val hover: js.UndefOr[CleanJsObject[SeriesPieStatesHover]] = js.undefined
}

object SeriesPieStates {
  /**
    * @param hover Options for the hovered series
    */
  def apply(hover: js.UndefOr[CleanJsObject[SeriesPieStatesHover]] = js.undefined): SeriesPieStates = {
    val hoverOuter: js.UndefOr[CleanJsObject[SeriesPieStatesHover]] = hover
    new SeriesPieStates {
      override val hover: js.UndefOr[CleanJsObject[SeriesPieStatesHover]] = hoverOuter
    }
  }
}
