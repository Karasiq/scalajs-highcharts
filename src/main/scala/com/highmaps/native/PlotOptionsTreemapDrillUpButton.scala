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
  * @note JavaScript name: <code>plotOptions-treemap-drillUpButton</code>
  */
class PlotOptionsTreemapDrillUpButton extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The position of the button.</p>
    */
  var position: js.Any = js.undefined
}

object PlotOptionsTreemapDrillUpButton {
  /**
    * @param position <p>The position of the button.</p>
    */
  def apply(position: js.UndefOr[js.Any] = js.undefined): PlotOptionsTreemapDrillUpButton = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsTreemapDrillUpButton {
      this.position = position
    })
  }
}
