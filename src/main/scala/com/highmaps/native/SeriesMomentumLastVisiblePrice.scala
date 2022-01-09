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
  * @note JavaScript name: <code>series&lt;momentum&gt;-lastVisiblePrice</code>
  */
class SeriesMomentumLastVisiblePrice extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Enable or disable the indicator.</p>
    * @since 6.0.0
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  var label: js.UndefOr[CleanJsObject[SeriesMomentumLastVisiblePriceLabel]] = js.undefined
}

object SeriesMomentumLastVisiblePrice {
  /**
    * @param enabled <p>Enable or disable the indicator.</p>
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, label: js.UndefOr[CleanJsObject[SeriesMomentumLastVisiblePriceLabel]] = js.undefined): SeriesMomentumLastVisiblePrice = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesMomentumLastVisiblePrice {
      this.enabled = enabled
      this.label = label
    })
  }
}
