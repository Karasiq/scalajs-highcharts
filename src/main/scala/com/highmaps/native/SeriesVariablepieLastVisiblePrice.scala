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
  * @note JavaScript name: <code>series&lt;variablepie&gt;-lastVisiblePrice</code>
  */
class SeriesVariablepieLastVisiblePrice extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Enable or disable the indicator.</p>
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  var label: js.UndefOr[CleanJsObject[SeriesVariablepieLastVisiblePriceLabel]] = js.undefined
}

object SeriesVariablepieLastVisiblePrice {
  /**
    * @param enabled <p>Enable or disable the indicator.</p>
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, label: js.UndefOr[CleanJsObject[SeriesVariablepieLastVisiblePriceLabel]] = js.undefined): SeriesVariablepieLastVisiblePrice = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesVariablepieLastVisiblePrice {
      this.enabled = enabled
      this.label = label
    })
  }
}
