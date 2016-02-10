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
  * @note JavaScript name: <code>series&lt;bubble&gt;-states</code>
  */
@js.annotation.ScalaJSDefined
class SeriesBubbleStates extends js.Object {

  /**
    * Options for the hovered series
    */
  val hover: js.UndefOr[CleanJsObject[SeriesBubbleStatesHover]] = js.undefined
}

object SeriesBubbleStates {
  /**
    * @param hover Options for the hovered series
    */
  def apply(hover: js.UndefOr[CleanJsObject[SeriesBubbleStatesHover]] = js.undefined): SeriesBubbleStates = {
    val hoverOuter: js.UndefOr[CleanJsObject[SeriesBubbleStatesHover]] = hover
    new SeriesBubbleStates {
      override val hover: js.UndefOr[CleanJsObject[SeriesBubbleStatesHover]] = hoverOuter
    }
  }
}
