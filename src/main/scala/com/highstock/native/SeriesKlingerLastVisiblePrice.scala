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
  * @note JavaScript name: <code>series&lt;klinger&gt;-lastVisiblePrice</code>
  */
class SeriesKlingerLastVisiblePrice extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Enable or disable the indicator.</p>
    * @since 9.1.0
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  var label: js.UndefOr[CleanJsObject[SeriesKlingerLastVisiblePriceLabel]] = js.undefined
}

object SeriesKlingerLastVisiblePrice {
  /**
    * @param enabled <p>Enable or disable the indicator.</p>
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, label: js.UndefOr[CleanJsObject[SeriesKlingerLastVisiblePriceLabel]] = js.undefined): SeriesKlingerLastVisiblePrice = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesKlingerLastVisiblePrice {
      this.enabled = enabled
      this.label = label
    })
  }
}
