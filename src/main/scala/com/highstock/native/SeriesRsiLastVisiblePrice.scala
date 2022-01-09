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
  * @note JavaScript name: <code>series&lt;rsi&gt;-lastVisiblePrice</code>
  */
class SeriesRsiLastVisiblePrice extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Enable or disable the indicator.</p>
    * @since 6.0.0
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  var label: js.UndefOr[CleanJsObject[SeriesRsiLastVisiblePriceLabel]] = js.undefined
}

object SeriesRsiLastVisiblePrice {
  /**
    * @param enabled <p>Enable or disable the indicator.</p>
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, label: js.UndefOr[CleanJsObject[SeriesRsiLastVisiblePriceLabel]] = js.undefined): SeriesRsiLastVisiblePrice = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesRsiLastVisiblePrice {
      this.enabled = enabled
      this.label = label
    })
  }
}
