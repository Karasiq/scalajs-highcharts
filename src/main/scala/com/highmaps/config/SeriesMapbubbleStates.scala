/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highmaps]]
  */
package com.highmaps.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>series&lt;mapbubble&gt;-states</code>
  */
@js.annotation.ScalaJSDefined
class SeriesMapbubbleStates extends js.Object {

  /**
    * Options for the hovered series
    */
  val hover: js.UndefOr[CleanJsObject[SeriesMapbubbleStatesHover]] = js.undefined

  /**
    * Overrides for the normal state
    */
  val normal: js.UndefOr[CleanJsObject[SeriesMapbubbleStatesNormal]] = js.undefined

  /**
    * Specific options for point in selected states, after being selected by <a href="#plotOptions.series.allowPointSelect">allowPointSelect</a> or programmatically. 
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-allowpointselect/" target="_blank">Allow point select demo</a>
    */
  val select: js.UndefOr[CleanJsObject[SeriesMapbubbleStatesSelect]] = js.undefined
}

object SeriesMapbubbleStates {
  /**
    * @param hover Options for the hovered series
    * @param normal Overrides for the normal state
    * @param select Specific options for point in selected states, after being selected by <a href="#plotOptions.series.allowPointSelect">allowPointSelect</a> or programmatically. 
    */
  def apply(hover: js.UndefOr[CleanJsObject[SeriesMapbubbleStatesHover]] = js.undefined, normal: js.UndefOr[CleanJsObject[SeriesMapbubbleStatesNormal]] = js.undefined, select: js.UndefOr[CleanJsObject[SeriesMapbubbleStatesSelect]] = js.undefined): SeriesMapbubbleStates = {
    val hoverOuter: js.UndefOr[CleanJsObject[SeriesMapbubbleStatesHover]] = hover
    val normalOuter: js.UndefOr[CleanJsObject[SeriesMapbubbleStatesNormal]] = normal
    val selectOuter: js.UndefOr[CleanJsObject[SeriesMapbubbleStatesSelect]] = select
    new SeriesMapbubbleStates {
      override val hover: js.UndefOr[CleanJsObject[SeriesMapbubbleStatesHover]] = hoverOuter
      override val normal: js.UndefOr[CleanJsObject[SeriesMapbubbleStatesNormal]] = normalOuter
      override val select: js.UndefOr[CleanJsObject[SeriesMapbubbleStatesSelect]] = selectOuter
    }
  }
}
