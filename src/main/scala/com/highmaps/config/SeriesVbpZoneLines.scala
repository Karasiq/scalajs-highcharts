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
  * @note JavaScript name: <code>series&lt;vbp&gt;-zoneLines</code>
  */
@js.annotation.ScalaJSDefined
class SeriesVbpZoneLines extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Enable/disable zone lines.</p>
    * @since 6.0.0
    */
  val enabled: js.UndefOr[Boolean] = js.undefined

  val styles: js.Any = js.undefined
}

object SeriesVbpZoneLines {
  /**
    * @param enabled <p>Enable/disable zone lines.</p>
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, styles: js.UndefOr[js.Any] = js.undefined): SeriesVbpZoneLines = {
    val enabledOuter: js.UndefOr[Boolean] = enabled
    val stylesOuter: js.Any = styles
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesVbpZoneLines {
      override val enabled: js.UndefOr[Boolean] = enabledOuter
      override val styles: js.Any = stylesOuter
    })
  }
}
