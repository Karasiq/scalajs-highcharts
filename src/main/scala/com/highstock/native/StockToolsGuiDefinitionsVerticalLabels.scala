/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highstock]]
  */
package com.highstock.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>stockTools-gui-definitions-verticalLabels</code>
  */
class StockToolsGuiDefinitionsVerticalLabels extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>A collection of strings pointing to config options for
    * the items.</p>
    * @since 7.0.0
    */
  var items: js.UndefOr[js.Array[js.Any]] = js.undefined

  var verticalArrow: js.Any = js.undefined

  var verticalCounter: js.Any = js.undefined

  var verticalLabel: js.Any = js.undefined
}

object StockToolsGuiDefinitionsVerticalLabels {
  /**
    * @param items <p>A collection of strings pointing to config options for. the items.</p>
    */
  def apply(items: js.UndefOr[js.Array[js.Any]] = js.undefined, verticalArrow: js.UndefOr[js.Any] = js.undefined, verticalCounter: js.UndefOr[js.Any] = js.undefined, verticalLabel: js.UndefOr[js.Any] = js.undefined): StockToolsGuiDefinitionsVerticalLabels = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new StockToolsGuiDefinitionsVerticalLabels {
      this.items = items
      this.verticalArrow = verticalArrow
      this.verticalCounter = verticalCounter
      this.verticalLabel = verticalLabel
    })
  }
}
