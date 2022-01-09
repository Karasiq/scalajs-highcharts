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
  * @note JavaScript name: <code>stockTools-gui-definitions-typeChange</code>
  */
class StockToolsGuiDefinitionsTypeChange extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>A collection of strings pointing to config options for
    * the items.</p>
    * @since 7.0.0
    */
  var items: js.UndefOr[js.Array[js.Any]] = js.undefined

  var typeCandlestick: js.Any = js.undefined

  var typeHLC: js.Any = js.undefined

  var typeHeikinAshi: js.Any = js.undefined

  var typeHollowCandlestick: js.Any = js.undefined

  var typeLine: js.Any = js.undefined

  var typeOHLC: js.Any = js.undefined
}

object StockToolsGuiDefinitionsTypeChange {
  /**
    * @param items <p>A collection of strings pointing to config options for. the items.</p>
    */
  def apply(items: js.UndefOr[js.Array[js.Any]] = js.undefined, typeCandlestick: js.UndefOr[js.Any] = js.undefined, typeHLC: js.UndefOr[js.Any] = js.undefined, typeHeikinAshi: js.UndefOr[js.Any] = js.undefined, typeHollowCandlestick: js.UndefOr[js.Any] = js.undefined, typeLine: js.UndefOr[js.Any] = js.undefined, typeOHLC: js.UndefOr[js.Any] = js.undefined): StockToolsGuiDefinitionsTypeChange = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new StockToolsGuiDefinitionsTypeChange {
      this.items = items
      this.typeCandlestick = typeCandlestick
      this.typeHLC = typeHLC
      this.typeHeikinAshi = typeHeikinAshi
      this.typeHollowCandlestick = typeHollowCandlestick
      this.typeLine = typeLine
      this.typeOHLC = typeOHLC
    })
  }
}
