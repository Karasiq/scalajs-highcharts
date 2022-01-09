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
  * @note JavaScript name: <code>plotOptions-sunburst-traverseUpButton</code>
  */
class PlotOptionsSunburstTraverseUpButton extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The position of the button.</p>
    * @since 6.0.0
    */
  var position: js.Any = js.undefined
}

object PlotOptionsSunburstTraverseUpButton {
  /**
    * @param position <p>The position of the button.</p>
    */
  def apply(position: js.UndefOr[js.Any] = js.undefined): PlotOptionsSunburstTraverseUpButton = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsSunburstTraverseUpButton {
      this.position = position
    })
  }
}
