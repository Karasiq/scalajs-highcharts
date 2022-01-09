/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highcharts]]
  */
package com.highcharts.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>series&lt;macd&gt;-signalLine</code>
  */
class SeriesMacdSignalLine extends com.highcharts.HighchartsGenericObject {

  var styles: js.Any = js.undefined

  var zones: js.UndefOr[CleanJsObject[SeriesMacdSignalLineZones]] = js.undefined
}

object SeriesMacdSignalLine {
  /**
    */
  def apply(styles: js.UndefOr[js.Any] = js.undefined, zones: js.UndefOr[CleanJsObject[SeriesMacdSignalLineZones]] = js.undefined): SeriesMacdSignalLine = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesMacdSignalLine {
      this.styles = styles
      this.zones = zones
    })
  }
}
