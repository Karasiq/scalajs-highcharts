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
  * @note JavaScript name: <code>series&lt;zigzag&gt;-lastVisiblePrice</code>
  */
class SeriesZigzagLastVisiblePrice extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Enable or disable the indicator.</p>
    * @since 6.0.0
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  var label: js.UndefOr[CleanJsObject[SeriesZigzagLastVisiblePriceLabel]] = js.undefined
}

object SeriesZigzagLastVisiblePrice {
  /**
    * @param enabled <p>Enable or disable the indicator.</p>
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, label: js.UndefOr[CleanJsObject[SeriesZigzagLastVisiblePriceLabel]] = js.undefined): SeriesZigzagLastVisiblePrice = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesZigzagLastVisiblePrice {
      this.enabled = enabled
      this.label = label
    })
  }
}