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
  * @note JavaScript name: <code>stockTools-gui-definitions-flags</code>
  */
class StockToolsGuiDefinitionsFlags extends com.highcharts.HighchartsGenericObject {

  var flagCirclepin: js.Any = js.undefined

  var flagDiamondpin: js.Any = js.undefined

  var flagSimplepin: js.Any = js.undefined

  var flagSquarepin: js.Any = js.undefined

  /**
    * <p>A collection of strings pointing to config options for
    * the items.</p>
    * @since 7.0.0
    */
  var items: js.UndefOr[js.Array[js.Any]] = js.undefined
}

object StockToolsGuiDefinitionsFlags {
  /**
    * @param items <p>A collection of strings pointing to config options for. the items.</p>
    */
  def apply(flagCirclepin: js.UndefOr[js.Any] = js.undefined, flagDiamondpin: js.UndefOr[js.Any] = js.undefined, flagSimplepin: js.UndefOr[js.Any] = js.undefined, flagSquarepin: js.UndefOr[js.Any] = js.undefined, items: js.UndefOr[js.Array[js.Any]] = js.undefined): StockToolsGuiDefinitionsFlags = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new StockToolsGuiDefinitionsFlags {
      this.flagCirclepin = flagCirclepin
      this.flagDiamondpin = flagDiamondpin
      this.flagSimplepin = flagSimplepin
      this.flagSquarepin = flagSquarepin
      this.items = items
    })
  }
}
