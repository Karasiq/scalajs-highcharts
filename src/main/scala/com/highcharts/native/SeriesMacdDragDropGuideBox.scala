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
  * @note JavaScript name: <code>series&lt;macd&gt;-dragDrop-guideBox</code>
  */
class SeriesMacdDragDropGuideBox extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Style options for the guide box default state.</p>
    * @since 6.2.0
    */
  var default: js.Any = js.undefined
}

object SeriesMacdDragDropGuideBox {
  /**
    * @param default <p>Style options for the guide box default state.</p>
    */
  def apply(default: js.UndefOr[js.Any] = js.undefined): SeriesMacdDragDropGuideBox = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesMacdDragDropGuideBox {
      this.default = default
    })
  }
}
