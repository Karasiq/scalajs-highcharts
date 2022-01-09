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
  * @note JavaScript name: <code>stockTools-gui-definitions-measure</code>
  */
class StockToolsGuiDefinitionsMeasure extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>A collection of strings pointing to config options for
    * the items.</p>
    * @since 7.0.0
    */
  var items: js.UndefOr[js.Array[js.Any]] = js.undefined

  var measureX: js.Any = js.undefined

  var measureXY: js.Any = js.undefined

  var measureY: js.Any = js.undefined
}

object StockToolsGuiDefinitionsMeasure {
  /**
    * @param items <p>A collection of strings pointing to config options for. the items.</p>
    */
  def apply(items: js.UndefOr[js.Array[js.Any]] = js.undefined, measureX: js.UndefOr[js.Any] = js.undefined, measureXY: js.UndefOr[js.Any] = js.undefined, measureY: js.UndefOr[js.Any] = js.undefined): StockToolsGuiDefinitionsMeasure = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new StockToolsGuiDefinitionsMeasure {
      this.items = items
      this.measureX = measureX
      this.measureXY = measureXY
      this.measureY = measureY
    })
  }
}
