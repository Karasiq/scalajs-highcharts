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
class SeriesMaplineStates extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Overrides for the normal state.</p>
    */
  val normal: js.Any = js.undefined

  /**
    * <p>Options for the hovered series. These settings override the normal
    * state options when a series is moused over or touched.</p>
    */
  val hover: js.Any = js.undefined

  /**
    * <p>Specific options for point in selected states, after being selected
    * by <a href="#plotOptions.series.allowPointSelect">allowPointSelect</a> or
    * programmatically.</p>
    * @example <a href="https://jsfiddle.net/gh/library/pure/highcharts/highcharts/tree/master/samples/maps/plotoptions/series-allowpointselect/">Allow point select demo</a>
    */
  val select: js.Any = js.undefined
}

object SeriesMaplineStates {
  /**
    * @param normal <p>Overrides for the normal state.</p>
    * @param hover <p>Options for the hovered series. These settings override the normal. state options when a series is moused over or touched.</p>
    * @param select <p>Specific options for point in selected states, after being selected. by <a href="#plotOptions.series.allowPointSelect">allowPointSelect</a> or. programmatically.</p>
    */
  def apply(normal: js.UndefOr[js.Any] = js.undefined, hover: js.UndefOr[js.Any] = js.undefined, select: js.UndefOr[js.Any] = js.undefined): SeriesMaplineStates = {
    val normalOuter: js.Any = normal
    val hoverOuter: js.Any = hover
    val selectOuter: js.Any = select
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesMaplineStates {
      override val normal: js.Any = normalOuter
      override val hover: js.Any = hoverOuter
      override val select: js.Any = selectOuter
    })
  }
}
