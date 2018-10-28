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
  * @note JavaScript name: <code>plotOptions-treemap-drillUpButton</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsTreemapDrillUpButton extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The position of the button.</p>
    */
  val position: js.Any = js.undefined
}

object PlotOptionsTreemapDrillUpButton {
  /**
    * @param position <p>The position of the button.</p>
    */
  def apply(position: js.UndefOr[js.Any] = js.undefined): PlotOptionsTreemapDrillUpButton = {
    val positionOuter: js.Any = position
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsTreemapDrillUpButton {
      override val position: js.Any = positionOuter
    })
  }
}
