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
  * @note JavaScript name: <code>stockTools-gui-definitions-crookedLines</code>
  */
class StockToolsGuiDefinitionsCrookedLines extends com.highcharts.HighchartsGenericObject {

  var crooked3: js.Any = js.undefined

  var crooked5: js.Any = js.undefined

  var elliott3: js.Any = js.undefined

  var elliott5: js.Any = js.undefined

  /**
    * <p>A collection of strings pointing to config options for
    * the items.</p>
    * @since 7.0.0
    */
  var items: js.UndefOr[js.Array[js.Any]] = js.undefined
}

object StockToolsGuiDefinitionsCrookedLines {
  /**
    * @param items <p>A collection of strings pointing to config options for. the items.</p>
    */
  def apply(crooked3: js.UndefOr[js.Any] = js.undefined, crooked5: js.UndefOr[js.Any] = js.undefined, elliott3: js.UndefOr[js.Any] = js.undefined, elliott5: js.UndefOr[js.Any] = js.undefined, items: js.UndefOr[js.Array[js.Any]] = js.undefined): StockToolsGuiDefinitionsCrookedLines = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new StockToolsGuiDefinitionsCrookedLines {
      this.crooked3 = crooked3
      this.crooked5 = crooked5
      this.elliott3 = elliott3
      this.elliott5 = elliott5
      this.items = items
    })
  }
}
