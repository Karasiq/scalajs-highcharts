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
  * @note JavaScript name: <code>plotOptions-treemap-traverseUpButton</code>
  */
class PlotOptionsTreemapTraverseUpButton extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The position of the button.</p>
    */
  var position: js.Any = js.undefined
}

object PlotOptionsTreemapTraverseUpButton {
  /**
    * @param position <p>The position of the button.</p>
    */
  def apply(position: js.UndefOr[js.Any] = js.undefined): PlotOptionsTreemapTraverseUpButton = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsTreemapTraverseUpButton {
      this.position = position
    })
  }
}
