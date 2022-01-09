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
  * @note JavaScript name: <code>stockTools-gui-definitions-crookedLines-elliott3</code>
  */
class StockToolsGuiDefinitionsCrookedLinesElliott3 extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>A predefined background symbol for the button.</p>
    * @since 7.0.0
    */
  var symbol: js.UndefOr[String] = js.undefined
}

object StockToolsGuiDefinitionsCrookedLinesElliott3 {
  /**
    * @param symbol <p>A predefined background symbol for the button.</p>
    */
  def apply(symbol: js.UndefOr[String] = js.undefined): StockToolsGuiDefinitionsCrookedLinesElliott3 = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new StockToolsGuiDefinitionsCrookedLinesElliott3 {
      this.symbol = symbol
    })
  }
}
