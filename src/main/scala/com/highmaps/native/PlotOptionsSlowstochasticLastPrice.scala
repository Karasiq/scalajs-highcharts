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
  * @note JavaScript name: <code>plotOptions-slowstochastic-lastPrice</code>
  */
class PlotOptionsSlowstochasticLastPrice extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The color of the line of last price.
    * By default, the line has the same color as the series.</p>
    * @since 8.0.0
    */
  var color: js.UndefOr[String] = js.undefined

  /**
    * <p>Enable or disable the indicator.</p>
    * @since 8.0.0
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  var label: js.UndefOr[CleanJsObject[PlotOptionsSlowstochasticLastPriceLabel]] = js.undefined
}

object PlotOptionsSlowstochasticLastPrice {
  /**
    * @param color <p>The color of the line of last price.. By default, the line has the same color as the series.</p>
    * @param enabled <p>Enable or disable the indicator.</p>
    */
  def apply(color: js.UndefOr[String] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, label: js.UndefOr[CleanJsObject[PlotOptionsSlowstochasticLastPriceLabel]] = js.undefined): PlotOptionsSlowstochasticLastPrice = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsSlowstochasticLastPrice {
      this.color = color
      this.enabled = enabled
      this.label = label
    })
  }
}