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
  * @note JavaScript name: <code>plotOptions-mapbubble-point</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsMapbubblePoint extends js.Object {

  /**
    * Events for each single point
    */
  val events: js.UndefOr[CleanJsObject[PlotOptionsMapbubblePointEvents]] = js.undefined
}

object PlotOptionsMapbubblePoint {
  /**
    * @param events Events for each single point
    */
  def apply(events: js.UndefOr[CleanJsObject[PlotOptionsMapbubblePointEvents]] = js.undefined): PlotOptionsMapbubblePoint = {
    val eventsOuter: js.UndefOr[CleanJsObject[PlotOptionsMapbubblePointEvents]] = events
    new PlotOptionsMapbubblePoint {
      override val events: js.UndefOr[CleanJsObject[PlotOptionsMapbubblePointEvents]] = eventsOuter
    }
  }
}
