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
  * @note JavaScript name: <code>plotOptions-mapline-point</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsMaplinePoint extends js.Object {

  /**
    * Events for each single point
    */
  val events: js.UndefOr[CleanJsObject[PlotOptionsMaplinePointEvents]] = js.undefined
}

object PlotOptionsMaplinePoint {
  /**
    * @param events Events for each single point
    */
  def apply(events: js.UndefOr[CleanJsObject[PlotOptionsMaplinePointEvents]] = js.undefined): PlotOptionsMaplinePoint = {
    val eventsOuter: js.UndefOr[CleanJsObject[PlotOptionsMaplinePointEvents]] = events
    new PlotOptionsMaplinePoint {
      override val events: js.UndefOr[CleanJsObject[PlotOptionsMaplinePointEvents]] = eventsOuter
    }
  }
}
