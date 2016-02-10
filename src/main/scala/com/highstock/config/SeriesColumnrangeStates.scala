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
  * @note JavaScript name: <code>series&lt;columnrange&gt;-states</code>
  */
@js.annotation.ScalaJSDefined
class SeriesColumnrangeStates extends js.Object {

  /**
    * Options for the hovered series
    */
  val hover: js.UndefOr[CleanJsObject[SeriesColumnrangeStatesHover]] = js.undefined
}

object SeriesColumnrangeStates {
  /**
    * @param hover Options for the hovered series
    */
  def apply(hover: js.UndefOr[CleanJsObject[SeriesColumnrangeStatesHover]] = js.undefined): SeriesColumnrangeStates = {
    val hoverOuter: js.UndefOr[CleanJsObject[SeriesColumnrangeStatesHover]] = hover
    new SeriesColumnrangeStates {
      override val hover: js.UndefOr[CleanJsObject[SeriesColumnrangeStatesHover]] = hoverOuter
    }
  }
}
