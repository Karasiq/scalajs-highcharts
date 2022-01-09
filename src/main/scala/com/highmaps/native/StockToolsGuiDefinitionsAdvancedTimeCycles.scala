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
  * @note JavaScript name: <code>stockTools-gui-definitions-advanced-timeCycles</code>
  */
class StockToolsGuiDefinitionsAdvancedTimeCycles extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>A predefined backgroud symbol for the button.</p>
    * @since 7.0.0
    */
  var symbol: js.UndefOr[String] = js.undefined
}

object StockToolsGuiDefinitionsAdvancedTimeCycles {
  /**
    * @param symbol <p>A predefined backgroud symbol for the button.</p>
    */
  def apply(symbol: js.UndefOr[String] = js.undefined): StockToolsGuiDefinitionsAdvancedTimeCycles = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new StockToolsGuiDefinitionsAdvancedTimeCycles {
      this.symbol = symbol
    })
  }
}
