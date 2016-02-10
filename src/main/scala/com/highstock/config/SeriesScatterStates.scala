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
  * @note JavaScript name: <code>series&lt;scatter&gt;-states</code>
  */
@js.annotation.ScalaJSDefined
class SeriesScatterStates extends js.Object {

  /**
    * Options for the hovered series
    */
  val hover: js.UndefOr[CleanJsObject[SeriesScatterStatesHover]] = js.undefined
}

object SeriesScatterStates {
  /**
    * @param hover Options for the hovered series
    */
  def apply(hover: js.UndefOr[CleanJsObject[SeriesScatterStatesHover]] = js.undefined): SeriesScatterStates = {
    val hoverOuter: js.UndefOr[CleanJsObject[SeriesScatterStatesHover]] = hover
    new SeriesScatterStates {
      override val hover: js.UndefOr[CleanJsObject[SeriesScatterStatesHover]] = hoverOuter
    }
  }
}
