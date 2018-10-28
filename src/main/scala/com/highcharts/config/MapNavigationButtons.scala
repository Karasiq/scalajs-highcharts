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
  * @note JavaScript name: <code>mapNavigation-buttons</code>
  */
@js.annotation.ScalaJSDefined
class MapNavigationButtons extends com.highcharts.HighchartsGenericObject {

  val zoomIn: js.Any = js.undefined

  val zoomOut: js.Any = js.undefined
}

object MapNavigationButtons {
  /**
    */
  def apply(zoomIn: js.UndefOr[js.Any] = js.undefined, zoomOut: js.UndefOr[js.Any] = js.undefined): MapNavigationButtons = {
    val zoomInOuter: js.Any = zoomIn
    val zoomOutOuter: js.Any = zoomOut
    com.highcharts.HighchartsGenericObject.toCleanObject(new MapNavigationButtons {
      override val zoomIn: js.Any = zoomInOuter
      override val zoomOut: js.Any = zoomOutOuter
    })
  }
}
