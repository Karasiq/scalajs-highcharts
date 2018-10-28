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
  * @note JavaScript name: <code>pane-background-backgroundColor</code>
  */
@js.annotation.ScalaJSDefined
class PaneBackgroundBackgroundColor extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Definition of the gradient, similar to SVG: object literal holds
    * start position (x1, y1) and the end position (x2, y2) relative
    * to the shape, where 0 means top/left and 1 is bottom/right.
    * All positions are floats between 0 and 1.</p>
    * @since 2.3.0
    */
  val linearGradient: js.UndefOr[CleanJsObject[PaneBackgroundBackgroundColorLinearGradient]] = js.undefined

  /**
    * <p>The stops is an array of tuples, where the first item is a float
    * between 0 and 1 assigning the relative position in the gradient,
    * and the second item is the color.</p>
    * @since 2.3.0
    */
  val stops: js.UndefOr[js.Array[js.Array[js.Any]]] = js.undefined
}

object PaneBackgroundBackgroundColor {
  /**
    * @param linearGradient <p>Definition of the gradient, similar to SVG: object literal holds. start position (x1, y1) and the end position (x2, y2) relative. to the shape, where 0 means top/left and 1 is bottom/right.. All positions are floats between 0 and 1.</p>
    * @param stops <p>The stops is an array of tuples, where the first item is a float. between 0 and 1 assigning the relative position in the gradient,. and the second item is the color.</p>
    */
  def apply(linearGradient: js.UndefOr[CleanJsObject[PaneBackgroundBackgroundColorLinearGradient]] = js.undefined, stops: js.UndefOr[js.Array[js.Array[js.Any]]] = js.undefined): PaneBackgroundBackgroundColor = {
    val linearGradientOuter: js.UndefOr[CleanJsObject[PaneBackgroundBackgroundColorLinearGradient]] = linearGradient
    val stopsOuter: js.UndefOr[js.Array[js.Array[js.Any]]] = stops
    com.highcharts.HighchartsGenericObject.toCleanObject(new PaneBackgroundBackgroundColor {
      override val linearGradient: js.UndefOr[CleanJsObject[PaneBackgroundBackgroundColorLinearGradient]] = linearGradientOuter
      override val stops: js.UndefOr[js.Array[js.Array[js.Any]]] = stopsOuter
    })
  }
}
