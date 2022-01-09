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
  * @note JavaScript name: <code>series&lt;hollowcandlestick&gt;-lastPrice</code>
  */
class SeriesHollowcandlestickLastPrice extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>The color of the line of last price.
    * By default, the line has the same color as the series.</p>
    */
  var color: js.UndefOr[String] = js.undefined

  /**
    * <p>Enable or disable the indicator.</p>
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  var label: js.UndefOr[CleanJsObject[SeriesHollowcandlestickLastPriceLabel]] = js.undefined
}

object SeriesHollowcandlestickLastPrice {
  /**
    * @param color <p>The color of the line of last price.. By default, the line has the same color as the series.</p>
    * @param enabled <p>Enable or disable the indicator.</p>
    */
  def apply(color: js.UndefOr[String] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined, label: js.UndefOr[CleanJsObject[SeriesHollowcandlestickLastPriceLabel]] = js.undefined): SeriesHollowcandlestickLastPrice = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesHollowcandlestickLastPrice {
      this.color = color
      this.enabled = enabled
      this.label = label
    })
  }
}
