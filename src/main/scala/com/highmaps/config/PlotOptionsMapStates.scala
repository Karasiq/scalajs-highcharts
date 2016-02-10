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
  * @note JavaScript name: <code>plotOptions-map-states</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsMapStates extends js.Object {

  /**
    * Options for the hovered series
    */
  val hover: js.UndefOr[CleanJsObject[PlotOptionsMapStatesHover]] = js.undefined

  /**
    * Overrides for the normal state
    */
  val normal: js.UndefOr[CleanJsObject[PlotOptionsMapStatesNormal]] = js.undefined

  /**
    * Specific options for point in selected states, after being selected by <a href="#plotOptions.series.allowPointSelect">allowPointSelect</a> or programmatically. 
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/plotoptions/series-allowpointselect/" target="_blank">Allow point select demo</a>
    */
  val select: js.UndefOr[CleanJsObject[PlotOptionsMapStatesSelect]] = js.undefined
}

object PlotOptionsMapStates {
  /**
    * @param hover Options for the hovered series
    * @param normal Overrides for the normal state
    * @param select Specific options for point in selected states, after being selected by <a href="#plotOptions.series.allowPointSelect">allowPointSelect</a> or programmatically. 
    */
  def apply(hover: js.UndefOr[CleanJsObject[PlotOptionsMapStatesHover]] = js.undefined, normal: js.UndefOr[CleanJsObject[PlotOptionsMapStatesNormal]] = js.undefined, select: js.UndefOr[CleanJsObject[PlotOptionsMapStatesSelect]] = js.undefined): PlotOptionsMapStates = {
    val hoverOuter: js.UndefOr[CleanJsObject[PlotOptionsMapStatesHover]] = hover
    val normalOuter: js.UndefOr[CleanJsObject[PlotOptionsMapStatesNormal]] = normal
    val selectOuter: js.UndefOr[CleanJsObject[PlotOptionsMapStatesSelect]] = select
    new PlotOptionsMapStates {
      override val hover: js.UndefOr[CleanJsObject[PlotOptionsMapStatesHover]] = hoverOuter
      override val normal: js.UndefOr[CleanJsObject[PlotOptionsMapStatesNormal]] = normalOuter
      override val select: js.UndefOr[CleanJsObject[PlotOptionsMapStatesSelect]] = selectOuter
    }
  }
}
