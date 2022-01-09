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
  * @note JavaScript name: <code>series&lt;dmi&gt;-lastVisiblePrice</code>
  */
class SeriesDmiLastVisiblePrice extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Enable or disable the indicator.</p>
    * @since 9.1.0
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  var label: js.UndefOr[CleanJsObject[SeriesDmiLastVisiblePriceLabel]] = js.undefined
}

object SeriesDmiLastVisiblePrice {
  /**
    * @param enabled <p>Enable or disable the indicator.</p>
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, label: js.UndefOr[CleanJsObject[SeriesDmiLastVisiblePriceLabel]] = js.undefined): SeriesDmiLastVisiblePrice = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesDmiLastVisiblePrice {
      this.enabled = enabled
      this.label = label
    })
  }
}
