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
  * @note JavaScript name: <code>stockTools-gui-definitions-verticalLabels-verticalArrow</code>
  */
class StockToolsGuiDefinitionsVerticalLabelsVerticalArrow extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>A predefined background symbol for the button.</p>
    * @since 7.0.0
    */
  var symbol: js.UndefOr[String] = js.undefined
}

object StockToolsGuiDefinitionsVerticalLabelsVerticalArrow {
  /**
    * @param symbol <p>A predefined background symbol for the button.</p>
    */
  def apply(symbol: js.UndefOr[String] = js.undefined): StockToolsGuiDefinitionsVerticalLabelsVerticalArrow = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new StockToolsGuiDefinitionsVerticalLabelsVerticalArrow {
      this.symbol = symbol
    })
  }
}
