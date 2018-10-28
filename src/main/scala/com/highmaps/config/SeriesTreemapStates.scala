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
  * @note JavaScript name: <code>series&lt;treemap&gt;-states</code>
  */
@js.annotation.ScalaJSDefined
class SeriesTreemapStates extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Options for the hovered series</p>
    */
  val hover: js.Any = js.undefined

  /**
    * <p>Overrides for the normal state.</p>
    */
  val normal: js.UndefOr[CleanJsObject[SeriesTreemapStatesNormal]] = js.undefined

  /**
    * <p>Specific options for point in selected states, after being selected
    * by <a href="#plotOptions.series.allowPointSelect">allowPointSelect</a> or
    * programmatically.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-allowpointselect/">Allow point select demo</a>
    */
  val select: js.UndefOr[CleanJsObject[SeriesTreemapStatesSelect]] = js.undefined
}

object SeriesTreemapStates {
  /**
    * @param hover <p>Options for the hovered series</p>
    * @param normal <p>Overrides for the normal state.</p>
    * @param select <p>Specific options for point in selected states, after being selected. by <a href="#plotOptions.series.allowPointSelect">allowPointSelect</a> or. programmatically.</p>
    */
  def apply(hover: js.UndefOr[js.Any] = js.undefined, normal: js.UndefOr[CleanJsObject[SeriesTreemapStatesNormal]] = js.undefined, select: js.UndefOr[CleanJsObject[SeriesTreemapStatesSelect]] = js.undefined): SeriesTreemapStates = {
    val hoverOuter: js.Any = hover
    val normalOuter: js.UndefOr[CleanJsObject[SeriesTreemapStatesNormal]] = normal
    val selectOuter: js.UndefOr[CleanJsObject[SeriesTreemapStatesSelect]] = select
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesTreemapStates {
      override val hover: js.Any = hoverOuter
      override val normal: js.UndefOr[CleanJsObject[SeriesTreemapStatesNormal]] = normalOuter
      override val select: js.UndefOr[CleanJsObject[SeriesTreemapStatesSelect]] = selectOuter
    })
  }
}
