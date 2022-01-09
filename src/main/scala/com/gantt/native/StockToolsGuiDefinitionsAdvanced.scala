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
  * @note JavaScript name: <code>stockTools-gui-definitions-advanced</code>
  */
class StockToolsGuiDefinitionsAdvanced extends com.highcharts.HighchartsGenericObject {

  var fibonacci: js.Any = js.undefined

  var fibonacciTimeZones: js.Any = js.undefined

  /**
    * <p>A collection of strings pointing to config options for
    * the items.</p>
    * @since 7.0.0
    */
  var items: js.UndefOr[js.Array[js.Any]] = js.undefined

  var parallelChannel: js.Any = js.undefined

  var pitchfork: js.Any = js.undefined

  var timeCycles: js.Any = js.undefined
}

object StockToolsGuiDefinitionsAdvanced {
  /**
    * @param items <p>A collection of strings pointing to config options for. the items.</p>
    */
  def apply(fibonacci: js.UndefOr[js.Any] = js.undefined, fibonacciTimeZones: js.UndefOr[js.Any] = js.undefined, items: js.UndefOr[js.Array[js.Any]] = js.undefined, parallelChannel: js.UndefOr[js.Any] = js.undefined, pitchfork: js.UndefOr[js.Any] = js.undefined, timeCycles: js.UndefOr[js.Any] = js.undefined): StockToolsGuiDefinitionsAdvanced = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new StockToolsGuiDefinitionsAdvanced {
      this.fibonacci = fibonacci
      this.fibonacciTimeZones = fibonacciTimeZones
      this.items = items
      this.parallelChannel = parallelChannel
      this.pitchfork = pitchfork
      this.timeCycles = timeCycles
    })
  }
}
