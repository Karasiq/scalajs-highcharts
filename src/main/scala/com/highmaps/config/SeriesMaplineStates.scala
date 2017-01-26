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
  * @note JavaScript name: <code>series&lt;mapline&gt;-states</code>
  */
@js.annotation.ScalaJSDefined
class SeriesMaplineStates extends js.Object {

  /**
    * Options for the hovered series
    */
  val hover: js.UndefOr[CleanJsObject[SeriesMaplineStatesHover]] = js.undefined

  /**
    * Overrides for the normal state
    */
  val normal: js.UndefOr[CleanJsObject[SeriesMaplineStatesNormal]] = js.undefined

  /**
    * Specific options for point in selected states, after being selected by <a href="#plotOptions.series.allowPointSelect">allowPointSelect</a> or programmatically. 
    * @example <a href="http://jsfiddle.net/gh/get/jquery/3.1.1/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-allowpointselect/" target="_blank">Allow point select demo</a>
    */
  val select: js.UndefOr[CleanJsObject[SeriesMaplineStatesSelect]] = js.undefined
}

object SeriesMaplineStates {
  /**
    * @param hover Options for the hovered series
    * @param normal Overrides for the normal state
    * @param select Specific options for point in selected states, after being selected by <a href="#plotOptions.series.allowPointSelect">allowPointSelect</a> or programmatically. 
    */
  def apply(hover: js.UndefOr[CleanJsObject[SeriesMaplineStatesHover]] = js.undefined, normal: js.UndefOr[CleanJsObject[SeriesMaplineStatesNormal]] = js.undefined, select: js.UndefOr[CleanJsObject[SeriesMaplineStatesSelect]] = js.undefined): SeriesMaplineStates = {
    val hoverOuter: js.UndefOr[CleanJsObject[SeriesMaplineStatesHover]] = hover
    val normalOuter: js.UndefOr[CleanJsObject[SeriesMaplineStatesNormal]] = normal
    val selectOuter: js.UndefOr[CleanJsObject[SeriesMaplineStatesSelect]] = select
    new SeriesMaplineStates {
      override val hover: js.UndefOr[CleanJsObject[SeriesMaplineStatesHover]] = hoverOuter
      override val normal: js.UndefOr[CleanJsObject[SeriesMaplineStatesNormal]] = normalOuter
      override val select: js.UndefOr[CleanJsObject[SeriesMaplineStatesSelect]] = selectOuter
    }
  }
}
