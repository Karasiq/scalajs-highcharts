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
  * @note JavaScript name: <code>stockTools-gui-definitions-simpleShapes</code>
  */
class StockToolsGuiDefinitionsSimpleShapes extends com.highcharts.HighchartsGenericObject {

  var circle: js.Any = js.undefined

  var ellipse: js.Any = js.undefined

  /**
    * <p>A collection of strings pointing to config options for
    * the items.</p>
    * @since 7.0.0
    */
  var items: js.UndefOr[js.Array[js.Any]] = js.undefined

  var label: js.Any = js.undefined

  var rectangle: js.Any = js.undefined
}

object StockToolsGuiDefinitionsSimpleShapes {
  /**
    * @param items <p>A collection of strings pointing to config options for. the items.</p>
    */
  def apply(circle: js.UndefOr[js.Any] = js.undefined, ellipse: js.UndefOr[js.Any] = js.undefined, items: js.UndefOr[js.Array[js.Any]] = js.undefined, label: js.UndefOr[js.Any] = js.undefined, rectangle: js.UndefOr[js.Any] = js.undefined): StockToolsGuiDefinitionsSimpleShapes = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new StockToolsGuiDefinitionsSimpleShapes {
      this.circle = circle
      this.ellipse = ellipse
      this.items = items
      this.label = label
      this.rectangle = rectangle
    })
  }
}
