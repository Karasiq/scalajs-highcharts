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
  * @note JavaScript name: <code>plotOptions-mapbubble-states</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsMapbubbleStates extends js.Object {

  /**
    * Options for the hovered series
    */
  val hover: js.UndefOr[CleanJsObject[PlotOptionsMapbubbleStatesHover]] = js.undefined

  /**
    * Overrides for the normal state
    */
  val normal: js.UndefOr[CleanJsObject[PlotOptionsMapbubbleStatesNormal]] = js.undefined

  /**
    * Specific options for point in selected states, after being selected by <a href="#plotOptions.series.allowPointSelect">allowPointSelect</a> or programmatically. 
    * @example <a href="http://jsfiddle.net/gh/get/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-allowpointselect/" target="_blank">Allow point select demo</a>
    */
  val select: js.UndefOr[CleanJsObject[PlotOptionsMapbubbleStatesSelect]] = js.undefined
}

object PlotOptionsMapbubbleStates {
  /**
    * @param hover Options for the hovered series
    * @param normal Overrides for the normal state
    * @param select Specific options for point in selected states, after being selected by <a href="#plotOptions.series.allowPointSelect">allowPointSelect</a> or programmatically. 
    */
  def apply(hover: js.UndefOr[CleanJsObject[PlotOptionsMapbubbleStatesHover]] = js.undefined, normal: js.UndefOr[CleanJsObject[PlotOptionsMapbubbleStatesNormal]] = js.undefined, select: js.UndefOr[CleanJsObject[PlotOptionsMapbubbleStatesSelect]] = js.undefined): PlotOptionsMapbubbleStates = {
    val hoverOuter: js.UndefOr[CleanJsObject[PlotOptionsMapbubbleStatesHover]] = hover
    val normalOuter: js.UndefOr[CleanJsObject[PlotOptionsMapbubbleStatesNormal]] = normal
    val selectOuter: js.UndefOr[CleanJsObject[PlotOptionsMapbubbleStatesSelect]] = select
    new PlotOptionsMapbubbleStates {
      override val hover: js.UndefOr[CleanJsObject[PlotOptionsMapbubbleStatesHover]] = hoverOuter
      override val normal: js.UndefOr[CleanJsObject[PlotOptionsMapbubbleStatesNormal]] = normalOuter
      override val select: js.UndefOr[CleanJsObject[PlotOptionsMapbubbleStatesSelect]] = selectOuter
    }
  }
}
