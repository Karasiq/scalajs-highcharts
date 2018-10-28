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
  * @note JavaScript name: <code>series&lt;macd&gt;-macdLine</code>
  */
@js.annotation.ScalaJSDefined
class SeriesMacdMacdLine extends com.highcharts.HighchartsGenericObject {

  val zones: js.UndefOr[CleanJsObject[SeriesMacdMacdLineZones]] = js.undefined

  val styles: js.Any = js.undefined
}

object SeriesMacdMacdLine {
  /**
    */
  def apply(zones: js.UndefOr[CleanJsObject[SeriesMacdMacdLineZones]] = js.undefined, styles: js.UndefOr[js.Any] = js.undefined): SeriesMacdMacdLine = {
    val zonesOuter: js.UndefOr[CleanJsObject[SeriesMacdMacdLineZones]] = zones
    val stylesOuter: js.Any = styles
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesMacdMacdLine {
      override val zones: js.UndefOr[CleanJsObject[SeriesMacdMacdLineZones]] = zonesOuter
      override val styles: js.Any = stylesOuter
    })
  }
}
