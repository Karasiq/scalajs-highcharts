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
  * @note JavaScript name: <code>series&lt;candlestick&gt;-lastVisiblePrice</code>
  */
class SeriesCandlestickLastVisiblePrice extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Enable or disable the indicator.</p>
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  var label: js.UndefOr[CleanJsObject[SeriesCandlestickLastVisiblePriceLabel]] = js.undefined
}

object SeriesCandlestickLastVisiblePrice {
  /**
    * @param enabled <p>Enable or disable the indicator.</p>
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, label: js.UndefOr[CleanJsObject[SeriesCandlestickLastVisiblePriceLabel]] = js.undefined): SeriesCandlestickLastVisiblePrice = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesCandlestickLastVisiblePrice {
      this.enabled = enabled
      this.label = label
    })
  }
}
