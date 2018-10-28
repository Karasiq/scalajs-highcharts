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
  * @note JavaScript name: <code>plotOptions-bubble-marker-states</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsBubbleMarkerStates extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The hover state for a single point marker.</p>
    */
  val hover: js.Any = js.undefined

  /**
    * <p>The normal state of a single point marker. Currently only used
    * for setting animation when returning to normal state from hover.</p>
    */
  val normal: js.Any = js.undefined

  /**
    * <p>The appearance of the point marker when selected. In order to
    * allow a point to be selected, set the <code>series.allowPointSelect</code>
    * option to true.</p>
    */
  val select: js.Any = js.undefined
}

object PlotOptionsBubbleMarkerStates {
  /**
    * @param hover <p>The hover state for a single point marker.</p>
    * @param normal <p>The normal state of a single point marker. Currently only used. for setting animation when returning to normal state from hover.</p>
    * @param select <p>The appearance of the point marker when selected. In order to. allow a point to be selected, set the <code>series.allowPointSelect</code>. option to true.</p>
    */
  def apply(hover: js.UndefOr[js.Any] = js.undefined, normal: js.UndefOr[js.Any] = js.undefined, select: js.UndefOr[js.Any] = js.undefined): PlotOptionsBubbleMarkerStates = {
    val hoverOuter: js.Any = hover
    val normalOuter: js.Any = normal
    val selectOuter: js.Any = select
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsBubbleMarkerStates {
      override val hover: js.Any = hoverOuter
      override val normal: js.Any = normalOuter
      override val select: js.Any = selectOuter
    })
  }
}
