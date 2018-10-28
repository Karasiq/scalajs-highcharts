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
  * @note JavaScript name: <code>plotOptions-vbp-zoneLines</code>
  */
@js.annotation.ScalaJSDefined
class PlotOptionsVbpZoneLines extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Enable/disable zone lines.</p>
    * @since 6.0.0
    */
  val enabled: js.UndefOr[Boolean] = js.undefined

  val styles: js.Any = js.undefined
}

object PlotOptionsVbpZoneLines {
  /**
    * @param enabled <p>Enable/disable zone lines.</p>
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, styles: js.UndefOr[js.Any] = js.undefined): PlotOptionsVbpZoneLines = {
    val enabledOuter: js.UndefOr[Boolean] = enabled
    val stylesOuter: js.Any = styles
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsVbpZoneLines {
      override val enabled: js.UndefOr[Boolean] = enabledOuter
      override val styles: js.Any = stylesOuter
    })
  }
}
