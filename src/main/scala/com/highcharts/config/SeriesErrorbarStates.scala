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
  * @note JavaScript name: <code>series&lt;errorbar&gt;-states</code>
  */
@js.annotation.ScalaJSDefined
class SeriesErrorbarStates extends js.Object {

  /**
    * Options for the hovered series
    */
  val hover: js.UndefOr[CleanJsObject[SeriesErrorbarStatesHover]] = js.undefined
}

object SeriesErrorbarStates {
  /**
    * @param hover Options for the hovered series
    */
  def apply(hover: js.UndefOr[CleanJsObject[SeriesErrorbarStatesHover]] = js.undefined): SeriesErrorbarStates = {
    val hoverOuter: js.UndefOr[CleanJsObject[SeriesErrorbarStatesHover]] = hover
    new SeriesErrorbarStates {
      override val hover: js.UndefOr[CleanJsObject[SeriesErrorbarStatesHover]] = hoverOuter
    }
  }
}
