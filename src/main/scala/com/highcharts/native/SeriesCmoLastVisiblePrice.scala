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
  * @note JavaScript name: <code>series&lt;cmo&gt;-lastVisiblePrice</code>
  */
class SeriesCmoLastVisiblePrice extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Enable or disable the indicator.</p>
    * @since 9.1.0
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  var label: js.UndefOr[CleanJsObject[SeriesCmoLastVisiblePriceLabel]] = js.undefined
}

object SeriesCmoLastVisiblePrice {
  /**
    * @param enabled <p>Enable or disable the indicator.</p>
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, label: js.UndefOr[CleanJsObject[SeriesCmoLastVisiblePriceLabel]] = js.undefined): SeriesCmoLastVisiblePrice = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesCmoLastVisiblePrice {
      this.enabled = enabled
      this.label = label
    })
  }
}
