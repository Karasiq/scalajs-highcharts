/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/gantt]]
  */
package com.gantt.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>series&lt;macd&gt;-macdLine</code>
  */
class SeriesMacdMacdLine extends com.highcharts.HighchartsGenericObject {

  var styles: js.Any = js.undefined

  var zones: js.UndefOr[CleanJsObject[SeriesMacdMacdLineZones]] = js.undefined
}

object SeriesMacdMacdLine {
  /**
    */
  def apply(styles: js.UndefOr[js.Any] = js.undefined, zones: js.UndefOr[CleanJsObject[SeriesMacdMacdLineZones]] = js.undefined): SeriesMacdMacdLine = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesMacdMacdLine {
      this.styles = styles
      this.zones = zones
    })
  }
}
