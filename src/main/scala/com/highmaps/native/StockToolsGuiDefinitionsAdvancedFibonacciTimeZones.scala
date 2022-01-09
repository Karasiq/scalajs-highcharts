/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highmaps]]
  */
package com.highmaps.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>stockTools-gui-definitions-advanced-fibonacciTimeZones</code>
  */
class StockToolsGuiDefinitionsAdvancedFibonacciTimeZones extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>A predefined background symbol for the button.</p>
    * @since 7.0.0
    */
  var symbol: js.UndefOr[String] = js.undefined
}

object StockToolsGuiDefinitionsAdvancedFibonacciTimeZones {
  /**
    * @param symbol <p>A predefined background symbol for the button.</p>
    */
  def apply(symbol: js.UndefOr[String] = js.undefined): StockToolsGuiDefinitionsAdvancedFibonacciTimeZones = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new StockToolsGuiDefinitionsAdvancedFibonacciTimeZones {
      this.symbol = symbol
    })
  }
}
