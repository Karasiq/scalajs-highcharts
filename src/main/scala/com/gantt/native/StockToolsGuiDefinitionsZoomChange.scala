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
  * @note JavaScript name: <code>stockTools-gui-definitions-zoomChange</code>
  */
class StockToolsGuiDefinitionsZoomChange extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>A collection of strings pointing to config options for
    * the items.</p>
    * @since 7.0.0
    */
  var items: js.UndefOr[js.Array[js.Any]] = js.undefined

  var zoomX: js.Any = js.undefined

  var zoomXY: js.Any = js.undefined

  var zoomY: js.Any = js.undefined
}

object StockToolsGuiDefinitionsZoomChange {
  /**
    * @param items <p>A collection of strings pointing to config options for. the items.</p>
    */
  def apply(items: js.UndefOr[js.Array[js.Any]] = js.undefined, zoomX: js.UndefOr[js.Any] = js.undefined, zoomXY: js.UndefOr[js.Any] = js.undefined, zoomY: js.UndefOr[js.Any] = js.undefined): StockToolsGuiDefinitionsZoomChange = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new StockToolsGuiDefinitionsZoomChange {
      this.items = items
      this.zoomX = zoomX
      this.zoomXY = zoomXY
      this.zoomY = zoomY
    })
  }
}
