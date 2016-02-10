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
  * @note JavaScript name: <code>series&lt;polygon&gt;-states</code>
  */
@js.annotation.ScalaJSDefined
class SeriesPolygonStates extends js.Object {

  /**
    * Options for the hovered series
    */
  val hover: js.UndefOr[CleanJsObject[SeriesPolygonStatesHover]] = js.undefined
}

object SeriesPolygonStates {
  /**
    * @param hover Options for the hovered series
    */
  def apply(hover: js.UndefOr[CleanJsObject[SeriesPolygonStatesHover]] = js.undefined): SeriesPolygonStates = {
    val hoverOuter: js.UndefOr[CleanJsObject[SeriesPolygonStatesHover]] = hover
    new SeriesPolygonStates {
      override val hover: js.UndefOr[CleanJsObject[SeriesPolygonStatesHover]] = hoverOuter
    }
  }
}
