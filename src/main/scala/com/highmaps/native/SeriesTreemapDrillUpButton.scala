/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highmaps]]
  */
package com.highmaps.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>series&lt;treemap&gt;-drillUpButton</code>
  */
class SeriesTreemapDrillUpButton extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The position of the button.</p>
    */
  var position: js.Any = js.undefined
}

object SeriesTreemapDrillUpButton {
  /**
    * @param position <p>The position of the button.</p>
    */
  def apply(position: js.UndefOr[js.Any] = js.undefined): SeriesTreemapDrillUpButton = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesTreemapDrillUpButton {
      this.position = position
    })
  }
}
