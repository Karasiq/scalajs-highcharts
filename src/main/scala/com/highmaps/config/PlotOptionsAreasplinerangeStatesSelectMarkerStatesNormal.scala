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
  * @note JavaScript name: <code>plotOptions-areasplinerange-states-select-marker-states-normal</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsAreasplinerangeStatesSelectMarkerStatesNormal extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Animation when returning to normal state after hovering.</p>
    * @since 2.3.0
    */
  val animation: js.UndefOr[Boolean | js.Object] = js.undefined
}

object PlotOptionsAreasplinerangeStatesSelectMarkerStatesNormal {
  /**
    * @param animation <p>Animation when returning to normal state after hovering.</p>
    */
  def apply(animation: js.UndefOr[Boolean | js.Object] = js.undefined): PlotOptionsAreasplinerangeStatesSelectMarkerStatesNormal = {
    val animationOuter: js.UndefOr[Boolean | js.Object] = animation
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsAreasplinerangeStatesSelectMarkerStatesNormal {
      override val animation: js.UndefOr[Boolean | js.Object] = animationOuter
    })
  }
}
