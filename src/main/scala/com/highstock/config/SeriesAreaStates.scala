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
  * @note JavaScript name: <code>series&lt;area&gt;-states</code>
  */
@js.annotation.ScalaJSDefined
class SeriesAreaStates extends js.Object {

  /**
    * Options for the hovered series
    */
  val hover: js.UndefOr[CleanJsObject[SeriesAreaStatesHover]] = js.undefined
}

object SeriesAreaStates {
  /**
    * @param hover Options for the hovered series
    */
  def apply(hover: js.UndefOr[CleanJsObject[SeriesAreaStatesHover]] = js.undefined): SeriesAreaStates = {
    val hoverOuter: js.UndefOr[CleanJsObject[SeriesAreaStatesHover]] = hover
    new SeriesAreaStates {
      override val hover: js.UndefOr[CleanJsObject[SeriesAreaStatesHover]] = hoverOuter
    }
  }
}
