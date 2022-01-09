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
  * @note JavaScript name: <code>series&lt;hollowcandlestick&gt;-lastVisiblePrice</code>
  */
class SeriesHollowcandlestickLastVisiblePrice extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Enable or disable the indicator.</p>
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  var label: js.UndefOr[CleanJsObject[SeriesHollowcandlestickLastVisiblePriceLabel]] = js.undefined
}

object SeriesHollowcandlestickLastVisiblePrice {
  /**
    * @param enabled <p>Enable or disable the indicator.</p>
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, label: js.UndefOr[CleanJsObject[SeriesHollowcandlestickLastVisiblePriceLabel]] = js.undefined): SeriesHollowcandlestickLastVisiblePrice = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesHollowcandlestickLastVisiblePrice {
      this.enabled = enabled
      this.label = label
    })
  }
}
