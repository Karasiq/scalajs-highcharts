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
  * @note JavaScript name: <code>series&lt;areaspline&gt;-lastVisiblePrice</code>
  */
class SeriesAreasplineLastVisiblePrice extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Enable or disable the indicator.</p>
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  var label: js.UndefOr[CleanJsObject[SeriesAreasplineLastVisiblePriceLabel]] = js.undefined
}

object SeriesAreasplineLastVisiblePrice {
  /**
    * @param enabled <p>Enable or disable the indicator.</p>
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, label: js.UndefOr[CleanJsObject[SeriesAreasplineLastVisiblePriceLabel]] = js.undefined): SeriesAreasplineLastVisiblePrice = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesAreasplineLastVisiblePrice {
      this.enabled = enabled
      this.label = label
    })
  }
}
