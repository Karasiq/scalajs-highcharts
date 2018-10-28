/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highcharts]]
  */
package com.highcharts.config

import scalajs.js, js.`|`
import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>plotOptions-line-marker-states</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsLineMarkerStates extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The normal state of a single point marker. Currently only used
    * for setting animation when returning to normal state from hover.</p>
    */
  val normal: js.Any = js.undefined

  /**
    * <p>The hover state for a single point marker.</p>
    */
  val hover: js.Any = js.undefined

  /**
    * <p>The appearance of the point marker when selected. In order to
    * allow a point to be selected, set the <code>series.allowPointSelect</code>
    * option to true.</p>
    */
  val select: js.Any = js.undefined
}

object PlotOptionsLineMarkerStates {
  /**
    * @param normal <p>The normal state of a single point marker. Currently only used. for setting animation when returning to normal state from hover.</p>
    * @param hover <p>The hover state for a single point marker.</p>
    * @param select <p>The appearance of the point marker when selected. In order to. allow a point to be selected, set the <code>series.allowPointSelect</code>. option to true.</p>
    */
  def apply(normal: js.UndefOr[js.Any] = js.undefined, hover: js.UndefOr[js.Any] = js.undefined, select: js.UndefOr[js.Any] = js.undefined): PlotOptionsLineMarkerStates = {
    val normalOuter: js.Any = normal
    val hoverOuter: js.Any = hover
    val selectOuter: js.Any = select
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsLineMarkerStates {
      override val normal: js.Any = normalOuter
      override val hover: js.Any = hoverOuter
      override val select: js.Any = selectOuter
    })
  }
}
