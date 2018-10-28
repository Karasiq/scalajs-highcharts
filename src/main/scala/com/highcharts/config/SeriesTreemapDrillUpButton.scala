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
  * @note JavaScript name: <code>series&lt;treemap&gt;-drillUpButton</code>
  */
@js.annotation.ScalaJSDefined
class SeriesTreemapDrillUpButton extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The position of the button.</p>
    */
  val position: js.Any = js.undefined
}

object SeriesTreemapDrillUpButton {
  /**
    * @param position <p>The position of the button.</p>
    */
  def apply(position: js.UndefOr[js.Any] = js.undefined): SeriesTreemapDrillUpButton = {
    val positionOuter: js.Any = position
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesTreemapDrillUpButton {
      override val position: js.Any = positionOuter
    })
  }
}
