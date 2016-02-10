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
  * @note JavaScript name: <code>plotOptions-mapline-states</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsMaplineStates extends js.Object {

  /**
    * Options for the hovered series
    */
  val hover: js.UndefOr[CleanJsObject[PlotOptionsMaplineStatesHover]] = js.undefined

  /**
    * Overrides for the normal state
    */
  val normal: js.UndefOr[CleanJsObject[PlotOptionsMaplineStatesNormal]] = js.undefined

  /**
    * Specific options for point in selected states, after being selected by <a href="#plotOptions.series.allowPointSelect">allowPointSelect</a> or programmatically. 
    * @example <a href="http://jsfiddle.net/gh/get/jquery/1.7.2/highslide-software/highcharts.com/tree/master/samples/maps/plotoptions/series-allowpointselect/" target="_blank">Allow point select demo</a>
    */
  val select: js.UndefOr[CleanJsObject[PlotOptionsMaplineStatesSelect]] = js.undefined
}

object PlotOptionsMaplineStates {
  /**
    * @param hover Options for the hovered series
    * @param normal Overrides for the normal state
    * @param select Specific options for point in selected states, after being selected by <a href="#plotOptions.series.allowPointSelect">allowPointSelect</a> or programmatically. 
    */
  def apply(hover: js.UndefOr[CleanJsObject[PlotOptionsMaplineStatesHover]] = js.undefined, normal: js.UndefOr[CleanJsObject[PlotOptionsMaplineStatesNormal]] = js.undefined, select: js.UndefOr[CleanJsObject[PlotOptionsMaplineStatesSelect]] = js.undefined): PlotOptionsMaplineStates = {
    val hoverOuter: js.UndefOr[CleanJsObject[PlotOptionsMaplineStatesHover]] = hover
    val normalOuter: js.UndefOr[CleanJsObject[PlotOptionsMaplineStatesNormal]] = normal
    val selectOuter: js.UndefOr[CleanJsObject[PlotOptionsMaplineStatesSelect]] = select
    new PlotOptionsMaplineStates {
      override val hover: js.UndefOr[CleanJsObject[PlotOptionsMaplineStatesHover]] = hoverOuter
      override val normal: js.UndefOr[CleanJsObject[PlotOptionsMaplineStatesNormal]] = normalOuter
      override val select: js.UndefOr[CleanJsObject[PlotOptionsMaplineStatesSelect]] = selectOuter
    }
  }
}
