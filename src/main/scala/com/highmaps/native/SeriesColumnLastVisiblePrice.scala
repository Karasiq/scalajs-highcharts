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
  * @note JavaScript name: <code>series&lt;column&gt;-lastVisiblePrice</code>
  */
class SeriesColumnLastVisiblePrice extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Enable or disable the indicator.</p>
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  var label: js.UndefOr[CleanJsObject[SeriesColumnLastVisiblePriceLabel]] = js.undefined
}

object SeriesColumnLastVisiblePrice {
  /**
    * @param enabled <p>Enable or disable the indicator.</p>
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, label: js.UndefOr[CleanJsObject[SeriesColumnLastVisiblePriceLabel]] = js.undefined): SeriesColumnLastVisiblePrice = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesColumnLastVisiblePrice {
      this.enabled = enabled
      this.label = label
    })
  }
}
