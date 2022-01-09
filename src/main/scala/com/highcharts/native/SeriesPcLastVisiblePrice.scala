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
  * @note JavaScript name: <code>series&lt;pc&gt;-lastVisiblePrice</code>
  */
class SeriesPcLastVisiblePrice extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Enable or disable the indicator.</p>
    * @since 7.0.0
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  var label: js.UndefOr[CleanJsObject[SeriesPcLastVisiblePriceLabel]] = js.undefined
}

object SeriesPcLastVisiblePrice {
  /**
    * @param enabled <p>Enable or disable the indicator.</p>
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, label: js.UndefOr[CleanJsObject[SeriesPcLastVisiblePriceLabel]] = js.undefined): SeriesPcLastVisiblePrice = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesPcLastVisiblePrice {
      this.enabled = enabled
      this.label = label
    })
  }
}
