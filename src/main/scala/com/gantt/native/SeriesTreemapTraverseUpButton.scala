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
  * @note JavaScript name: <code>series&lt;treemap&gt;-traverseUpButton</code>
  */
class SeriesTreemapTraverseUpButton extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The position of the button.</p>
    */
  var position: js.Any = js.undefined
}

object SeriesTreemapTraverseUpButton {
  /**
    * @param position <p>The position of the button.</p>
    */
  def apply(position: js.UndefOr[js.Any] = js.undefined): SeriesTreemapTraverseUpButton = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesTreemapTraverseUpButton {
      this.position = position
    })
  }
}
