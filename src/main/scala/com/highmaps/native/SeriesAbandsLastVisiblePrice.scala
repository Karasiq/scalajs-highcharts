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
  * @note JavaScript name: <code>series&lt;abands&gt;-lastVisiblePrice</code>
  */
class SeriesAbandsLastVisiblePrice extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Enable or disable the indicator.</p>
    * @since 7.0.0
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  var label: js.UndefOr[CleanJsObject[SeriesAbandsLastVisiblePriceLabel]] = js.undefined
}

object SeriesAbandsLastVisiblePrice {
  /**
    * @param enabled <p>Enable or disable the indicator.</p>
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, label: js.UndefOr[CleanJsObject[SeriesAbandsLastVisiblePriceLabel]] = js.undefined): SeriesAbandsLastVisiblePrice = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesAbandsLastVisiblePrice {
      this.enabled = enabled
      this.label = label
    })
  }
}
