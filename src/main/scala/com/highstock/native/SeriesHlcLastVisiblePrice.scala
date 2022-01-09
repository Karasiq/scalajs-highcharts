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
  * @note JavaScript name: <code>series&lt;hlc&gt;-lastVisiblePrice</code>
  */
class SeriesHlcLastVisiblePrice extends com.highcharts.HighchartsGenericObject {

  /**
    * <p>Enable or disable the indicator.</p>
    */
  var enabled: js.UndefOr[Boolean] = js.undefined

  var label: js.UndefOr[CleanJsObject[SeriesHlcLastVisiblePriceLabel]] = js.undefined
}

object SeriesHlcLastVisiblePrice {
  /**
    * @param enabled <p>Enable or disable the indicator.</p>
    */
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, label: js.UndefOr[CleanJsObject[SeriesHlcLastVisiblePriceLabel]] = js.undefined): SeriesHlcLastVisiblePrice = {
    com.highcharts.HighchartsGenericObject.toCleanObject(new SeriesHlcLastVisiblePrice {
      this.enabled = enabled
      this.label = label
    })
  }
}
