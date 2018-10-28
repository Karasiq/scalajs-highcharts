/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highstock]]
  */
package com.highstock.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>series&lt;pyramid&gt;-states</code>
  */
@js.annotation.ScalaJSDefined
class SeriesPyramidStates extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Options for a selected funnel item.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-allowpointselect/">Allow point select demo</a>
    */
  val select: js.Any = js.undefined

  /**
    * <p>Options for the hovered series. These settings override the normal
    * state options when a series is moused over or touched.</p>
    */
  val hover: js.Any = js.undefined

  /**
    * <p>Overrides for the normal state.</p>
    */
  val normal: js.UndefOr[CleanJsObject[SeriesPyramidStatesNormal]] = js.undefined
}

object SeriesPyramidStates {
  /**
    * @param select <p>Options for a selected funnel item.</p>
    * @param hover <p>Options for the hovered series. These settings override the normal. state options when a series is moused over or touched.</p>
    * @param normal <p>Overrides for the normal state.</p>
    */
  def apply(select: js.UndefOr[js.Any] = js.undefined, hover: js.UndefOr[js.Any] = js.undefined, normal: js.UndefOr[CleanJsObject[SeriesPyramidStatesNormal]] = js.undefined): SeriesPyramidStates = {
    val selectOuter: js.Any = select
    val hoverOuter: js.Any = hover
    val normalOuter: js.UndefOr[CleanJsObject[SeriesPyramidStatesNormal]] = normal
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesPyramidStates {
      override val select: js.Any = selectOuter
      override val hover: js.Any = hoverOuter
      override val normal: js.UndefOr[CleanJsObject[SeriesPyramidStatesNormal]] = normalOuter
    })
  }
}
