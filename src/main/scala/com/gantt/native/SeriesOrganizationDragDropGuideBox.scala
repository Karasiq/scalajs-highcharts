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
  * @note JavaScript name: <code>series&lt;organization&gt;-dragDrop-guideBox</code>
  */
class SeriesOrganizationDragDropGuideBox extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Style options for the guide box default state.</p>
    * @since 6.2.0
    */
  var default: js.Any = js.undefined
}

object SeriesOrganizationDragDropGuideBox {
  /**
    * @param default <p>Style options for the guide box default state.</p>
    */
  def apply(default: js.UndefOr[js.Any] = js.undefined): SeriesOrganizationDragDropGuideBox = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesOrganizationDragDropGuideBox {
      this.default = default
    })
  }
}