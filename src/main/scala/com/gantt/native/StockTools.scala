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
  * @note JavaScript name: <code>stockTools</code>
  */
class StockTools extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Definitions of buttons in Stock Tools GUI.</p>
    * @since 7.0.0
    */
  var gui: js.Any = js.undefined
}

object StockTools {
  /**
    * @param gui <p>Definitions of buttons in Stock Tools GUI.</p>
    */
  def apply(gui: js.UndefOr[js.Any] = js.undefined): StockTools = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new StockTools {
      this.gui = gui
    })
  }
}
