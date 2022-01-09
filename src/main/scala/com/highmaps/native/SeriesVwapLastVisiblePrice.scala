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
  * @note JavaScript name: <code>series&lt;vwap&gt;-lastVisiblePrice</code>
  */
class SeriesVwapLastVisiblePrice extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Enable or disable the indicator.</p>
    * @since 6.0.0
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  var label: js.UndefOr[CleanJsObject[SeriesVwapLastVisiblePriceLabel]] = js.undefined
}

object SeriesVwapLastVisiblePrice {
  /**
    * @param enabled <p>Enable or disable the indicator.</p>
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, label: js.UndefOr[CleanJsObject[SeriesVwapLastVisiblePriceLabel]] = js.undefined): SeriesVwapLastVisiblePrice = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesVwapLastVisiblePrice {
      this.enabled = enabled
      this.label = label
    })
  }
}
