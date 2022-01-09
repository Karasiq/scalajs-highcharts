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
  * @note JavaScript name: <code>plotOptions-tilemap-lastVisiblePrice</code>
  */
class PlotOptionsTilemapLastVisiblePrice extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Enable or disable the indicator.</p>
    * @since 6.0.0
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  var label: js.UndefOr[CleanJsObject[PlotOptionsTilemapLastVisiblePriceLabel]] = js.undefined
}

object PlotOptionsTilemapLastVisiblePrice {
  /**
    * @param enabled <p>Enable or disable the indicator.</p>
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, label: js.UndefOr[CleanJsObject[PlotOptionsTilemapLastVisiblePriceLabel]] = js.undefined): PlotOptionsTilemapLastVisiblePrice = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsTilemapLastVisiblePrice {
      this.enabled = enabled
      this.label = label
    })
  }
}