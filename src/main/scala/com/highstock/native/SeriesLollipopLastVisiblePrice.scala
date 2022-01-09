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
  * @note JavaScript name: <code>series&lt;lollipop&gt;-lastVisiblePrice</code>
  */
class SeriesLollipopLastVisiblePrice extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Enable or disable the indicator.</p>
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  var label: js.UndefOr[CleanJsObject[SeriesLollipopLastVisiblePriceLabel]] = js.undefined
}

object SeriesLollipopLastVisiblePrice {
  /**
    * @param enabled <p>Enable or disable the indicator.</p>
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, label: js.UndefOr[CleanJsObject[SeriesLollipopLastVisiblePriceLabel]] = js.undefined): SeriesLollipopLastVisiblePrice = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesLollipopLastVisiblePrice {
      this.enabled = enabled
      this.label = label
    })
  }
}
