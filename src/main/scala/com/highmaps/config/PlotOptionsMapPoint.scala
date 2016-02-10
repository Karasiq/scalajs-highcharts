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
  * @note JavaScript name: <code>plotOptions-map-point</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsMapPoint extends js.Object {

  /**
    * Events for each single point
    */
  val events: js.UndefOr[CleanJsObject[PlotOptionsMapPointEvents]] = js.undefined
}

object PlotOptionsMapPoint {
  /**
    * @param events Events for each single point
    */
  def apply(events: js.UndefOr[CleanJsObject[PlotOptionsMapPointEvents]] = js.undefined): PlotOptionsMapPoint = {
    val eventsOuter: js.UndefOr[CleanJsObject[PlotOptionsMapPointEvents]] = events
    new PlotOptionsMapPoint {
      override val events: js.UndefOr[CleanJsObject[PlotOptionsMapPointEvents]] = eventsOuter
    }
  }
}
