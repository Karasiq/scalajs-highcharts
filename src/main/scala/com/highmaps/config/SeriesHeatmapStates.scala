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
  * @note JavaScript name: <code>series&lt;heatmap&gt;-states</code>
  */
@js.annotation.ScalaJSDefined
class SeriesHeatmapStates extends js.Object {

  /**
    * Options for the hovered series
    */
  val hover: js.UndefOr[CleanJsObject[SeriesHeatmapStatesHover]] = js.undefined

  /**
    * Overrides for the normal state
    */
  val normal: js.UndefOr[CleanJsObject[SeriesHeatmapStatesNormal]] = js.undefined

  /**
    * Specific options for point in selected states, after being selected by <a href="#plotOptions.series.allowPointSelect">allowPointSelect</a> or programmatically. 
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-allowpointselect/" target="_blank">Allow point select demo</a>
    */
  val select: js.UndefOr[CleanJsObject[SeriesHeatmapStatesSelect]] = js.undefined
}

object SeriesHeatmapStates {
  /**
    * @param hover Options for the hovered series
    * @param normal Overrides for the normal state
    * @param select Specific options for point in selected states, after being selected by <a href="#plotOptions.series.allowPointSelect">allowPointSelect</a> or programmatically. 
    */
  def apply(hover: js.UndefOr[CleanJsObject[SeriesHeatmapStatesHover]] = js.undefined, normal: js.UndefOr[CleanJsObject[SeriesHeatmapStatesNormal]] = js.undefined, select: js.UndefOr[CleanJsObject[SeriesHeatmapStatesSelect]] = js.undefined): SeriesHeatmapStates = {
    val hoverOuter: js.UndefOr[CleanJsObject[SeriesHeatmapStatesHover]] = hover
    val normalOuter: js.UndefOr[CleanJsObject[SeriesHeatmapStatesNormal]] = normal
    val selectOuter: js.UndefOr[CleanJsObject[SeriesHeatmapStatesSelect]] = select
    new SeriesHeatmapStates {
      override val hover: js.UndefOr[CleanJsObject[SeriesHeatmapStatesHover]] = hoverOuter
      override val normal: js.UndefOr[CleanJsObject[SeriesHeatmapStatesNormal]] = normalOuter
      override val select: js.UndefOr[CleanJsObject[SeriesHeatmapStatesSelect]] = selectOuter
    }
  }
}
