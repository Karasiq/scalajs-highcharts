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
  * @note JavaScript name: <code>series&lt;map&gt;-states</code>
  */
@js.annotation.ScalaJSDefined
class SeriesMapStates extends js.Object {

  /**
    * Options for the hovered series
    */
  val hover: js.UndefOr[CleanJsObject[SeriesMapStatesHover]] = js.undefined

  /**
    * Overrides for the normal state
    */
  val normal: js.UndefOr[CleanJsObject[SeriesMapStatesNormal]] = js.undefined

  /**
    * Specific options for point in selected states, after being selected by <a href="#plotOptions.series.allowPointSelect">allowPointSelect</a> or programmatically. 
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-allowpointselect/" target="_blank">Allow point select demo</a>
    */
  val select: js.UndefOr[CleanJsObject[SeriesMapStatesSelect]] = js.undefined
}

object SeriesMapStates {
  /**
    * @param hover Options for the hovered series
    * @param normal Overrides for the normal state
    * @param select Specific options for point in selected states, after being selected by <a href="#plotOptions.series.allowPointSelect">allowPointSelect</a> or programmatically. 
    */
  def apply(hover: js.UndefOr[CleanJsObject[SeriesMapStatesHover]] = js.undefined, normal: js.UndefOr[CleanJsObject[SeriesMapStatesNormal]] = js.undefined, select: js.UndefOr[CleanJsObject[SeriesMapStatesSelect]] = js.undefined): SeriesMapStates = {
    val hoverOuter: js.UndefOr[CleanJsObject[SeriesMapStatesHover]] = hover
    val normalOuter: js.UndefOr[CleanJsObject[SeriesMapStatesNormal]] = normal
    val selectOuter: js.UndefOr[CleanJsObject[SeriesMapStatesSelect]] = select
    new SeriesMapStates {
      override val hover: js.UndefOr[CleanJsObject[SeriesMapStatesHover]] = hoverOuter
      override val normal: js.UndefOr[CleanJsObject[SeriesMapStatesNormal]] = normalOuter
      override val select: js.UndefOr[CleanJsObject[SeriesMapStatesSelect]] = selectOuter
    }
  }
}
