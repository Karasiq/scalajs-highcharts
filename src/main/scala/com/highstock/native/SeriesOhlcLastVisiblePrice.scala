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
  * @note JavaScript name: <code>series&lt;ohlc&gt;-lastVisiblePrice</code>
  */
class SeriesOhlcLastVisiblePrice extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Enable or disable the indicator.</p>
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  var label: js.UndefOr[CleanJsObject[SeriesOhlcLastVisiblePriceLabel]] = js.undefined
}

object SeriesOhlcLastVisiblePrice {
  /**
    * @param enabled <p>Enable or disable the indicator.</p>
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, label: js.UndefOr[CleanJsObject[SeriesOhlcLastVisiblePriceLabel]] = js.undefined): SeriesOhlcLastVisiblePrice = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesOhlcLastVisiblePrice {
      this.enabled = enabled
      this.label = label
    })
  }
}
