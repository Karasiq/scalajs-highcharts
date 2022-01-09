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
  * @note JavaScript name: <code>plotOptions-solidgauge-lastVisiblePrice</code>
  */
class PlotOptionsSolidgaugeLastVisiblePrice extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Enable or disable the indicator.</p>
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  var label: js.UndefOr[CleanJsObject[PlotOptionsSolidgaugeLastVisiblePriceLabel]] = js.undefined
}

object PlotOptionsSolidgaugeLastVisiblePrice {
  /**
    * @param enabled <p>Enable or disable the indicator.</p>
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, label: js.UndefOr[CleanJsObject[PlotOptionsSolidgaugeLastVisiblePriceLabel]] = js.undefined): PlotOptionsSolidgaugeLastVisiblePrice = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsSolidgaugeLastVisiblePrice {
      this.enabled = enabled
      this.label = label
    })
  }
}