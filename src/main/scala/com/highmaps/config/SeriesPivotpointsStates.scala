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
  * @note JavaScript name: <code>series&lt;pivotpoints&gt;-states</code>
  */
@js.annotation.ScalaJSDefined
class SeriesPivotpointsStates extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Overrides for the normal state.</p>
    * @since 6.0.0
    */
  val normal: js.UndefOr[CleanJsObject[SeriesPivotpointsStatesNormal]] = js.undefined

  /**
    * <p>Options for the hovered series. These settings override the normal
    * state options when a series is moused over or touched.</p>
    * @since 6.0.0
    */
  val hover: js.Any = js.undefined

  /**
    * <p>Specific options for point in selected states, after being selected
    * by <a href="#plotOptions.series.allowPointSelect">allowPointSelect</a> or
    * programmatically.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-allowpointselect/">Allow point select demo</a>
    * @since 6.0.0
    */
  val select: js.UndefOr[CleanJsObject[SeriesPivotpointsStatesSelect]] = js.undefined
}

object SeriesPivotpointsStates {
  /**
    * @param normal <p>Overrides for the normal state.</p>
    * @param hover <p>Options for the hovered series. These settings override the normal. state options when a series is moused over or touched.</p>
    * @param select <p>Specific options for point in selected states, after being selected. by <a href="#plotOptions.series.allowPointSelect">allowPointSelect</a> or. programmatically.</p>
    */
  def apply(normal: js.UndefOr[CleanJsObject[SeriesPivotpointsStatesNormal]] = js.undefined, hover: js.UndefOr[js.Any] = js.undefined, select: js.UndefOr[CleanJsObject[SeriesPivotpointsStatesSelect]] = js.undefined): SeriesPivotpointsStates = {
    val normalOuter: js.UndefOr[CleanJsObject[SeriesPivotpointsStatesNormal]] = normal
    val hoverOuter: js.Any = hover
    val selectOuter: js.UndefOr[CleanJsObject[SeriesPivotpointsStatesSelect]] = select
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesPivotpointsStates {
      override val normal: js.UndefOr[CleanJsObject[SeriesPivotpointsStatesNormal]] = normalOuter
      override val hover: js.Any = hoverOuter
      override val select: js.UndefOr[CleanJsObject[SeriesPivotpointsStatesSelect]] = selectOuter
    })
  }
}