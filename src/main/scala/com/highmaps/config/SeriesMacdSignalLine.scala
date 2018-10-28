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
  * @note JavaScript name: <code>series&lt;macd&gt;-signalLine</code>
  */
@js.annotation.ScalaJSDefined
class SeriesMacdSignalLine extends com.highcharts.HighchartsGenericObject {

  val zones: js.UndefOr[CleanJsObject[SeriesMacdSignalLineZones]] = js.undefined

  val styles: js.Any = js.undefined
}

object SeriesMacdSignalLine {
  /**
    */
  def apply(zones: js.UndefOr[CleanJsObject[SeriesMacdSignalLineZones]] = js.undefined, styles: js.UndefOr[js.Any] = js.undefined): SeriesMacdSignalLine = {
    val zonesOuter: js.UndefOr[CleanJsObject[SeriesMacdSignalLineZones]] = zones
    val stylesOuter: js.Any = styles
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesMacdSignalLine {
      override val zones: js.UndefOr[CleanJsObject[SeriesMacdSignalLineZones]] = zonesOuter
      override val styles: js.Any = stylesOuter
    })
  }
}
