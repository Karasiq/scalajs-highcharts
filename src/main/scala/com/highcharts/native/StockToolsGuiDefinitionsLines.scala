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
  * @note JavaScript name: <code>stockTools-gui-definitions-lines</code>
  */
class StockToolsGuiDefinitionsLines extends com.highcharts.HighchartsGenericObject {

  var arrowInfinityLine: js.Any = js.undefined

  var arrowRay: js.Any = js.undefined

  var arrowSegment: js.Any = js.undefined

  var horizontalLine: js.Any = js.undefined

  /**
    * <p>A collection of strings pointing to config options for
    * the items.</p>
    * @since 7.0.0
    */
  var items: js.UndefOr[js.Array[js.Any]] = js.undefined

  var line: js.Any = js.undefined

  var ray: js.Any = js.undefined

  var segment: js.Any = js.undefined

  var verticalLine: js.Any = js.undefined
}

object StockToolsGuiDefinitionsLines {
  /**
    * @param items <p>A collection of strings pointing to config options for. the items.</p>
    */
  def apply(arrowInfinityLine: js.UndefOr[js.Any] = js.undefined, arrowRay: js.UndefOr[js.Any] = js.undefined, arrowSegment: js.UndefOr[js.Any] = js.undefined, horizontalLine: js.UndefOr[js.Any] = js.undefined, items: js.UndefOr[js.Array[js.Any]] = js.undefined, line: js.UndefOr[js.Any] = js.undefined, ray: js.UndefOr[js.Any] = js.undefined, segment: js.UndefOr[js.Any] = js.undefined, verticalLine: js.UndefOr[js.Any] = js.undefined): StockToolsGuiDefinitionsLines = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new StockToolsGuiDefinitionsLines {
      this.arrowInfinityLine = arrowInfinityLine
      this.arrowRay = arrowRay
      this.arrowSegment = arrowSegment
      this.horizontalLine = horizontalLine
      this.items = items
      this.line = line
      this.ray = ray
      this.segment = segment
      this.verticalLine = verticalLine
    })
  }
}
