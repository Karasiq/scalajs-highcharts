/**
  * Automatically generated file. Please do not edit.
  * @author Highcharts Config Generator by Karasiq
  * @see [[http://api.highcharts.com/highstock]]
  */
package com.highstock.native

import scalajs.js, js.`|`
import org.scalajs.dom

import com.highcharts.CleanJsObject
import com.highcharts.HighchartsUtils._

/**
  * @note JavaScript name: <code>plotOptions-williamsr-lastPrice</code>
  */
class PlotOptionsWilliamsrLastPrice extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The color of the line of last price.
    * By default, the line has the same color as the series.</p>
    * @since 7.0.0
    */
  var color: js.UndefOr[String] = js.undefined

  /**
    * <p>Enable or disable the indicator.</p>
    * @since 7.0.0
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  var label: js.UndefOr[CleanJsObject[PlotOptionsWilliamsrLastPriceLabel]] = js.undefined
}

object PlotOptionsWilliamsrLastPrice {
  /**
    * @param color <p>The color of the line of last price.. By default, the line has the same color as the series.</p>
    * @param enabled <p>Enable or disable the indicator.</p>
    */
  def apply(color: js.UndefOr[String] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, label: js.UndefOr[CleanJsObject[PlotOptionsWilliamsrLastPriceLabel]] = js.undefined): PlotOptionsWilliamsrLastPrice = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new PlotOptionsWilliamsrLastPrice {
      this.color = color
      this.enabled = enabled
      this.label = label
    })
  }
}