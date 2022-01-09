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
  * @note JavaScript name: <code>series&lt;boxplot&gt;-data-dragDrop-guideBox</code>
  */
class SeriesBoxplotDataDragDropGuideBox extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Style options for the guide box default state.</p>
    * @since 6.2.0
    */
  var default: js.Any = js.undefined
}

object SeriesBoxplotDataDragDropGuideBox {
  /**
    * @param default <p>Style options for the guide box default state.</p>
    */
  def apply(default: js.UndefOr[js.Any] = js.undefined): SeriesBoxplotDataDragDropGuideBox = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesBoxplotDataDragDropGuideBox {
      this.default = default
    })
  }
}
